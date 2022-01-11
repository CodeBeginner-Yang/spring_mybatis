package com.example.spring_mybatis.exception;

import lombok.Data;

/**
 * @program: spring_mybatis
 * @author: YHK
 * @create: 2022-01-11 21:49
 **/
@Data
public class ParamException extends RuntimeException {
    private Integer code=300;
    private String msg="参数异常";
    public ParamException(String msg) {
        super(msg);
        this.msg=msg;
    }
    public ParamException(){
        super("参数异常");
    }
}
