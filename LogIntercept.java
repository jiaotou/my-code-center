/*
 *
 *  * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 *
 */
package com.jiaotou.pay.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jiaotou<jiaotou@dfire.com>
 * @date 2016年12月8日
 */
@Aspect
@Component
public class LogIntercept {

	@Pointcut("execution(public * com.itsoft.action..*.*(..))")
    public void recordLog(){}
     
     
    @Before("recordLog()")
    public void before() {
        this.printLog("已经记录下操作日志@Before 方法执行前");
    }
     
    @Around("recordLog()")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        this.printLog("已经记录下操作日志@Around 方法执行前");
        pjp.proceed();
        this.printLog("已经记录下操作日志@Around 方法执行后");
    }
     
     
    @After("recordLog()")
    public void after() {
        this.printLog("已经记录下操作日志@After 方法执行后");
    }
     
     
    private void printLog(String str){
        System.out.println(str);
    }
}
