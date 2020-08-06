package com.sky.springbootmybatisplus.service.test.impl;

import com.sky.springbootmybatisplus.entity.test.Test;
import com.sky.springbootmybatisplus.mapper.test.TestMapper;
import com.sky.springbootmybatisplus.service.test.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-08-07
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
