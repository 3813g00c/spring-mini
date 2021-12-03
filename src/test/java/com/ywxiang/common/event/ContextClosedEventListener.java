package com.ywxiang.common.event;

import com.ywxiang.context.ApplicationListener;
import com.ywxiang.context.event.ContextClosedEvent;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("容器关闭了！" + this.getClass().getName());
    }
}
