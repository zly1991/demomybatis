package com.dzhou.dao;

import com.dzhou.entity.TBdRole;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TBdRoleDao extends Mapper<TBdRole> {
    @Select(" select   a.id,role_code,role_name   from t_bd_role a ,t_bd_user_role b where a.id=b.role_id and b.user_id=#{0} ")
     public List<TBdRole> selectTBdRoleByUserId(long userId);

    @Select("select *   from t_bd_role a  ")
    public List<TBdRole> selectRoles();
}
