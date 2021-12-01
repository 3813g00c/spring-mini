package com.ywxiang.beans.factory.config;

import com.ywxiang.beans.BeansException;

/**
 * 实例化Bean之后修改bean的扩展点
 *
 * @author xiangyaowei
 * @date 2021/11/24
 */
public interface BeanPostProcessor {
    /**
     * 在bean执行初始化方法之前执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在bean执行初始化方法之后执行的方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
