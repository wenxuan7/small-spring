package cn.wenxuan.bean.factory.support;

import cn.wenxuan.bean.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
