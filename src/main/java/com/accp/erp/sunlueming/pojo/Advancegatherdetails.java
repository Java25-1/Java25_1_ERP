package com.accp.erp.sunlueming.pojo;

public class Advancegatherdetails {
    private String billid;

    private Integer cotemark;

    private Float promisedmoney;

    private Float advancemoney;

    private String sinname;

    private Integer originbillid;

    private String summary;

    private Integer enables;

    private String safetyone;

    private String safetytwo;

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