package com.web.entity;

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

    private Integer hospitalizationadviceid;

    /**
     * 手术名称
     */
    private String operationname;

    /**
     * 手术室号
     */
    private Integer operationroomid;

    /**
     * 住院号
     */
    private Integer hospitalizationid;

    /**
     * 主刀医师号
     */
    private Integer chiefsurgeonid;

    /**
     * 手术日期
     */
    private String operationdate;

    /**
     * 麻醉方式
     */
    private String anaesthesiamode;

    /**
     * 切口情况
     */
    private String incisioncondition;

    /**
     * 手术持续时间
     */
    private String operationduration;

    /**
     * 手术结果
     */
    private String surgicalresults;

    private Double operationprice;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getOperationnumber() {
        return operationnumber;
    }

    public void setOperationnumber(Integer operationnumber) {
        this.operationnumber = operationnumber;
    }

    public Integer getHospitalizationadviceid() {
        return hospitalizationadviceid;
    }

    public void setHospitalizationadviceid(Integer hospitalizationadviceid) {
        this.hospitalizationadviceid = hospitalizationadviceid;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public Integer getOperationroomid() {
        return operationroomid;
    }

    public void setOperationroomid(Integer operationroomid) {
        this.operationroomid = operationroomid;
    }

    public Integer getHospitalizationid() {
        return hospitalizationid;
    }

    public void setHospitalizationid(Integer hospitalizationid) {
        this.hospitalizationid = hospitalizationid;
    }

    public Integer getChiefsurgeonid() {
        return chiefsurgeonid;
    }

    public void setChiefsurgeonid(Integer chiefsurgeonid) {
        this.chiefsurgeonid = chiefsurgeonid;
    }

    public String getOperationdate() {
        return operationdate;
    }

    public void setOperationdate(String operationdate) {
        this.operationdate = operationdate;
    }

    public String getAnaesthesiamode() {
        return anaesthesiamode;
    }

    public void setAnaesthesiamode(String anaesthesiamode) {
        this.anaesthesiamode = anaesthesiamode;
    }

    public String getIncisioncondition() {
        return incisioncondition;
    }

    public void setIncisioncondition(String incisioncondition) {
        this.incisioncondition = incisioncondition;
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

    public Double getOperationprice() {
        return operationprice;
    }

    public void setOperationprice(Double operationprice) {
        this.operationprice = operationprice;
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
        Operation other = (Operation) that;
        return (this.getOperationnumber() == null ? other.getOperationnumber() == null : this.getOperationnumber().equals(other.getOperationnumber()))
            && (this.getHospitalizationadviceid() == null ? other.getHospitalizationadviceid() == null : this.getHospitalizationadviceid().equals(other.getHospitalizationadviceid()))
            && (this.getOperationname() == null ? other.getOperationname() == null : this.getOperationname().equals(other.getOperationname()))
            && (this.getOperationroomid() == null ? other.getOperationroomid() == null : this.getOperationroomid().equals(other.getOperationroomid()))
            && (this.getHospitalizationid() == null ? other.getHospitalizationid() == null : this.getHospitalizationid().equals(other.getHospitalizationid()))
            && (this.getChiefsurgeonid() == null ? other.getChiefsurgeonid() == null : this.getChiefsurgeonid().equals(other.getChiefsurgeonid()))
            && (this.getOperationdate() == null ? other.getOperationdate() == null : this.getOperationdate().equals(other.getOperationdate()))
            && (this.getAnaesthesiamode() == null ? other.getAnaesthesiamode() == null : this.getAnaesthesiamode().equals(other.getAnaesthesiamode()))
            && (this.getIncisioncondition() == null ? other.getIncisioncondition() == null : this.getIncisioncondition().equals(other.getIncisioncondition()))
            && (this.getOperationduration() == null ? other.getOperationduration() == null : this.getOperationduration().equals(other.getOperationduration()))
            && (this.getSurgicalresults() == null ? other.getSurgicalresults() == null : this.getSurgicalresults().equals(other.getSurgicalresults()))
            && (this.getOperationprice() == null ? other.getOperationprice() == null : this.getOperationprice().equals(other.getOperationprice()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationnumber() == null) ? 0 : getOperationnumber().hashCode());
        result = prime * result + ((getHospitalizationadviceid() == null) ? 0 : getHospitalizationadviceid().hashCode());
        result = prime * result + ((getOperationname() == null) ? 0 : getOperationname().hashCode());
        result = prime * result + ((getOperationroomid() == null) ? 0 : getOperationroomid().hashCode());
        result = prime * result + ((getHospitalizationid() == null) ? 0 : getHospitalizationid().hashCode());
        result = prime * result + ((getChiefsurgeonid() == null) ? 0 : getChiefsurgeonid().hashCode());
        result = prime * result + ((getOperationdate() == null) ? 0 : getOperationdate().hashCode());
        result = prime * result + ((getAnaesthesiamode() == null) ? 0 : getAnaesthesiamode().hashCode());
        result = prime * result + ((getIncisioncondition() == null) ? 0 : getIncisioncondition().hashCode());
        result = prime * result + ((getOperationduration() == null) ? 0 : getOperationduration().hashCode());
        result = prime * result + ((getSurgicalresults() == null) ? 0 : getSurgicalresults().hashCode());
        result = prime * result + ((getOperationprice() == null) ? 0 : getOperationprice().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationnumber=").append(operationnumber);
        sb.append(", hospitalizationadviceid=").append(hospitalizationadviceid);
        sb.append(", operationname=").append(operationname);
        sb.append(", operationroomid=").append(operationroomid);
        sb.append(", hospitalizationid=").append(hospitalizationid);
        sb.append(", chiefsurgeonid=").append(chiefsurgeonid);
        sb.append(", operationdate=").append(operationdate);
        sb.append(", anaesthesiamode=").append(anaesthesiamode);
        sb.append(", incisioncondition=").append(incisioncondition);
        sb.append(", operationduration=").append(operationduration);
        sb.append(", surgicalresults=").append(surgicalresults);
        sb.append(", operationprice=").append(operationprice);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}