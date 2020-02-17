package cn.harryai.test.springboot.testmybatis.service;

import cn.harryai.test.springboot.testmybatis.mapper.UserMapper;
import cn.harryai.test.springboot.testmybatis.model.User;

/**
 * @author Harry
 * @since 2020/02/17 17:49
 **/
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void save(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User getUsers(Integer id) {
        return userMapper.getUser(id);
    }
}
