package com.yutong.context.support;

import com.yutong.beans.factory.support.DefaultBeanFactory;
import com.yutong.beans.factory.xml.XmlBeanDefinitionReader;
import com.yutong.context.ApplicationContext;
import com.yutong.core.io.ClassPathResource;
import com.yutong.core.io.Resource;

/**
 * 模版设计模式应用
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    private DefaultBeanFactory defaultBeanFactory = null;

    public AbstractApplicationContext(String config){
        defaultBeanFactory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultBeanFactory);
        Resource resource = this.getResource(config);
        reader.loadBeanDefinitions(resource);
    }

    @Override
    public Object getBean(String beanId) {
        Object bean = defaultBeanFactory.getBean(beanId);
        return bean;
    }

    protected abstract  Resource getResource(String config);
}
