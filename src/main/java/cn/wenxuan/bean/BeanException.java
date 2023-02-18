package cn.wenxuan.bean;

public class BeanException extends RuntimeException {

    public BeanException(String msg, Throwable e) {
        super(msg, e);
    }

    public BeanException(String msg) {
        super(msg);
    }

}
