package com.accp.erp.sunlueming.pojo;

import java.util.Date;
/**
 * @description: 预付款
 * @author: apple
 */
public class Advance {
    private String advid;//预付单单号

    private Date advdate;//单据日期

    private String advnum;//单据号码

    private String proofnumber;//凭证编号

    private String purveyid;//供应商ID

    private Date enddate;//终止日期

    private String purveyname;//供应商名称

    private String advstrike1;//结算方式1

    private String advstrike2;//结算方式2

    private String advstrike3;//结算方式3

    private Float advmoney1;//金额1

    private Float advmoney2;//金额2

    private Float advmoney3;//金额3

    private String advmakeing;//制单人员

    private String stodept;//制单人所属部门

    private String stodeptid;//部门ID

    private String advcheckman;//复核人员

    private String advremark;//备注

    private Integer isaditing;//是否审核

    private Integer enables;//标识是否删除

    private String safetyone;//保存（“预付款单”）

    private String safetytwo;//保留字段1

    private Integer issafetyone;//保留字段2

    public String getAdvid() {
        return advid;
    }

    public void setAdvid(String advid) {
        this.advid = advid == null ? null : advid.trim();
    }

    public Date getAdvdate() {
        return advdate;
    }

    public void setAdvdate(Date advdate) {
        this.advdate = advdate;
    }

    public String getAdvnum() {
        return advnum;
    }

    public void setAdvnum(String advnum) {
        this.advnum = advnum == null ? null : advnum.trim();
    }

    public String getProofnumber() {
        return proofnumber;
    }

    public void setProofnumber(String proofnumber) {
        this.proofnumber = proofnumber == null ? null : proofnumber.trim();
    }

    public String getPurveyid() {
        return purveyid;
    }

    public void setPurveyid(String purveyid) {
        this.purveyid = purveyid == null ? null : purveyid.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getPurveyname() {
        return purveyname;
    }

    public void setPurveyname(String purveyname) {
        this.purveyname = purveyname == null ? null : purveyname.trim();
    }

    public String getAdvstrike1() {
        return advstrike1;
    }

    public void setAdvstrike1(String advstrike1) {
        this.advstrike1 = advstrike1 == null ? null : advstrike1.trim();
    }

    public String getAdvstrike2() {
        return advstrike2;
    }

    public void setAdvstrike2(String advstrike2) {
        this.advstrike2 = advstrike2 == null ? null : advstrike2.trim();
    }

    public String getAdvstrike3() {
        return advstrike3;
    }

    public void setAdvstrike3(String advstrike3) {
        this.advstrike3 = advstrike3 == null ? null : advstrike3.trim();
    }

    public Float getAdvmoney1() {
        return advmoney1;
    }

    public void setAdvmoney1(Float advmoney1) {
        this.advmoney1 = advmoney1;
    }

    public Float getAdvmoney2() {
        return advmoney2;
    }

    public void setAdvmoney2(Float advmoney2) {
        this.advmoney2 = advmoney2;
    }

    public Float getAdvmoney3() {
        return advmoney3;
    }

    public void setAdvmoney3(Float advmoney3) {
        this.advmoney3 = advmoney3;
    }

    public String getAdvmakeing() {
        return advmakeing;
    }

    public void setAdvmakeing(String advmakeing) {
        this.advmakeing = advmakeing == null ? null : advmakeing.trim();
    }

    public String getStodept() {
        return stodept;
    }

    public void setStodept(String stodept) {
        this.stodept = stodept == null ? null : stodept.trim();
    }

    public String getStodeptid() {
        return stodeptid;
    }

    public void setStodeptid(String stodeptid) {
        this.stodeptid = stodeptid == null ? null : stodeptid.trim();
    }

    public String getAdvcheckman() {
        return advcheckman;
    }

    public void setAdvcheckman(String advcheckman) {
        this.advcheckman = advcheckman == null ? null : advcheckman.trim();
    }

    public String getAdvremark() {
        return advremark;
    }

    public void setAdvremark(String advremark) {
        this.advremark = advremark == null ? null : advremark.trim();
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

    public Integer getIssafetyone() {
        return issafetyone;
    }

    public void setIssafetyone(Integer issafetyone) {
        this.issafetyone = issafetyone;
    }
}