package com.example.demo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo6Application {
    /*
     * 测试步骤
     * 在要测试的类上加2注解
     * @RunWith(SpringRunner.class)
     * @SpringBootTest
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(Demo6Application.class, args);
    }
}
