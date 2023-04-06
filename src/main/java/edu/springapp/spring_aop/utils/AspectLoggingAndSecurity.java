package edu.springapp.spring_aop.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLoggingAndSecurity {
    @Pointcut("execution (* get*())")
    private void allGetMethods(){
    }
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: INFO TRUE");
    }
    @Before("execution (public * return*())")
    public void beforeReturnBook(){
        System.out.println("beforeReturnBookAdvice: Trying return book!");
    }
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Security started!");
    }
}
