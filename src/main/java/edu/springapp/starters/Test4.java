package edu.springapp.starters;

import edu.springapp.models.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[]args){
         ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContextTwo.xml");
         Cat cat=context.getBean("myPet", Cat.class);
//         cat.setName("Murris");
         Cat cat2=context.getBean("myPet",Cat.class);
//         cat.setName("Turris");
//         System.out.println(cat.getName());
//         System.out.println(cat2.getName());
         System.out.println(cat.equals(cat2));
         System.out.println(cat+" : "+cat2);

         context.close();
    }
}
