package com.cn.lx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cn.lx.dao")
public class SpringbootMybatis2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis2DemoApplication.class, args);
    }

}

