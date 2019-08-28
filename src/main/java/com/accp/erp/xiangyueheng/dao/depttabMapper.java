package com.accp.erp.xiangyueheng.dao;

import com.accp.erp.xiangyueheng.pojo.depttab;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface depttabMapper extends BaseMapper<depttab> {
    int deleteByPrimaryKey(Integer depid);

    int insert(depttab record);

    int insertSelective(depttab record);

    depttab selectByPrimaryKey(Integer depid);

    int updateByPrimaryKeySelective(depttab record);

    int updateByPrimaryKey(depttab record);
}