package com.example.demo2;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo2.dao.UserDao;
import com.example.demo2.domain.User;


@SpringBootApplication
@EnableTransactionManagement
public class Demo2Application {

    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext context = SpringApplication.run(Demo2Application.class, args);
        DataSource dataSource = context.getBean(DataSource.class);
        Connection c = dataSource.getConnection();
        System.out.println(c.getCatalog());
        c.close();
        User user = context.getBean(User.class);
        user.setU_name("zhangsan");
        user.setU_password("zhangsan");
        context.getBean(UserDao.class).add(user);

    }
}
