package cn.harryai.test.springboot.testspringandmybatis.service;

import cn.harryai.test.springboot.testspringandmybatis.model.User;

/**
 * @author Harry
 * @since 2020/02/17 17:47
 **/
public interface UserService {
    void save(User user);

    User getUsers(Integer id);
}
