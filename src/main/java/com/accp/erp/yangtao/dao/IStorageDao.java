package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


public interface IStorageDao extends BaseMapper<Storage>{
	    // 自定义sql查询方法
		public List<Storage> queryAllStorage();

		// 自定义sql加载方法
		public Storage loadStorage(@Param("stoid") String stoid);

		// 自定义sql模糊条件查询
		public List<Storage> queryStorageListByStoname(@Param("Stoname") String Stoname);

		// 自定义sql更新方法
		public int updateStorage(@Param("Storage") Storage Storage);

		// 自定义sql新增方法
		public int saveStorage(@Param("Storage") Storage Storage);

		// 自定义sql移除方法
		public int deleteById(@Param("stoid") String stoid);
	
}
