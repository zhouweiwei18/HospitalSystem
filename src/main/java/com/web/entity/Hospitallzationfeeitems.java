package com.web.entity;

import java.io.Serializable;

/**
 * hospitallzationfeeitems
 * @author 
 */
public class Hospitallzationfeeitems implements Serializable {
    /**
     * 项目序号
     */
    private Integer projecdid;

    /**
     * 处方号
     */
    private Integer prescriptionno;

    /**
     * 住院号
     */
    private Integer hospitalizationid;

    /**
     * 收款日期
     */
    private String receivabledate;

    /**
     * 收款员
     */
    private Integer cashier;

    /**
     * 收费金额
     */
    private Double chargemoney;

    /**
     * 结账情况
     */
    private Integer checkoutstatus;

    private static final long serialVersionUID = 1L;

    public Integer getProjecdid() {
        return projecdid;
    }

    public void setProjecdid(Integer projecdid) {
        this.projecdid = projecdid;
    }

    public Integer getPrescriptionno() {
        return prescriptionno;
    }

    public void setPrescriptionno(Integer prescriptionno) {
        this.prescriptionno = prescriptionno;
    }

    public Integer getHospitalizationid() {
        return hospitalizationid;
    }

    public void setHospitalizationid(Integer hospitalizationid) {
        this.hospitalizationid = hospitalizationid;
    }

    public String getReceivabledate() {
        return receivabledate;
    }

    public void setReceivabledate(String receivabledate) {
        this.receivabledate = receivabledate;
    }

    public Integer getCashier() {
        return cashier;
    }

    public void setCashier(Integer cashier) {
        this.cashier = cashier;
    }

    public Double getChargemoney() {
        return chargemoney;
    }

    public void setChargemoney(Double chargemoney) {
        this.chargemoney = chargemoney;
    }

    public Integer getCheckoutstatus() {
        return checkoutstatus;
    }

    public void setCheckoutstatus(Integer checkoutstatus) {
        this.checkoutstatus = checkoutstatus;
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
        Hospitallzationfeeitems other = (Hospitallzationfeeitems) that;
        return (this.getProjecdid() == null ? other.getProjecdid() == null : this.getProjecdid().equals(other.getProjecdid()))
            && (this.getPrescriptionno() == null ? other.getPrescriptionno() == null : this.getPrescriptionno().equals(other.getPrescriptionno()))
            && (this.getHospitalizationid() == null ? other.getHospitalizationid() == null : this.getHospitalizationid().equals(other.getHospitalizationid()))
            && (this.getReceivabledate() == null ? other.getReceivabledate() == null : this.getReceivabledate().equals(other.getReceivabledate()))
            && (this.getCashier() == null ? other.getCashier() == null : this.getCashier().equals(other.getCashier()))
            && (this.getChargemoney() == null ? other.getChargemoney() == null : this.getChargemoney().equals(other.getChargemoney()))
            && (this.getCheckoutstatus() == null ? other.getCheckoutstatus() == null : this.getCheckoutstatus().equals(other.getCheckoutstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProjecdid() == null) ? 0 : getProjecdid().hashCode());
        result = prime * result + ((getPrescriptionno() == null) ? 0 : getPrescriptionno().hashCode());
        result = prime * result + ((getHospitalizationid() == null) ? 0 : getHospitalizationid().hashCode());
        result = prime * result + ((getReceivabledate() == null) ? 0 : getReceivabledate().hashCode());
        result = prime * result + ((getCashier() == null) ? 0 : getCashier().hashCode());
        result = prime * result + ((getChargemoney() == null) ? 0 : getChargemoney().hashCode());
        result = prime * result + ((getCheckoutstatus() == null) ? 0 : getCheckoutstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projecdid=").append(projecdid);
        sb.append(", prescriptionno=").append(prescriptionno);
        sb.append(", hospitalizationid=").append(hospitalizationid);
        sb.append(", receivabledate=").append(receivabledate);
        sb.append(", cashier=").append(cashier);
        sb.append(", chargemoney=").append(chargemoney);
        sb.append(", checkoutstatus=").append(checkoutstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}