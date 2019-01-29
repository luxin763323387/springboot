package com.cn.lx.service;

import com.cn.lx.entity.User;

public interface UserService {

   public int add (User user);

   User queryById(Integer id);
}

