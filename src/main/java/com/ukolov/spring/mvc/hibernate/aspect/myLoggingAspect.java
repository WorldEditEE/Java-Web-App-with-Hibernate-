package com.ukolov.spring.mvc.hibernate.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class myLoggingAspect {

    @Around("execution(* com.ukolov.spring.mvc.hibernate.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable{

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        String methodName = methodSignature.getName();
        System.out.println("Begin of " + methodName);

        Object targetMethodResult = joinPoint.proceed();
        System.out.println("End of " + methodName);

        return targetMethodResult;

    }

}
