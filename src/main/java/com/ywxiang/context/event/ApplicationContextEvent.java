package com.ywxiang.context.event;

import com.ywxiang.context.ApplicationContext;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public abstract class ApplicationContextEvent extends ApplicationEvent{

    public ApplicationContextEvent(ApplicationContext source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
