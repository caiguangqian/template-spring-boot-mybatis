package com.onion.template.spring.boot.mybatis.controller;

/**
 * @ClassName ReportController
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/11
 * @Version V1.0
 **/
import cn.hutool.json.JSONUtil;
import com.fr.base.FRContext;
import com.fr.general.ModuleContext;
import com.fr.io.TemplateWorkBookIO;
import com.fr.io.exporter.ExcelExporter;
import com.fr.io.exporter.ImageExporter;
import com.fr.io.exporter.PDFExporter;
import com.fr.io.exporter.WordExporter;
import com.fr.main.TemplateWorkBook;
import com.fr.main.workbook.ResultWorkBook;
import com.fr.report.module.EngineModule;
import com.fr.stable.WriteActor;
import org.apache.commons.collections4.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/report")
public class ReportController {

    private static final Logger log = LoggerFactory.getLogger(ReportController.class);

    /**
     * CPT 导出 文件 信息
     * @param eName     导出文件名
     * @param eReport   cpt文件及文件路径
     * @param paramList cpt文件参数，用 封号 隔开
     * @param ePath     输出文件路径
     * @param fileType  输出文件类型，PDF,XLS,DOC
     * @return 输出执行情况Json 对象
     */
    @RequestMapping(value = "/exportFile", method = RequestMethod.POST)
    @ResponseBody
    public String exportFile(String eName,String eReport,String paramList,String ePath,String fileType){
        log.info("开始组装输出文件参数...");
        Map<String,Object> rstMap = new HashedMap(2);
        FileOutputStream outputStream = null;
        ModuleContext.startModule(EngineModule.class.getName());
        String rePath = eReport;
         if(null == rePath || rePath.equals("")){
            rstMap.put("status","601");
            rstMap.put("message","参数异常，文件路径参数不能为空！");
            log.info("调用输出文件参数类失败，文件路径参数为空!");
        } else {
            try {
                TemplateWorkBook workbook = TemplateWorkBookIO.readTemplateWorkBook(FRContext.getCurrentEnv(), rePath);
                ////// 生成文件参数
                Map paramMap = new HashMap<String, String>();
                ///String paramList = eb.getParamList();
                String[] paramArr = paramList.split(";");
                for (int i = 0; i < paramArr.length; i++) {
                    String[] params = paramArr[i].split(":");
                    String param = params[0];
                    String val = "";
                    if (params.length != 0) {
                        val = params[1];
                    }

                    paramMap.put(param, val);
                    log.info("正在组装参数：参数名：{}，参数值：{}", param, val);
                }

                ResultWorkBook result = workbook.execute(paramMap, new WriteActor());

                String outFile = ePath ;
                File output = new File(outFile);
                if (!output.exists()) {
                    output.mkdirs();
                    log.info("未找到相关路径，自动创建文件。");
                }
                String fileTypes = "";
                if (null == fileType || fileType.equals("") || fileType.toUpperCase().equals("PDF")) {
                    fileTypes = ".PDF";
                } else if (fileType.toUpperCase().equals("XLS")) {
                    fileTypes = ".XLS";
                } else if (fileType.toUpperCase().equals("DOC")) {
                    fileTypes = ".DOC";
                } else if (fileType.toUpperCase().equals("JPG") || fileType.toUpperCase().equals("PNG") || fileType.toUpperCase().equals("GIF") || fileType.toUpperCase().equals("BMP")) {
                    fileTypes = "."+fileType;
                }
                ////// 组合生成相关文件
                if(null == eName || eName.equals("")){
                    Calendar cld = Calendar.getInstance();
                    long mills = cld.getTimeInMillis();
                    eName = ""+mills;
                    log.info("没有传入文件名，默认生成 毫秒的 文件名：{}",eName);
                }

                output = new File(ePath+eName+fileTypes);

                log.info("输出文件为:"+ePath+eName+fileTypes);
                if(!output.exists()){
                    output.createNewFile();
                }

                outputStream = new FileOutputStream(output);
                log.info("开始准备输出文件...");
                String outType = fileType;    //文件输出类型
                if (null != outType || outType.equals("")) {
                    if (outType.toUpperCase().equals("PDF")) {
                        PDFExporter pdfExporter = new PDFExporter();
                        pdfExporter.export(outputStream, result);
                        log.info("输出PDF文件类型...");
                    } else if (outType.toUpperCase().equals("XLS")) {
                        ExcelExporter xlsExporter = new ExcelExporter();
                        xlsExporter.export(outputStream, result);
                        log.info("输出XLS文件类型...");
                    } else if (outType.toUpperCase().equals("DOC")) {
                        WordExporter wordExporter = new WordExporter();
                        wordExporter.export(outputStream, result);
                        log.info("输出DOC文件类型...");
                    }else if (outType.toUpperCase().equals("JPG")) {
                        ImageExporter imgExporter = new ImageExporter();
                        imgExporter.export(outputStream, result);
                        log.info("输出JPG文件类型...");
                    }
                } else {
                    PDFExporter pdfExporter = new PDFExporter();
                    pdfExporter.export(outputStream, result);
                    log.info("没有匹配对应的输出文件类型,默认输出PDF文件...");
                }

                rstMap.put("status", "200");
                rstMap.put("message", "输出文件成功！");

                outputStream.close();
            } catch (Exception e) {
                ///e.printStackTrace();
                log.error("FineReport 处理异常：{}", e.getMessage());

                rstMap.put("status", "604");
                rstMap.put("message", "打开文件异常，文件目录为空！");
            }finally {
                ModuleContext.stopModules();
            }
        }
        return JSONUtil.toJsonStr(rstMap);
    }
}
