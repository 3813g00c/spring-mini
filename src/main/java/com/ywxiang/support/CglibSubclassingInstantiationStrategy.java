package com.ywxiang.support;

import com.ywxiang.BeansException;
import com.ywxiang.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;

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
