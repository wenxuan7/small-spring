package cn.wenxuan.bean.factory.support;

import cn.wenxuan.bean.BeanException;
import cn.wenxuan.bean.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException {
        Object bean = null;

        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeanException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }


}
