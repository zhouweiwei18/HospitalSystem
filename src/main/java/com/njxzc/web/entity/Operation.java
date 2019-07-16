package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * operation
 * @author 
 */
public class Operation implements Serializable {
    /**
     * 手术号
     */
    private Integer operationnumber;

    /**
     * 主刀医师号
     */
    private Integer chiefsurgeonid;

    /**
     * 住院号
     */
    private Integer admissionnumber;

    /**
     * 病人id
     */
    private Integer patientid;

    /**
     * 手术名称
     */
    private String operationname;

    /**
     * 麻醉方式
     */
    private Integer anaesthesiamode;

    /**
     * 切口情况
     */
    private String incisioncondition;

    /**
     * 手术日期
     */
    private String operationdate;

    /**
     * 手术持续时间
     */
    private String operationduration;

    /**
     * 手术结果
     */
    private String surgicalresults;

    /**
     * 手术室号
     */
    private Integer operatingroomnumber;

    private static final long serialVersionUID = 1L;

    public Integer getOperationnumber() {
        return operationnumber;
    }

    public void setOperationnumber(Integer operationnumber) {
        this.operationnumber = operationnumber;
    }

    public Integer getChiefsurgeonid() {
        return chiefsurgeonid;
    }

    public void setChiefsurgeonid(Integer chiefsurgeonid) {
        this.chiefsurgeonid = chiefsurgeonid;
    }

    public Integer getAdmissionnumber() {
        return admissionnumber;
    }

    public void setAdmissionnumber(Integer admissionnumber) {
        this.admissionnumber = admissionnumber;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public Integer getAnaesthesiamode() {
        return anaesthesiamode;
    }

    public void setAnaesthesiamode(Integer anaesthesiamode) {
        this.anaesthesiamode = anaesthesiamode;
    }

    public String getIncisioncondition() {
        return incisioncondition;
    }

    public void setIncisioncondition(String incisioncondition) {
        this.incisioncondition = incisioncondition;
    }

    public String getOperationdate() {
        return operationdate;
    }

    public void setOperationdate(String operationdate) {
        this.operationdate = operationdate;
    }

    public String getOperationduration() {
        return operationduration;
    }

    public void setOperationduration(String operationduration) {
        this.operationduration = operationduration;
    }

    public String getSurgicalresults() {
        return surgicalresults;
    }

    public void setSurgicalresults(String surgicalresults) {
        this.surgicalresults = surgicalresults;
    }

    public Integer getOperatingroomnumber() {
        return operatingroomnumber;
    }

    public void setOperatingroomnumber(Integer operatingroomnumber) {
        this.operatingroomnumber = operatingroomnumber;
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
        Operation other = (Operation) that;
        return (this.getOperationnumber() == null ? other.getOperationnumber() == null : this.getOperationnumber().equals(other.getOperationnumber()))
            && (this.getChiefsurgeonid() == null ? other.getChiefsurgeonid() == null : this.getChiefsurgeonid().equals(other.getChiefsurgeonid()))
            && (this.getAdmissionnumber() == null ? other.getAdmissionnumber() == null : this.getAdmissionnumber().equals(other.getAdmissionnumber()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getOperationname() == null ? other.getOperationname() == null : this.getOperationname().equals(other.getOperationname()))
            && (this.getAnaesthesiamode() == null ? other.getAnaesthesiamode() == null : this.getAnaesthesiamode().equals(other.getAnaesthesiamode()))
            && (this.getIncisioncondition() == null ? other.getIncisioncondition() == null : this.getIncisioncondition().equals(other.getIncisioncondition()))
            && (this.getOperationdate() == null ? other.getOperationdate() == null : this.getOperationdate().equals(other.getOperationdate()))
            && (this.getOperationduration() == null ? other.getOperationduration() == null : this.getOperationduration().equals(other.getOperationduration()))
            && (this.getSurgicalresults() == null ? other.getSurgicalresults() == null : this.getSurgicalresults().equals(other.getSurgicalresults()))
            && (this.getOperatingroomnumber() == null ? other.getOperatingroomnumber() == null : this.getOperatingroomnumber().equals(other.getOperatingroomnumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationnumber() == null) ? 0 : getOperationnumber().hashCode());
        result = prime * result + ((getChiefsurgeonid() == null) ? 0 : getChiefsurgeonid().hashCode());
        result = prime * result + ((getAdmissionnumber() == null) ? 0 : getAdmissionnumber().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getOperationname() == null) ? 0 : getOperationname().hashCode());
        result = prime * result + ((getAnaesthesiamode() == null) ? 0 : getAnaesthesiamode().hashCode());
        result = prime * result + ((getIncisioncondition() == null) ? 0 : getIncisioncondition().hashCode());
        result = prime * result + ((getOperationdate() == null) ? 0 : getOperationdate().hashCode());
        result = prime * result + ((getOperationduration() == null) ? 0 : getOperationduration().hashCode());
        result = prime * result + ((getSurgicalresults() == null) ? 0 : getSurgicalresults().hashCode());
        result = prime * result + ((getOperatingroomnumber() == null) ? 0 : getOperatingroomnumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationnumber=").append(operationnumber);
        sb.append(", chiefsurgeonid=").append(chiefsurgeonid);
        sb.append(", admissionnumber=").append(admissionnumber);
        sb.append(", patientid=").append(patientid);
        sb.append(", operationname=").append(operationname);
        sb.append(", anaesthesiamode=").append(anaesthesiamode);
        sb.append(", incisioncondition=").append(incisioncondition);
        sb.append(", operationdate=").append(operationdate);
        sb.append(", operationduration=").append(operationduration);
        sb.append(", surgicalresults=").append(surgicalresults);
        sb.append(", operatingroomnumber=").append(operatingroomnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}