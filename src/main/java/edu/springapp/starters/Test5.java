package edu.springapp.starters;

import edu.springapp.models.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContextTwo.xml");
        Cat cat=context.getBean("myPet",Cat.class);
        cat.say();
        Cat cat2=context.getBean("myPet",Cat.class);
        cat2.say();
        context.close();
    }
}
