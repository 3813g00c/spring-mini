package com.ywxiang.context.event;

import com.ywxiang.context.ApplicationContext;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public class ContextClosedEvent extends ApplicationContextEvent{
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
