package com.accp.erp.sunlueming.pojo;

import java.util.Date;

/**
 * @description: 收款冲款
 * @author: apple
 */
public class Clashfund {
    private String billid;//单据号码

    private Date billdate;//单据日期

    private Integer sinid;//单据类型

    private String cliid;//客户编号

    private String clishortname;//客户简称

    private String currencytype;//币别

    private String reckontypef;//结算方式一

    private String reckontypes;//结算方式二

    private String reckontypet;//结算方式三

    private Float reckonmoneyf;//金额1

    private Float reckonmoneys;//金额2

    private Float reckonmoneyt;//金额3

    private Float gatherdiscount;//折扣率

    private Date gatherendaccountmonth;//终止帐月

    private String empid;//业务人员编号

    private String empname;//业务人员

    private String depid;//部门编号

    private String depname;//所属部门

    private String makeempname;//制单人员

    private String auditingempname;//复核人员

    private Integer checkstate;//审核状态

    private String remark;//备注

    private Integer enables;//标识是否删除

    private String safetyone;//保留字段

    private String safetytwo;//保留字段

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid == null ? null : billid.trim();
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public Integer getSinid() {
        return sinid;
    }

    public void setSinid(Integer sinid) {
        this.sinid = sinid;
    }

    public String getCliid() {
        return cliid;
    }

    public void setCliid(String cliid) {
        this.cliid = cliid == null ? null : cliid.trim();
    }

    public String getClishortname() {
        return clishortname;
    }

    public void setClishortname(String clishortname) {
        this.clishortname = clishortname == null ? null : clishortname.trim();
    }

    public String getCurrencytype() {
        return currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype == null ? null : currencytype.trim();
    }

    public String getReckontypef() {
        return reckontypef;
    }

    public void setReckontypef(String reckontypef) {
        this.reckontypef = reckontypef == null ? null : reckontypef.trim();
    }

    public String getReckontypes() {
        return reckontypes;
    }

    public void setReckontypes(String reckontypes) {
        this.reckontypes = reckontypes == null ? null : reckontypes.trim();
    }

    public String getReckontypet() {
        return reckontypet;
    }

    public void setReckontypet(String reckontypet) {
        this.reckontypet = reckontypet == null ? null : reckontypet.trim();
    }

    public Float getReckonmoneyf() {
        return reckonmoneyf;
    }

    public void setReckonmoneyf(Float reckonmoneyf) {
        this.reckonmoneyf = reckonmoneyf;
    }

    public Float getReckonmoneys() {
        return reckonmoneys;
    }

    public void setReckonmoneys(Float reckonmoneys) {
        this.reckonmoneys = reckonmoneys;
    }

    public Float getReckonmoneyt() {
        return reckonmoneyt;
    }

    public void setReckonmoneyt(Float reckonmoneyt) {
        this.reckonmoneyt = reckonmoneyt;
    }

    public Float getGatherdiscount() {
        return gatherdiscount;
    }

    public void setGatherdiscount(Float gatherdiscount) {
        this.gatherdiscount = gatherdiscount;
    }

    public Date getGatherendaccountmonth() {
        return gatherendaccountmonth;
    }

    public void setGatherendaccountmonth(Date gatherendaccountmonth) {
        this.gatherendaccountmonth = gatherendaccountmonth;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid == null ? null : empid.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getMakeempname() {
        return makeempname;
    }

    public void setMakeempname(String makeempname) {
        this.makeempname = makeempname == null ? null : makeempname.trim();
    }

    public String getAuditingempname() {
        return auditingempname;
    }

    public void setAuditingempname(String auditingempname) {
        this.auditingempname = auditingempname == null ? null : auditingempname.trim();
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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