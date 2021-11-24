package com.ywxiang.beans.factory.config;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.BeanFactory;

/**
 * @author xiangyaowei
 * @date 2021/11/23
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行BeanPostProcessor的before方法
     *
     * @param existingBean
     * @param beanName
     * @return
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行BeanPostProcessor的after方法
     *
     * @param existingBean
     * @param beanName
     * @return
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
