package com.ywxiang.context;

import com.ywxiang.context.event.ApplicationEvent;

import java.util.EventListener;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    void onApplicationEvent(E event);
}
