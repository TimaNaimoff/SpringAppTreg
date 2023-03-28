package edu.springapp.models;

public class Person {
    private Pet pet;
    private String surName;
    private int age;
    public Person(){
        System.out.println("Person is created!");
    }
    public Person(Pet pet){
        System.out.println("Person is created!");
        this.pet=pet;
    }
    public void callYourPet(){
        System.out.println("Khu-khu! Surname=" +getSurName()+",age="+getAge());
        this.pet.say();
    }
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
