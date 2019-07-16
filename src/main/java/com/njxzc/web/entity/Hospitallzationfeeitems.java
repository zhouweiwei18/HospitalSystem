package com.njxzc.web.entity;

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
    private Integer prescriptionid;

    /**
     * 相应序号
     */
    private Integer correspondingid;

    /**
     * 收费类型
     */
    private Integer chargetype;

    /**
     * 收费金额
     */
    private Double chargemoney;

    /**
     * 收款员
     */
    private Integer cashier;

    /**
     * 结账情况
     */
    private Integer checkoutstatus;

    /**
     * 结账金额
     */
    private Double checkoutmoney;

    /**
     * 是否转账
     */
    private Integer transferornot;

    private static final long serialVersionUID = 1L;

    public Integer getProjecdid() {
        return projecdid;
    }

    public void setProjecdid(Integer projecdid) {
        this.projecdid = projecdid;
    }

    public Integer getPrescriptionid() {
        return prescriptionid;
    }

    public void setPrescriptionid(Integer prescriptionid) {
        this.prescriptionid = prescriptionid;
    }

    public Integer getCorrespondingid() {
        return correspondingid;
    }

    public void setCorrespondingid(Integer correspondingid) {
        this.correspondingid = correspondingid;
    }

    public Integer getChargetype() {
        return chargetype;
    }

    public void setChargetype(Integer chargetype) {
        this.chargetype = chargetype;
    }

    public Double getChargemoney() {
        return chargemoney;
    }

    public void setChargemoney(Double chargemoney) {
        this.chargemoney = chargemoney;
    }

    public Integer getCashier() {
        return cashier;
    }

    public void setCashier(Integer cashier) {
        this.cashier = cashier;
    }

    public Integer getCheckoutstatus() {
        return checkoutstatus;
    }

    public void setCheckoutstatus(Integer checkoutstatus) {
        this.checkoutstatus = checkoutstatus;
    }

    public Double getCheckoutmoney() {
        return checkoutmoney;
    }

    public void setCheckoutmoney(Double checkoutmoney) {
        this.checkoutmoney = checkoutmoney;
    }

    public Integer getTransferornot() {
        return transferornot;
    }

    public void setTransferornot(Integer transferornot) {
        this.transferornot = transferornot;
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
            && (this.getPrescriptionid() == null ? other.getPrescriptionid() == null : this.getPrescriptionid().equals(other.getPrescriptionid()))
            && (this.getCorrespondingid() == null ? other.getCorrespondingid() == null : this.getCorrespondingid().equals(other.getCorrespondingid()))
            && (this.getChargetype() == null ? other.getChargetype() == null : this.getChargetype().equals(other.getChargetype()))
            && (this.getChargemoney() == null ? other.getChargemoney() == null : this.getChargemoney().equals(other.getChargemoney()))
            && (this.getCashier() == null ? other.getCashier() == null : this.getCashier().equals(other.getCashier()))
            && (this.getCheckoutstatus() == null ? other.getCheckoutstatus() == null : this.getCheckoutstatus().equals(other.getCheckoutstatus()))
            && (this.getCheckoutmoney() == null ? other.getCheckoutmoney() == null : this.getCheckoutmoney().equals(other.getCheckoutmoney()))
            && (this.getTransferornot() == null ? other.getTransferornot() == null : this.getTransferornot().equals(other.getTransferornot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProjecdid() == null) ? 0 : getProjecdid().hashCode());
        result = prime * result + ((getPrescriptionid() == null) ? 0 : getPrescriptionid().hashCode());
        result = prime * result + ((getCorrespondingid() == null) ? 0 : getCorrespondingid().hashCode());
        result = prime * result + ((getChargetype() == null) ? 0 : getChargetype().hashCode());
        result = prime * result + ((getChargemoney() == null) ? 0 : getChargemoney().hashCode());
        result = prime * result + ((getCashier() == null) ? 0 : getCashier().hashCode());
        result = prime * result + ((getCheckoutstatus() == null) ? 0 : getCheckoutstatus().hashCode());
        result = prime * result + ((getCheckoutmoney() == null) ? 0 : getCheckoutmoney().hashCode());
        result = prime * result + ((getTransferornot() == null) ? 0 : getTransferornot().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projecdid=").append(projecdid);
        sb.append(", prescriptionid=").append(prescriptionid);
        sb.append(", correspondingid=").append(correspondingid);
        sb.append(", chargetype=").append(chargetype);
        sb.append(", chargemoney=").append(chargemoney);
        sb.append(", cashier=").append(cashier);
        sb.append(", checkoutstatus=").append(checkoutstatus);
        sb.append(", checkoutmoney=").append(checkoutmoney);
        sb.append(", transferornot=").append(transferornot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}