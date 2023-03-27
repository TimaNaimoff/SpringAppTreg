package edu.springapp.models;

public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Bow-Wow!");
    }
}
