package com.accp.erp.sunlueming.action;

import com.accp.erp.sunlueming.biz.AdvancegatherBiz;
import com.accp.erp.sunlueming.pojo.Advancedetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: erp->Advancedetails_Action
 * @description: 预付款明细视图管理层
 * @author: Apple
 * @create: 2019-08-29 21:09
 **/
@RequestMapping("/Advancedetails")
@Controller
public class Advancedetails_Action {
    @Resource
    private AdvancegatherBiz biz;

//    @RequestMapping("sel/advancedetails")
//    public List<> SellAll(){
//
//    }
}
