package com.jhblog.admin.web;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdminAopConfig {

    @Before("execution(* com.jhblog.admin.*.*Controller.*(..))")
    public void viewTest() {
        System.out.println("aopTest");
    }
}
