package com.example.spring_mybatis.po;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @program: spring_mybatis
 * @author: YHK
 * @create: 2021-12-28 23:52
 **/
@Data
@Component
public class User implements Serializable {
    private Long id;//编号
    private String username;//用户名
    private String upwd;//密码

}
