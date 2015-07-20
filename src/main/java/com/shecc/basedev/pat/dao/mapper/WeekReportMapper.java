package com.shecc.basedev.pat.dao.mapper;

import com.shecc.basedev.pat.entity.WeekReport;

public interface WeekReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeekReport record);

    int insertSelective(WeekReport record);

    WeekReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeekReport record);

    int updateByPrimaryKey(WeekReport record);
}