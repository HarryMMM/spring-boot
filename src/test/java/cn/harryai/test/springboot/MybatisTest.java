package cn.harryai.test.springboot;

import cn.harryai.test.springboot.testmybatis.mapper.UserMapper;
import cn.harryai.test.springboot.testmybatis.model.User;
import cn.harryai.test.springboot.testmybatis.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @author Harry
 * @since 2020/02/17 17:26
 **/
public class MybatisTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User("harry", 11, "manffff");
        mapper.insertUser(user);
        User user1 = mapper.getUser(6);
        System.out.println(user1);
        sqlSession.commit();
    }
}
