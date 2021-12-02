package com.ywxiang.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author xiangyaowei
 * @date 2021/12/2
 */
public class AdvisedSupport {
    private TargetSource source;

    private MethodInterceptor methodInterceptor;

    private MethodMatcher methodMatcher;

    public TargetSource getSource() {
        return source;
    }

    public void setSource(TargetSource source) {
        this.source = source;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    public MethodMatcher getMethodMatcher() {
        return methodMatcher;
    }

    public void setMethodMatcher(MethodMatcher methodMatcher) {
        this.methodMatcher = methodMatcher;
    }
}
