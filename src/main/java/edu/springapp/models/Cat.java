package edu.springapp.models;


public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat is created!");
    }
    public void say(){
        System.out.println("Meow meow!");
    }
}
