package com.onion.template.spring.boot.mybatis.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 这个工具类意义不大，直接使用redisUtil足够了
 * @date 2020/7/5 13:34
 **/
@Component
public class TokenUtil {
    private static final Logger logger = LoggerFactory.getLogger(TokenUtil.class);
    //@Resource
    //private RedisTemplate<String, Object> redisTemplate; 注意：直接注入redisTemplate会为空
    @Resource
    private RedisUtil redisUtil;

    /**
     * 生成token
     * @param userId 用户ID
     * @return Token
     * */
    public String getToken(String userId) {
        String uuid = UUID.randomUUID().toString();
        String token_key = userId+"_"+uuid.replace("_","");
        String value = userId + "_token";
        //缓存时间为一天
        //redisTemplate.opsForValue().set(key,token,2, TimeUnit.DAYS);
        redisUtil.set(token_key,value,2, TimeUnit.DAYS);
        return token_key;
    }
    /**
     * 检查token
     * @param token
     * @return true更新token;false令牌不存在
     * */
   /* public Boolean checkToken(String token){
        // 空token 返回false
        if(token == null || token.equals("")){
            return false;
        }
        // 分解token
        String[] arr1 = token.split("_");
        // 格式不对返回false
        if(arr1.length != 2){
            return false;
        }
        try {
            String value = arr1[0] + "_token";
            // 读取服务器token
            //String r_token = redisTemplate.opsForValue().get(key).toString();
            //String r_token2 = redisTemplate.opsForValue().get("2016_token").toString();
            String r_token = arr1[1];
            boolean hasToken = redisUtil.hasKey(token);

            //String r_token2 = (String) redisUtil.get(key);
            //System.out.println("@@@"+r_token2);
            // 服务器token 过期 或 与用户token 不相等返回false
            *//*if(r_token2 == null || ! r_token2.equals(token)){
                return false;
            }*//*
            if(hasToken){
                redisUtil.set(token, value, 48, TimeUnit.HOURS);
                return true;
            }
            // 更新token时长
            return false;
            //redisTemplate.opsForValue().set(key, token, 12, TimeUnit.HOURS);
            //return true;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
        return false;
    }*/
    /**
     * 注销token
     * @param token
     * @return true成功;false失败
     * */
    public Boolean clearToken(String token){
        // 空token 返回false
        if(token == null || token.equals("")){
            return false;
        }
        // 分解token
        String[] arr1 = token.split("_");
        // 格式不对返回false
        if(arr1.length != 2){
            return false;
        }
        try {
            //String value = arr1[0] + "_token";
            // 读取服务器token
            boolean hasToken = redisUtil.hasKey(token);
            // 服务器token 过期 或 与用户token 不相等返回false
            if(hasToken){
                redisUtil.del(token);
                return true;
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        System.out.println(str);
    }
}
