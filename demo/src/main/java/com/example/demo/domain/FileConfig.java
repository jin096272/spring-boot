package com.example.demo.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/*
 * 加载外部的配置
 *
 */
@Configuration
//@PropertySource("classpath:jdbc.properties")
@PropertySources({@PropertySource("classpath:jdbc.properties"), @PropertySource("file:/F:/springboot/jdbc2.properties")})
public class FileConfig {

}
