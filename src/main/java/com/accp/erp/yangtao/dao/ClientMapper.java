package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.ClientWithBLOBs;

public interface ClientMapper {
    int insert(ClientWithBLOBs record);

    int insertSelective(ClientWithBLOBs record);
}