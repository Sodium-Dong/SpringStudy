package com.xs;

import com.xs.service.OrderService;
import com.xs.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class C3IocApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(C3IocApplication.class, args);

        System.out.println(ioc.getBean("orderService"));
    }
}