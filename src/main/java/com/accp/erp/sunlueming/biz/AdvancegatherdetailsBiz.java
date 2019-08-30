package com.accp.erp.sunlueming.biz;

import com.accp.erp.sunlueming.dao.AdvancegatherdetailsMapper;
import com.accp.erp.sunlueming.pojo.Advancegatherdetails;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: erp->AdvancegatherdetailsBiz
 * @description: 预收款明细业务逻辑层
 * @author: Apple
 * @create: 2019-08-29 22:23
 **/
@Service
public class AdvancegatherdetailsBiz {
    @Resource
    private AdvancegatherdetailsMapper maper;

    /**
     * @description: 新增预收款明细
     * @author: apple
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public Integer addAdvancegatherdetails(Advancegatherdetails Advancegatherdetails) {
        return maper.insert(Advancegatherdetails);
    }

    /**
     * @description: 根据预收款主表编号查询预收款明细表数据
     * @author: apple
     */
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public List<Advancegatherdetails> SelSomeById(String billid) {
        List<Advancegatherdetails> wrapper = maper.selectList(new QueryWrapper<Advancegatherdetails>().eq("billId", billid));
        return wrapper;
    }
    
}
