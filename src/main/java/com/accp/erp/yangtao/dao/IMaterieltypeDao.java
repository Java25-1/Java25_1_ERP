package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Materieltype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IMaterieltypeDao extends BaseMapper<Materieltype>{
	// 自定义sql查询方法
			public List<Materieltype> queryAllMaterieltype();

			// 自定义sql加载方法
			public Materieltype loadMaterieltype(@Param("matypeid") String matypeid);

			// 自定义sql模糊条件查询
			public List<Materieltype> queryMaterieltypeListBymatypename(@Param("matypename") String matypename);

			// 自定义sql更新方法
			public int updateMaterieltype(@Param("Materieltype") Materieltype Materieltype);

			// 自定义sql新增方法
			public int saveMaterieltype(@Param("Materieltype") Materieltype Materieltype);

			// 自定义sql移除方法
			public int deleteById(@Param("matypeid") String matypeid);
}
