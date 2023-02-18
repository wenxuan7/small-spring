package cn.wenxuan.bean.factory;

import cn.wenxuan.bean.BeanException;

public interface BeanFactory {

    Object getBean(String beanName) throws BeanException;
}
