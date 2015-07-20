package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.Job;

public interface JobMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}