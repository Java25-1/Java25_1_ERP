package com.accp.erp.yangtao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.yangtao.pojo.Client;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IClientDao extends BaseMapper<Client>{
			// 自定义sql查询方法
			public List<Client> queryAllClient();

			// 自定义sql加载方法
			public Client loadClient(@Param("cliid") String cliid);

			// 自定义sql模糊条件查询
			public List<Client> queryClientListByCliid(@Param("Cliname") String Cliname);

			// 自定义sql更新方法
			public int updateClient(@Param("Client") Client Client);

			// 自定义sql新增方法
			public int saveClient(@Param("Client") Client Client);

			// 自定义sql移除方法
			public int deleteById(@Param("cliid") String cliid);
}
