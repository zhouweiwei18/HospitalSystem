package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * outpatient_medical_record
 * @author 
 */
public class OutpatientMedicalRecord implements Serializable {
    /**
     * 病历号
     */
    private Integer medicalrecordno;

    /**
     * 挂号id
     */
    private Integer registerid;

    /**
     * 主治医师
     */
    private Integer physician;

    /**
     * 诊断时间
     */
    private String diagnostictime;

    /**
     * 病历内容
     */
    private String medicalrecordcontent;

    private static final long serialVersionUID = 1L;

    public Integer getMedicalrecordno() {
        return medicalrecordno;
    }

    public void setMedicalrecordno(Integer medicalrecordno) {
        this.medicalrecordno = medicalrecordno;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Integer getPhysician() {
        return physician;
    }

    public void setPhysician(Integer physician) {
        this.physician = physician;
    }

    public String getDiagnostictime() {
        return diagnostictime;
    }

    public void setDiagnostictime(String diagnostictime) {
        this.diagnostictime = diagnostictime;
    }

    public String getMedicalrecordcontent() {
        return medicalrecordcontent;
    }

    public void setMedicalrecordcontent(String medicalrecordcontent) {
        this.medicalrecordcontent = medicalrecordcontent;
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
        OutpatientMedicalRecord other = (OutpatientMedicalRecord) that;
        return (this.getMedicalrecordno() == null ? other.getMedicalrecordno() == null : this.getMedicalrecordno().equals(other.getMedicalrecordno()))
            && (this.getRegisterid() == null ? other.getRegisterid() == null : this.getRegisterid().equals(other.getRegisterid()))
            && (this.getPhysician() == null ? other.getPhysician() == null : this.getPhysician().equals(other.getPhysician()))
            && (this.getDiagnostictime() == null ? other.getDiagnostictime() == null : this.getDiagnostictime().equals(other.getDiagnostictime()))
            && (this.getMedicalrecordcontent() == null ? other.getMedicalrecordcontent() == null : this.getMedicalrecordcontent().equals(other.getMedicalrecordcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicalrecordno() == null) ? 0 : getMedicalrecordno().hashCode());
        result = prime * result + ((getRegisterid() == null) ? 0 : getRegisterid().hashCode());
        result = prime * result + ((getPhysician() == null) ? 0 : getPhysician().hashCode());
        result = prime * result + ((getDiagnostictime() == null) ? 0 : getDiagnostictime().hashCode());
        result = prime * result + ((getMedicalrecordcontent() == null) ? 0 : getMedicalrecordcontent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medicalrecordno=").append(medicalrecordno);
        sb.append(", registerid=").append(registerid);
        sb.append(", physician=").append(physician);
        sb.append(", diagnostictime=").append(diagnostictime);
        sb.append(", medicalrecordcontent=").append(medicalrecordcontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}