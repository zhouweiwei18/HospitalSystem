package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * supply
 * @author 
 */
public class Supply implements Serializable {
    /**
     * 产品号
     */
    private Integer productnumber;

    /**
     * 供应商号
     */
    private Integer supplierid;

    /**
     * 供应量
     */
    private Integer supplynumber;

    private static final long serialVersionUID = 1L;

    public Integer getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(Integer productnumber) {
        this.productnumber = productnumber;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getSupplynumber() {
        return supplynumber;
    }

    public void setSupplynumber(Integer supplynumber) {
        this.supplynumber = supplynumber;
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
        Supply other = (Supply) that;
        return (this.getProductnumber() == null ? other.getProductnumber() == null : this.getProductnumber().equals(other.getProductnumber()))
            && (this.getSupplierid() == null ? other.getSupplierid() == null : this.getSupplierid().equals(other.getSupplierid()))
            && (this.getSupplynumber() == null ? other.getSupplynumber() == null : this.getSupplynumber().equals(other.getSupplynumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductnumber() == null) ? 0 : getProductnumber().hashCode());
        result = prime * result + ((getSupplierid() == null) ? 0 : getSupplierid().hashCode());
        result = prime * result + ((getSupplynumber() == null) ? 0 : getSupplynumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productnumber=").append(productnumber);
        sb.append(", supplierid=").append(supplierid);
        sb.append(", supplynumber=").append(supplynumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}