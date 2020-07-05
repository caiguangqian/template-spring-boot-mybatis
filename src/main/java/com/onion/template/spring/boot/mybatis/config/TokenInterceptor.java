package com.onion.template.spring.boot.mybatis.config;

import com.onion.template.spring.boot.mybatis.util.RedisUtil;
import com.onion.template.spring.boot.mybatis.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/7/5 13:26
 **/
@Configuration
public class TokenInterceptor extends WebMvcConfigurationSupport {
    private static final Logger logger=LoggerFactory.getLogger(TokenInterceptor.class);
    private static final String OPTIONS="OPTIONS";
    @Resource
    private RedisUtil redisUtil;
    @Resource
    private TokenUtil tokenUtil;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

        HandlerInterceptor handlerInterceptor =new  HandlerInterceptor(){
            @Override
            public boolean preHandle(HttpServletRequest request , HttpServletResponse response , Object handler) throws Exception{
                response.setHeader("Access-Control-Allow-Origin", "*");
                response.setHeader("Access-Control-Allow-Credentials", "true");
                response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS");
                response.setHeader("Access-Control-Max-Age", "86400");
                response.setHeader("Access-Control-Allow-Headers", "Authorization");
                // 放行OPTIONS请求，防止因跨域导致的请求失败
                if(OPTIONS.equals(request.getMethod().toUpperCase())){
                    return true;
                }
                // 非OPTIONS请求TOKEN验证
                String token = request.getHeader("authorization");
                System.out.println(token);
                if (token != null) {
                    //boolean flag = tokenUtil.checkToken(token);
                    boolean flag = redisUtil.hasKey(token);
                    if (flag) {
                        return true;
                    }
                }
                return false;
            }
        };
        // 拦截路径配置，不拦截 login 和 logout（exclude表示排除）
        registry.addInterceptor(handlerInterceptor).excludePathPatterns("/*/login","/*/logout");
    }
}
