package com.example.demo5.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class User {
    private Logger log = LoggerFactory.getLogger(User.class);

    public void log() {
        log.debug("user debug log");
        log.info("user info log");
        log.warn("user warn log");
        log.error("user error log");
    }
}
