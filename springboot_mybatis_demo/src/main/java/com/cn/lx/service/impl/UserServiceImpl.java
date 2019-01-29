package com.cn.lx.service.impl;

import com.cn.lx.dao.UserMapper;
import com.cn.lx.entity.User;
import com.cn.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User queryById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
