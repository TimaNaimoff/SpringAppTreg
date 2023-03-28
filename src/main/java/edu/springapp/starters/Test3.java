package edu.springapp.starters;

import edu.springapp.models.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[]args){
//        Pet pet=new Dog();
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person person=context.getBean("myPerson",Person.class);
        person.callYourPet();
        context.close();
    }
}
