package com.example.spring_mybatis;

import com.example.spring_mybatis.exception.ParamException;
import com.example.spring_mybatis.po.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: spring_mybatis
 * @author: YHK
 * @create: 2022-01-11 21:31
 **/
@ControllerAdvice
public class GlobalExeptionHandler {
    /**
     * 全局异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultInfo exceptionHandler(Exception e){
        ResultInfo info = new ResultInfo();
        info.setCode(300);
        info.setMsg("操作异常");
        return info;
    }

    @ExceptionHandler(value = ParamException.class)
    @ResponseBody
    public ResultInfo paramExceptionHandler(ParamException p){
        ResultInfo info = new ResultInfo();
        info.setCode(p.getCode());
        info.setMsg(p.getMsg());
        return info;
    }
}
