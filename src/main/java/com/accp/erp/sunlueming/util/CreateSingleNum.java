package com.accp.erp.sunlueming.util;

import java.util.Date;

/**
 * @program: erp->CreateSingleNum
 * @description: 创建单据编号
 * @author: Apple
 * @create: 2019-08-30 18:09
 **/
public class CreateSingleNum {
    CountDate countDate = new CountDate();
    /**
     * @description: 根据不同的单据名创建唯一的单据号
     * @author: apple
     */
    public String AddNum(String FirWord){
        String single ;
        String time = String.valueOf(countDate.LongDate(new Date()));
        single = FirWord+time;
        return single;
    }

}
