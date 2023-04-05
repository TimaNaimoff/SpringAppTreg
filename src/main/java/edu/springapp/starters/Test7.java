package edu.springapp.starters;

import edu.springapp.configs.SpringConfig;
import edu.springapp.models.Cat;
import edu.springapp.models.Person;
import edu.springapp.models.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
//        Cat cat=context.getBean("catBean",Cat.class);
//        System.out.println(cat);
//        System.out.println("CAT'S SAYING!!!");
//        cat.say();
        Person person=context.getBean("personBean",Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
        context.close();
    }
}
