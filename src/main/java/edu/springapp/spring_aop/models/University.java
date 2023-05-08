package edu.springapp.spring_aop.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private static List<Student> students;
    static{
        students=new ArrayList<>();
    }
    public void addStudents(){
        Student st1=new Student("Timur",4,7.5);
        Student st2=new Student("Bondarchuk",3,8.4);
        Student st3=new Student("Evgen",1,9.4);
        students.add(st1);
        students.add(st2);
        students.add(st3);

    }
    public List<Student>getStudents(){
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
