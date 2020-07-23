package com.onion.template.spring.boot.mybatis.util;

import java.io.InputStream;

/**
 * @ClassName FileUtil
 * @Description: TODO
 * @Author onion
 * @Date 2020/7/22
 * @Version V1.0
 **/
public class FileUtil {

    public static InputStream getResourcesFileInputStream(String fileName) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("static/excel/" + fileName);
    }
}
