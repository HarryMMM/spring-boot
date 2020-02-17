package cn.harryai.test.springboot.testaop.Service;

import cn.harryai.test.springboot.testaop.model.User;

/**
 * @author Harry
 * @since 2020/02/16 11:31
 **/
public interface UserService {
    /**
     * 创建用户
     *
     * @param name 用户名
     * @param age  用户年龄
     * @return 返回新创建的用户
     */
    User createUser(String name, int age);

    /**
     * 查找用户
     *
     * @param name 用户名
     * @return 找到的用户
     */
    User queryUser(String name);
}
