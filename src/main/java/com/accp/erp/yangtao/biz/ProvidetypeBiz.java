package com.accp.erp.yangtao.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.erp.yangtao.dao.IProvidetypeDao;
import com.accp.erp.yangtao.dao.IStorageDao;
import com.accp.erp.yangtao.pojo.Providetype;
import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ProvidetypeBiz {

	@Autowired
	private IProvidetypeDao dao;
	
	/**
	 * 查询
	 * 
	 * @return
	 */
	public List<Providetype> findStorage() {
		return dao.selectList(null);
	}
	
	/**
	 * 修改
	 * 
	 * @param person
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyProvidetype(Providetype Providetype) {
		dao.updateById(Providetype);
	}
	
	/**
	 * 新增
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addProvidetype(Providetype Providetype) {
		dao.insert(Providetype);
	}
	
	/**
	 * 删除
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteProvidetype(String peeid) {
		dao.deleteById(peeid);
	}
}
