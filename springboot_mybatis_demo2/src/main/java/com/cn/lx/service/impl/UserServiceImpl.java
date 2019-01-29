package com.cn.lx.service.impl;

import com.cn.lx.dao.UserMapper;
import com.cn.lx.entity.User;
import com.cn.lx.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public Page<User> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.findByPage();
    }

}
