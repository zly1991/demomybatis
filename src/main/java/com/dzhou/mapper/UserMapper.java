package com.dzhou.mapper;

import com.dzhou.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ZHOULY2 on 2019-6-1.
 */
public interface UserMapper {
    @Select("select * from t_bd_user")
    public List<User> queryUsers();
}
