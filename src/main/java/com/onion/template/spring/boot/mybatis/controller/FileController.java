package com.onion.template.spring.boot.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/7/21 18:59
 **/
@RestController
@RequestMapping("file")
public class FileController {
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
}
