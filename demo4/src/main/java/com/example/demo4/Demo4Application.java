package com.example.demo4;

import java.util.Hashtable;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import redis.clients.jedis.Jedis;

@SpringBootApplication
public class Demo4Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo4Application.class, args);
        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("syang", "syang");
        jedis.hset("ww","mm", "qqqqqq");
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.putAll(jedis.hgetAll("ww"));
        Iterator<String> i = hashtable.keySet().iterator();
        while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(hashtable.get(string));
		}
        System.out.println(jedis.get("syang"));
        jedis.close();
 
    }
}
