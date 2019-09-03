package com.accp.erp.yangtao.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.erp.yangtao.dao.IClienttypeDao;
import com.accp.erp.yangtao.dao.IStorageDao;
import com.accp.erp.yangtao.pojo.Clienttype;
import com.accp.erp.yangtao.pojo.Depttab;
import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ClienttypeBiz {

	@Autowired
	private IClienttypeDao dao;
	
	
	/**
	 * 查询
	 * 
	 * @return
	 */
	public List<Clienttype> findClienttype() {
		return dao.selectList(null);
	}
	
	
	/**
	 * 修改
	 * 
	 * @param person
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyClienttype(Clienttype Clienttype) {
		dao.updateById(Clienttype);
	}
	
	/**
	 * 新增
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addClienttype(Clienttype Clienttype) {
		dao.insert(Clienttype);
	}
	
	/**
	 * 删除
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteClienttype(String clitypeid) {
		dao.deleteById(clitypeid);
	}
}
