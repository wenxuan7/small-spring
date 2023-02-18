package cn.wenxuan.bean.factory.config;

public class BeanDefinition {

    private final Class<?> bean;

    public BeanDefinition(Class<?> bean) {
        this.bean = bean;
    }

    public Class<?> getBeanClass() {
        return this.bean;
    }

}
