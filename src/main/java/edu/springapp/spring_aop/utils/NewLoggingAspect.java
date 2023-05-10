package edu.springapp.spring_aop.utils;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution (public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: library trying return book");
//        long start=System.currentTimeMillis();
    Object targetMethodResult=null;
    try {
         targetMethodResult = joinPoint.proceed();
    }catch(RuntimeException e){
        System.out.println("aroundReturnBookAdvice: was catch exception: "+e);
        throw e;
    }
//        long end=System.currentTimeMillis();
//        System.out.println(end+":"+start);
        System.out.println("aroundReturnBookAdvice: library success return book");
//        System.out.println("aroundReturnBookAdvice finished his work with :"+(end-start));
        return targetMethodResult;
    }
}
