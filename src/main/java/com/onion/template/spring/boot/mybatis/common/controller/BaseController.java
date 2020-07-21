package com.onion.template.spring.boot.mybatis.common.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.onion.template.spring.boot.mybatis.common.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.List;

/**
 * web层通用数据处理
 * 
 * @author onion
 */
public class BaseController
{
    protected final Logger logger = LoggerFactory.getLogger(BaseController.class);


    @InitBinder/**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    public void initBinder(WebDataBinder binder)
    {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport()
        {
            @Override
            public void setAsText(String text)
            {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

    /**
     * 设置请求分页数据
     */
    protected PageInfo startPage(int pageNum , int pageSize , List<?> list)
    {
        PageHelper.startPage(pageNum , pageSize);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }


}
