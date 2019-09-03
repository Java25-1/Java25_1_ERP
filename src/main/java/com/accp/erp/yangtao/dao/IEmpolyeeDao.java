package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Empolyee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IEmpolyeeDao extends BaseMapper<Empolyee>{
	// 自定义sql查询方法
	public List<Empolyee> queryAllEmpolyee();

	// 自定义sql加载方法
	public Empolyee loadEmpolyee(@Param("Empid") String Empid);

	// 自定义sql模糊条件查询
	public List<Empolyee> queryEmpolyeeListByEmpname(@Param("Empname") String Empname);

	// 自定义sql更新方法
	public int updateEmpolyee(@Param("Empolyee") Empolyee Empolyee);

	// 自定义sql新增方法
	public int saveEmpolyee(@Param("Empolyee") Empolyee Empolyee);

	// 自定义sql移除方法
	public int deleteById(@Param("Empid") String Empid);
}
