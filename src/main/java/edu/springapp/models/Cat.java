package edu.springapp.models;


public class Cat implements Pet{
    private String name;
    public Cat(){
        System.out.println("Cat is created!");
    }
    public void say(){
        System.out.println("Meow meow!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
