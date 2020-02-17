package cn.harryai.test.springboot.testaop.config;

import cn.harryai.test.springboot.testaop.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Harry
 * @since 2020/02/16 11:39
 **/
@Aspect
@Component
public class UserServiceAspect {
    @Pointcut("execution(* cn.harryai.test.springboot.testaop.serviceimpl.*.create*(..))")
    public void createMethod() {
    }

    @Pointcut("execution(* cn.harryai.test.springboot.testaop.serviceimpl.*.query*(..))")
    public void queryMethod() {
    }

    @Before("createMethod()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Before advice,All args is:" + Arrays.toString(args));
    }

    @After("createMethod()")
    public void after(JoinPoint joinPoint) {
        System.out.println("After advice");
    }

    @AfterReturning(value = "createMethod()", returning = "retVal")
    public void after(User retVal) {
        System.out.println("After returning advice,the return val is " + retVal);
    }

    @Around("createMethod()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice before");
        Object proceed = joinPoint.proceed();
        System.out.println("Around advice after");
        return proceed;
    }

    @AfterThrowing(value = "queryMethod()", throwing = "ex")
    public void afterThrow(Throwable ex) {
        System.out.println("Then cause of exception is:" + ex.getMessage());
    }

}
