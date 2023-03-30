package edu.springapp.starters;


import edu.springapp.models.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigureWithAnnotations {

    public static void main(String[]args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:autoconfig.xml");
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
    }
}
