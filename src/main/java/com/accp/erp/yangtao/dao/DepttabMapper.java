package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.Depttab;

public interface DepttabMapper {
    int deleteByPrimaryKey(Integer depid);

    int insert(Depttab record);

    int insertSelective(Depttab record);

    Depttab selectByPrimaryKey(Integer depid);

    int updateByPrimaryKeySelective(Depttab record);

    int updateByPrimaryKey(Depttab record);
}