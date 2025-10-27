package com.xys.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {
    // 匹配业务层的所有方法
    @Pointcut("execution(* com.xys.service.*Service.*(..))")
    private void servicePt(){};

    @Around("Advice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();

        Long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; ++i){
            pjp.proceed();
        }
        Long end = System.currentTimeMillis();
        System.out.println("万次执行：" + className + "." + methodName + " ---------> " + (end - start) + "ms");
    }
}
