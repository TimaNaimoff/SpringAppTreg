package edu.springapp.spring_aop.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(3)
public class ExceptionHandlingAdvice {
    @Before("edu.springapp.spring_aop.utils.MainPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: handing exceptions " +
                "after trying book/journal");
    }
}
