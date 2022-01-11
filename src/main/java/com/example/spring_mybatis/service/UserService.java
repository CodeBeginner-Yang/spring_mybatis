package com.example.spring_mybatis.service;

import com.example.spring_mybatis.dao.UserMapper;
import com.example.spring_mybatis.po.User;
import com.example.spring_mybatis.query.UserQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserByName(String uname){

        return userMapper.getUserByName(uname);
    }

    public PageInfo<User> getUserList(UserQuery userQuery){
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new PageInfo<>(userMapper.selectAllByParams(userQuery));
    }
}
