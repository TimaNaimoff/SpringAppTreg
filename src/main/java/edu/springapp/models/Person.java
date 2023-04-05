package edu.springapp.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Qualifier("catBean")
//    @Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surName;
    @Value("${person.age}")
    private int age;
//    @Autowired
//    public Person(@Qualifier("catBean")Pet pet){
//        this.pet=pet;
//    }
    public Person(Pet pet){
        this.pet=pet;
    }
    public void callYourPet(){
        System.out.println("Khu-khu! Surname=" +getSurName()+",age="+getAge());
        this.pet.say();
    }
//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet){
        System.out.println("Dependency "+pet+" is injected!");
        this.pet=pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Surname set!");
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age set!");
        this.age = age;
    }

}
