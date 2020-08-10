package com.sky.springbootmybatisplus.service.test1.impl;

import com.sky.springbootmybatisplus.entity.test1.Test1;
import com.sky.springbootmybatisplus.mapper.test1.Test1Mapper;
import com.sky.springbootmybatisplus.service.test1.ITest1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-08-10
 */
@Service
public class Test1ServiceImpl extends ServiceImpl<Test1Mapper, Test1> implements ITest1Service {

}
