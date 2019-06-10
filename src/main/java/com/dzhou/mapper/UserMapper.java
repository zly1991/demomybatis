package com.dzhou.mapper;

import com.dzhou.entity.TBdUser;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ZHOULY2 on 2019-6-1.
 */
public interface UserMapper {
    @Select("select * from t_bd_user")
    public List<TBdUser> queryUsers();
}
