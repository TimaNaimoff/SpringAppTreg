package edu.springapp.models;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
//    private String name;
    public Cat(){
        System.out.println("Cat is created!");
    }
    public void say(){
        System.out.println("Meow meow!");
    }

    public void init(){
        System.out.println("class Cat init-method");
    }
    public void destroy(){
        System.out.println("class Cat destroy-method");
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
