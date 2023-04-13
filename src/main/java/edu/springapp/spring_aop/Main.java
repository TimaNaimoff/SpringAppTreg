package edu.springapp.spring_aop;

import edu.springapp.spring_aop.config.SpringConfig;
import edu.springapp.spring_aop.models.Book;
import edu.springapp.spring_aop. models.Library;
import edu.springapp.spring_aop.models.LibraryTypeTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Library library=context.getBean("libraryBean",Library.class);
        library.returnBook();
//        library.getBook("Elrik from Melnibone");
//        library.getMagazine();
        Book book=context.getBean("book", Book.class);
        library.getBook();
        library.returnMagazine();
        library.addBook("Timur",book );
        library.addMagazine() ;
        LibraryTypeTwo libraryTypeTwo=  context.getBean("libraryTypeTwo",LibraryTypeTwo.class);
        libraryTypeTwo.getBook(123);

        context.close();
    }
}
