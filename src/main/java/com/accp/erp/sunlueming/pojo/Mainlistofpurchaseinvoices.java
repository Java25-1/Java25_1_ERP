package com.accp.erp.sunlueming.pojo;

import java.util.Date;
/**
 * @description: 采购发票
 * @author: apple
 */
public class Mainlistofpurchaseinvoices {
    private String storageid;//发票主表ID

    private String citationid;//供货商ID

    private String clientsupply;//供货商名称

    private Date storagedate;//单据日期

    private String documenttype;//单据类型

    private String documentint;//单据号码

    private Integer taxincluded;//单价是否含税

    private String invoiceint;//发票号码

    private String checkstatus;//采购核对状态

    private String invoicetype;//发票类型

    private String voucherint;//凭证编号

    private String currency;//币别

    private String certificateno;//差价凭证编号

    private Float exchangerate;//汇率

    private String purchaser;//采购人员

    private String subordinatedepartments;//所属部门

    private String attributionofaccounts;//账款归属

    private String termofpayment;//付款条件

    private Integer daysofpaymentterms;//付款条件天数

    private Date dateofpayment;//付款日期

    private Date accountmonth;//账款月份

    private String paystrike1;//结算方式1

    private String paystrike2;//结算方式2

    private String paystrike3;//结算方式3

    private Float paymoney1;//金额1

    private Float paymoney2;//金额2

    private Float paymoney3;//金额3

    private String systempersonnel;//制单人员

    private String reviewpersonne;//复核人员

    private String subordinateprojects;//所属项目

    private Integer enables;//标识是否删除

    private Integer isaditing;//是否审核

    private String safetytone;//保留字段

    private String safetytwo;//保留字段

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getCitationid() {
        return citationid;
    }

    public void setCitationid(String citationid) {
        this.citationid = citationid == null ? null : citationid.trim();
    }

    public String getClientsupply() {
        return clientsupply;
    }

    public void setClientsupply(String clientsupply) {
        this.clientsupply = clientsupply == null ? null : clientsupply.trim();
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public String getDocumenttype() {
        return documenttype;
    }

    public void setDocumenttype(String documenttype) {
        this.documenttype = documenttype == null ? null : documenttype.trim();
    }

    public String getDocumentint() {
        return documentint;
    }

    public void setDocumentint(String documentint) {
        this.documentint = documentint == null ? null : documentint.trim();
    }

    public Integer getTaxincluded() {
        return taxincluded;
    }

    public void setTaxincluded(Integer taxincluded) {
        this.taxincluded = taxincluded;
    }

    public String getInvoiceint() {
        return invoiceint;
    }

    public void setInvoiceint(String invoiceint) {
        this.invoiceint = invoiceint == null ? null : invoiceint.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype == null ? null : invoicetype.trim();
    }

    public String getVoucherint() {
        return voucherint;
    }

    public void setVoucherint(String voucherint) {
        this.voucherint = voucherint == null ? null : voucherint.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getCertificateno() {
        return certificateno;
    }

    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno == null ? null : certificateno.trim();
    }

    public Float getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Float exchangerate) {
        this.exchangerate = exchangerate;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser == null ? null : purchaser.trim();
    }

    public String getSubordinatedepartments() {
        return subordinatedepartments;
    }

    public void setSubordinatedepartments(String subordinatedepartments) {
        this.subordinatedepartments = subordinatedepartments == null ? null : subordinatedepartments.trim();
    }

    public String getAttributionofaccounts() {
        return attributionofaccounts;
    }

    public void setAttributionofaccounts(String attributionofaccounts) {
        this.attributionofaccounts = attributionofaccounts == null ? null : attributionofaccounts.trim();
    }

    public String getTermofpayment() {
        return termofpayment;
    }

    public void setTermofpayment(String termofpayment) {
        this.termofpayment = termofpayment == null ? null : termofpayment.trim();
    }

    public Integer getDaysofpaymentterms() {
        return daysofpaymentterms;
    }

    public void setDaysofpaymentterms(Integer daysofpaymentterms) {
        this.daysofpaymentterms = daysofpaymentterms;
    }

    public Date getDateofpayment() {
        return dateofpayment;
    }

    public void setDateofpayment(Date dateofpayment) {
        this.dateofpayment = dateofpayment;
    }

    public Date getAccountmonth() {
        return accountmonth;
    }

    public void setAccountmonth(Date accountmonth) {
        this.accountmonth = accountmonth;
    }

    public String getPaystrike1() {
        return paystrike1;
    }

    public void setPaystrike1(String paystrike1) {
        this.paystrike1 = paystrike1 == null ? null : paystrike1.trim();
    }

    public String getPaystrike2() {
        return paystrike2;
    }

    public void setPaystrike2(String paystrike2) {
        this.paystrike2 = paystrike2 == null ? null : paystrike2.trim();
    }

    public String getPaystrike3() {
        return paystrike3;
    }

    public void setPaystrike3(String paystrike3) {
        this.paystrike3 = paystrike3 == null ? null : paystrike3.trim();
    }

    public Float getPaymoney1() {
        return paymoney1;
    }

    public void setPaymoney1(Float paymoney1) {
        this.paymoney1 = paymoney1;
    }

    public Float getPaymoney2() {
        return paymoney2;
    }

    public void setPaymoney2(Float paymoney2) {
        this.paymoney2 = paymoney2;
    }

    public Float getPaymoney3() {
        return paymoney3;
    }

    public void setPaymoney3(Float paymoney3) {
        this.paymoney3 = paymoney3;
    }

    public String getSystempersonnel() {
        return systempersonnel;
    }

    public void setSystempersonnel(String systempersonnel) {
        this.systempersonnel = systempersonnel == null ? null : systempersonnel.trim();
    }

    public String getReviewpersonne() {
        return reviewpersonne;
    }

    public void setReviewpersonne(String reviewpersonne) {
        this.reviewpersonne = reviewpersonne == null ? null : reviewpersonne.trim();
    }

    public String getSubordinateprojects() {
        return subordinateprojects;
    }

    public void setSubordinateprojects(String subordinateprojects) {
        this.subordinateprojects = subordinateprojects == null ? null : subordinateprojects.trim();
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public Integer getIsaditing() {
        return isaditing;
    }

    public void setIsaditing(Integer isaditing) {
        this.isaditing = isaditing;
    }

    public String getSafetytone() {
        return safetytone;
    }

    public void setSafetytone(String safetytone) {
        this.safetytone = safetytone == null ? null : safetytone.trim();
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo == null ? null : safetytwo.trim();
    }
}