package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}