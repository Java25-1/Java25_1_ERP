package com.accp.erp.yangtao.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.erp.yangtao.dao.IClientDao;
import com.accp.erp.yangtao.dao.IStorageDao;
import com.accp.erp.yangtao.pojo.Client;
import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ClientBiz {

	@Autowired
	private IClientDao dao;
	
	
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Client> findClientListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Client>(dao.selectList(null));
	}
	
	
	/**
	 * 根据姓名模糊分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Client> findClientListWithNameByPage(String Cliname, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Client> qw=Wrappers.query();
		qw.like("Cliname", Cliname);
		return new PageInfo<Client>(dao.selectList(qw));
	}
	
	
	/**
	 * 修改
	 * 
	 * @param person
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyClient(Client Client) {
		dao.updateById(Client);
	}
	
	/**
	 * 新增
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addClient(Client Client) {
		dao.insert(Client);
	}
	
	/**
	 * 删除
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteClient(String cliid) {
		dao.deleteById(cliid);
	}
}
