package com.jwt.demo.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @description: 多线程测试
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/24 16:26
 */
public class ThreadTest {
    /**
     * 测试线程执行次数
     */
    private static final int EXECUTE_COUNT = 20;

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        String result = runByCallable("jiangwentao");
        System.out.println(result);
    }

    /**
     * 使用资源池运行Runnable多线程
     *
     * @param name 传参
     */
    public static void runByRunnable(String name) {
        MyRunnable runnable = new MyRunnable(name);
        ThreadPoolUtil.executorService.execute(runnable);
    }

    /**
     * 使用资源池运行Callable多线程
     *
     * @param name 传参
     */
    public static String runByCallable(String name) throws ExecutionException, InterruptedException, TimeoutException {
        MyCallable callable = new MyCallable(name);
        FutureTask<String> futureTask = new FutureTask<>(callable);
        ThreadPoolUtil.executorService.execute(futureTask);
        //阻塞获取返回值
        futureTask.get();
        //阻塞3秒获取返回值
        return futureTask.get(3, TimeUnit.SECONDS);
    }

    /**
     * 使用资源池运行匿名线程
     */
    public static void runByAnonmous() {
        ThreadPoolUtil.executorService.execute(() -> {
            for (int i = 1; i < EXECUTE_COUNT; i++) {
                System.out.println("a-thread" + i);
            }
        });
    }
}
