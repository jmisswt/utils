package com.jwt.demo.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

import static com.jwt.demo.util.constant.ConstantUtil.DEFAULT_RESPONSE_FAIL_CODE;
import static com.jwt.demo.util.constant.ConstantUtil.DEFAULT_RESPONSE_FAIL_MSG;
import static com.jwt.demo.util.constant.ConstantUtil.DEFAULT_RESPONSE_SUCCESS_CODE;
import static com.jwt.demo.util.constant.ConstantUtil.DEFAULT_RESPONSE_SUCCESS_MSG;


/**
 * @description: 接口返回结果处理
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/21 10:42
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class RestResult<T> implements Serializable {
    private static final long serialVersionUID = 9211889136173018364L;

    /**
     * 请求成功,code：200
     */
    private static final int SUCCESS_CODE = 200;
    /**
     * 请求成功,msg：处理成功
     */
    private static final String SUCCESS_MSG = "处理成功";

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 响应内容-默认为空
     */
    private T data = null;

    public RestResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RestResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> RestResult<T> ok() {
        return new RestResult<T>().setCode(DEFAULT_RESPONSE_SUCCESS_CODE).setMsg(DEFAULT_RESPONSE_SUCCESS_MSG);
    }

    public static <T> RestResult<T> ok(String message) {
        return new RestResult<T>().setCode(DEFAULT_RESPONSE_SUCCESS_CODE).setMsg(message);
    }

    public static <T> RestResult<T> ok(T data) {
        return ok(data, DEFAULT_RESPONSE_SUCCESS_CODE, DEFAULT_RESPONSE_SUCCESS_MSG);
    }

    public static <T> RestResult<T> ok(T data, String message) {
        return ok(data, DEFAULT_RESPONSE_SUCCESS_CODE, message);
    }

    public static <T> RestResult<T> ok(T data, int code, String message) {
        return new RestResult<T>().setData(data).setCode(code).setMsg(message);
    }

    public static RestResult<Void> error() {
        return error(DEFAULT_RESPONSE_FAIL_MSG);
    }

    public static RestResult<Void> error(String message) {
        return error(DEFAULT_RESPONSE_FAIL_CODE, message);
    }

    public static RestResult<Void> error(int code, String message) {
        return new RestResult<Void>().setCode(code).setMsg(message);
    }

    public static <T> RestResult<T> error(T body, String message) {
        return error(body, DEFAULT_RESPONSE_FAIL_CODE, message);
    }

    public static <T> RestResult<T> error(T body, int code, String message) {
        return new RestResult<T>().setCode(code).setMsg(message).setData(body);
    }
}
