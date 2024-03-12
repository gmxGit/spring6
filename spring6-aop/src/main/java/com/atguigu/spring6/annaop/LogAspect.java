package com.atguigu.spring6.annaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//切面类
@Component //在spring ioc 中进行管理
@Aspect  //切面类
public class LogAspect {
    //    设置切入点，和通知类型
//    通知类型 前置 返回 后置  异常  环绕
//    前置 @Before(value="切入点表达式配置切入点")

    @Before(value = "execution(public int com.atguigu.spring6.annaop.CalculatorImp.add(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger---》前置通知,方法名字" + name + "参数" + Arrays.toString(args));
    }

    //    返回 @AfterReturning
    @AfterReturning(value = "execution(* com.atguigu.spring6.annaop.CalculatorImp.add(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger---》返回通知,方法名字" + name + "返回结果" + result);
    }

    //    后置 @After()
    @After(value = "execution(* com.atguigu.spring6.annaop.CalculatorImp.add(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger---》后置通知,方法名字" + name);
    }

    //    异常 @AfterThrowing
    @AfterThrowing(value = "execution(* com.atguigu.spring6.annaop.CalculatorImp.add(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger---》异常通知，方法名称" + name + "异常信息" + ex);
    }

    //    环绕 @Around()
    @Around(value = "execution(* com.atguigu.spring6.annaop.CalculatorImp.add(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        Object proceed=null;
        Object[] args = joinPoint.getArgs();
        String toString = Arrays.toString(args);
        String name = joinPoint.getSignature().getName();
        System.out.println("环绕通知==目标方法之前执行");
//调用目标方法
        try {
             proceed = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知==目标方法异常执行"+e);
        } finally {
            System.out.println("环绕通知==目标方法之后执行");
        }
//        System.out.println("Logger---》异常通知，方法名称" + name);
        return proceed;
    }
}
