package com.yutong.beans.factory;

import com.yutong.beans.BeanDefinition;

public interface BeanFactory {
    Object getBean(String beanId);
}
