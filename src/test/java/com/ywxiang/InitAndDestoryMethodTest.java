package com.ywxiang;

import com.ywxiang.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author xiangyaowei
 * @date 2021/11/25
 */
public class InitAndDestoryMethodTest {

    @Test
    public void testInitAndDestroyMethod() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:init-destroy-method.xml");
        applicationContext.registerShutdownHook();  //或者手动关闭 applicationContext.close();
    }
}
