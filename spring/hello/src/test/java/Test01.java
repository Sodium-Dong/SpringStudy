import com.xs.dao.IUserDao;
import com.xs.dao.UserDao;
import com.xs.service.IUserService;
import com.xs.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test() {
        UserService userService = new UserService();

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserService service = ioc.getBean(IUserService.class);
        service.getUser();
    }
}
