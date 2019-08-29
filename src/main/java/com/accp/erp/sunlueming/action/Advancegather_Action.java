package com.accp.erp.sunlueming.action;

import com.accp.erp.sunlueming.biz.AdvancegatherBiz;
import com.accp.erp.sunlueming.pojo.Advancegather;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: erp->Advancegather_Action
 * @description: 预收款视图控制层
 * @author: Apple
 * @create: 2019-08-29 22:20
 **/
@RequestMapping("/Advancegather")
@Controller
public class Advancegather_Action {
    @Resource
    private AdvancegatherBiz biz;
//        @RequestMapping("sel/advancedetails")
//    public List<Advancegather> SellAll(){
//            return biz
//    }
}
