package com.onion.template.spring.boot.mybatis.config.redission;

import org.redisson.api.RCountDownLatch;
import org.redisson.api.RLock;
import org.redisson.api.RSemaphore;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName RedisDistributedLocker
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/7
 * @Version V1.0
 **/
//@Component
public class RedisDistributedLocker implements DistributedLocker {

    @Autowired
    private RedissonClient redissonClient;

    @Override
    public RLock lock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock();
        return lock;
    }

    @Override
    public RLock lock(String lockKey, int leaseTime) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(leaseTime, TimeUnit.SECONDS);
        return lock;
    }

    @Override
    public RLock lock(String lockKey, TimeUnit unit ,int timeout) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(timeout, unit);
        return lock;
    }

    @Override
    public boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime) {
        RLock lock = redissonClient.getLock(lockKey);
        try {
            return lock.tryLock(waitTime, leaseTime, unit);
        } catch (InterruptedException e) {
            return false;
        }
    }

    @Override
    public void unlock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.unlock();
    }

    @Override
    public void unlock(RLock lock) {
        lock.unlock();
    }

    @Override
    public RCountDownLatch getCountDownLatch(String name) {
        return redissonClient.getCountDownLatch(name);
    }
    @Override
    public RSemaphore getSemaphore(String name){
        return redissonClient.getSemaphore(name);
    }


    public static interface DistributedLocker {

        RLock lock(String lockKey);

        RLock lock(String lockKey, int timeout);

        RLock lock(String lockKey, TimeUnit unit, int timeout);

        boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime);

        void unlock(String lockKey);

        void unlock(RLock lock);

    }
}
