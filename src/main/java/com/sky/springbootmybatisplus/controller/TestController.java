package com.sky.springbootmybatisplus.controller;


import com.sky.springbootmybatisplus.entity.Test;
import com.sky.springbootmybatisplus.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-08-06
 */
@RestController
@RequestMapping("//test")
public class TestController {
    @Autowired
    ITestService testService;

    @RequestMapping("/list")
    public List<Test> list() {
        return testService.list();
    }
}
