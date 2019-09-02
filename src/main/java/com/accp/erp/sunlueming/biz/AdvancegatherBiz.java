package com.accp.erp.sunlueming.biz;

import com.accp.erp.sunlueming.dao.AdvancegatherMapper;
import com.accp.erp.sunlueming.pojo.Advancegather;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;


/**
 * @program: erp->AdvancegatherBiz
 * @description: 预收款主表业务逻辑层
 * @author: Apple
 * @create: 2019-08-29 20:24
 **/
@Service
public class AdvancegatherBiz {
    @Resource
    private AdvancegatherMapper maper;

    /**
     * @description: 新增预收款主表数据
     * @author: apple
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public Integer addAdvancegather(Advancegather advancegather){
        return maper.insert(advancegather);
    }

    /**
     * @description: 查询预收款主表所有数据
     * @author: apple
     */
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public List<Advancegather> SelAll(){
        List<Advancegather> a =maper.selectList(null);
        return a;
    }


}
