package com.ywxiang.common.event;

import com.ywxiang.context.ApplicationListener;
import com.ywxiang.context.event.ContextRefreshedEvent;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("容器刷新完成！" + this.getClass().getName());
    }
}
