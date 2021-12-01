package com.ywxiang.beans.factory;

import com.ywxiang.beans.BeansException;

/**
 * @author xiangyaowei
 * @date 2021/11/30
 */
public interface BeanFactoryAware extends Aware{
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
