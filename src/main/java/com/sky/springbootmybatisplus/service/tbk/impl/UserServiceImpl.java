package com.sky.springbootmybatisplus.service.tbk.impl;

import com.sky.springbootmybatisplus.entity.tbk.User;
import com.sky.springbootmybatisplus.mapper.tbk.UserMapper;
import com.sky.springbootmybatisplus.service.tbk.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
