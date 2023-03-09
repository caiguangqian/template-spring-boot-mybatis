package com.onion.template.spring.boot.mybatis.util;

import java.util.Map;
import java.util.concurrent.*;

/**
 * @ClassName Thread
 * @Description: TODO
 * @Author onion
 * @Date 2023/3/9
 * @Version V1.0
 **/
public class Thread {
    /*private Map<String, Integer> getExecutorService(Map<String, String> mapjdsql) throws InterruptedException {
        System.out.println("开启多线程...");
        long startTime = System.currentTimeMillis();
        Map<String, Integer> mapResult = new ConcurrentHashMap<>();
        CountDownLatch countDownLatch = new CountDownLatch(mapjdsql.size());
        ExecutorService executorService = new ThreadPoolExecutor(1, 20, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue(10));
        System.out.println("线程池设置完成成！......");
        for (String key : mapjdsql.keySet()) {
            Runnable runnable = () -> {
                String sdsql = mapjdsql.get(key).toString();
                System.out.println("当前线程name:" + java.lang.Thread.currentThread().getName() + "；-执行的节点:" + key + ";sql:" + sdsql);
                DBRowSet sdsqlds = SqlConfigQuery.baiscQueryWithSql(sdsql, null, null, new PageModel(-1, -1));
                if (sdsqlds != null) {
                    if (sdsqlds.getInt(0, 0) > 0) {
                        mapResult.put(key, sdsqlds.getInt(0, 0));
                    }
                }
                countDownLatch.countDown();
            };
            executorService.execute(runnable);
        }
        countDownLatch.await();
        executorService.shutdown();
        return mapResult;
    }*/
}
