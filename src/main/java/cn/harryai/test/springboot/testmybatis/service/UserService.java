package cn.harryai.test.springboot.testmybatis.service;

import cn.harryai.test.springboot.testmybatis.model.User;

/**
 * @author Harry
 * @since 2020/02/17 17:47
 **/
public interface UserService {
    void save(User user);

    User getUsers(Integer id);
}
