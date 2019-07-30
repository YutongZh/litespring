package com.yutong.beans.factory.support;

import com.yutong.beans.BeanDefinition;

public class GenericBeanDefinition implements BeanDefinition {
    private String id;
    private String beanClassName;
    public GenericBeanDefinition(String id, String beanClassName) {

        this.id = id;
        this.beanClassName = beanClassName;
    }
    public String getBeanClassName() {

        return this.beanClassName;
    }

}
