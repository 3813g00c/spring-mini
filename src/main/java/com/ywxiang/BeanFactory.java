package com.ywxiang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangyaowei
 * @date 2021/9/18
 */
public class BeanFactory {
    private final Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
