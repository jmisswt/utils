package com.jwt.demo.thread;

import java.util.concurrent.Callable;

/**
 * @description: Callable实现多线程
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/24 16:38
 */
public class MyCallable implements Callable<String> {

    public String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + i);
        }
        return "执行完成";
    }
}
