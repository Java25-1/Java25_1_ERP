package com.accp.erp.sunlueming.dao;

import com.accp.erp.sunlueming.pojo.Paymentdetails;

public interface PaymentdetailsMapper {
    int insert(Paymentdetails record);

    int insertSelective(Paymentdetails record);
}