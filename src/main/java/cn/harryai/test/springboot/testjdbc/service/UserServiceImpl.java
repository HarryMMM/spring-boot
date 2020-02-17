package cn.harryai.test.springboot.testjdbc.service;

import cn.harryai.test.springboot.testjdbc.model.User;
import cn.harryai.test.springboot.testjdbc.rowmapper.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * @author Harry
 * @since 2020/02/17 17:49
 **/
public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into user (name,age,sex) values(?,?,?)", new Object[]{user.getName(), user.getAge()
                , user.getSex()}, new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});
    }

    @Override
    public List<User> getUsers() {
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }

    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
