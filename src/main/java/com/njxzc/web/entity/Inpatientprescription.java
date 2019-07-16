package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * inpatientprescription
 * @author 
 */
public class Inpatientprescription implements Serializable {
    /**
     * 处方号
     */
    private Integer prescriptionno;

    /**
     * 病例id
     */
    private Integer caseid;

    /**
     * 处方内容
     */
    private String prescriptioncontent;

    /**
     * 住院医师
     */
    private Integer residents;

    /**
     * 病人
     */
    private Integer patient;

    /**
     * 附注
     */
    private Integer note;

    private static final long serialVersionUID = 1L;

    public Integer getPrescriptionno() {
        return prescriptionno;
    }

    public void setPrescriptionno(Integer prescriptionno) {
        this.prescriptionno = prescriptionno;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getPrescriptioncontent() {
        return prescriptioncontent;
    }

    public void setPrescriptioncontent(String prescriptioncontent) {
        this.prescriptioncontent = prescriptioncontent;
    }

    public Integer getResidents() {
        return residents;
    }

    public void setResidents(Integer residents) {
        this.residents = residents;
    }

    public Integer getPatient() {
        return patient;
    }

    public void setPatient(Integer patient) {
        this.patient = patient;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
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
        Inpatientprescription other = (Inpatientprescription) that;
        return (this.getPrescriptionno() == null ? other.getPrescriptionno() == null : this.getPrescriptionno().equals(other.getPrescriptionno()))
            && (this.getCaseid() == null ? other.getCaseid() == null : this.getCaseid().equals(other.getCaseid()))
            && (this.getPrescriptioncontent() == null ? other.getPrescriptioncontent() == null : this.getPrescriptioncontent().equals(other.getPrescriptioncontent()))
            && (this.getResidents() == null ? other.getResidents() == null : this.getResidents().equals(other.getResidents()))
            && (this.getPatient() == null ? other.getPatient() == null : this.getPatient().equals(other.getPatient()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescriptionno() == null) ? 0 : getPrescriptionno().hashCode());
        result = prime * result + ((getCaseid() == null) ? 0 : getCaseid().hashCode());
        result = prime * result + ((getPrescriptioncontent() == null) ? 0 : getPrescriptioncontent().hashCode());
        result = prime * result + ((getResidents() == null) ? 0 : getResidents().hashCode());
        result = prime * result + ((getPatient() == null) ? 0 : getPatient().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescriptionno=").append(prescriptionno);
        sb.append(", caseid=").append(caseid);
        sb.append(", prescriptioncontent=").append(prescriptioncontent);
        sb.append(", residents=").append(residents);
        sb.append(", patient=").append(patient);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}