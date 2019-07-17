package com.web.entity;

import java.io.Serializable;

/**
 * generate
 * @author 
 */
public class Generate implements Serializable {
    /**
     * 请领单
     */
    private Integer receipt;

    /**
     * 处方号
     */
    private Integer prescription;

    /**
     * 编号
     */
    private Integer serialnumber;

    /**
     * 生成量
     */
    private Integer generate;

    private static final long serialVersionUID = 1L;

    public Integer getReceipt() {
        return receipt;
    }

    public void setReceipt(Integer receipt) {
        this.receipt = receipt;
    }

    public Integer getPrescription() {
        return prescription;
    }

    public void setPrescription(Integer prescription) {
        this.prescription = prescription;
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Integer getGenerate() {
        return generate;
    }

    public void setGenerate(Integer generate) {
        this.generate = generate;
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
        Generate other = (Generate) that;
        return (this.getReceipt() == null ? other.getReceipt() == null : this.getReceipt().equals(other.getReceipt()))
            && (this.getPrescription() == null ? other.getPrescription() == null : this.getPrescription().equals(other.getPrescription()))
            && (this.getSerialnumber() == null ? other.getSerialnumber() == null : this.getSerialnumber().equals(other.getSerialnumber()))
            && (this.getGenerate() == null ? other.getGenerate() == null : this.getGenerate().equals(other.getGenerate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReceipt() == null) ? 0 : getReceipt().hashCode());
        result = prime * result + ((getPrescription() == null) ? 0 : getPrescription().hashCode());
        result = prime * result + ((getSerialnumber() == null) ? 0 : getSerialnumber().hashCode());
        result = prime * result + ((getGenerate() == null) ? 0 : getGenerate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receipt=").append(receipt);
        sb.append(", prescription=").append(prescription);
        sb.append(", serialnumber=").append(serialnumber);
        sb.append(", generate=").append(generate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}