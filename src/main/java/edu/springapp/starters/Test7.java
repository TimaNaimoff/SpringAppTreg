package edu.springapp.starters;

import edu.springapp.configs.SpringConfig;
import edu.springapp.models.Cat;
import edu.springapp.models.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
//        Cat cat=context.getBean("catBean",Cat.class);
//        System.out.println(cat);
        Person person=context.getBean("personBean",Person.class);
        person.callYourPet();
        context.close();
    }
}
