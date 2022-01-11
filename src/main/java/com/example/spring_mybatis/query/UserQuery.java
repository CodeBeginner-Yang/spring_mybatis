package com.example.spring_mybatis.query;

import lombok.Data;

/**
 * @program: spring_mybatis
 * @author: YHK
 * @create: 2021-12-30 23:36
 **/
@Data
public class UserQuery {

    private int pageNum=1;
    private int pageSize=10;
    private String userName;
}
