package cn.harryai.test.springboot;

import cn.harryai.test.springboot.testaop.Service.UserService;
import cn.harryai.test.springboot.testresource.config.PropertiesConfUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import java.io.IOException;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private Environment environment;
    @Autowired
    private PropertySourcesPlaceholderConfigurer PropertySourcesPlaceholderConfigurer;
    @Value("${nichen:122}")
    private String nicheng;
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() throws IOException {
        System.out.println(PropertiesConfUtils.getProperty("name"));
        System.out.println(PropertiesConfUtils.getProperty("age"));
        System.out.println(PropertiesConfUtils.getProperty("nicheng"));
        System.out.println(PropertiesConfUtils.getProperty("aaa"));
        System.out.println(PropertiesConfUtils.getProperty("bbb"));
    }

    @Test
    public void testAop() {
        userService.createUser("tt", 13);
    }

}
