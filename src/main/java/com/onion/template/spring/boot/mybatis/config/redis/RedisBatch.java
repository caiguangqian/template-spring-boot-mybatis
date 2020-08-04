package com.onion.template.spring.boot.mybatis.config.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
/**
 * @ClassName RedisBatch
 * @Description: TODO Redis 批量操作
 * @Author onion
 * @Date 2020/8/3
 * @Version V1.0
 **/
@Slf4j
@Service
public class RedisBatch {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 批量设置值
     *
     * @param map 要插入的 key value 集合
     */
    public void barchSet(Map<String, Object> map) {
        redisTemplate.opsForValue().multiSet(map);
    }

    /**
     * 批量获取值
     *
     * @param list 查询的 Key 列表
     * @return value 列表
     */
    public List<Object> batchGet(List<String> list) {
        return redisTemplate.opsForValue().multiGet(list);
    }

}
