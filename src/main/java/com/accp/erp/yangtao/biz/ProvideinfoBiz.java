package com.accp.erp.yangtao.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.erp.yangtao.dao.IProvideinfoDao;
import com.accp.erp.yangtao.dao.IStorageDao;
import com.accp.erp.yangtao.pojo.Provideinfo;
import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ProvideinfoBiz {

	@Autowired
	private IProvideinfoDao dao;
	
	
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Provideinfo> findProvideinfoListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Provideinfo>(dao.selectList(null));
	}
	
	
	/**
	 * 根据姓名模糊分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Provideinfo> findProvideinfoListWithNameByPage(String peoname, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Provideinfo> qw=Wrappers.query();
		qw.like("peoname", peoname);
		return new PageInfo<Provideinfo>(dao.selectList(qw));
	}
	
	
	/**
	 * 修改
	 * 
	 * @param person
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyProvideinfo(Provideinfo Provideinfo) {
		dao.updateById(Provideinfo);
	}
	
	/**
	 * 新增
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addProvideinfo(Provideinfo Provideinfo) {
		dao.insert(Provideinfo);
	}
	
	/**
	 * 删除
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteProvideinfo(String peoid) {
		dao.deleteById(peoid);
	}
}
