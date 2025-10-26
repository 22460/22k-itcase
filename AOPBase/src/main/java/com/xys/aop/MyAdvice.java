package com.xys.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component      // 表示当前类被Spring管理
@Aspect            // 表示当前类是一个切面类
public class MyAdvice {
    @Pointcut("execution(void com.xys.dao.BookDao.update())")
    public void pt() {
    }

    @Pointcut("execution(int com.xys.dao.BookDao.select())")
    public void pt2() {
    }

//    @Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }

//    @After("pt()")
    public void after(){
        System.out.println("after advice...");
    }

//    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        // 表示对原始操作的调用
        Object proceed = pjp.proceed();
        System.out.println("around after advice...");
        return proceed;
    }

    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        // 表示对原始操作的调用
        Integer proceed = (Integer) pjp.proceed();
        System.out.println("around after advice...");
        return proceed + 10;
    }

//    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice...");
    }

//    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice...");
    }
}
