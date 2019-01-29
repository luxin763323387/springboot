package com.cn.lx.controller;

import com.cn.lx.entity.User;
import com.cn.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
      public int   add(User user){
          return userService.add(user) ;
      }

      @RequestMapping(value = "queryUserInfo",method = RequestMethod.GET)
    public User queryUserInfo(@RequestParam(name = "id")Integer id ){
        return userService.queryById(id);
      }
}
