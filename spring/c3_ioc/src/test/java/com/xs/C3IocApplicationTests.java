package com.xs;

import com.xs.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class C3IocApplicationTests {

    @Autowired
    IUserService userService;

    @Test
    void contextLoads() {
        userService.getUser();
    }
}
