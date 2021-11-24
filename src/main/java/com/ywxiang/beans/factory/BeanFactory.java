package com.ywxiang.beans.factory;

import com.ywxiang.beans.BeansException;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;

    /**
     * 根据名称和类型检查bean
     *
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
