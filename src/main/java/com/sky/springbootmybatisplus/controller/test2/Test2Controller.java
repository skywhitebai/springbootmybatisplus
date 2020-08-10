package com.sky.springbootmybatisplus.controller.test2;


import com.sky.springbootmybatisplus.entity.test2.Test2;
import com.sky.springbootmybatisplus.service.test2.ITest2Service;
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
 * @since 2020-08-10
 */
@RestController
@RequestMapping("//test2")
public class Test2Controller {
    @Autowired
    ITest2Service test2Service;
    @RequestMapping("//list")
    public List<Test2> list(){
        List list=test2Service.list();
        return list;
    }
}
