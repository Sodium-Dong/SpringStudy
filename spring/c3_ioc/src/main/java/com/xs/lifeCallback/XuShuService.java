package com.xs.lifeCallback;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;

public class XuShuService implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("初始化PostConstruct");
    }

    @PostConstruct
    public void init2() throws Exception {
        System.out.println("初始化init2");
    }
}
