package com.cn.lx.service;

import com.cn.lx.entity.User;
import com.github.pagehelper.Page;

import java.util.List;

public interface UserService {

   public int add (User user);

   User queryById(Integer id);

   /**
    * 查找所有信息
    * @return
    */
   List<User> findAll();

   /**
    * 根据页数查找
    * @param pageNum
    * @param pageSize
    * @return
    */
   Page<User> findByPage(int pageNum, int pageSize);
}

