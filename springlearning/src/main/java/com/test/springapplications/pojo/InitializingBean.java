package com.test.springapplications.pojo;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitializingBean implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("before" + beanName);
        return bean;

    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("After" + beanName);
        return bean;

    }

}
