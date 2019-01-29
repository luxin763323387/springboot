package com.cn.lx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cn.lx.dao")
public class SpringbootMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }

}

