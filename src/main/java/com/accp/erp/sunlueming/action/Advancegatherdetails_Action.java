package com.accp.erp.sunlueming.action;

import com.accp.erp.sunlueming.biz.AdvancegatherdetailsBiz;
import com.accp.erp.sunlueming.pojo.Advancegather;
import com.accp.erp.sunlueming.pojo.Advancegatherdetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: erp->Advancegatherdetails_Action
 * @description: 预收款明细视图管理层
 * @author: Apple
 * @create: 2019-08-30 10:01
 **/
@RequestMapping("/Advancegatherdetails")
@RestController
public class Advancegatherdetails_Action {
    @Resource
    private AdvancegatherdetailsBiz biz;

    @RequestMapping("/addAdv/{advancegatherdetail}")
    public Integer addAdv(@PathVariable Advancegatherdetails adv) {
            return biz.addAdvancegatherdetails(adv);
    }
    @RequestMapping("/SelAdvDetail/{biilid}")
    public List<Advancegatherdetails> SellAll(@PathVariable String biilid) {
        return biz.SelSomeById(biilid);
    }
}
