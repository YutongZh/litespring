package com.yutong.context.support;

import com.yutong.core.io.FileSystemResource;
import com.yutong.core.io.Resource;

public class FileSystemXmlApplicationContext extends AbstractApplicationContext{

    public FileSystemXmlApplicationContext(String config) {
        super(config);
    }

    @Override
    protected Resource getResource(String config) {
        return new FileSystemResource(config);
    }
}
