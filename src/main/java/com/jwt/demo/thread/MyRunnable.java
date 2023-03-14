package com.jwt.demo.thread;

/**
 * @description: Runnable实现多线程
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/24 16:33
 */
public class MyRunnable implements Runnable {
    public String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + i);
        }
    }
}
