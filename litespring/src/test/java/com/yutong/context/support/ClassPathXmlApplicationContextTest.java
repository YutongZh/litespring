package com.yutong.context.support;

import com.yutong.context.ApplicationContext;
import org.junit.Test;

public class ClassPathXmlApplicationContextTest {

    @Test
    public void getBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("petstore-v1.xml");
        Object petstore = applicationContext.getBean("petStore");
    }
}
