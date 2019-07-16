package com.njxzc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * inpatient
 * @author 
 */
public class Inpatient implements Serializable {
    /**
     * 住院号
     */
    private Integer hospitalizationnumber;

    /**
     * 病人id
     */
    private Integer patientid;

    /**
     * 床位号
     */
    private Integer bednumber;

    /**
     * 入院科别
     */
    private String admissiondepartment;

    /**
     * 入院时间
     */
    private Date admissiontime;

    /**
     * 入院情况
     */
    private String admissionsituation;

    /**
     * 转科情况
     */
    private Integer transfersituation;

    /**
     * 出院情况
     */
    private String dischargeddepartment;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalizationnumber() {
        return hospitalizationnumber;
    }

    public void setHospitalizationnumber(Integer hospitalizationnumber) {
        this.hospitalizationnumber = hospitalizationnumber;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getBednumber() {
        return bednumber;
    }

    public void setBednumber(Integer bednumber) {
        this.bednumber = bednumber;
    }

    public String getAdmissiondepartment() {
        return admissiondepartment;
    }

    public void setAdmissiondepartment(String admissiondepartment) {
        this.admissiondepartment = admissiondepartment;
    }

    public Date getAdmissiontime() {
        return admissiontime;
    }

    public void setAdmissiontime(Date admissiontime) {
        this.admissiontime = admissiontime;
    }

    public String getAdmissionsituation() {
        return admissionsituation;
    }

    public void setAdmissionsituation(String admissionsituation) {
        this.admissionsituation = admissionsituation;
    }

    public Integer getTransfersituation() {
        return transfersituation;
    }

    public void setTransfersituation(Integer transfersituation) {
        this.transfersituation = transfersituation;
    }

    public String getDischargeddepartment() {
        return dischargeddepartment;
    }

    public void setDischargeddepartment(String dischargeddepartment) {
        this.dischargeddepartment = dischargeddepartment;
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
        Inpatient other = (Inpatient) that;
        return (this.getHospitalizationnumber() == null ? other.getHospitalizationnumber() == null : this.getHospitalizationnumber().equals(other.getHospitalizationnumber()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getBednumber() == null ? other.getBednumber() == null : this.getBednumber().equals(other.getBednumber()))
            && (this.getAdmissiondepartment() == null ? other.getAdmissiondepartment() == null : this.getAdmissiondepartment().equals(other.getAdmissiondepartment()))
            && (this.getAdmissiontime() == null ? other.getAdmissiontime() == null : this.getAdmissiontime().equals(other.getAdmissiontime()))
            && (this.getAdmissionsituation() == null ? other.getAdmissionsituation() == null : this.getAdmissionsituation().equals(other.getAdmissionsituation()))
            && (this.getTransfersituation() == null ? other.getTransfersituation() == null : this.getTransfersituation().equals(other.getTransfersituation()))
            && (this.getDischargeddepartment() == null ? other.getDischargeddepartment() == null : this.getDischargeddepartment().equals(other.getDischargeddepartment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalizationnumber() == null) ? 0 : getHospitalizationnumber().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getBednumber() == null) ? 0 : getBednumber().hashCode());
        result = prime * result + ((getAdmissiondepartment() == null) ? 0 : getAdmissiondepartment().hashCode());
        result = prime * result + ((getAdmissiontime() == null) ? 0 : getAdmissiontime().hashCode());
        result = prime * result + ((getAdmissionsituation() == null) ? 0 : getAdmissionsituation().hashCode());
        result = prime * result + ((getTransfersituation() == null) ? 0 : getTransfersituation().hashCode());
        result = prime * result + ((getDischargeddepartment() == null) ? 0 : getDischargeddepartment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalizationnumber=").append(hospitalizationnumber);
        sb.append(", patientid=").append(patientid);
        sb.append(", bednumber=").append(bednumber);
        sb.append(", admissiondepartment=").append(admissiondepartment);
        sb.append(", admissiontime=").append(admissiontime);
        sb.append(", admissionsituation=").append(admissionsituation);
        sb.append(", transfersituation=").append(transfersituation);
        sb.append(", dischargeddepartment=").append(dischargeddepartment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}