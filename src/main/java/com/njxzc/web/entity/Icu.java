package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * icu
 * @author 
 */
public class Icu implements Serializable {
    /**
     * 病区号
     */
    private Integer icuid;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 病区名
     */
    private String icuname;

    /**
     * 床位数
     */
    private Integer bedno;

    /**
     * 负责人
     */
    private String chargeperson;

    /**
     * 入住人数
     */
    private Integer occupantsno;

    /**
     * 出院人数
     */
    private Integer dischargesno;

    /**
     * 治疗率
     */
    private Double treatmentrate;

    /**
     * 好转率
     */
    private Double improvementrate;

    /**
     * 未愈率
     */
    private Double unhealedrate;

    /**
     * 死亡率
     */
    private Double mortality;

    /**
     * 诊断符合
     */
    private String diagnosticCoincidence;

    /**
     * 床位使用率
     */
    private Double bedUtilizationRate;

    private static final long serialVersionUID = 1L;

    public Integer getIcuid() {
        return icuid;
    }

    public void setIcuid(Integer icuid) {
        this.icuid = icuid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIcuname() {
        return icuname;
    }

    public void setIcuname(String icuname) {
        this.icuname = icuname;
    }

    public Integer getBedno() {
        return bedno;
    }

    public void setBedno(Integer bedno) {
        this.bedno = bedno;
    }

    public String getChargeperson() {
        return chargeperson;
    }

    public void setChargeperson(String chargeperson) {
        this.chargeperson = chargeperson;
    }

    public Integer getOccupantsno() {
        return occupantsno;
    }

    public void setOccupantsno(Integer occupantsno) {
        this.occupantsno = occupantsno;
    }

    public Integer getDischargesno() {
        return dischargesno;
    }

    public void setDischargesno(Integer dischargesno) {
        this.dischargesno = dischargesno;
    }

    public Double getTreatmentrate() {
        return treatmentrate;
    }

    public void setTreatmentrate(Double treatmentrate) {
        this.treatmentrate = treatmentrate;
    }

    public Double getImprovementrate() {
        return improvementrate;
    }

    public void setImprovementrate(Double improvementrate) {
        this.improvementrate = improvementrate;
    }

    public Double getUnhealedrate() {
        return unhealedrate;
    }

    public void setUnhealedrate(Double unhealedrate) {
        this.unhealedrate = unhealedrate;
    }

    public Double getMortality() {
        return mortality;
    }

    public void setMortality(Double mortality) {
        this.mortality = mortality;
    }

    public String getDiagnosticCoincidence() {
        return diagnosticCoincidence;
    }

    public void setDiagnosticCoincidence(String diagnosticCoincidence) {
        this.diagnosticCoincidence = diagnosticCoincidence;
    }

    public Double getBedUtilizationRate() {
        return bedUtilizationRate;
    }

    public void setBedUtilizationRate(Double bedUtilizationRate) {
        this.bedUtilizationRate = bedUtilizationRate;
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
        Icu other = (Icu) that;
        return (this.getIcuid() == null ? other.getIcuid() == null : this.getIcuid().equals(other.getIcuid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getIcuname() == null ? other.getIcuname() == null : this.getIcuname().equals(other.getIcuname()))
            && (this.getBedno() == null ? other.getBedno() == null : this.getBedno().equals(other.getBedno()))
            && (this.getChargeperson() == null ? other.getChargeperson() == null : this.getChargeperson().equals(other.getChargeperson()))
            && (this.getOccupantsno() == null ? other.getOccupantsno() == null : this.getOccupantsno().equals(other.getOccupantsno()))
            && (this.getDischargesno() == null ? other.getDischargesno() == null : this.getDischargesno().equals(other.getDischargesno()))
            && (this.getTreatmentrate() == null ? other.getTreatmentrate() == null : this.getTreatmentrate().equals(other.getTreatmentrate()))
            && (this.getImprovementrate() == null ? other.getImprovementrate() == null : this.getImprovementrate().equals(other.getImprovementrate()))
            && (this.getUnhealedrate() == null ? other.getUnhealedrate() == null : this.getUnhealedrate().equals(other.getUnhealedrate()))
            && (this.getMortality() == null ? other.getMortality() == null : this.getMortality().equals(other.getMortality()))
            && (this.getDiagnosticCoincidence() == null ? other.getDiagnosticCoincidence() == null : this.getDiagnosticCoincidence().equals(other.getDiagnosticCoincidence()))
            && (this.getBedUtilizationRate() == null ? other.getBedUtilizationRate() == null : this.getBedUtilizationRate().equals(other.getBedUtilizationRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIcuid() == null) ? 0 : getIcuid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getIcuname() == null) ? 0 : getIcuname().hashCode());
        result = prime * result + ((getBedno() == null) ? 0 : getBedno().hashCode());
        result = prime * result + ((getChargeperson() == null) ? 0 : getChargeperson().hashCode());
        result = prime * result + ((getOccupantsno() == null) ? 0 : getOccupantsno().hashCode());
        result = prime * result + ((getDischargesno() == null) ? 0 : getDischargesno().hashCode());
        result = prime * result + ((getTreatmentrate() == null) ? 0 : getTreatmentrate().hashCode());
        result = prime * result + ((getImprovementrate() == null) ? 0 : getImprovementrate().hashCode());
        result = prime * result + ((getUnhealedrate() == null) ? 0 : getUnhealedrate().hashCode());
        result = prime * result + ((getMortality() == null) ? 0 : getMortality().hashCode());
        result = prime * result + ((getDiagnosticCoincidence() == null) ? 0 : getDiagnosticCoincidence().hashCode());
        result = prime * result + ((getBedUtilizationRate() == null) ? 0 : getBedUtilizationRate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", icuid=").append(icuid);
        sb.append(", userid=").append(userid);
        sb.append(", icuname=").append(icuname);
        sb.append(", bedno=").append(bedno);
        sb.append(", chargeperson=").append(chargeperson);
        sb.append(", occupantsno=").append(occupantsno);
        sb.append(", dischargesno=").append(dischargesno);
        sb.append(", treatmentrate=").append(treatmentrate);
        sb.append(", improvementrate=").append(improvementrate);
        sb.append(", unhealedrate=").append(unhealedrate);
        sb.append(", mortality=").append(mortality);
        sb.append(", diagnosticCoincidence=").append(diagnosticCoincidence);
        sb.append(", bedUtilizationRate=").append(bedUtilizationRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}