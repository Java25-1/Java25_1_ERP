package com.accp.erp.yangtao.pojo;

public class Providetype {
    private Integer peeid;

    private String peename;

    private String peeename;

    private String peeremark;

    private Integer enables;

    private String extend0;

    private String extend1;

    private String extend2;

    private String extend3;

    private String extend4;

    public Integer getPeeid() {
        return peeid;
    }

    public void setPeeid(Integer peeid) {
        this.peeid = peeid;
    }

    public String getPeename() {
        return peename;
    }

    public void setPeename(String peename) {
        this.peename = peename == null ? null : peename.trim();
    }

    public String getPeeename() {
        return peeename;
    }

    public void setPeeename(String peeename) {
        this.peeename = peeename == null ? null : peeename.trim();
    }

    public String getPeeremark() {
        return peeremark;
    }

    public void setPeeremark(String peeremark) {
        this.peeremark = peeremark == null ? null : peeremark.trim();
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