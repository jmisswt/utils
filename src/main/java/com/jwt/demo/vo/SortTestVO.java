package com.jwt.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SortTestVO {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "SortTestVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
