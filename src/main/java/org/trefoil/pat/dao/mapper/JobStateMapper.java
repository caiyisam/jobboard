package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.JobState;

public interface JobStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(JobState record);

    int insertSelective(JobState record);

    JobState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(JobState record);

    int updateByPrimaryKey(JobState record);
}