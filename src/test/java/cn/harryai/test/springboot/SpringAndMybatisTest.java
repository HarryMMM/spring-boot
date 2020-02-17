package cn.harryai.test.springboot;

import cn.harryai.test.springboot.testspringandmybatis.mapper.UserMapper;
import cn.harryai.test.springboot.testspringandmybatis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Harry
 * @since 2020/02/17 17:26
 **/
public class SpringAndMybatisTest {
    @Test
    public void test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springAndMybatis/spring-content-mybatis.xml");
        UserMapper userMapper =
                applicationContext.getBean("userMapper", UserMapper.class);
        User user = new User("testSpringAndMybatis", 11, "manffff");
        userMapper.insertUser(user);
        System.out.println(userMapper.getUser(8));
    }
}
