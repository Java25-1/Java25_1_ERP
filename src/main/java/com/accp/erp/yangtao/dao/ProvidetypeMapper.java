package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.Providetype;

public interface ProvidetypeMapper {
    int deleteByPrimaryKey(Integer peeid);

    int insert(Providetype record);

    int insertSelective(Providetype record);

    Providetype selectByPrimaryKey(Integer peeid);

    int updateByPrimaryKeySelective(Providetype record);

    int updateByPrimaryKey(Providetype record);
}