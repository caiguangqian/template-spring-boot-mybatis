package com.onion.template.spring.boot.mybatis.config.easyexcel.listener.impl;

import com.onion.template.spring.boot.mybatis.config.easyexcel.listener.BaseExcelListener;
import com.onion.template.spring.boot.mybatis.config.easyexcel.model.Order;
import lombok.extern.slf4j.Slf4j;

/**
 * @author WuKun
 * @since 2019/10/10
 */
@Slf4j
public class OrderListener extends BaseExcelListener<Order> {

    @Override
    public boolean validateBeforeAddData(Order object) {
        return true;
    }

    @Override
    public void doService() {
        log.info("/*------- 写入数据 -------*/");
    }
}
