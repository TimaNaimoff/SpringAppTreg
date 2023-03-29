package edu.springapp.starters;

import edu.springapp.models.Cat;
import edu.springapp.models.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:autoconfig.xml");
        Cat cat=context.getBean("catBean",Cat.class);
        cat.say();
        context.close();
    }
}
