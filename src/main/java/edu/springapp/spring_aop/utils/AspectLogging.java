package edu.springapp.spring_aop.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogging {
    @Before("execution (public void get*(..))")
    public void beforeGetBookAdvice(){
        System.out.println(this.getClass().getMethods()[0].getName()+" INFO TRUE");
    }
    @Before("execution (public * return*())")
    public void beforeReturnBook(){
        System.out.println("beforeReturnBookAdvice: Trying return book!");
    }
}
