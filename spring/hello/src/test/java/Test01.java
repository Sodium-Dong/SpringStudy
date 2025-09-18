import com.xs.service.UserService;
import org.junit.Test;

public class Test01 {

    @Test
    public void test() {
        UserService userService = new UserService();
        userService.getUser();
    }
}
