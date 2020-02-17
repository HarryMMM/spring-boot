package cn.harryai.test.springboot.testjdbc.service;

import cn.harryai.test.springboot.testjdbc.model.User;

import java.util.List;

/**
 * @author Harry
 * @since 2020/02/17 17:47
 **/
public interface UserService {
    void save(User user);

    List<User> getUsers();
}
