package com.onion.template.spring.boot.mybatis.result;


import java.io.Serializable;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/6/27 11:32
 **/
public class Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;
    public static <T> Result<T> success(T data){
        return new Result<>(200 , "SUCCESS" , data);
    }
    public static <T> Result<T> success(){
        return new Result<>();
    }
    public static <T> Result<T> error(CodeMsg codeMsg){
        return new Result<>(codeMsg);
    }
    private Result(){
        this.code=200;
        this.msg="SUCCESS";
    }
    private Result(CodeMsg codeMsg){
        if(codeMsg!=null){
            this.code=codeMsg.getCode();
            this.msg=codeMsg.getMsg();
        }
    }

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
