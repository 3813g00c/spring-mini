package com.ywxiang.context;

import com.ywxiang.beans.factory.HierarchicalBeanFactory;
import com.ywxiang.beans.factory.ListableBeanFactory;
import com.ywxiang.core.io.ResourceLoader;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {
}
