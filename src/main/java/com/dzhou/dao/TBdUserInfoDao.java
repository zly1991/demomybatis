package com.dzhou.dao;

import com.dzhou.entity.TBdUserInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface TBdUserInfoDao extends Mapper<TBdUserInfo> {
    @Select("select * from t_bd_user_info a where a.user_id=#{0}")
    public TBdUserInfo selectUserInfoByUserId(long userid);
}
