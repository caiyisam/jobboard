package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}