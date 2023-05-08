package edu.springapp.spring_aop.utils;

import edu.springapp.spring_aop.models.Student;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution (* get*())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: we log the receipt of the list of students before the getStudent method");
    }
    @AfterReturning(pointcut="execution (* get*())",returning="students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        Student person1=students.get(0);
        String nameSurname=person1.getSurName();
        nameSurname="Mr "+nameSurname;
        person1.setSurName(nameSurname);
        double averageGrade=person1.getAverageGrade();
        averageGrade=averageGrade+1;
        person1.setAverageGrade(averageGrade);
        System.out.println("afterReturningGetStudentsLoggingAdvice: we log the receipt of the list of students after the getStudent method");
    }

}
