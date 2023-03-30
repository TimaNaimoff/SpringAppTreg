package edu.springapp.starters;

import edu.springapp.models.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:autoconfig.xml");
        Dog dog=context.getBean("dogBean",Dog.class);
        Dog dog2=context.getBean("dogBean",Dog.class);
        dog.say();

//        System.out.println(dog==dog2);
//        System.out.println(dog);
//        System.out.println(dog2);
        context.close();
    }
}
