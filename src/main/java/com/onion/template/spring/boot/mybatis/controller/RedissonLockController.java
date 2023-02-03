package com.onion.template.spring.boot.mybatis.controller;

/**
 * @ClassName RedissonLockController
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/7
 * @Version V1.0
 **/

import com.onion.template.spring.boot.mybatis.config.redission.RedisLockUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * redis分布式锁控制器
 * @author gourd
 * @since 2019-07-30
 */
@RestController
@Api(tags = "redisson", description = "redis分布式锁控制器" )
@RequestMapping("/redisson" )
@Slf4j
public class RedissonLockController {

    @Autowired
    private RedissonClient redissonClient;
    private static  final String lock="test";
    private static  final String SUCCESS="success";
    private static  final String FAILED="failed";
    /**
     * 锁测试共享变量
     */
    private Integer lockCount = 10;

    /**
     * 无锁测试共享变量
     */
    private Integer count = 10;

    /**
     * 模拟线程数
     */
    private static int threadNum = 10;

    /**
     * 模拟并发测试加锁和不加锁
     * @return
     */
    @GetMapping("/test")
    @ApiOperation(value = "模拟并发测试加锁和不加锁")
    public void lock(){
        // 计数器
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < threadNum; i ++) {
            MyRunnable myRunnable = new MyRunnable(countDownLatch);
            Thread myThread = new Thread(myRunnable);
            myThread.start();
        }
        // 释放所有线程
        countDownLatch.countDown();
    }

    /**
     * 如果只有一个线程来访问，那么在rLock.tryLock() 这个方法就会阻塞，等锁释放然后再继续下面的操作，
     * 如果是多线程访问，那么在rLock.tryLock() 这个方法会直接返回false不阻塞了,继续往下执行
     * 可以配合Jmeter 来测试
     * 更多锁的demo,可以参考wiki: https://github.com/redisson/redisson/wiki/8.-%E5%88%86%E5%B8%83%E5%BC%8F%E9%94%81%E5%92%8C%E5%90%8C%E6%AD%A5%E5%99%A8
     * @return
     */
    @GetMapping("/test11")
    public Object test(){
        //获取锁实例
        RLock rLock = redissonClient.getLock(lock);
        boolean isLock =false;
        try {
            // 上锁
            isLock = rLock.tryLock();
            System.out.println(Thread.currentThread().getName()+"isLock="+isLock);
            if (isLock) {
                System.out.println(Thread.currentThread().getName()+"我抢到锁了，开心，先休息10秒先");
                Thread.sleep(10 *1000);
                // todo service 业务代码
            }else {
                System.out.println(Thread.currentThread().getName()+"被人锁了，郁闷下次再来");
                return "error";
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(isLock){
                System.out.println(Thread.currentThread().getName()+"不玩了，开锁了！！！");
                // 解锁
                rLock.unlock();
            }
        }
        return "SUCCESS";
    }
    /**
     * 加锁测试
     */
    private void testLockCount() {
        String lockKey = "lock-test";
        try {
            // 加锁，设置超时时间2s
            RedisLockUtil.lock(lockKey,2, TimeUnit.SECONDS);
            lockCount--;
            log.info("lockCount值："+lockCount);
        }catch (Exception e){
            log.error(e.getMessage(),e);
        }finally {
            // 释放锁
            RedisLockUtil.unlock(lockKey);
        }
    }

    /**
     * 无锁测试
     */
    private void testCount() {
        count--;
        log.info("count值："+count);
    }


    public class MyRunnable implements Runnable {
        /**
         * 计数器
         */
        final CountDownLatch countDownLatch;

        public MyRunnable(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                // 阻塞当前线程，直到计时器的值为0
                countDownLatch.await();
            } catch (InterruptedException e) {
                log.error(e.getMessage(),e);
            }
            // 无锁操作
            testCount();
            // 加锁操作
            testLockCount();
        }

    }

}
