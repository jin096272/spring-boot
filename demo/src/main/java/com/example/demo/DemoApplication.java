package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.domain.Sy;
import com.example.demo.domain.User;
import com.example.demo.domain.UserConfig;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println(context.getBean(User.class)); //获取bean对象
        System.out.println(context.getBean(List.class)); //获取自定义bean
        System.out.println(context.getEnvironment().getProperty("aaa")); //获取配置文件
        context.getBean(UserConfig.class).show();
        context.getBean(Sy.class).show();
    }
}
