package com.ywxiang;

import com.ywxiang.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public class EventAndEventListenerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:event-and-event-listener.xml");
        applicationContext.close();
    }
}

