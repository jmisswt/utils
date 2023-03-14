package com.jwt.demo.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: 资源池
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/24 16:22
 */
public class ThreadPoolUtil {
    public static ThreadPoolExecutor executorService = new ThreadPoolExecutor(
            5,
            10,
            5,
            TimeUnit.MINUTES,
            new ArrayBlockingQueue<>(5),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());
}
