package com.jwt.demo.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.bind.annotation.ControllerAdvice;

import static com.jwt.demo.util.constant.ConstantUtil.DEFAULT_RESPONSE_FAIL_CODE;
import static com.jwt.demo.util.constant.ConstantUtil.DEFAULT_RESPONSE_FAIL_MSG;


/**
 * @description: 业务异常错误码和错误信息
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cnl
 * @date: 2022/1/10 9:39
 */
@Data
@ControllerAdvice
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    /**
     * 错误信息
     */
    private final String msg;


    public BusinessException() {
        this.code = DEFAULT_RESPONSE_FAIL_CODE;
        this.msg = DEFAULT_RESPONSE_FAIL_MSG;
    }

    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;
        this.code = DEFAULT_RESPONSE_FAIL_CODE;
    }

    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
