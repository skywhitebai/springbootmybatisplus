package com.sky.springbootmybatisplus.controller;


import com.sky.springbootmybatisplus.entity.Test;
import com.sky.springbootmybatisplus.entity.User;
import com.sky.springbootmybatisplus.service.ITestService;
import com.sky.springbootmybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-08-06
 */
@RestController
@RequestMapping("//user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/list")
    public List<User> list() {
        return userService.list();
    }
}
