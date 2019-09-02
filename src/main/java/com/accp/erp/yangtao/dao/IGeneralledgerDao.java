package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Generalledger;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IGeneralledgerDao extends BaseMapper<Generalledger>{
	// 自定义sql查询方法
		public List<Generalledger> queryAllGeneralledger();

		// 自定义sql加载方法
		public Generalledger loadGeneralledger(@Param("Genid") String Genid);

		// 自定义sql模糊条件查询
		public List<Generalledger> queryGeneralledgerListBygenstoragename(@Param("genstoragename") String genstoragename);

		// 自定义sql更新方法
		public int updateGeneralledger(@Param("Generalledger") Generalledger Generalledger);

		// 自定义sql新增方法
		public int saveGeneralledger(@Param("Generalledger") Generalledger Generalledger);

		// 自定义sql移除方法
		public int deleteById(@Param("Genid") String Genid);
}
