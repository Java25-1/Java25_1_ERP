package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Materiel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IMaterielDao extends BaseMapper<Materiel>{
	// 自定义sql查询方法
			public List<Materiel> queryAllMateriel();

			// 自定义sql加载方法
			public Materiel loadMateriel(@Param("matid") String matid);

			// 自定义sql模糊条件查询
			public List<Materiel> queryMaterielListBymatname(@Param("matname") String matname);

			// 自定义sql更新方法
			public int updateMateriel(@Param("Materiel") Materiel Materiel);

			// 自定义sql新增方法
			public int saveMateriel(@Param("Materiel") Materiel Materiel);

			// 自定义sql移除方法
			public int deleteById(@Param("matid") String matid);
}
