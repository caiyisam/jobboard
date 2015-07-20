package org.trefoil.pat.dao.mapper;

import org.trefoil.pat.entity.LisenceInfo;

public interface LisenceInfoMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(LisenceInfo record);

    int insertSelective(LisenceInfo record);

    LisenceInfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(LisenceInfo record);

    int updateByPrimaryKey(LisenceInfo record);
}