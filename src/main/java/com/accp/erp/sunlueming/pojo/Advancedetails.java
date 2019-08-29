package com.accp.erp.sunlueming.pojo;

public class Advancedetails {
    private Float advdetmoney;

    private String advdetoddtype;

    private String advdetoddid;

    private String advdetdegest;

    private Integer enables;

    private String safetyone;

    private String safetytwo;

    private String advid;

    public Float getAdvdetmoney() {
        return advdetmoney;
    }

    public void setAdvdetmoney(Float advdetmoney) {
        this.advdetmoney = advdetmoney;
    }

    public String getAdvdetoddtype() {
        return advdetoddtype;
    }

    public void setAdvdetoddtype(String advdetoddtype) {
        this.advdetoddtype = advdetoddtype == null ? null : advdetoddtype.trim();
    }

    public String getAdvdetoddid() {
        return advdetoddid;
    }

    public void setAdvdetoddid(String advdetoddid) {
        this.advdetoddid = advdetoddid == null ? null : advdetoddid.trim();
    }

    public String getAdvdetdegest() {
        return advdetdegest;
    }

    public void setAdvdetdegest(String advdetdegest) {
        this.advdetdegest = advdetdegest == null ? null : advdetdegest.trim();
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

    public String getAdvid() {
        return advid;
    }

    public void setAdvid(String advid) {
        this.advid = advid == null ? null : advid.trim();
    }
}