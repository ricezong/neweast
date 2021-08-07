package com.zong.east;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.zong.east.mapper")
@ServletComponentScan("com.zong.east")
public class EastApplication {

    public static void main(String[] args) {
        SpringApplication.run(EastApplication.class, args);
    }

}
