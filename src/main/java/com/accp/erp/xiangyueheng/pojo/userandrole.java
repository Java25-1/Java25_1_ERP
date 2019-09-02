package com.accp.erp.xiangyueheng.pojo;

import java.io.Serializable;
import java.util.Date;

public class userandrole implements Serializable {
    private Integer urid;

    private Integer uid;

    private Integer rid;

    private String createby;

    private Date createdate;

    private static final long serialVersionUID = 1L;

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}