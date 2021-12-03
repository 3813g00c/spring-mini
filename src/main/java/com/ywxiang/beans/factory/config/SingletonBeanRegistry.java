package com.ywxiang.beans.factory.config;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);
}
