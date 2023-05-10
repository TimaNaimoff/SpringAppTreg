package edu.springapp.starters;

import edu.springapp.spring_aop.config.SpringConfig;
import edu.springapp.spring_aop.models.Library;
import edu.springapp.spring_aop.models.Student;
import edu.springapp.spring_aop.models.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test51 {
    public static void main(String[]args) {
        System.out.println("Main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Library library=context.getBean("libraryBean",Library.class);
        String bookName=library.returnBook();
        System.out.println("To library returned book: "+bookName);
        context.close();
        System.out.println("Main ends");
    }
    }
