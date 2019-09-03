package com.accp.erp.yangtao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("Storage")
public class Storage {
	@TableId(type=IdType.INPUT)
    private String stoid;

    private String stoname;

    private String stosimplename;

    private String stoconnectper;

    private String stoempid;

    private String stophone;

    private String stoaddress;

    private String storemark;

    private String safetyone;

    private String safetytwo;

    private Integer enables;

    private String extend0;

    private String extend1;

    private String extend2;

    private String extend3;

    private String extend4;

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid == null ? null : stoid.trim();
    }

    public String getStoname() {
        return stoname;
    }

    public void setStoname(String stoname) {
        this.stoname = stoname == null ? null : stoname.trim();
    }

    public String getStosimplename() {
        return stosimplename;
    }

    public void setStosimplename(String stosimplename) {
        this.stosimplename = stosimplename == null ? null : stosimplename.trim();
    }

    public String getStoconnectper() {
        return stoconnectper;
    }

    public void setStoconnectper(String stoconnectper) {
        this.stoconnectper = stoconnectper == null ? null : stoconnectper.trim();
    }

    public String getStoempid() {
        return stoempid;
    }

    public void setStoempid(String stoempid) {
        this.stoempid = stoempid == null ? null : stoempid.trim();
    }

    public String getStophone() {
        return stophone;
    }

    public void setStophone(String stophone) {
        this.stophone = stophone == null ? null : stophone.trim();
    }

    public String getStoaddress() {
        return stoaddress;
    }

    public void setStoaddress(String stoaddress) {
        this.stoaddress = stoaddress == null ? null : stoaddress.trim();
    }

    public String getStoremark() {
        return storemark;
    }

    public void setStoremark(String storemark) {
        this.storemark = storemark == null ? null : storemark.trim();
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