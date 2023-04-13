package edu.springapp.spring_aop.models;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary{
//    @Override
    public void getBook(){
        System.out.println("Getting books ");//+bookName );
        System.out.println("---------------------");
    }
    public void returnBook(){
        System.out.println("Returning book");
        System.out.println(("--------------------"));
    }
    public void returnMagazine(){
        System.out.println("Getting magazine");
        System.out.println("---------------------");
    }
    public void addBook(String personName, Book book){
        System.out.println("Adding books!");
        System.out.println("---------------------");
    }
    public void addMagazine(){
        System.out.println("Adding magazine!");
        System.out.println("---------------------");
    }
}
