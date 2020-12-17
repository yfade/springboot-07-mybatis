package com.adt.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.adt.springboot.mapper")
public class Springboot07MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07MybatisApplication.class, args);
    }

}
