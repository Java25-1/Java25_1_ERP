package com.accp.erp.yangtao.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
@TableName("employee")
public class Empolyee {
	@TableId(type=IdType.INPUT)
    private String empid;

    private String empname;

    private String empename;

    private String depid;

    private String empsex;

    private String empcard;

    private String empstate;

    private String empduty;

    private String empphoneone;

    private String empphonetwo;

    private String empphonethree;

    private String empbankaccounts;

    private Date empbirthday;

    private String empjob;

    private String empemail;

    private String empweb;

    private String empfaxes;

    private String empopenbank;

    private String emptop;

    private String empdegree;

    private Date empgotime;

    private String empgraduatetime;

    private Date emppactstarttime;

    private Date emppactendtime;

    private String empnowmailid;

    private String empfamilyphone;

    private String empfamilyplace;

    private String empnowphone;

    private String empnowplace;

    private String empexigenceman;

    private String empfamilymailid;

    private String empremark;

    private Integer emptrash;

    private String safetyone;

    private String safetytwo;

    private Integer enables;

    private String extend0;

    private String extend1;

    private String extend2;

    private String extend3;

    private String extend4;

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

    public String getEmpename() {
        return empename;
    }

    public void setEmpename(String empename) {
        this.empename = empename == null ? null : empename.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex == null ? null : empsex.trim();
    }

    public String getEmpcard() {
        return empcard;
    }

    public void setEmpcard(String empcard) {
        this.empcard = empcard == null ? null : empcard.trim();
    }

    public String getEmpstate() {
        return empstate;
    }

    public void setEmpstate(String empstate) {
        this.empstate = empstate == null ? null : empstate.trim();
    }

    public String getEmpduty() {
        return empduty;
    }

    public void setEmpduty(String empduty) {
        this.empduty = empduty == null ? null : empduty.trim();
    }

    public String getEmpphoneone() {
        return empphoneone;
    }

    public void setEmpphoneone(String empphoneone) {
        this.empphoneone = empphoneone == null ? null : empphoneone.trim();
    }

    public String getEmpphonetwo() {
        return empphonetwo;
    }

    public void setEmpphonetwo(String empphonetwo) {
        this.empphonetwo = empphonetwo == null ? null : empphonetwo.trim();
    }

    public String getEmpphonethree() {
        return empphonethree;
    }

    public void setEmpphonethree(String empphonethree) {
        this.empphonethree = empphonethree == null ? null : empphonethree.trim();
    }

    public String getEmpbankaccounts() {
        return empbankaccounts;
    }

    public void setEmpbankaccounts(String empbankaccounts) {
        this.empbankaccounts = empbankaccounts == null ? null : empbankaccounts.trim();
    }

    public Date getEmpbirthday() {
        return empbirthday;
    }

    public void setEmpbirthday(Date empbirthday) {
        this.empbirthday = empbirthday;
    }

    public String getEmpjob() {
        return empjob;
    }

    public void setEmpjob(String empjob) {
        this.empjob = empjob == null ? null : empjob.trim();
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail == null ? null : empemail.trim();
    }

    public String getEmpweb() {
        return empweb;
    }

    public void setEmpweb(String empweb) {
        this.empweb = empweb == null ? null : empweb.trim();
    }

    public String getEmpfaxes() {
        return empfaxes;
    }

    public void setEmpfaxes(String empfaxes) {
        this.empfaxes = empfaxes == null ? null : empfaxes.trim();
    }

    public String getEmpopenbank() {
        return empopenbank;
    }

    public void setEmpopenbank(String empopenbank) {
        this.empopenbank = empopenbank == null ? null : empopenbank.trim();
    }

    public String getEmptop() {
        return emptop;
    }

    public void setEmptop(String emptop) {
        this.emptop = emptop == null ? null : emptop.trim();
    }

    public String getEmpdegree() {
        return empdegree;
    }

    public void setEmpdegree(String empdegree) {
        this.empdegree = empdegree == null ? null : empdegree.trim();
    }

    public Date getEmpgotime() {
        return empgotime;
    }

    public void setEmpgotime(Date empgotime) {
        this.empgotime = empgotime;
    }

    public String getEmpgraduatetime() {
        return empgraduatetime;
    }

    public void setEmpgraduatetime(String empgraduatetime) {
        this.empgraduatetime = empgraduatetime == null ? null : empgraduatetime.trim();
    }

    public Date getEmppactstarttime() {
        return emppactstarttime;
    }

    public void setEmppactstarttime(Date emppactstarttime) {
        this.emppactstarttime = emppactstarttime;
    }

    public Date getEmppactendtime() {
        return emppactendtime;
    }

    public void setEmppactendtime(Date emppactendtime) {
        this.emppactendtime = emppactendtime;
    }

    public String getEmpnowmailid() {
        return empnowmailid;
    }

    public void setEmpnowmailid(String empnowmailid) {
        this.empnowmailid = empnowmailid == null ? null : empnowmailid.trim();
    }

    public String getEmpfamilyphone() {
        return empfamilyphone;
    }

    public void setEmpfamilyphone(String empfamilyphone) {
        this.empfamilyphone = empfamilyphone == null ? null : empfamilyphone.trim();
    }

    public String getEmpfamilyplace() {
        return empfamilyplace;
    }

    public void setEmpfamilyplace(String empfamilyplace) {
        this.empfamilyplace = empfamilyplace == null ? null : empfamilyplace.trim();
    }

    public String getEmpnowphone() {
        return empnowphone;
    }

    public void setEmpnowphone(String empnowphone) {
        this.empnowphone = empnowphone == null ? null : empnowphone.trim();
    }

    public String getEmpnowplace() {
        return empnowplace;
    }

    public void setEmpnowplace(String empnowplace) {
        this.empnowplace = empnowplace == null ? null : empnowplace.trim();
    }

    public String getEmpexigenceman() {
        return empexigenceman;
    }

    public void setEmpexigenceman(String empexigenceman) {
        this.empexigenceman = empexigenceman == null ? null : empexigenceman.trim();
    }

    public String getEmpfamilymailid() {
        return empfamilymailid;
    }

    public void setEmpfamilymailid(String empfamilymailid) {
        this.empfamilymailid = empfamilymailid == null ? null : empfamilymailid.trim();
    }

    public String getEmpremark() {
        return empremark;
    }

    public void setEmpremark(String empremark) {
        this.empremark = empremark == null ? null : empremark.trim();
    }

    public Integer getEmptrash() {
        return emptrash;
    }

    public void setEmptrash(Integer emptrash) {
        this.emptrash = emptrash;
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

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getExtend0() {
        return extend0;
    }

    public void setExtend0(String extend0) {
        this.extend0 = extend0 == null ? null : extend0.trim();
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1 == null ? null : extend1.trim();
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2 == null ? null : extend2.trim();
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3 == null ? null : extend3.trim();
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4 == null ? null : extend4.trim();
    }
}