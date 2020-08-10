package com.sky.springbootmybatisplus.controller.test1;


import com.sky.springbootmybatisplus.entity.test1.Test1;
import com.sky.springbootmybatisplus.service.test1.ITest1Service;
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
@RequestMapping("//test1")
public class Test1Controller {
    @Autowired
    ITest1Service test1Service;
    @RequestMapping("//list")
    public List<Test1> list(){
        List list=test1Service.list();
        return list;
    }
    @RequestMapping("//delete")
    public int delete(Integer id){
        test1Service.removeById(id);
        return 1;
    }
    @RequestMapping("//update")
    public boolean update(Integer id){
        Test1 test1=test1Service.getById(id);
        test1.setDr(0);
        return test1Service.updateById(test1);
    }
}
