package edu.springapp.spring_aop.utils;

import edu.springapp.spring_aop.models.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class AspectLogging {
//      @Pointcut("execution (* edu.springapp.spring_aop.models.Library.*(..))")
//      private void allMethodsFromLibrary(){
//      }
//      @Pointcut("execution (public void edu.springapp.spring_aop.models.Library.returnMagazine())")
//      private void returnMagazineFromLibrary(){}
//      @Pointcut("allMethodsFromLibrary() && !returnMagazineFromLibrary()")
//      private void allMethodsExceptReturnMagazineFromLibrary(){}
//      @Before("allMethodsExceptReturnMagazineFromLibrary()")
//      public void beforeAllMethodsExceptReturnMagazineAdvice(){
//          System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: #Log 10");
//      }
//    @Pointcut("execution (* edu.springapp.spring_aop.models.Library.return*())")
//    public void allReturnMethodsFromLibrary(){}
//    @Pointcut("execution (* edu.springapp.spring_aop.models.Library.add*())")
//    public void allAddMethodsFromLibrary(){}
//    @Pointcut("execution (* edu.springapp.spring_aop.models.Library.get*())")
//    public void allGetMethodsFromLibrary(){}
//    @Pointcut("allGetMethodsFromLibrary()||allReturnMethodsFromLibrary()")
//    private void allGetAndReturnMethodsFromLibrary(){
//    }
//    @Before("allReturnMethodsFromLibrary()")
//    public void beforeReturnBookLoggingAdvice(){
//        System.out.println("returnBook: returning book!");
//    }
//    @Before("allGetMethodsFromLibrary()")
//    public void beforeGetBookLoggingAdvice(){
//        System.out.println("beforeGetBookLoggingAdvice: GET");
//    }
//    @Before("allGetAndReturnMethodsFromLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: #Log 3");
//    }
    @Before("edu.springapp.spring_aop.utils.MainPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature=(MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature: "+methodSignature);
        System.out.println("methodSignature.getMethod() = "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+methodSignature.getName());
        if(methodSignature.getName().equals("addBook")){
            Object[]arguments= joinPoint.getArgs();
            for(Object obj:arguments){
                if(obj instanceof Book myBook){
                    System.out.println("INFO books: book's name = "+myBook.getName()+", author = "+myBook.getAuthor()+",year of publication = "+myBook.getYearOfPublication());
                }else if(obj instanceof String string){
                    System.out.println("INFO current user: "+string);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: INFO TRUE");
        System.out.println("---------------------");
    }
}
