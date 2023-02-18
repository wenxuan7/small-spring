package cn.wenxuan.bean.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
