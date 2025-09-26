package org.southwind.c4_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect  // 标记为了切面类
@Component  // 让这个类被 Spring 容器管理
public class LogAspect {
    // 切点表达式
    // @Around 表示环绕通知
    // * → 匹配任意返回值, 匹配 UserService 类里所有方法，任意参数
    @Around("execution(* org.southwind.c4_aop.UserService.*(..))")
    // 环绕通知专属参数，它表示被拦截的方法调用
    public void log(ProceedingJoinPoint proceedingJoinPoint) {
        // 记录方法时间
        long start = System.currentTimeMillis();
        try {
            // proceed() 会让目标方法继续执行
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("方法异常，" + e.getMessage());
        }
        long end = System.currentTimeMillis();
        System.out.println("方法用时：" + (end - start));
    }
}
