package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.Empolyee;

public interface EmpolyeeMapper {
    int deleteByPrimaryKey(String empid);

    int insert(Empolyee record);

    int insertSelective(Empolyee record);

    Empolyee selectByPrimaryKey(String empid);

    int updateByPrimaryKeySelective(Empolyee record);

    int updateByPrimaryKey(Empolyee record);
}