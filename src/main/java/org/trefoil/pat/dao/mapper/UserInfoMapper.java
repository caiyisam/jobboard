package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}