package com.zhisan.fastboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhisan
 */
@SpringBootApplication
@MapperScan("com.zhisan.**.mapper")
public class FastbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastbootApplication.class, args);
    }

}
