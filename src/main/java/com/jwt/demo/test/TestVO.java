package com.jwt.demo.test;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jiangwentao
 * @description
 * @createTime 2023年03月08日 13:16
 */
@Data
@Accessors(chain = true)
public class TestVO {

    private String imageId;

    private String accountId;

    public TestVO(String imageId, String accountId) {
        this.imageId = imageId;
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "imageId='" + imageId + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }
}
