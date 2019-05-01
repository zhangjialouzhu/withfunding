package com.yuc.with_boot.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yuc.with_boot")
@MapperScan("com.yuc.with_boot.mapper")
public class WithBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WithBootApplication.class, args);
    }

}
