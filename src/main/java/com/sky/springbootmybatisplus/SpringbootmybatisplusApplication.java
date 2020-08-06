package com.sky.springbootmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sky.springbootmybatisplus.mapper")
public class SpringbootmybatisplusApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootmybatisplusApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootmybatisplusApplication.class, args);
        logger.info("========================启动完毕========================");
    }

}
