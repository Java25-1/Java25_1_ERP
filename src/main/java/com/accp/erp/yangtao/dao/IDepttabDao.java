package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Depttab;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IDepttabDao extends BaseMapper<Depttab>{
	// 自定义sql查询方法
				public List<Depttab> queryAllDepttab();

				// 自定义sql加载方法
				public Depttab loadDepttab(@Param("Depid") String Depid);

				// 自定义sql模糊条件查询
				public List<Depttab> queryDepttabListByDepname(@Param("Depname") String Depname);

				// 自定义sql更新方法
				public int updateDepttab(@Param("Depttab") Depttab Depttab);

				// 自定义sql新增方法
				public int saveDepttab(@Param("Depttab") Depttab Depttab);

				// 自定义sql移除方法
				public int deleteById(@Param("Depid") String Depid);
}
