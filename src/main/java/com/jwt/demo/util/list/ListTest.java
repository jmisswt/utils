package com.jwt.demo.util.list;

import com.jwt.demo.util.bean.vo.BeanTestVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jiangwentao
 * @description
 * @createTime 2023年01月09日 10:03
 */
public class ListTest {
    public static void main(String[] args) {
        double[][] doubles = ListUtil.linearScatters();
        //二维数组输出
        Stream.of(doubles).forEach(t -> System.out.println(Arrays.toString(t)));

        List<String> list1 = new ArrayList<>();
        list1.add("11");
        list1.add("22");
        list1.add("22");

        List<String> list2 = new ArrayList<>();
        list2.add("22");
        list2.add("22");
        list2.add("33");

        List<BeanTestVO> list3 = new ArrayList<>();
        list3.add(new BeanTestVO("111", "111"));
        list3.add(new BeanTestVO("222", "bbb"));
        list3.add(new BeanTestVO("111", "ccc"));

        //Stream常见操作：过滤
        list1.stream().filter(l -> l.equalsIgnoreCase("111")).collect(Collectors.toList());
        list3.stream().filter(l -> l.getId().equalsIgnoreCase("111")).collect(Collectors.toList());
        //Stream常见操作：去重（同时保证原有顺序）
        list1.stream().distinct().collect(Collectors.toList());
        //Stream常见操作：排序
        list2.stream().sorted(Comparator.comparing(String::new)).collect(Collectors.toList());
        list3.stream().sorted(Comparator.comparing(BeanTestVO::getId).thenComparing(BeanTestVO::getName).reversed()).collect(Collectors.toList());
        //Stream常见操作：取某一属性的集合
        list3.stream().map(BeanTestVO::getId).collect(Collectors.toList());
        //Stream常见操作：生成map，t->t 表示取对象本身，(n1, n2) -> n2 表示n1,n2重复则取n2
        list3.stream().collect(Collectors.toMap(BeanTestVO::getId, t -> t, (n1, n2) -> n2));
        //Stream常见操作：取最大值
        list2.stream().max(Comparator.comparing(String::new));
        list3.stream().max(Comparator.comparing(BeanTestVO::getId));

    }
}
