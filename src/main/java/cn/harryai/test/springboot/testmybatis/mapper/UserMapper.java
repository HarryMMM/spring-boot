package cn.harryai.test.springboot.testmybatis.mapper;

import cn.harryai.test.springboot.testmybatis.model.User;

/**
 * @author Harry
 * @since 2020/02/17 20:02
 **/
public interface UserMapper {
    void insertUser(User user);

    User getUser(Integer id);

}
