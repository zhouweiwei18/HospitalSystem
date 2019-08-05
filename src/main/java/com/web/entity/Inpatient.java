package com.web.entity;

import java.io.Serializable;

/**
 * inpatient
 * @author 
 */
public class Inpatient implements Serializable {
    /**
     * 住院号
     */
    private Integer hospitalizationid;

    /**
     * 病人id
     */
    private Integer patientid;

    /**
     * 入院科别
     */
    private Integer departmentid;

    /**
     * 入院时间
     */
    private String hospitalizationtime;

    /**
     * 床位号
     */
    private Integer bednumber;

    /**
     * 情况
     */
    private String situation;

    /**
     * 转科情况
     */
    private Integer transfersituation;

    /**
     * 出院时间
     */
    private String dischargetime;
    
    private Department department;
    
    private Patient patient;
     
    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalizationid() {
        return hospitalizationid;
    }

    public void setHospitalizationid(Integer hospitalizationid) {
        this.hospitalizationid = hospitalizationid;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getHospitalizationtime() {
        return hospitalizationtime;
    }

    public void setHospitalizationtime(String hospitalizationtime) {
        this.hospitalizationtime = hospitalizationtime;
    }

    public Integer getBednumber() {
        return bednumber;
    }

    public void setBednumber(Integer bednumber) {
        this.bednumber = bednumber;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Integer getTransfersituation() {
        return transfersituation;
    }

    public void setTransfersituation(Integer transfersituation) {
        this.transfersituation = transfersituation;
    }

    public String getDischargetime() {
        return dischargetime;
    }

    public void setDischargetime(String dischargetime) {
        this.dischargetime = dischargetime;
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
        Inpatient other = (Inpatient) that;
        return (this.getHospitalizationid() == null ? other.getHospitalizationid() == null : this.getHospitalizationid().equals(other.getHospitalizationid()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getHospitalizationtime() == null ? other.getHospitalizationtime() == null : this.getHospitalizationtime().equals(other.getHospitalizationtime()))
            && (this.getBednumber() == null ? other.getBednumber() == null : this.getBednumber().equals(other.getBednumber()))
            && (this.getSituation() == null ? other.getSituation() == null : this.getSituation().equals(other.getSituation()))
            && (this.getTransfersituation() == null ? other.getTransfersituation() == null : this.getTransfersituation().equals(other.getTransfersituation()))
            && (this.getDischargetime() == null ? other.getDischargetime() == null : this.getDischargetime().equals(other.getDischargetime()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalizationid() == null) ? 0 : getHospitalizationid().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getHospitalizationtime() == null) ? 0 : getHospitalizationtime().hashCode());
        result = prime * result + ((getBednumber() == null) ? 0 : getBednumber().hashCode());
        result = prime * result + ((getSituation() == null) ? 0 : getSituation().hashCode());
        result = prime * result + ((getTransfersituation() == null) ? 0 : getTransfersituation().hashCode());
        result = prime * result + ((getDischargetime() == null) ? 0 : getDischargetime().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalizationid=").append(hospitalizationid);
        sb.append(", patientid=").append(patientid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", hospitalizationtime=").append(hospitalizationtime);
        sb.append(", bednumber=").append(bednumber);
        sb.append(", situation=").append(situation);
        sb.append(", transfersituation=").append(transfersituation);
        sb.append(", dischargetime=").append(dischargetime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}