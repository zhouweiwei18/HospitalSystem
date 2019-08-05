package com.web.entity;

import java.io.Serializable;

/**
 * doctoradvice
 * @author 
 */
public class Doctoradvice implements Serializable {
    /**
     * 医嘱id
     */
    private Integer doctoradviceid;

    /**
     * 病历
     */
    private Integer medicalrecord;

    /**
     * 开出时间
     */
    private String startupdate;

    /**
     * 处理日期
     */
    private String processingdate;

    /**
     * 医嘱内容
     */
    private String doctoradvicecontent;

    private Integer processingschemeno;

    /**
     * 主治医生
     */
    private Integer attendingdoctor;

    /**
     * 病人id
     */
    private Integer patientid;

    /**
     * 疾病名称
     */
    private String diseasename;

    /**
     * 出院
     */
    private String leavehospital;

    private Integer isdelete;

    private Patient patient;
    public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	private static final long serialVersionUID = 1L;

    public Integer getDoctoradviceid() {
        return doctoradviceid;
    }

    public void setDoctoradviceid(Integer doctoradviceid) {
        this.doctoradviceid = doctoradviceid;
    }

    public Integer getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(Integer medicalrecord) {
        this.medicalrecord = medicalrecord;
    }

    public String getStartupdate() {
        return startupdate;
    }

    public void setStartupdate(String startupdate) {
        this.startupdate = startupdate;
    }

    public String getProcessingdate() {
        return processingdate;
    }

    public void setProcessingdate(String processingdate) {
        this.processingdate = processingdate;
    }

    public String getDoctoradvicecontent() {
        return doctoradvicecontent;
    }

    public void setDoctoradvicecontent(String doctoradvicecontent) {
        this.doctoradvicecontent = doctoradvicecontent;
    }

    public Integer getProcessingschemeno() {
        return processingschemeno;
    }

    public void setProcessingschemeno(Integer processingschemeno) {
        this.processingschemeno = processingschemeno;
    }

    public Integer getAttendingdoctor() {
        return attendingdoctor;
    }

    public void setAttendingdoctor(Integer attendingdoctor) {
        this.attendingdoctor = attendingdoctor;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public String getLeavehospital() {
        return leavehospital;
    }

    public void setLeavehospital(String leavehospital) {
        this.leavehospital = leavehospital;
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
        Doctoradvice other = (Doctoradvice) that;
        return (this.getDoctoradviceid() == null ? other.getDoctoradviceid() == null : this.getDoctoradviceid().equals(other.getDoctoradviceid()))
            && (this.getMedicalrecord() == null ? other.getMedicalrecord() == null : this.getMedicalrecord().equals(other.getMedicalrecord()))
            && (this.getStartupdate() == null ? other.getStartupdate() == null : this.getStartupdate().equals(other.getStartupdate()))
            && (this.getProcessingdate() == null ? other.getProcessingdate() == null : this.getProcessingdate().equals(other.getProcessingdate()))
            && (this.getDoctoradvicecontent() == null ? other.getDoctoradvicecontent() == null : this.getDoctoradvicecontent().equals(other.getDoctoradvicecontent()))
            && (this.getProcessingschemeno() == null ? other.getProcessingschemeno() == null : this.getProcessingschemeno().equals(other.getProcessingschemeno()))
            && (this.getAttendingdoctor() == null ? other.getAttendingdoctor() == null : this.getAttendingdoctor().equals(other.getAttendingdoctor()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getDiseasename() == null ? other.getDiseasename() == null : this.getDiseasename().equals(other.getDiseasename()))
            && (this.getLeavehospital() == null ? other.getLeavehospital() == null : this.getLeavehospital().equals(other.getLeavehospital()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctoradviceid() == null) ? 0 : getDoctoradviceid().hashCode());
        result = prime * result + ((getMedicalrecord() == null) ? 0 : getMedicalrecord().hashCode());
        result = prime * result + ((getStartupdate() == null) ? 0 : getStartupdate().hashCode());
        result = prime * result + ((getProcessingdate() == null) ? 0 : getProcessingdate().hashCode());
        result = prime * result + ((getDoctoradvicecontent() == null) ? 0 : getDoctoradvicecontent().hashCode());
        result = prime * result + ((getProcessingschemeno() == null) ? 0 : getProcessingschemeno().hashCode());
        result = prime * result + ((getAttendingdoctor() == null) ? 0 : getAttendingdoctor().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getDiseasename() == null) ? 0 : getDiseasename().hashCode());
        result = prime * result + ((getLeavehospital() == null) ? 0 : getLeavehospital().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctoradviceid=").append(doctoradviceid);
        sb.append(", medicalrecord=").append(medicalrecord);
        sb.append(", startupdate=").append(startupdate);
        sb.append(", processingdate=").append(processingdate);
        sb.append(", doctoradvicecontent=").append(doctoradvicecontent);
        sb.append(", processingschemeno=").append(processingschemeno);
        sb.append(", attendingdoctor=").append(attendingdoctor);
        sb.append(", patientid=").append(patientid);
        sb.append(", diseasename=").append(diseasename);
        sb.append(", leavehospital=").append(leavehospital);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}