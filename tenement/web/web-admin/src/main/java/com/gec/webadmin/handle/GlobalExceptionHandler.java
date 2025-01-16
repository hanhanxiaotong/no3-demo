//package com.gec.webadmin.handle;
//
//import com.gec.common.result.Result;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    //全局异常处理
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public Result handleException(Exception e) {
//        e.printStackTrace();
//        return Result.fail();
//    }
//}
