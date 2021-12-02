package com.ywxiang.context.event;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.BeanFactory;
import com.ywxiang.beans.factory.BeanFactoryAware;
import com.ywxiang.context.ApplicationListener;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public abstract class AbstractApplicationEventMulticaster implements ApplicationEventMulticaster, BeanFactoryAware {
    public final Set<ApplicationListener<ApplicationEvent>> applicationListeners = new HashSet<>();

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void addApplicationListener(ApplicationListener<?> listener) {
        this.applicationListeners.add((ApplicationListener<ApplicationEvent>) listener);
    }

    @Override
    public void removeApplicationListener(ApplicationListener<?> listener) {
        this.applicationListeners.remove(listener);
    }
}
