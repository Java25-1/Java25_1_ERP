package com.accp.erp.sunlueming.pojo;

import java.util.Date;

/**
 * @description: 应付冲款
 * @author: apple
 */
public class Payment {
    private String payid;//应付冲款单单号

    private Date paydate;//单据日期

    private String purveyid;//供应商ID

    private String purveyname;//供应商名称

    private String paystrike1;//结算方式1

    private String paystrike2;//结算方式2

    private Float exchangerate;//汇率

    private String paystrike3;//结算方式3

    private Date enddate;//终止日期

    private Float discountrate;//折扣率

    private Float paymoney1;//金额1

    private Float paymoney2;//金额2

    private Float paymoney3;//金额3

    private String paymakeing;//制单人员

    private String paydept;//制单人所属部门

    private String stodeptid;//	部门ID

    private String paycheckman;//审核人员

    private String payremark;//备注

    private String currency;//币别

    private Integer isaditing;//是否审核

    private Integer enables;//标识是否删除

    private String safetyone;//保留字段1

    private String safetytwo;//保留字段2

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid == null ? null : payid.trim();
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getPurveyid() {
        return purveyid;
    }

    public void setPurveyid(String purveyid) {
        this.purveyid = purveyid == null ? null : purveyid.trim();
    }

    public String getPurveyname() {
        return purveyname;
    }

    public void setPurveyname(String purveyname) {
        this.purveyname = purveyname == null ? null : purveyname.trim();
    }

    public String getPaystrike1() {
        return paystrike1;
    }

    public void setPaystrike1(String paystrike1) {
        this.paystrike1 = paystrike1 == null ? null : paystrike1.trim();
    }

    public String getPaystrike2() {
        return paystrike2;
    }

    public void setPaystrike2(String paystrike2) {
        this.paystrike2 = paystrike2 == null ? null : paystrike2.trim();
    }

    public Float getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Float exchangerate) {
        this.exchangerate = exchangerate;
    }

    public String getPaystrike3() {
        return paystrike3;
    }

    public void setPaystrike3(String paystrike3) {
        this.paystrike3 = paystrike3 == null ? null : paystrike3.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Float getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(Float discountrate) {
        this.discountrate = discountrate;
    }

    public Float getPaymoney1() {
        return paymoney1;
    }

    public void setPaymoney1(Float paymoney1) {
        this.paymoney1 = paymoney1;
    }

    public Float getPaymoney2() {
        return paymoney2;
    }

    public void setPaymoney2(Float paymoney2) {
        this.paymoney2 = paymoney2;
    }

    public Float getPaymoney3() {
        return paymoney3;
    }

    public void setPaymoney3(Float paymoney3) {
        this.paymoney3 = paymoney3;
    }

    public String getPaymakeing() {
        return paymakeing;
    }

    public void setPaymakeing(String paymakeing) {
        this.paymakeing = paymakeing == null ? null : paymakeing.trim();
    }

    public String getPaydept() {
        return paydept;
    }

    public void setPaydept(String paydept) {
        this.paydept = paydept == null ? null : paydept.trim();
    }

    public String getStodeptid() {
        return stodeptid;
    }

    public void setStodeptid(String stodeptid) {
        this.stodeptid = stodeptid == null ? null : stodeptid.trim();
    }

    public String getPaycheckman() {
        return paycheckman;
    }

    public void setPaycheckman(String paycheckman) {
        this.paycheckman = paycheckman == null ? null : paycheckman.trim();
    }

    public String getPayremark() {
        return payremark;
    }

    public void setPayremark(String payremark) {
        this.payremark = payremark == null ? null : payremark.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Integer getIsaditing() {
        return isaditing;
    }

    public void setIsaditing(Integer isaditing) {
        this.isaditing = isaditing;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getSafetyone() {
        return safetyone;
    }

    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone == null ? null : safetyone.trim();
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo == null ? null : safetytwo.trim();
    }
}