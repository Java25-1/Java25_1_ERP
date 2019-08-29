package com.accp.erp.sunlueming.pojo;

/**
 * @description:预收款明细
 * @author: apple
 */
public class Advancegatherdetails {
    private String billid;//单据号码

    private Integer cotemark;//栏号

    private Float promisedmoney;//预收金额

    private Float advancemoney;//预收余额

    private String sinname;//来源单别

    private Integer originbillid;//来源单号

    private String summary;//摘要

    private Integer enables;//标识是否删除

    private String safetyone;//保留字段

    private String safetytwo;//保留字段

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

    public Float getPromisedmoney() {
        return promisedmoney;
    }

    public void setPromisedmoney(Float promisedmoney) {
        this.promisedmoney = promisedmoney;
    }

    public Float getAdvancemoney() {
        return advancemoney;
    }

    public void setAdvancemoney(Float advancemoney) {
        this.advancemoney = advancemoney;
    }

    public String getSinname() {
        return sinname;
    }

    public void setSinname(String sinname) {
        this.sinname = sinname == null ? null : sinname.trim();
    }

    public Integer getOriginbillid() {
        return originbillid;
    }

    public void setOriginbillid(Integer originbillid) {
        this.originbillid = originbillid;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
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