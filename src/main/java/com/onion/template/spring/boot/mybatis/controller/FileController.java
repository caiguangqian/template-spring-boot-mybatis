package com.onion.template.spring.boot.mybatis.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.onion.template.spring.boot.mybatis.config.easyexcel.listener.BaseExcelListener;
import com.onion.template.spring.boot.mybatis.entity.Employee;
import com.onion.template.spring.boot.mybatis.mapper.EmployeeMapper;
import com.onion.template.spring.boot.mybatis.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/7/21 18:59
 **/
/*@RestController
@RequestMapping("file")*/
public class FileController {
    @Value("${filePath}")
    private String filePath;
    @Resource
    private EmployeeMapper employeeMapper;
    private static final String JDSEXCEL="2020年数据质量管理稽查项目一览表 （戒毒所）";
    private static final String JLSEXCEL="2020年数据质量管理稽查项目一览表 （拘留所）";
    private static final String KSSEXCEL="2020年数据质量管理稽查项目一览表 （看守所）";
    @GetMapping("download")
    public String fileDownload(@RequestParam("code") String code, HttpServletResponse response) throws IOException {
        String file1;
        if("1".equals(code)){
            file1 = JDSEXCEL+".xlsx";
        }else if("2".equals(code)){
            file1 = JLSEXCEL+".xlsx";
        }else if("3".equals(code)) {
            file1 = KSSEXCEL+".xlsx";
        }else {
            return "非法code";
        }
        /**
         *项目所在路径
         */
        String relativelyPath=System.getProperty("user.dir");
        /**
         *拼接路径不要使用// 使用File.separator 在linux不会出错
         */
        String realPath = relativelyPath+File.separator+"src\\main\\resources\\static\\excel"+File.separator+file1;
        System.out.println(realPath);

        //String fileName = "\\src\\main\\resources\\static\\excel\\"+file1;
        //System.out.println(fileName);
        File file = new File(realPath);//E:\onion\github\template-spring-boot-mybatis\src\main\resources\static\excel
        System.out.println(file);
        if(file.exists()){
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=\"" + java.net.URLEncoder.encode(file1, "UTF-8") + "\"");
            byte[] buffer = new byte[10240];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                response.addHeader("Content-Length", String.valueOf(fis.getChannel().size()));
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i!=-1){
                    os.write(buffer,0,i);
                    i=bis.read(buffer);
                }
                return "success";

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "error";
    }


    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req){
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        //String realPath = req.getSession().getServletContext().getRealPath("/uploadFile");
        String format = sd.format(new Date());
        File file = new File(filePath + format);
        if (!file.isDirectory()){
            file.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.indexOf("."), oldName.length());
        try {
            uploadFile.transferTo(new File(file,newName));
            String path = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName;
            return path;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    @GetMapping("download1")
    public void download(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), Employee.class).sheet("模板").doWrite(employeeMapper.selectAll());
    }
    @PostMapping("upload1")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream()).sheet().doRead();
        return "success";
    }

}
