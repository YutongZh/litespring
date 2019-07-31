package com.yutong.context.support;

import com.yutong.core.io.ClassPathResource;
import com.yutong.core.io.Resource;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    private ClassLoader beanClassLoader;

    public ClassPathXmlApplicationContext(String config){
        super(config);
    }
    @Override
    protected Resource getResource(String config) {
        return new ClassPathResource(config, this.getBeanClassLoader());
    }

}
