package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * chargestatus
 * @author 
 */
public class Chargestatus implements Serializable {
    /**
     * 收费号
     */
    private Integer chargeno;

    /**
     * 收费项目号
     */
    private Integer chargeitemno;

    /**
     * 收费金额
     */
    private Integer chargeamount;

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
    private Double settleaccounts;

    /**
     * 是否转账
     */
    private Integer istransfer;

    /**
     * 病人id
     */
    private Integer patientid;

    private static final long serialVersionUID = 1L;

    public Integer getChargeno() {
        return chargeno;
    }

    public void setChargeno(Integer chargeno) {
        this.chargeno = chargeno;
    }

    public Integer getChargeitemno() {
        return chargeitemno;
    }

    public void setChargeitemno(Integer chargeitemno) {
        this.chargeitemno = chargeitemno;
    }

    public Integer getChargeamount() {
        return chargeamount;
    }

    public void setChargeamount(Integer chargeamount) {
        this.chargeamount = chargeamount;
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

    public Double getSettleaccounts() {
        return settleaccounts;
    }

    public void setSettleaccounts(Double settleaccounts) {
        this.settleaccounts = settleaccounts;
    }

    public Integer getIstransfer() {
        return istransfer;
    }

    public void setIstransfer(Integer istransfer) {
        this.istransfer = istransfer;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
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
        Chargestatus other = (Chargestatus) that;
        return (this.getChargeno() == null ? other.getChargeno() == null : this.getChargeno().equals(other.getChargeno()))
            && (this.getChargeitemno() == null ? other.getChargeitemno() == null : this.getChargeitemno().equals(other.getChargeitemno()))
            && (this.getChargeamount() == null ? other.getChargeamount() == null : this.getChargeamount().equals(other.getChargeamount()))
            && (this.getCashier() == null ? other.getCashier() == null : this.getCashier().equals(other.getCashier()))
            && (this.getCheckoutstatus() == null ? other.getCheckoutstatus() == null : this.getCheckoutstatus().equals(other.getCheckoutstatus()))
            && (this.getSettleaccounts() == null ? other.getSettleaccounts() == null : this.getSettleaccounts().equals(other.getSettleaccounts()))
            && (this.getIstransfer() == null ? other.getIstransfer() == null : this.getIstransfer().equals(other.getIstransfer()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChargeno() == null) ? 0 : getChargeno().hashCode());
        result = prime * result + ((getChargeitemno() == null) ? 0 : getChargeitemno().hashCode());
        result = prime * result + ((getChargeamount() == null) ? 0 : getChargeamount().hashCode());
        result = prime * result + ((getCashier() == null) ? 0 : getCashier().hashCode());
        result = prime * result + ((getCheckoutstatus() == null) ? 0 : getCheckoutstatus().hashCode());
        result = prime * result + ((getSettleaccounts() == null) ? 0 : getSettleaccounts().hashCode());
        result = prime * result + ((getIstransfer() == null) ? 0 : getIstransfer().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chargeno=").append(chargeno);
        sb.append(", chargeitemno=").append(chargeitemno);
        sb.append(", chargeamount=").append(chargeamount);
        sb.append(", cashier=").append(cashier);
        sb.append(", checkoutstatus=").append(checkoutstatus);
        sb.append(", settleaccounts=").append(settleaccounts);
        sb.append(", istransfer=").append(istransfer);
        sb.append(", patientid=").append(patientid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}