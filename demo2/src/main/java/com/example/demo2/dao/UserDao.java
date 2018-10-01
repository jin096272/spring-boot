package com.example.demo2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo2.domain.User;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //rollbackFor=Exception.class 表示设置对所有异常进行回滚
    //noRollbackFor 表示设置不回滚的异常
    //事物注解必须在调用方法上面才有效  及add上面
    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user) {
        String sql = "insert into user(u_name,u_password) values('" + user.getU_name() + "','" + user.getU_password() + "')";
        System.out.println(sql);
        jdbcTemplate.execute(sql);
    }

    public void add(User user) {
        addUser(user);
    }
}
