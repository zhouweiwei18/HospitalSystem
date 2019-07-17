package com.web.entity;

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
     * 科室号
     */
    private Integer departmentid;

    /**
     * 药品编号
     */
    private Integer drugsid;

    /**
     * 领药量
     */
    private Integer drugscount;

    private Integer drugstorageid;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getReceiptid() {
        return receiptid;
    }

    public void setReceiptid(Integer receiptid) {
        this.receiptid = receiptid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public Integer getDrugscount() {
        return drugscount;
    }

    public void setDrugscount(Integer drugscount) {
        this.drugscount = drugscount;
    }

    public Integer getDrugstorageid() {
        return drugstorageid;
    }

    public void setDrugstorageid(Integer drugstorageid) {
        this.drugstorageid = drugstorageid;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
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
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()))
            && (this.getDrugscount() == null ? other.getDrugscount() == null : this.getDrugscount().equals(other.getDrugscount()))
            && (this.getDrugstorageid() == null ? other.getDrugstorageid() == null : this.getDrugstorageid().equals(other.getDrugstorageid()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReceiptid() == null) ? 0 : getReceiptid().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        result = prime * result + ((getDrugscount() == null) ? 0 : getDrugscount().hashCode());
        result = prime * result + ((getDrugstorageid() == null) ? 0 : getDrugstorageid().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receiptid=").append(receiptid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", drugsid=").append(drugsid);
        sb.append(", drugscount=").append(drugscount);
        sb.append(", drugstorageid=").append(drugstorageid);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}