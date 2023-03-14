package com.jwt.demo.thread;

/**
 * @description: 继承Thread实现多线程
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/24 16:42
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("my Thread -" + i);
        }
    }
}
