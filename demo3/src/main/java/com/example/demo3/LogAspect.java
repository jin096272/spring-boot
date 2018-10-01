package com.example.demo3;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
 * application.properties里面可以配置是否启用aop
 */

@Aspect
@Component
public class LogAspect {
    //执行方法前
    @Before("execution(* com.example.demo3.dao..*.*(..))")
    public void log() {
        System.out.println("before method log done");
    }

    @After("execution(* com.example.demo3.dao..*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("after method log done" + joinPoint.getTarget().getClass() + ",args:" + Arrays.asList(joinPoint.getArgs()) + ",method:" + joinPoint.getSignature().getName());
    }
}
