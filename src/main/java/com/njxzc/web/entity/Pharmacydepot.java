package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * pharmacydepot
 * @author 
 */
public class Pharmacydepot implements Serializable {
    /**
     * 药库号
     */
    private Integer pharmacydepotid;

    /**
     * 请领单编号
     */
    private Integer receiptid;

    /**
     * 负责人号
     */
    private Integer chargepersonid;

    /**
     * 类别
     */
    private String category;

    /**
     * 面积
     */
    private Double area;

    private static final long serialVersionUID = 1L;

    public Integer getPharmacydepotid() {
        return pharmacydepotid;
    }

    public void setPharmacydepotid(Integer pharmacydepotid) {
        this.pharmacydepotid = pharmacydepotid;
    }

    public Integer getReceiptid() {
        return receiptid;
    }

    public void setReceiptid(Integer receiptid) {
        this.receiptid = receiptid;
    }

    public Integer getChargepersonid() {
        return chargepersonid;
    }

    public void setChargepersonid(Integer chargepersonid) {
        this.chargepersonid = chargepersonid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
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
        Pharmacydepot other = (Pharmacydepot) that;
        return (this.getPharmacydepotid() == null ? other.getPharmacydepotid() == null : this.getPharmacydepotid().equals(other.getPharmacydepotid()))
            && (this.getReceiptid() == null ? other.getReceiptid() == null : this.getReceiptid().equals(other.getReceiptid()))
            && (this.getChargepersonid() == null ? other.getChargepersonid() == null : this.getChargepersonid().equals(other.getChargepersonid()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPharmacydepotid() == null) ? 0 : getPharmacydepotid().hashCode());
        result = prime * result + ((getReceiptid() == null) ? 0 : getReceiptid().hashCode());
        result = prime * result + ((getChargepersonid() == null) ? 0 : getChargepersonid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pharmacydepotid=").append(pharmacydepotid);
        sb.append(", receiptid=").append(receiptid);
        sb.append(", chargepersonid=").append(chargepersonid);
        sb.append(", category=").append(category);
        sb.append(", area=").append(area);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}