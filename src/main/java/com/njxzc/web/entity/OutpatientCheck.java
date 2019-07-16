package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * outpatient_check
 * @author 
 */
public class OutpatientCheck implements Serializable {
    /**
     * 门诊病历id
     */
    private Integer outpatientmedicalrecordid;

    /**
     * 检查医师姓名
     */
    private Integer checkdoctorname;

    /**
     * 检查时间安排
     */
    private String checktime;

    /**
     * 检查内容
     */
    private String checkcontext;

    /**
     * 检查结果分析
     */
    private String checkanalysis;

    /**
     * 检查结果
     */
    private String checkresult;

    /**
     * 检查收费情况
     */
    private Double checkcharge;

    private static final long serialVersionUID = 1L;

    public Integer getOutpatientmedicalrecordid() {
        return outpatientmedicalrecordid;
    }

    public void setOutpatientmedicalrecordid(Integer outpatientmedicalrecordid) {
        this.outpatientmedicalrecordid = outpatientmedicalrecordid;
    }

    public Integer getCheckdoctorname() {
        return checkdoctorname;
    }

    public void setCheckdoctorname(Integer checkdoctorname) {
        this.checkdoctorname = checkdoctorname;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getCheckcontext() {
        return checkcontext;
    }

    public void setCheckcontext(String checkcontext) {
        this.checkcontext = checkcontext;
    }

    public String getCheckanalysis() {
        return checkanalysis;
    }

    public void setCheckanalysis(String checkanalysis) {
        this.checkanalysis = checkanalysis;
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    public Double getCheckcharge() {
        return checkcharge;
    }

    public void setCheckcharge(Double checkcharge) {
        this.checkcharge = checkcharge;
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
        OutpatientCheck other = (OutpatientCheck) that;
        return (this.getOutpatientmedicalrecordid() == null ? other.getOutpatientmedicalrecordid() == null : this.getOutpatientmedicalrecordid().equals(other.getOutpatientmedicalrecordid()))
            && (this.getCheckdoctorname() == null ? other.getCheckdoctorname() == null : this.getCheckdoctorname().equals(other.getCheckdoctorname()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getCheckcontext() == null ? other.getCheckcontext() == null : this.getCheckcontext().equals(other.getCheckcontext()))
            && (this.getCheckanalysis() == null ? other.getCheckanalysis() == null : this.getCheckanalysis().equals(other.getCheckanalysis()))
            && (this.getCheckresult() == null ? other.getCheckresult() == null : this.getCheckresult().equals(other.getCheckresult()))
            && (this.getCheckcharge() == null ? other.getCheckcharge() == null : this.getCheckcharge().equals(other.getCheckcharge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOutpatientmedicalrecordid() == null) ? 0 : getOutpatientmedicalrecordid().hashCode());
        result = prime * result + ((getCheckdoctorname() == null) ? 0 : getCheckdoctorname().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getCheckcontext() == null) ? 0 : getCheckcontext().hashCode());
        result = prime * result + ((getCheckanalysis() == null) ? 0 : getCheckanalysis().hashCode());
        result = prime * result + ((getCheckresult() == null) ? 0 : getCheckresult().hashCode());
        result = prime * result + ((getCheckcharge() == null) ? 0 : getCheckcharge().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", outpatientmedicalrecordid=").append(outpatientmedicalrecordid);
        sb.append(", checkdoctorname=").append(checkdoctorname);
        sb.append(", checktime=").append(checktime);
        sb.append(", checkcontext=").append(checkcontext);
        sb.append(", checkanalysis=").append(checkanalysis);
        sb.append(", checkresult=").append(checkresult);
        sb.append(", checkcharge=").append(checkcharge);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}