package com.accp.erp.yangtao.dao;

import com.accp.erp.yangtao.pojo.Materiel;

public interface MaterielMapper {
    int insert(Materiel record);

    int insertSelective(Materiel record);
}