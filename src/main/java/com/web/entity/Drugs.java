package com.web.entity;

import java.io.Serializable;

/**
 * drugs
 * @author 
 */
public class Drugs implements Serializable {
    /**
     * 药品编号
     */
    private Integer drugsid;

    private Integer drugstorageid;

    /**
     * 药品名称
     */
    private String drugsname;

    /**
     * 规格
     */
    private String specifications;

    /**
     * 单位
     */
    private String amount;

    /**
     * 单价
     */
    private Double price;

    /**
     * 生产日期
     */
    private String manufacturedate;

    /**
     * 保质期
     */
    private String guaranteetime;

    private Integer supplierid;
    
    
    
    public Supplier getSupplier() {
		return Supplier;
	}

	public void setSupplier(Supplier supplier) {
		Supplier = supplier;
	}

	private Supplier  Supplier;

    private static final long serialVersionUID = 1L;

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public Integer getDrugstorageid() {
        return drugstorageid;
    }

    public void setDrugstorageid(Integer drugstorageid) {
        this.drugstorageid = drugstorageid;
    }

    public String getDrugsname() {
        return drugsname;
    }

    public void setDrugsname(String drugsname) {
        this.drugsname = drugsname;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(String manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    public String getGuaranteetime() {
        return guaranteetime;
    }

    public void setGuaranteetime(String guaranteetime) {
        this.guaranteetime = guaranteetime;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Drugs other = (Drugs) that;
        return (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()))
            && (this.getDrugstorageid() == null ? other.getDrugstorageid() == null : this.getDrugstorageid().equals(other.getDrugstorageid()))
            && (this.getDrugsname() == null ? other.getDrugsname() == null : this.getDrugsname().equals(other.getDrugsname()))
            && (this.getSpecifications() == null ? other.getSpecifications() == null : this.getSpecifications().equals(other.getSpecifications()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getManufacturedate() == null ? other.getManufacturedate() == null : this.getManufacturedate().equals(other.getManufacturedate()))
            && (this.getGuaranteetime() == null ? other.getGuaranteetime() == null : this.getGuaranteetime().equals(other.getGuaranteetime()))
            && (this.getSupplierid() == null ? other.getSupplierid() == null : this.getSupplierid().equals(other.getSupplierid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        result = prime * result + ((getDrugstorageid() == null) ? 0 : getDrugstorageid().hashCode());
        result = prime * result + ((getDrugsname() == null) ? 0 : getDrugsname().hashCode());
        result = prime * result + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getManufacturedate() == null) ? 0 : getManufacturedate().hashCode());
        result = prime * result + ((getGuaranteetime() == null) ? 0 : getGuaranteetime().hashCode());
        result = prime * result + ((getSupplierid() == null) ? 0 : getSupplierid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugsid=").append(drugsid);
        sb.append(", drugstorageid=").append(drugstorageid);
        sb.append(", drugsname=").append(drugsname);
        sb.append(", specifications=").append(specifications);
        sb.append(", amount=").append(amount);
        sb.append(", price=").append(price);
        sb.append(", manufacturedate=").append(manufacturedate);
        sb.append(", guaranteetime=").append(guaranteetime);
        sb.append(", supplierid=").append(supplierid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
    
    
}