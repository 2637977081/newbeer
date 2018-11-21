package com.univer.novice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lvgang
 * @descript
 * @time 2018-11-16 17:19
 */
@SpringBootApplication
@MapperScan("com.univer.novice.mapper")
public class NoviceKafkaApplication {
    public static void main(String[] args){
        SpringApplication.run(NoviceKafkaApplication.class,args);
    }
}
