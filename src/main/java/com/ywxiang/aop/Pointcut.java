package com.ywxiang.aop;

/**
 * @author xiangyaowei
 * @date 2021/12/2
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodeMatcher();
}
