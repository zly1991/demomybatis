package com.dzhou.dao;

import com.dzhou.entity.TBdUser;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserDao extends Mapper<TBdUser> {

    @Select("select * from t_bd_user")
    public List<TBdUser> queryUsers();

    @Select("select * from t_bd_user a where a.id=#{0}")
    @Results({
            @Result(property = "tBdRole",column = "id",many = @Many(select="com.dzhou.dao.TBdRoleDao.selectTBdRoleByUserId"))
    })
    public TBdUser queryUserRoleId(long id);

    @Select("select * from t_bd_user a where a.id=#{0}")
    @Results({
            @Result(property = "tBdUserInfo" ,column = "id" ,one = @One(select="com.dzhou.dao.TBdUserInfoDao.selectUserInfoByUserId"))
    })
    public TBdUser  queryUserInfo(long id);
}
