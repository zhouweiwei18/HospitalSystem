package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * supplier
 * @author 
 */
public class Supplier implements Serializable {
    /**
     * 供应商号
     */
    private Integer productnumber;

    private String address;

    private String tel;

    /**
     * 信贷情况
     */
    private Integer creditsituation;

    private static final long serialVersionUID = 1L;

    public Integer getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(Integer productnumber) {
        this.productnumber = productnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getCreditsituation() {
        return creditsituation;
    }

    public void setCreditsituation(Integer creditsituation) {
        this.creditsituation = creditsituation;
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
        Supplier other = (Supplier) that;
        return (this.getProductnumber() == null ? other.getProductnumber() == null : this.getProductnumber().equals(other.getProductnumber()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getCreditsituation() == null ? other.getCreditsituation() == null : this.getCreditsituation().equals(other.getCreditsituation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductnumber() == null) ? 0 : getProductnumber().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getCreditsituation() == null) ? 0 : getCreditsituation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productnumber=").append(productnumber);
        sb.append(", address=").append(address);
        sb.append(", tel=").append(tel);
        sb.append(", creditsituation=").append(creditsituation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}