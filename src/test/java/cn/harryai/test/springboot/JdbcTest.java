package cn.harryai.test.springboot;

import cn.harryai.test.springboot.testjdbc.model.User;
import cn.harryai.test.springboot.testjdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Harry
 * @since 2020/02/17 17:26
 **/
public class JdbcTest {
    @Test
    public void test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc/spring-content-jdbc.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User("harry", 11, "man");
        userService.save(user);
        List<User> users = userService.getUsers();
        System.out.println(users);


    }
}
