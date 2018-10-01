package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class MyList {
    @Bean
    public List<User> geLits() {
        return new ArrayList<User>();
    }


}
