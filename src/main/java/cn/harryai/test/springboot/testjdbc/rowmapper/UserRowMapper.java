package cn.harryai.test.springboot.testjdbc.rowmapper;

import cn.harryai.test.springboot.testjdbc.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Harry
 * @since 2020/02/17 17:04
 **/
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(rs.getInt("id"), rs.getString("name"),
                rs.getInt("age"), rs.getString("sex"));
    }
}
