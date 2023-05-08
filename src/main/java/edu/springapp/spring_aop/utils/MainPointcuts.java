package edu.springapp.spring_aop.utils;

import org.aspectj.lang.annotation.Pointcut;

public class MainPointcuts {
    @Pointcut("execution (* abc*(..))")
    public void allAddMethods(){
    }
}
