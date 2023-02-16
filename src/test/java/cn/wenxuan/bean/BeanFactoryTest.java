package cn.wenxuan.bean;

import junit.framework.TestCase;

public class BeanFactoryTest extends TestCase {

    public void testUserService() {
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("beanDefinition", beanDefinition);

        UserService us = (UserService) beanFactory.getBeanDefinition("beanDefinition").getBean();
        us.queryUserInfo();
    }

}
