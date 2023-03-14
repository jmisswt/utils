package com.jwt.demo.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 自定义分页
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/28 14:44
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class MyPaging<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private long totalElements;// 总记录数
    private int totalPages;// 总页数
    private boolean first;// 是否首页
    private boolean last;// 是否最后一页
    private int number;// 当前页码，从0开始
    private int size = 10;// 每页记录数,默认10
    private int numberOfElements;// 当前页记录数
    private List<T> content = new ArrayList<>();// 数据列表

    public MyPaging(long totalElements, int totalPages, boolean first, boolean last, int number, int size, int numberOfElements) {
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.first = first;
        this.last = last;
        this.number = number;
        this.size = size;
        this.numberOfElements = numberOfElements;
    }
}
