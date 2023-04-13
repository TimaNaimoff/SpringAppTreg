package edu.springapp.spring_aop.utils;

import org.aspectj.lang.annotation.Pointcut;

public class MainPointcuts {
    @Pointcut("execution (* add*(..))")
    public void allAddMethods(){
    }
}
