package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/*
 * 两种获取配置文件的方法
 * 配置文件默认的配置文件名为application.properties
 * 位置为classpath下或者在classpath的config目录下
 *
 * 默认的配置文件名字可以使用--spring.config.name=app来指定    右键选择Run As里面的Run configurations里面的 Arguments里面修改
 * 默认的配置文件路径可以使用--spring。config。location=file:F:/springboot/app.properties来指定
 * 1,classpath:或2,file:F:/springboot/app.properties
 */
@Component
public class UserConfig {
    /*
     * @Value默认必须要有配置项，可以为空，如果没有默认项可以给默认值
     */
    @Value("${root}")
    private String root;
    @Value("${root2}")
    private String root2;
    @Value("${bbb}")
    private String bbb;
    @Value("${ccc:我是谁}")
    private String ccc;
    @Autowired
    private Environment env;

    public void show() {
        System.out.println(env.getProperty("aaa"));
        System.out.println(bbb);
        System.out.println(ccc);
        System.out.println(env.getProperty("name"));
        System.out.println(env.getProperty("app.name"));
        System.out.println(root);
        System.out.println(root2);
    }
}
