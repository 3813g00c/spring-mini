package com.ywxiang.context.support;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.config.BeanPostProcessor;
import com.ywxiang.context.ApplicationContext;
import com.ywxiang.context.ApplicationContextAware;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
