package com.accp.erp.sunlueming.dao;

import com.accp.erp.sunlueming.pojo.Payment;

public interface PaymentMapper {
    int insert(Payment record);

    int insertSelective(Payment record);
}