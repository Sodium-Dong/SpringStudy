package com.xushu.springboot_xushu.exception;

import com.xushu.springboot_xushu.pojo.dto.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandlerAdvice {
    @ExceptionHandler({Exception.class})
    public ResponseMessage handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        // 记录日志
        Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
        log.error("统一异常：", e);
        return new ResponseMessage(500, "error", null);
    }
}
