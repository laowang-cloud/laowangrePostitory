package com.example.bangbangxia.service;


import com.example.bangbangxia.domain.RespPageBean;
import com.example.bangbangxia.domain.User;

import java.util.List;

public interface UserService {
    //插入User
    int insertUser(User user);

    //分页查询所有用户
    RespPageBean getUserByPage(Integer page, Integer size);

    //更新用户
    int updateUser(User user);

    //删除用户
    int deleteUserById(Integer user_id);
}
