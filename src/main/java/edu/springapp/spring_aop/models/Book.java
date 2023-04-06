package edu.springapp.spring_aop.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Chopallan")
    private String name;
    public String getName(){
        return this.name;
    }
}
