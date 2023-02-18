package cn.wenxuan.bean.factory.support;

import cn.wenxuan.bean.BeanException;
import cn.wenxuan.bean.factory.BeanFactory;
import cn.wenxuan.bean.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeanException {
        Object bean = this.getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException;

}
