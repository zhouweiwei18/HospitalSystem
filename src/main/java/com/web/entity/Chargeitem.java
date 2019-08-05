package com.web.entity;

import java.io.Serializable;

/**
 * chargeitem
 * @author 
 */
public class Chargeitem implements Serializable {
    private Integer chargeid;

    private Integer patientid;

    private Integer medicinefree;

    private Double inspectionfree;

    private Double checkfree;

    private static final long serialVersionUID = 1L;

    public Integer getChargeid() {
        return chargeid;
    }

    public void setChargeid(Integer chargeid) {
        this.chargeid = chargeid;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getMedicinefree() {
        return medicinefree;
    }

    public void setMedicinefree(Integer medicinefree) {
        this.medicinefree = medicinefree;
    }

    public Double getInspectionfree() {
        return inspectionfree;
    }

    public void setInspectionfree(Double inspectionfree) {
        this.inspectionfree = inspectionfree;
    }

    public Double getCheckfree() {
        return checkfree;
    }

    public void setCheckfree(Double checkfree) {
        this.checkfree = checkfree;
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
        Chargeitem other = (Chargeitem) that;
        return (this.getChargeid() == null ? other.getChargeid() == null : this.getChargeid().equals(other.getChargeid()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getMedicinefree() == null ? other.getMedicinefree() == null : this.getMedicinefree().equals(other.getMedicinefree()))
            && (this.getInspectionfree() == null ? other.getInspectionfree() == null : this.getInspectionfree().equals(other.getInspectionfree()))
            && (this.getCheckfree() == null ? other.getCheckfree() == null : this.getCheckfree().equals(other.getCheckfree()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChargeid() == null) ? 0 : getChargeid().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getMedicinefree() == null) ? 0 : getMedicinefree().hashCode());
        result = prime * result + ((getInspectionfree() == null) ? 0 : getInspectionfree().hashCode());
        result = prime * result + ((getCheckfree() == null) ? 0 : getCheckfree().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chargeid=").append(chargeid);
        sb.append(", patientid=").append(patientid);
        sb.append(", medicinefree=").append(medicinefree);
        sb.append(", inspectionfree=").append(inspectionfree);
        sb.append(", checkfree=").append(checkfree);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}