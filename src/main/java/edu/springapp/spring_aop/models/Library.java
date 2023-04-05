package edu.springapp.spring_aop.models;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary{
//    @Override
    public void getBook(){
        System.out.println("Getting books ");//+bookName );
    }
    public void returnBook(){
        System.out.println("Returning book");
    }
    public void getMagazine(){
        System.out.println("Getting magazine");
    }
}
