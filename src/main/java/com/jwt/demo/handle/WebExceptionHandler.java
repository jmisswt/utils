package com.jwt.demo.handle;

import com.jwt.demo.common.RestResult;
import com.jwt.demo.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 异常处理，自定义异常捕获类型
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/21 10:45
 */
@ControllerAdvice
public class WebExceptionHandler {

    /**
     * @description: 处理自定义异常
     * @author: jiangwentao
     * @date: 2022/1/21 11:22
     */
    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public RestResult<Void> businessExceptionHandle(HttpServletRequest httpServletRequest, BusinessException businessException) {
        return RestResult.error(businessException.getCode(),businessException.getMessage());
    }

//    /**
//     * @description: 处理其他异常
//     * @author: jiangwentao
//     * @date: 2022/1/21 11:22
//     */
//    @ResponseBody
//    @ExceptionHandler(value = Exception.class)
//    public Response<Void> otherExceptionHandler(Exception e) {
//        return Response.error();
//    }
}
