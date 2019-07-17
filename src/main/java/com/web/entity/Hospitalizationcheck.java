package com.web.entity;

import java.io.Serializable;

/**
 * hospitalizationCheck
 * @author 
 */
public class Hospitalizationcheck implements Serializable {
    /**
     * 住院检验序号
     */
    private Integer hospitalizationcheckno;

    /**
     * 住院医嘱
     */
    private Integer hospitalizationadviceid;

    /**
     * 检验医师
     */
    private Integer inspectiondoctorid;

    /**
     * 检查项目号
     */
    private Integer inspectionno;

    /**
     * 检验日期
     */
    private String inspectiondate;

    /**
     * 检验结果
     */
    private String inspectionresult;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalizationcheckno() {
        return hospitalizationcheckno;
    }

    public void setHospitalizationcheckno(Integer hospitalizationcheckno) {
        this.hospitalizationcheckno = hospitalizationcheckno;
    }

    public Integer getHospitalizationadviceid() {
        return hospitalizationadviceid;
    }

    public void setHospitalizationadviceid(Integer hospitalizationadviceid) {
        this.hospitalizationadviceid = hospitalizationadviceid;
    }

    public Integer getInspectiondoctorid() {
        return inspectiondoctorid;
    }

    public void setInspectiondoctorid(Integer inspectiondoctorid) {
        this.inspectiondoctorid = inspectiondoctorid;
    }

    public Integer getInspectionno() {
        return inspectionno;
    }

    public void setInspectionno(Integer inspectionno) {
        this.inspectionno = inspectionno;
    }

    public String getInspectiondate() {
        return inspectiondate;
    }

    public void setInspectiondate(String inspectiondate) {
        this.inspectiondate = inspectiondate;
    }

    public String getInspectionresult() {
        return inspectionresult;
    }

    public void setInspectionresult(String inspectionresult) {
        this.inspectionresult = inspectionresult;
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
        Hospitalizationcheck other = (Hospitalizationcheck) that;
        return (this.getHospitalizationcheckno() == null ? other.getHospitalizationcheckno() == null : this.getHospitalizationcheckno().equals(other.getHospitalizationcheckno()))
            && (this.getHospitalizationadviceid() == null ? other.getHospitalizationadviceid() == null : this.getHospitalizationadviceid().equals(other.getHospitalizationadviceid()))
            && (this.getInspectiondoctorid() == null ? other.getInspectiondoctorid() == null : this.getInspectiondoctorid().equals(other.getInspectiondoctorid()))
            && (this.getInspectionno() == null ? other.getInspectionno() == null : this.getInspectionno().equals(other.getInspectionno()))
            && (this.getInspectiondate() == null ? other.getInspectiondate() == null : this.getInspectiondate().equals(other.getInspectiondate()))
            && (this.getInspectionresult() == null ? other.getInspectionresult() == null : this.getInspectionresult().equals(other.getInspectionresult()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalizationcheckno() == null) ? 0 : getHospitalizationcheckno().hashCode());
        result = prime * result + ((getHospitalizationadviceid() == null) ? 0 : getHospitalizationadviceid().hashCode());
        result = prime * result + ((getInspectiondoctorid() == null) ? 0 : getInspectiondoctorid().hashCode());
        result = prime * result + ((getInspectionno() == null) ? 0 : getInspectionno().hashCode());
        result = prime * result + ((getInspectiondate() == null) ? 0 : getInspectiondate().hashCode());
        result = prime * result + ((getInspectionresult() == null) ? 0 : getInspectionresult().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalizationcheckno=").append(hospitalizationcheckno);
        sb.append(", hospitalizationadviceid=").append(hospitalizationadviceid);
        sb.append(", inspectiondoctorid=").append(inspectiondoctorid);
        sb.append(", inspectionno=").append(inspectionno);
        sb.append(", inspectiondate=").append(inspectiondate);
        sb.append(", inspectionresult=").append(inspectionresult);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}