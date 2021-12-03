package com.ywxiang.aop.framework;

import com.ywxiang.aop.AdvisedSupport;
import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiangyaowei
 * @date 2021/12/2
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler {
    private final AdvisedSupport support;

    public JdkDynamicAopProxy(AdvisedSupport support) {
        this.support = support;
    }

    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(getClass().getClassLoader(), support.getSource().getTargetClass(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (support.getMethodMatcher().matches(method, support.getSource().getTarget().getClass())) {
            MethodInterceptor methodInterceptor = support.getMethodInterceptor();
            return methodInterceptor.invoke(new ReflectiveMethodInvocation(support.getSource().getTarget(), method, args));
        }
        return method.invoke(support.getSource().getTarget(), args);
    }
}
