package com.xs.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new UserService();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
