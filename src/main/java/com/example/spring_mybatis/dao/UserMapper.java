package com.example.spring_mybatis.dao;

import com.example.spring_mybatis.po.User;
import com.example.spring_mybatis.query.UserQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    User getUserByName(String name);
    List<User> selectAllByParams(UserQuery userQuery);
}
