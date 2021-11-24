package com.ywxiang.beans.factory.support;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.config.BeanDefinition;
import com.ywxiang.beans.factory.ConfigurableListableBeanFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry, ConfigurableListableBeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        Map<String, T> res = new HashMap<>();
        beanDefinitionMap.forEach((beanName, beanDefinition) -> {
            Class beanClass = beanDefinition.getBeanClass();
            if (type.isAssignableFrom(beanClass)) {
                T bean = (T) getBean(beanName);
                res.put(beanName, bean);
            }
        });
        return res;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        Set<String> strings = beanDefinitionMap.keySet();
        return strings.toArray(new String[strings.size()]);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (null == beanDefinition) {
            throw new BeansException("No bean named" + beanName + "is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public void preInstantiateSingleton() throws BeansException {
        beanDefinitionMap.keySet().forEach(this::getBean);
    }
}
