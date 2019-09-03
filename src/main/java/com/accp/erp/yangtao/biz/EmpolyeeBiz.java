package com.accp.erp.yangtao.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.erp.yangtao.dao.IEmpolyeeDao;
import com.accp.erp.yangtao.dao.IStorageDao;
import com.accp.erp.yangtao.pojo.Empolyee;
import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmpolyeeBiz {

	@Autowired
	private IEmpolyeeDao dao;
	
	
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Empolyee> findEmpolyeeListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Empolyee>(dao.selectList(null));
	}
	
	
	/**
	 * 根据姓名模糊分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Empolyee> findEmpolyeeListWithNameByPage(String Empname, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Empolyee> qw=Wrappers.query();
		qw.like("Empname", Empname);
		return new PageInfo<Empolyee>(dao.selectList(qw));
	}
	
	
	/**
	 * 修改
	 * 
	 * @param person
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyEmpolyee(Empolyee Empolyee) {
		dao.updateById(Empolyee);
	}
	
	/**
	 * 新增
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addEmpolyee(Empolyee Empolyee) {
		dao.insert(Empolyee);
	}
	
	/**
	 * 删除
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteEmpolyee(String Empid) {
		dao.deleteById(Empid);
	}
}
