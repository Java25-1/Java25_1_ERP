package com.accp.erp.yangtao.pojo;

public class Depttab {
    private Integer depid;

    private String depname;

    private String depremark;

    private String deptrash;

    private String extend0;

    private String extend1;

    private String extend2;

    private String extend3;

    private String extend4;

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getDepremark() {
        return depremark;
    }

    public void setDepremark(String depremark) {
        this.depremark = depremark == null ? null : depremark.trim();
    }

    public String getDeptrash() {
        return deptrash;
    }

    public void setDeptrash(String deptrash) {
        this.deptrash = deptrash == null ? null : deptrash.trim();
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