package org.freefly.simplesugarmark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"org.freefly.simplesugarmark.mapper"})
public class SimpleSugarMarkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSugarMarkApplication.class, args);
    }

}
