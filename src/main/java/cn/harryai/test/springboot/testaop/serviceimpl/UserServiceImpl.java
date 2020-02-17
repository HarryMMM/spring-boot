package cn.harryai.test.springboot.testaop.serviceimpl;

import cn.harryai.test.springboot.testaop.Service.UserService;
import cn.harryai.test.springboot.testaop.model.User;
import org.springframework.stereotype.Service;

/**
 * @author Harry
 * @since 2020/02/16 11:34
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(String name, int age) {
        System.out.println("create user……");
        return new User(name, age);

    }

    @Override
    public User queryUser(String name) {
        int i = 1 / 0;
        return new User("harry", 11);
    }


}
