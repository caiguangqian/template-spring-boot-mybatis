package com.onion.template.spring.boot.mybatis.exception;


import com.onion.template.spring.boot.mybatis.result.CodeMsg;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/6/27 11:13
 **/
public class GlobalException extends RuntimeException{
    private static final long serialVersionUID=4564124491192825748L;
    private CodeMsg cm;
    public GlobalException(CodeMsg cm){
        super(cm.toString());
        this.cm=cm;
    }
    public GlobalException(){
    }

    public CodeMsg getCm(){
        return cm;
    }
}
