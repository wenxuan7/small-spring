package cn.wenxuan.bean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public BeanDefinition getBeanDefinition(String name) {
        return beanDefinitionMap.get(name);
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
