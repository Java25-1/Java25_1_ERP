package com.accp.erp.sunlueming.pojo;

public class Mainlistofpurchaseinvoicesdetatils {
    private String invoiceddetailsid;

    private Integer lineint;

    private String materialint;

    private String namematerial;

    private String specificationtype;

    private String nameofunit;

    private Integer num;

    private Float unitprice;

    private Float amountofmoney;

    private Float taxrate;

    private Float taxamount;

    private Float taxableamount;

    private Integer unenteredquantity;

    private String purchasingorderint;

    private String notestoentries;

    private String safetytone;

    private String safetyttwo;

    public String getInvoiceddetailsid() {
        return invoiceddetailsid;
    }

    public void setInvoiceddetailsid(String invoiceddetailsid) {
        this.invoiceddetailsid = invoiceddetailsid == null ? null : invoiceddetailsid.trim();
    }

    public Integer getLineint() {
        return lineint;
    }

    public void setLineint(Integer lineint) {
        this.lineint = lineint;
    }

    public String getMaterialint() {
        return materialint;
    }

    public void setMaterialint(String materialint) {
        this.materialint = materialint == null ? null : materialint.trim();
    }

    public String getNamematerial() {
        return namematerial;
    }

    public void setNamematerial(String namematerial) {
        this.namematerial = namematerial == null ? null : namematerial.trim();
    }

    public String getSpecificationtype() {
        return specificationtype;
    }

    public void setSpecificationtype(String specificationtype) {
        this.specificationtype = specificationtype == null ? null : specificationtype.trim();
    }

    public String getNameofunit() {
        return nameofunit;
    }

    public void setNameofunit(String nameofunit) {
        this.nameofunit = nameofunit == null ? null : nameofunit.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    public Float getAmountofmoney() {
        return amountofmoney;
    }

    public void setAmountofmoney(Float amountofmoney) {
        this.amountofmoney = amountofmoney;
    }

    public Float getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Float taxrate) {
        this.taxrate = taxrate;
    }

    public Float getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Float taxamount) {
        this.taxamount = taxamount;
    }

    public Float getTaxableamount() {
        return taxableamount;
    }

    public void setTaxableamount(Float taxableamount) {
        this.taxableamount = taxableamount;
    }

    public Integer getUnenteredquantity() {
        return unenteredquantity;
    }

    public void setUnenteredquantity(Integer unenteredquantity) {
        this.unenteredquantity = unenteredquantity;
    }

    public String getPurchasingorderint() {
        return purchasingorderint;
    }

    public void setPurchasingorderint(String purchasingorderint) {
        this.purchasingorderint = purchasingorderint == null ? null : purchasingorderint.trim();
    }

    public String getNotestoentries() {
        return notestoentries;
    }

    public void setNotestoentries(String notestoentries) {
        this.notestoentries = notestoentries == null ? null : notestoentries.trim();
    }

    public String getSafetytone() {
        return safetytone;
    }

    public void setSafetytone(String safetytone) {
        this.safetytone = safetytone == null ? null : safetytone.trim();
    }

    public String getSafetyttwo() {
        return safetyttwo;
    }

    public void setSafetyttwo(String safetyttwo) {
        this.safetyttwo = safetyttwo == null ? null : safetyttwo.trim();
    }
}