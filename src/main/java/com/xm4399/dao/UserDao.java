package com.xm4399.dao;

import com.xm4399.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by hemintang on 17-3-24.
 */
@Repository("userDao")
public class UserDao {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        String sql = "insert into t_user(userName, password) values(?, ?)";
        Object[] objs = new Object[]{user.getUserName(), user.getPassword()};
        jdbcTemplate.update(sql, objs);
    }
}
