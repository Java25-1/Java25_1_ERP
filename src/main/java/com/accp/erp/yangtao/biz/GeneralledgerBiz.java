package com.accp.erp.yangtao.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.erp.yangtao.dao.IGeneralledgerDao;
import com.accp.erp.yangtao.dao.IStorageDao;
import com.accp.erp.yangtao.pojo.Generalledger;
import com.accp.erp.yangtao.pojo.Materieltype;
import com.accp.erp.yangtao.pojo.Storage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class GeneralledgerBiz {

	@Autowired
	private IGeneralledgerDao dao;
	
	
	/**
	 * 查询
	 * 
	 * @return
	 */
	public List<Generalledger> findMaterieltype() {
		return dao.selectList(null);
	}
	
	
	/**
	 * 修改
	 * 
	 * @param person
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyGeneralledger(Generalledger Generalledger) {
		dao.updateById(Generalledger);
	}
	
	/**
	 * 新增
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addGeneralledger(Generalledger Generalledger) {
		dao.insert(Generalledger);
	}
	
	/**
	 * 删除
	 * 
	 * @param person
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteGeneralledger(String Genid) {
		dao.deleteById(Genid);
	}
}
