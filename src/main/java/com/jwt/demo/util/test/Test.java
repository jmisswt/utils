package com.jwt.demo.util.test;


/**
 * @author jiangwentao
 * @description
 * @createTime 2023年01月17日 20:58
 */
public class Test {
    public static void main(String[] args) {
        int byteToMb = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();

        System.out.println("total:"+runtime.totalMemory()/byteToMb);

        System.out.println("max:"+runtime.maxMemory()/byteToMb);
    }
}
