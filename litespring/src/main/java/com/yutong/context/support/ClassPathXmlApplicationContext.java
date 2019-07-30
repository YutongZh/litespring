package com.yutong.context.support;

import com.yutong.beans.factory.support.DefaultBeanFactory;
import com.yutong.beans.factory.xml.XmlBeanDefinitionReader;
import com.yutong.context.ApplicationContext;
import com.yutong.core.io.ClassPathResource;
import com.yutong.core.io.Resource;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String config){
        super(config);
    }
    @Override
    protected Resource getResource(String config) {
        return new ClassPathResource(config);
    }
}
