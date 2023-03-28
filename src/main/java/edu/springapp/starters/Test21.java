package edu.springapp.starters;

import edu.springapp.models.Cat;
import edu.springapp.models.Dog;
import edu.springapp.models.Pet;

public class Test21 {
    public static void main(String[] args) {
        Pet dog=new Dog();
        dog.say();
        Cat cat=new Cat();
        cat.say();
    }
}
