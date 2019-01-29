package com.cn.lx.dao;

import com.cn.lx.entity.User;
import com.github.pagehelper.Page;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 获取所有数据
     * @return
     */
    List<User> findAll();

    /**
     * 分页查询数据
     * @return
     */
    Page<User> findByPage();

}