package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.Modules;

public interface ModulesMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Modules record);

    int insertSelective(Modules record);

    Modules selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Modules record);

    int updateByPrimaryKey(Modules record);
}