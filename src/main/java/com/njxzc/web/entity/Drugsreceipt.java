package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * drugsreceipt
 * @author 
 */
public class Drugsreceipt implements Serializable {
    /**
     * 请领编号
     */
    private Integer receiptid;

    /**
     * 请领单
     */
    private Integer receipt;

    /**
     * 药库号
     */
    private Integer pharmacydepotid;

    /**
     * 领用单位
     */
    private String employmentunit;

    /**
     * 领药量
     */
    private Integer drugscount;

    /**
     * 药品编号
     */
    private Integer drugsid;

    private static final long serialVersionUID = 1L;

    public Integer getReceiptid() {
        return receiptid;
    }

    public void setReceiptid(Integer receiptid) {
        this.receiptid = receiptid;
    }

    public Integer getReceipt() {
        return receipt;
    }

    public void setReceipt(Integer receipt) {
        this.receipt = receipt;
    }

    public Integer getPharmacydepotid() {
        return pharmacydepotid;
    }

    public void setPharmacydepotid(Integer pharmacydepotid) {
        this.pharmacydepotid = pharmacydepotid;
    }

    public String getEmploymentunit() {
        return employmentunit;
    }

    public void setEmploymentunit(String employmentunit) {
        this.employmentunit = employmentunit;
    }

    public Integer getDrugscount() {
        return drugscount;
    }

    public void setDrugscount(Integer drugscount) {
        this.drugscount = drugscount;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
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
        Drugsreceipt other = (Drugsreceipt) that;
        return (this.getReceiptid() == null ? other.getReceiptid() == null : this.getReceiptid().equals(other.getReceiptid()))
            && (this.getReceipt() == null ? other.getReceipt() == null : this.getReceipt().equals(other.getReceipt()))
            && (this.getPharmacydepotid() == null ? other.getPharmacydepotid() == null : this.getPharmacydepotid().equals(other.getPharmacydepotid()))
            && (this.getEmploymentunit() == null ? other.getEmploymentunit() == null : this.getEmploymentunit().equals(other.getEmploymentunit()))
            && (this.getDrugscount() == null ? other.getDrugscount() == null : this.getDrugscount().equals(other.getDrugscount()))
            && (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReceiptid() == null) ? 0 : getReceiptid().hashCode());
        result = prime * result + ((getReceipt() == null) ? 0 : getReceipt().hashCode());
        result = prime * result + ((getPharmacydepotid() == null) ? 0 : getPharmacydepotid().hashCode());
        result = prime * result + ((getEmploymentunit() == null) ? 0 : getEmploymentunit().hashCode());
        result = prime * result + ((getDrugscount() == null) ? 0 : getDrugscount().hashCode());
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receiptid=").append(receiptid);
        sb.append(", receipt=").append(receipt);
        sb.append(", pharmacydepotid=").append(pharmacydepotid);
        sb.append(", employmentunit=").append(employmentunit);
        sb.append(", drugscount=").append(drugscount);
        sb.append(", drugsid=").append(drugsid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}