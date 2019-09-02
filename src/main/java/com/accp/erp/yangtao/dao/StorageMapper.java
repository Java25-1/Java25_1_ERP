package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.Storage;

public interface StorageMapper {
    int insert(Storage record);

    int insertSelective(Storage record);
}