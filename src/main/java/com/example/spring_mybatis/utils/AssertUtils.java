package com.example.spring_mybatis.utils;

import com.example.spring_mybatis.exception.ParamException;

/**
 * @program: spring_mybatis
 * @author: YHK
 * @create: 2022-01-11 21:47
 **/
public class AssertUtils {
    public static void isTrue(boolean flag,String msg){
        if (flag){
            throw new ParamException(msg);
        }
    }
    public static void isTrue(){

            throw new ParamException();

    }
}
