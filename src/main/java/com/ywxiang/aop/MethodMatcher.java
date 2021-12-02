package com.ywxiang.aop;

import java.lang.reflect.Method;

/**
 * @author xiangyaowei
 * @date 2021/12/2
 */
public interface MethodMatcher {
    boolean matches(Method method, Class<?> targetClass);
}
