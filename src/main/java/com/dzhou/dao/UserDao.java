package com.dzhou.dao;

import com.dzhou.entity.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserDao extends Mapper<User> {

    @Select("select * from t_bd_user")
    public List<User> queryUsers();
}
