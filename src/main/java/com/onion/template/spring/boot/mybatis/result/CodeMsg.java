package com.onion.template.spring.boot.mybatis.result;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/6/27 11:20
 **/
public class CodeMsg {
    private int code;
    private String msg;

    //通用错误码
    public static CodeMsg SUCCESS = new CodeMsg(200100 , "success");
    public static CodeMsg TOKEN_ERRO = new CodeMsg(400100, "Token错误或为空");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100 , "服务器异常");
    public static CodeMsg BIND_ERROR = new CodeMsg(500101 , "参数校验异常：%s");
    //登录模块 5002XX
    public static CodeMsg SESSION_ERROR = new CodeMsg(500210 , "Session不存在或者已经失效");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500211, "登录密码不能为空");
    public static CodeMsg MOBILE_EMPTY = new CodeMsg(500212, "手机号不能为空");


    public CodeMsg() {
    }

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
    public CodeMsg fillArgs(Object... args){
        int code = this.code;
        String message = String.format(this.msg , args);
        return new CodeMsg(code , message);
    }

    @Override
    public String toString() {
        return "CodeMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
