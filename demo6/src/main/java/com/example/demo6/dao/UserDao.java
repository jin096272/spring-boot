package com.example.demo6.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public Integer addUser(String username) {
        System.out.println(username);
        if (username == null) {
            return 0;
        }
        return 1;
    }
}
