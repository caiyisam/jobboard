package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.Period;

public interface PeriodMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Period record);

    int insertSelective(Period record);

    Period selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Period record);

    int updateByPrimaryKey(Period record);
}