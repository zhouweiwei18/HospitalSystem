package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * inspectionproject
 * @author 
 */
public class Inspectionproject implements Serializable {
    /**
     * 检验序号
     */
    private Integer inspectionnumber;

    /**
     * 检验日期
     */
    private String inspectiondate;

    /**
     * 检验人员
     */
    private String inspectionperson;

    /**
     * 住院号
     */
    private Integer hospitalizationnumber;

    /**
     * 检验内容
     */
    private String inspectioncontent;

    /**
     * 检验结果
     */
    private String inspectionresult;

    private static final long serialVersionUID = 1L;

    public Integer getInspectionnumber() {
        return inspectionnumber;
    }

    public void setInspectionnumber(Integer inspectionnumber) {
        this.inspectionnumber = inspectionnumber;
    }

    public String getInspectiondate() {
        return inspectiondate;
    }

    public void setInspectiondate(String inspectiondate) {
        this.inspectiondate = inspectiondate;
    }

    public String getInspectionperson() {
        return inspectionperson;
    }

    public void setInspectionperson(String inspectionperson) {
        this.inspectionperson = inspectionperson;
    }

    public Integer getHospitalizationnumber() {
        return hospitalizationnumber;
    }

    public void setHospitalizationnumber(Integer hospitalizationnumber) {
        this.hospitalizationnumber = hospitalizationnumber;
    }

    public String getInspectioncontent() {
        return inspectioncontent;
    }

    public void setInspectioncontent(String inspectioncontent) {
        this.inspectioncontent = inspectioncontent;
    }

    public String getInspectionresult() {
        return inspectionresult;
    }

    public void setInspectionresult(String inspectionresult) {
        this.inspectionresult = inspectionresult;
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
        Inspectionproject other = (Inspectionproject) that;
        return (this.getInspectionnumber() == null ? other.getInspectionnumber() == null : this.getInspectionnumber().equals(other.getInspectionnumber()))
            && (this.getInspectiondate() == null ? other.getInspectiondate() == null : this.getInspectiondate().equals(other.getInspectiondate()))
            && (this.getInspectionperson() == null ? other.getInspectionperson() == null : this.getInspectionperson().equals(other.getInspectionperson()))
            && (this.getHospitalizationnumber() == null ? other.getHospitalizationnumber() == null : this.getHospitalizationnumber().equals(other.getHospitalizationnumber()))
            && (this.getInspectioncontent() == null ? other.getInspectioncontent() == null : this.getInspectioncontent().equals(other.getInspectioncontent()))
            && (this.getInspectionresult() == null ? other.getInspectionresult() == null : this.getInspectionresult().equals(other.getInspectionresult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInspectionnumber() == null) ? 0 : getInspectionnumber().hashCode());
        result = prime * result + ((getInspectiondate() == null) ? 0 : getInspectiondate().hashCode());
        result = prime * result + ((getInspectionperson() == null) ? 0 : getInspectionperson().hashCode());
        result = prime * result + ((getHospitalizationnumber() == null) ? 0 : getHospitalizationnumber().hashCode());
        result = prime * result + ((getInspectioncontent() == null) ? 0 : getInspectioncontent().hashCode());
        result = prime * result + ((getInspectionresult() == null) ? 0 : getInspectionresult().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inspectionnumber=").append(inspectionnumber);
        sb.append(", inspectiondate=").append(inspectiondate);
        sb.append(", inspectionperson=").append(inspectionperson);
        sb.append(", hospitalizationnumber=").append(hospitalizationnumber);
        sb.append(", inspectioncontent=").append(inspectioncontent);
        sb.append(", inspectionresult=").append(inspectionresult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}