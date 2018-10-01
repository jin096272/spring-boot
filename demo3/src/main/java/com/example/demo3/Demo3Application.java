package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo3.dao.UserDao;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo3Application.class, args);
        context.getBean(UserDao.class).add("lisi", "lisi");
        context.close();
    }
}
