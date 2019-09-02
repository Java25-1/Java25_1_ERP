package com.accp.erp.xiangyueheng.pojo;

import java.io.Serializable;
import java.util.List;


 //用户表
public class User {
    private Integer uid;

    private String account;

    private String userpwd;

    private String deptid;

    private String deptname;

    private String uimg;

    private Integer status;

    private String empid;

    private String empname;

    private List<role>  roles;  //角色集合
    
    
 

    public List<role> getRoles() {
		return roles;
	}

	public void setRoles(List<role> roles) {
		this.roles = roles;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg == null ? null : uimg.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}