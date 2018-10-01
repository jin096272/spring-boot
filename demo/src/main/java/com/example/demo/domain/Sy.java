package com.example.demo.domain;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sy")
public class Sy {
    private String name;
    private String password;
    private List<String> alist;
    private String[] str;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getAlist() {
        return alist;
    }

    public void setAlist(List<String> alist) {
        this.alist = alist;
    }

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public void show() {
        System.out.println("sy.name=" + name);
        System.out.println("sy.password=" + password);
        System.out.println("sy.alist[0]=" + alist.get(0));
        System.out.println("sy.alist[1]=" + alist.get(1));
        System.out.println("sy.alist[2]=" + alist.get(1));
        System.out.println("sy.str[0]=" + str[0]);
    }
}
