package cn.wenxuan.bean;

public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return this.bean;
    }

}
