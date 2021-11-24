package com.ywxiang.context.support;

import com.ywxiang.beans.factory.support.DefaultListableBeanFactory;
import com.ywxiang.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            reader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
