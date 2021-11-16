package com.ywxiang.beans.support;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.config.BeanDefinition;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{
    private CGLibProxy cgLibProxy = new CGLibProxy();
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        return cgLibProxy.getProxy(beanDefinition.getBeanClass());
    }
}
