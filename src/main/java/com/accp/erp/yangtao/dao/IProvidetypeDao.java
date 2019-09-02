package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Providetype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IProvidetypeDao extends BaseMapper<Providetype>{
	// 自定义sql查询方法
				public List<Providetype> queryAllProvidetype();

				// 自定义sql加载方法
				public Providetype loadProvidetype(@Param("peeid") String peeid);

				// 自定义sql模糊条件查询
				public List<Providetype> queryProvidetypeListBypeename(@Param("peename") String peoname);

				// 自定义sql更新方法
				public int updateProvidetype(@Param("Providetype") Providetype Providetype);

				// 自定义sql新增方法
				public int saveProvidetype(@Param("Providetype") Providetype Providetype);

				// 自定义sql移除方法
				public int deleteById(@Param("peeid") String peeid);
}
