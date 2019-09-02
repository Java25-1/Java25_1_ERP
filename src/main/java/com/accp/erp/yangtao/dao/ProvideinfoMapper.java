package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.Provideinfo;

public interface ProvideinfoMapper {
    int deleteByPrimaryKey(String peoid);

    int insert(Provideinfo record);

    int insertSelective(Provideinfo record);

    Provideinfo selectByPrimaryKey(String peoid);

    int updateByPrimaryKeySelective(Provideinfo record);

    int updateByPrimaryKey(Provideinfo record);
}