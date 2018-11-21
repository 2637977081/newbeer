package com.univer.novice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lvgang
 * @descript
 * @time 2018-11-16 19:48
 */
@SpringBootApplication
@MapperScan("com.univer.novice.mapper")
public class NoviceEmailApplication {
    public static void main(String[] args){
        SpringApplication.run(NoviceEmailApplication.class,args);
    }
}
