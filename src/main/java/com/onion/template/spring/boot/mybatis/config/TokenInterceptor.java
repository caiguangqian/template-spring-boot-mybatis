package com.onion.template.spring.boot.mybatis.config;

import com.onion.template.spring.boot.mybatis.result.CodeMsg;
import com.onion.template.spring.boot.mybatis.util.MapperUtils;
import com.onion.template.spring.boot.mybatis.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 拦截器，拦截所有请求，验证token再放行
 * @date 2020/7/5 13:26
 **/
@Configuration
public class TokenInterceptor extends WebMvcConfigurationSupport {
    private static final Logger logger=LoggerFactory.getLogger(TokenInterceptor.class);
    private static final String OPTIONS="OPTIONS";
    @Resource
    private RedisUtil redisUtil;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
                //拦截请求信息
        registry.addResourceHandler("/static/**")
                //拦截真实地址，注意每个访问路径后面的路径加 /
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/images/**")
                //拦截真实地址，注意每个访问路径后面的路径加 /
                .addResourceLocations("classpath:/images/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

        HandlerInterceptor handlerInterceptor =new  HandlerInterceptor(){
            @Override
            public boolean preHandle(HttpServletRequest request , HttpServletResponse response , Object handler) throws Exception{

                // 放行OPTIONS请求，防止因跨域导致的请求失败
                if(OPTIONS.equals(request.getMethod().toUpperCase())){
                    return false;
                }
                // 非OPTIONS请求TOKEN验证
                String token = request.getHeader("authorization");
                System.out.println(token);

                if (null!=token && !"".equals(token)) {
                    boolean flag = redisUtil.hasKey(token);
                    if (flag) {
                        redisUtil.expire(token , 18000);
                        return true;
                    }
                }

                response.reset();
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/json;charset=UTF-8");
                PrintWriter pw = response.getWriter();
                pw.write(MapperUtils.obj2json(CodeMsg.TOKEN_ERROR));
                logger.error("前端Token有问题，校验Redis上的Token失败");
                return false;

            }

        };
        // 拦截路径配置，不拦截 login 和 logout（exclude表示排除）
        registry.addInterceptor(handlerInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/*/login")
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**",
                        "/swagger-ui.html/**",
                        "/**/*.html",
                        "/**/*.js",
                        "/**/*.css",
                        "/**/*.woff2",
                        "/**/*.ttf",
                        "/favicon.ico",
                        "/images"
                );
    }
}
