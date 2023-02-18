package cn.wenxuan.bean.factory.support;

import cn.wenxuan.bean.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    Map<String, Object> singletonObjects = new HashMap<String, Object>();

    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object bean) {
        singletonObjects.put(beanName, bean);
    }

}
