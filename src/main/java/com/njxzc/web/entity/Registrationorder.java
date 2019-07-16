package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * registrationorder
 * @author 
 */
public class Registrationorder implements Serializable {
    /**
     * 挂号id
     */
    private Integer registerid;

    /**
     * 挂号编号
     */
    private Integer registrationnumber;

    /**
     * 主治医师
     */
    private Integer physicianincharge;

    private Integer patientid;

    /**
     * 挂号科室
     */
    private Integer registrationdepartment;

    /**
     * 挂号人员
     */
    private Integer registeredpersonnel;

    private Double registeredfee;

    /**
     * 挂号日期
     */
    private String registrationdate;

    private static final long serialVersionUID = 1L;

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Integer getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(Integer registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public Integer getPhysicianincharge() {
        return physicianincharge;
    }

    public void setPhysicianincharge(Integer physicianincharge) {
        this.physicianincharge = physicianincharge;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getRegistrationdepartment() {
        return registrationdepartment;
    }

    public void setRegistrationdepartment(Integer registrationdepartment) {
        this.registrationdepartment = registrationdepartment;
    }

    public Integer getRegisteredpersonnel() {
        return registeredpersonnel;
    }

    public void setRegisteredpersonnel(Integer registeredpersonnel) {
        this.registeredpersonnel = registeredpersonnel;
    }

    public Double getRegisteredfee() {
        return registeredfee;
    }

    public void setRegisteredfee(Double registeredfee) {
        this.registeredfee = registeredfee;
    }

    public String getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(String registrationdate) {
        this.registrationdate = registrationdate;
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
        Registrationorder other = (Registrationorder) that;
        return (this.getRegisterid() == null ? other.getRegisterid() == null : this.getRegisterid().equals(other.getRegisterid()))
            && (this.getRegistrationnumber() == null ? other.getRegistrationnumber() == null : this.getRegistrationnumber().equals(other.getRegistrationnumber()))
            && (this.getPhysicianincharge() == null ? other.getPhysicianincharge() == null : this.getPhysicianincharge().equals(other.getPhysicianincharge()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getRegistrationdepartment() == null ? other.getRegistrationdepartment() == null : this.getRegistrationdepartment().equals(other.getRegistrationdepartment()))
            && (this.getRegisteredpersonnel() == null ? other.getRegisteredpersonnel() == null : this.getRegisteredpersonnel().equals(other.getRegisteredpersonnel()))
            && (this.getRegisteredfee() == null ? other.getRegisteredfee() == null : this.getRegisteredfee().equals(other.getRegisteredfee()))
            && (this.getRegistrationdate() == null ? other.getRegistrationdate() == null : this.getRegistrationdate().equals(other.getRegistrationdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegisterid() == null) ? 0 : getRegisterid().hashCode());
        result = prime * result + ((getRegistrationnumber() == null) ? 0 : getRegistrationnumber().hashCode());
        result = prime * result + ((getPhysicianincharge() == null) ? 0 : getPhysicianincharge().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getRegistrationdepartment() == null) ? 0 : getRegistrationdepartment().hashCode());
        result = prime * result + ((getRegisteredpersonnel() == null) ? 0 : getRegisteredpersonnel().hashCode());
        result = prime * result + ((getRegisteredfee() == null) ? 0 : getRegisteredfee().hashCode());
        result = prime * result + ((getRegistrationdate() == null) ? 0 : getRegistrationdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", registerid=").append(registerid);
        sb.append(", registrationnumber=").append(registrationnumber);
        sb.append(", physicianincharge=").append(physicianincharge);
        sb.append(", patientid=").append(patientid);
        sb.append(", registrationdepartment=").append(registrationdepartment);
        sb.append(", registeredpersonnel=").append(registeredpersonnel);
        sb.append(", registeredfee=").append(registeredfee);
        sb.append(", registrationdate=").append(registrationdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}