package com.accp.erp.sunlueming.action;

import com.accp.erp.sunlueming.biz.AdvancegatherBiz;
import com.accp.erp.sunlueming.pojo.Advancegather;
import com.accp.erp.sunlueming.util.CreateSingleNum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @program: erp->Advancegather_Action
 * @description: 预收款视图控制层
 * @author: Apple
 * @create: 2019-08-29 22:20
 **/
@RequestMapping("/Advancegather")
@RestController
public class Advancegather_Action {
    @Resource
    private AdvancegatherBiz biz;

    CreateSingleNum createSingleNum = new CreateSingleNum();
    /**
     * @description: 查询预收款数据
     * @author: apple
     */
    @RequestMapping("/sel/{biilid}")
    public Advancegather SellAll(@PathVariable String biilid) {
        return biz.SelSome(biilid);
    }

    /**
     * @description: 根据单据创建单号
     * @author: apple
     */
    @RequestMapping("/single")
    public String singleNum() {
        String code = "YFK";
        return createSingleNum.AddNum(code);
    }
}
