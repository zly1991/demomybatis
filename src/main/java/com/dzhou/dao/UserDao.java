package com.dzhou.dao;

import com.dzhou.entity.TBdUser;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
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
}
