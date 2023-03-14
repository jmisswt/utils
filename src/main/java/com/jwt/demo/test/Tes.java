package com.jwt.demo.test;

import cn.hutool.crypto.digest.MD5;
import org.apache.commons.codec.digest.Md5Crypt;
import sun.util.resources.cldr.nmg.LocaleNames_nmg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author jiangwentao
 * @description
 * @createTime 2023年02月23日 13:29
 */
public class Tes {
    public static void main(String[] args) {
        List<TestVO> list = new ArrayList<>();
        list.add(new TestVO("111", "aaa"));
        list.add(new TestVO("222", "bbb"));
        list.add(new TestVO("333", "aaa"));
        list.add(new TestVO("111", "ccc"));
        list.add(new TestVO("111", "bbb"));

        Map<String, List<TestVO>> collect = list.stream().collect(Collectors.groupingBy(TestVO::getAccountId));
        collect.forEach((key, value)-> System.out.println(key + "：" + value.size()));

        List<Long>  ids=new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(31L);
        System.out.println(ids.toString());

        System.out.println(1);

        String str="/data/cmp/images/9ddaf608-353a-be8c-6a0a-19b4ebbab495";


        MD5 md5=new MD5();
        String md5Str = md5.digestHex(new File("F:\\pve_centos7.9dhcp.qcow2"));
        System.out.println(md5Str);
    }
}
