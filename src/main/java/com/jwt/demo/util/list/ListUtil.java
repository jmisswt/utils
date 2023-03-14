package com.jwt.demo.util.list;

import cn.hutool.core.collection.CollUtil;
import com.jwt.demo.util.bean.vo.BeanTestVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jiangwentao
 * @version 2.0.0
 * @className ListUtil.java
 * @description 集合工具类
 * @createTime 2022年06月13日 13:42
 */
public class ListUtil {

    /**
     * 取两个集合相同元素保存在list1
     *
     * @param strList1 list1
     * @param strList2 list2
     * @return 交集
     */
    public static List<String> getMix(List<String> strList1, List<String> strList2) {
        strList1.retainAll(strList2);
        return strList1;
    }

    /**
     * 取list1中有而list2中没有的元素
     *
     * @param strList1 list1
     * @param strList2 list2
     * @return 并集
     */
    public static List<String> getDiff(List<String> strList1, List<String> strList2) {
        strList1.addAll(strList2);
        return strList1;
    }

    /**
     * 取两个集合所有元素保存在list1
     *
     * @param strList1 list1
     * @param strList2 list2
     * @return 差集
     */
    public static List<String> getUnion(List<String> strList1, List<String> strList2) {
        strList1.removeAll(strList2);
        return strList1;
    }

    public static double[][] linearScatters() {
        List<double[]> data = new ArrayList<>();
        for (double x = 0; x <= 10; x += 0.1) {
            double y = 1.5 * x + 0.5;
            // 随机数
            //y += Math.random() * 4 - 2;
            double[] xy = {x, y};
            data.add(xy);
        }
        return data.stream().toArray(double[][]::new);
    }

    /**
     * 计算平均值
     *
     * @param data double类型数据
     * @return 平均值
     */
    private static double getAverage(List<Double> data) {
        return data.stream().mapToDouble(Double::new).average().orElse(0);
    }

    /**
     * 判断集合是否有重复元素
     *
     * @param list 集合
     * @param <T>  类型
     * @return
     */
    public static <T> boolean checkAllEqual(List<T> list) {
        if (list.size() == 1) {
            return true;
        }
        List<T> newList = list.stream().distinct().collect(Collectors.toList());
        return newList.size() == 1;
    }

    /**
     * list转string，逗号分隔
     *
     * @param strList 集合元素
     * @return string
     */
    public static String listTransString(List<String> strList) {
        return CollUtil.join(strList, ",");
    }
}
