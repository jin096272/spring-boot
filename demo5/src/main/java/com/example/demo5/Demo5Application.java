package com.example.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo5.dao.UserDao;
import com.example.demo5.domain.User;
import com.example.demo5.service.UserService;

@SpringBootApplication
public class Demo5Application {
    /*
     * spring boot 默认日志级别时info
     * 可以通过logging.level.*=debug  来设置,*可以是包也可以是类
     * 日志级别有：TRACE,DEBUG,INFO,WARN,ERROR,FATAL,OFF
     * 日志级别为off时表示关闭日志输出
     * logging.file=F:/springboot/my.log文件输出
     * logging.path=F:/springboot/logs
     */

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo5Application.class, args);
        context.getBean(UserDao.class).log();
        context.getBean(UserService.class).log();
        context.getBean(User.class).log();
    }
}
