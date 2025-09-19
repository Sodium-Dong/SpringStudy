import com.xs.config.SpringConfig;
import com.xs.service.IUserService;
import com.xs.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserService {

    @Test
    public void test() {
        UserService userService = new UserService();

        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        IUserService service = ioc.getBean(IUserService.class);
        service.getUser();
    }
}