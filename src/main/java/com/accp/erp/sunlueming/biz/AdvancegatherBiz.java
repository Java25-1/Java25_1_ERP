package com.accp.erp.sunlueming.biz;

import com.accp.erp.sunlueming.dao.AdvancegatherMapper;
import com.accp.erp.sunlueming.pojo.Advancegather;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @program: erp->AdvancegatherBiz
 * @description: 预收款主表业务逻辑层
 * @author: Apple
 * @create: 2019-08-29 20:24
 **/
public class AdvancegatherBiz {
    @Autowired
    private AdvancegatherMapper biz;

    /**
     * @description: 新增预收款主表数据
     * @author: apple
     */
    public Integer addAdvancegather(Advancegather advancegather){
        return biz.insert(advancegather);
    }
    
}
