package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Provideinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IProvideinfoDao extends BaseMapper<Provideinfo>{
	// 自定义sql查询方法
			public List<Provideinfo> queryAllProvideinfo();

			// 自定义sql加载方法
			public Provideinfo loadProvideinfo(@Param("peoid") String peoid);

			// 自定义sql模糊条件查询
			public List<Provideinfo> queryProvideinfoListBypeoname(@Param("peoname") String peoname);

			// 自定义sql更新方法
			public int updateProvideinfo(@Param("Provideinfo") Provideinfo Provideinfo);

			// 自定义sql新增方法
			public int saveProvideinfo(@Param("Provideinfo") Provideinfo Provideinfo);

			// 自定义sql移除方法
			public int deleteById(@Param("peoid") String peoid);
}
