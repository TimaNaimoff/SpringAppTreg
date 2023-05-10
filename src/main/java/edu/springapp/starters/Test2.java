package edu.springapp.starters;

import edu.springapp.spring_aop.config.SpringConfig;
import edu.springapp.spring_aop.models.Student;
import edu.springapp.spring_aop.models.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        University university = context.getBean("university",University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        }catch(RuntimeException e){
            System.out.println("Exception catch: "+e);
        }
        context.close();
    }
}
