package edu.springapp.spring_aop.models;

import org.springframework.stereotype.Component;

@Component("libraryTypeTwo")
public class LibraryTypeTwo extends AbstractLibrary{
//    @Override
    public void getBook(int count) {
        System.out.println("LibraryTwo "+count);
    }
}
