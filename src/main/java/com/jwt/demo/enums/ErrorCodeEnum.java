package com.jwt.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 错误枚举
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2021/12/27 11:10
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {
    /**
     * 参数为空或校验失败
     */
    PARAM_NULL_OR_VALID(10000, "参数为空或校验失败!"),

    USER_NOT_EXISED(1100, "用户信息不存在！"),
    USER_EXISED(1100, "用户信息已存在，不能重复！"),
    ;

    /**
     * 错误码
     */
    private final int code;
    /**
     * 错误描述
     */
    private final String msg;
}
