package com.accp.erp.sunlueming.pojo;

import java.util.Date;

/**
 * @description: 应付冲款单明细
 * @author: apple
 */
public class Paymentdetails {
    private String billid;//

    private Integer cotemark;//

    private String sinname;//

    private String originbillid;//

    private Date originodddate;//

    private Float originoddmoney;//

    private Float currentlybalance;//

    private Float discountmoney;//

    private Float clashmoney;//

    private Float offsetbytheamountof;//

    private Integer enables;//

    private String invoicenumber;//

    private String tradingname;//

    private String departmentnumber;//

    private String departmentname;//

    private String buyer;//

    private String projectname;//

    private String currency;//

    private Float exchangerate;//

    private String afetyone;//

    private String afetytwo;//

    private String tradingobject;//

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid == null ? null : billid.trim();
    }

    public Integer getCotemark() {
        return cotemark;
    }

    public void setCotemark(Integer cotemark) {
        this.cotemark = cotemark;
    }

    public String getSinname() {
        return sinname;
    }

    public void setSinname(String sinname) {
        this.sinname = sinname == null ? null : sinname.trim();
    }

    public String getOriginbillid() {
        return originbillid;
    }

    public void setOriginbillid(String originbillid) {
        this.originbillid = originbillid == null ? null : originbillid.trim();
    }

    public Date getOriginodddate() {
        return originodddate;
    }

    public void setOriginodddate(Date originodddate) {
        this.originodddate = originodddate;
    }

    public Float getOriginoddmoney() {
        return originoddmoney;
    }

    public void setOriginoddmoney(Float originoddmoney) {
        this.originoddmoney = originoddmoney;
    }

    public Float getCurrentlybalance() {
        return currentlybalance;
    }

    public void setCurrentlybalance(Float currentlybalance) {
        this.currentlybalance = currentlybalance;
    }

    public Float getDiscountmoney() {
        return discountmoney;
    }

    public void setDiscountmoney(Float discountmoney) {
        this.discountmoney = discountmoney;
    }

    public Float getClashmoney() {
        return clashmoney;
    }

    public void setClashmoney(Float clashmoney) {
        this.clashmoney = clashmoney;
    }

    public Float getOffsetbytheamountof() {
        return offsetbytheamountof;
    }

    public void setOffsetbytheamountof(Float offsetbytheamountof) {
        this.offsetbytheamountof = offsetbytheamountof;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber == null ? null : invoicenumber.trim();
    }

    public String getTradingname() {
        return tradingname;
    }

    public void setTradingname(String tradingname) {
        this.tradingname = tradingname == null ? null : tradingname.trim();
    }

    public String getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(String departmentnumber) {
        this.departmentnumber = departmentnumber == null ? null : departmentnumber.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Float getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Float exchangerate) {
        this.exchangerate = exchangerate;
    }

    public String getAfetyone() {
        return afetyone;
    }

    public void setAfetyone(String afetyone) {
        this.afetyone = afetyone == null ? null : afetyone.trim();
    }

    public String getAfetytwo() {
        return afetytwo;
    }

    public void setAfetytwo(String afetytwo) {
        this.afetytwo = afetytwo == null ? null : afetytwo.trim();
    }

    public String getTradingobject() {
        return tradingobject;
    }

    public void setTradingobject(String tradingobject) {
        this.tradingobject = tradingobject;
    }
}