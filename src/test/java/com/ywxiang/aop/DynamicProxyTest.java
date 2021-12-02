package com.ywxiang.aop;

import com.ywxiang.aop.aspectj.AspectJExpressionPointcut;
import com.ywxiang.aop.framework.JdkDynamicAopProxy;
import com.ywxiang.common.WorldServiceInterceptor;
import com.ywxiang.service.WorldService;
import com.ywxiang.service.WorldServiceImpl;
import org.junit.Test;

/**
 * @author xiangyaowei
 * @date 2021/12/2
 */
public class DynamicProxyTest {
    @Test
    public void testJdkDynamicProxy() throws Exception {
        WorldService worldService = new WorldServiceImpl();

        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(worldService);
        WorldServiceInterceptor methodInterceptor = new WorldServiceInterceptor();
        MethodMatcher methodMatcher = new AspectJExpressionPointcut("execution(* com.ywxiang.service.WorldService.explode(..))").getMethodeMatcher();
        advisedSupport.setSource(targetSource);
        advisedSupport.setMethodInterceptor(methodInterceptor);
        advisedSupport.setMethodMatcher(methodMatcher);

        WorldService proxy = (WorldService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        proxy.explode();
    }
}
