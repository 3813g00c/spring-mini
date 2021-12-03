package com.ywxiang.context.event;

import com.ywxiang.context.ApplicationContext;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    public ContextRefreshedEvent(ApplicationContext source) {
        super(source);
    }
}
