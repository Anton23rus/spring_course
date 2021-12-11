package com.bbraun.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

// @Pointcut ("execution(* com.bbraun.spring.aop.UniLibrary.*(..))")
//private void allMethodsFromUniLibrary() {
// }
//
// @Pointcut ("execution(public void com.bbraun.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
// }
//
// @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice : Log #10");
//    }


//    @Pointcut("execution(* com.bbraun.spring.aop.UniLibrary.get*())")
//private  void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.bbraun.spring.aop.UniLibrary.return*())")
//    private  void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice : writing Log #3");
//    }
//


    @Before("com.bbraun.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());

        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("----------------------------------------");
    }


}
