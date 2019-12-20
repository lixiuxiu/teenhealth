package com.cx.teenhealth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.cx.teenhealth.*")
public class TeenhealthApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeenhealthApplication.class, args);
    }

}
