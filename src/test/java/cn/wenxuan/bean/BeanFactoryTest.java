package cn.wenxuan.bean;

import cn.wenxuan.bean.factory.config.BeanDefinition;
import cn.wenxuan.bean.factory.support.DefaultListableBeanFactory;
import junit.framework.TestCase;

/**
 * 测试bean工厂
 */
public class BeanFactoryTest extends TestCase {

    public void testUserService() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService u1 = (UserService) beanFactory.getBean("userService");
        u1.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService u2 = (UserService) beanFactory.getBean("userService");
        u2.queryUserInfo();

        System.out.println(u1 == u2);
    }

}
