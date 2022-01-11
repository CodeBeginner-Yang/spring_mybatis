package com.example.spring_mybatis.controller;

import com.example.spring_mybatis.po.User;
import com.example.spring_mybatis.query.UserQuery;
import com.example.spring_mybatis.service.UserService;
import com.example.spring_mybatis.utils.AssertUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_mybatis
 * @author: YHK
 * @create: 2021-12-29 00:07
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/{userName}")
    public User queryUserByName(@PathVariable String userName){
        System.out.println("参数->userName"+userName);
        //int i=1/0;
       // AssertUtils.isTrue(true,"异常测试");
        AssertUtils.isTrue();
        return userService.getUserByName(userName);
    }
    @RequestMapping("/user/list")
    public PageInfo<User> list(UserQuery userQuery){
        return userService.getUserList(userQuery);
    }
}
