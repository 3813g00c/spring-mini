package com.ywxiang.aop;

import com.ywxiang.aop.aspectj.AspectJExpressionPointcut;
import com.ywxiang.service.HelloService;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author xiangyaowei
 * @date 2021/12/2
 */
public class PointcutExpressionTest {

    @Test
    public void testPointcutExpressionTest() throws NoSuchMethodException {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* com.ywxiang.service.HelloService.*(..))");
        Class<HelloService> aClass = HelloService.class;
        Method hello = aClass.getDeclaredMethod("hello");

        System.out.println(pointcut.matches(aClass));
        System.out.println(pointcut.matches(hello, aClass));
    }
}
