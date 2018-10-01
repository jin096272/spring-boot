package com.example.demo6.dao;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;


@TestConfiguration
public class TestBeanConfiguration {
    @Bean
    public Runnable createRunnable() {
        return new Runnable() {

            public void run() {
                // TODO Auto-generated method stub

            }
        };
    }
}
