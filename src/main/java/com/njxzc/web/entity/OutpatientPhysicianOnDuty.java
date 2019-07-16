package com.njxzc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * outpatient_physician_on_duty
 * @author 
 */
public class OutpatientPhysicianOnDuty implements Serializable {
    /**
     * 值班医师id
     */
    private Integer outpatientdoctorid;

    /**
     * 挂号
     */
    private Integer register;

    /**
     * 医师id
     */
    private Integer doctorid;

    /**
     * 值班日期
     */
    private Date dutydate;

    private static final long serialVersionUID = 1L;

    public Integer getOutpatientdoctorid() {
        return outpatientdoctorid;
    }

    public void setOutpatientdoctorid(Integer outpatientdoctorid) {
        this.outpatientdoctorid = outpatientdoctorid;
    }

    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Date getDutydate() {
        return dutydate;
    }

    public void setDutydate(Date dutydate) {
        this.dutydate = dutydate;
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
        OutpatientPhysicianOnDuty other = (OutpatientPhysicianOnDuty) that;
        return (this.getOutpatientdoctorid() == null ? other.getOutpatientdoctorid() == null : this.getOutpatientdoctorid().equals(other.getOutpatientdoctorid()))
            && (this.getRegister() == null ? other.getRegister() == null : this.getRegister().equals(other.getRegister()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getDutydate() == null ? other.getDutydate() == null : this.getDutydate().equals(other.getDutydate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOutpatientdoctorid() == null) ? 0 : getOutpatientdoctorid().hashCode());
        result = prime * result + ((getRegister() == null) ? 0 : getRegister().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getDutydate() == null) ? 0 : getDutydate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", outpatientdoctorid=").append(outpatientdoctorid);
        sb.append(", register=").append(register);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", dutydate=").append(dutydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}