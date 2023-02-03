package com.onion.template.spring.boot.mybatis.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.onion.template.spring.boot.mybatis.TemplateSpringBootMybatisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExcelTest
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/6
 * @Version V1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TemplateSpringBootMybatisApplication.class)
@Transactional
@Rollback
public class ExcelTest {

    @Test
    public void testRead(){
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream("C:\\Users\\admin\\Desktop\\onion\\excel\\zzz.xlsx");
            ExcelReader excelReader = EasyExcel.read(inputStream , User.class , new UserDataListener()).build();
            ReadSheet readSheet = EasyExcel.readSheet(0).build();
            excelReader.read(readSheet);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void SimpleWrite(){
        String fileName = "C:\\Users\\admin\\Desktop\\onion\\excel\\zzz1.xlsx";
        EasyExcel.write(fileName , User.class).sheet("fuck").doWrite(data());
    }

    private List<User> data(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(4L);
        user.setName("测试4");
        user.setCreateTime("2020.1.1");
        user.setDescription("fuck");
        list.add(user);
        return list;
    }

}
