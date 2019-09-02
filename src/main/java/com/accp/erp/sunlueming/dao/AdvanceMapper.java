package com.accp.erp.sunlueming.dao;

import com.accp.erp.sunlueming.pojo.Advance;

public interface AdvanceMapper {
    int insert(Advance record);

    int insertSelective(Advance record);
}