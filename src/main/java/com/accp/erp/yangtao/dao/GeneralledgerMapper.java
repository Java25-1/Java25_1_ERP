package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.Generalledger;

public interface GeneralledgerMapper {
    int insert(Generalledger record);

    int insertSelective(Generalledger record);
}