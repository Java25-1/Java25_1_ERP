package com.accp.erp.xiangyueheng.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class role  {
    private Integer rid;

    private String rcode;

    private String rname;

    private Integer rstatus;

    private Date createdate;

    private String createby;

    private List<function>  functions;
    
    

    public List<function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<function> functions) {
		this.functions = functions;
	}

	public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode == null ? null : rcode.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Integer getRstatus() {
        return rstatus;
    }

    public void setRstatus(Integer rstatus) {
        this.rstatus = rstatus;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }
}