package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.Organizations;

public interface OrganizationsMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Organizations record);

    int insertSelective(Organizations record);

    Organizations selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Organizations record);

    int updateByPrimaryKey(Organizations record);
}