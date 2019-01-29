package com.cn.lx.controller;

import com.cn.lx.entity.User;
import com.cn.lx.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public int add(User user) {
        return userService.add(user);
    }

    @RequestMapping(value = "queryUserInfo", method = RequestMethod.GET)
    public User queryUserInfo(@RequestParam(name = "id") Integer id) {
        return userService.queryById(id);
    }

    /**
     * 查询所有信息
     * @return
     */
    @RequestMapping(value = "findAllUserInfo",method = RequestMethod.GET)
    public List<User> findAllUserInfo(){
        return userService.findAll();
    }

    /**
     * 根据分页查询(有些信息可以不要)
     * @return
     */
    @RequestMapping(value = "findUserInfoByPage",method = RequestMethod.GET)
    public PageInfo<User> findUserInfoByPage(){
        Page<User> users = userService.findByPage(1, 2);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }
}
