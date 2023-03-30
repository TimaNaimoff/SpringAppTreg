package edu.springapp.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Bow-Wow!");
    }
    public Dog(){
        System.out.println("Dog is created!");
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean initialized!");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean destroyed!");
        }
    }

