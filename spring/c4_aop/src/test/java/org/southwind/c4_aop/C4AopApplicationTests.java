package org.southwind.c4_aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest(classes = C4AopApplication.class)
@ComponentScan
class C4AopApplicationTests {

    @Test
    void contextLoads(@Autowired UserService userService) {
        userService.add();
    }
}
