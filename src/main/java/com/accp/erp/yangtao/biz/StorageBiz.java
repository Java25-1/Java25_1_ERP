package com.accp.erp.yangtao.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.erp.yangtao.dao.IStorageDao;
import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StorageBiz {

	@Autowired
	private IStorageDao dao;
	
	
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Storage> findStorageListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Storage>(dao.selectList(null));
	}
	
	
	/**
	 * 根据姓名模糊分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Storage> findStorageListWithNameByPage(String stoname, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Storage> qw=Wrappers.query();
		qw.like("stoname", stoname);
		return new PageInfo<Storage>(dao.selectList(qw));
	}
	
	
	/**
	 * 修改
	 * 
	 * @param person
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyStorage(Storage Storage) {
		dao.updateById(Storage);
	}
	
	/**
	 * 新增
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addStorage(Storage Storage) {
		dao.insert(Storage);
	}
	
	/**
	 * 删除
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteStorage(String stoid) {
		dao.deleteById(stoid);
	}
}
