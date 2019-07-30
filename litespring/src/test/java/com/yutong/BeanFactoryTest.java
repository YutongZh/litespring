package com.yutong;

import com.yutong.beans.factory.BeanFactory;
import com.yutong.beans.BeanDefinition;
import com.yutong.beans.factory.support.BeanDefinitionRegistry;
import com.yutong.beans.factory.support.DefaultBeanFactory;
import com.yutong.beans.factory.xml.XmlBeanDefinitionReader;
import com.yutong.service.PetStoreService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeanFactoryTest {

    DefaultBeanFactory factory = null;
    XmlBeanDefinitionReader xmlBeanDefinitionReader = null;

    @Before
    public void setup(){
        factory = new DefaultBeanFactory();
        xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
    }
    @Test
    public void getBean() {
        xmlBeanDefinitionReader.loadBeanDefinitions("petstore-v1.xml");
        PetStoreService petStoreService = (PetStoreService)factory.getBean("petStore");
        assertNotNull(petStoreService);
    }
}
