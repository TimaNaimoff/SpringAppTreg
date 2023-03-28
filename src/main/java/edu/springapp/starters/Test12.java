package edu.springapp.starters;

import edu.springapp.models.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test12 {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Pet pet=context.getBean("myPet",Pet.class);
        pet.say();
        context.close();
    }
}
