package com.example.examan.ctrleaman.configurations;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AOP {

    @After("execution(int com.example.examan.ctrleaman.services.serviceImpl.*.*(..))")
    public void logMethodExecutionTime(JoinPoint joinPoint) {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        log.info("Execution time of " + joinPoint.getSignature().getName() + " is : " + executionTime + " ms");
    }
}
