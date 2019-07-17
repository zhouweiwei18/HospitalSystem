package com.web.entity;

import java.io.Serializable;

/**
 * check
 * @author 
 */
public class Check implements Serializable {
    /**
     * 检查序号
     */
    private Integer checkid;

    /**
     * 检查医师
     */
    private Integer checkdoctor;

    private String checktime;

    /**
     * 检查项目id
     */
    private Integer checkprojectno;

    private String checkresult;

    private Integer doctoradviceid;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getCheckid() {
        return checkid;
    }

    public void setCheckid(Integer checkid) {
        this.checkid = checkid;
    }

    public Integer getCheckdoctor() {
        return checkdoctor;
    }

    public void setCheckdoctor(Integer checkdoctor) {
        this.checkdoctor = checkdoctor;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public Integer getCheckprojectno() {
        return checkprojectno;
    }

    public void setCheckprojectno(Integer checkprojectno) {
        this.checkprojectno = checkprojectno;
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    public Integer getDoctoradviceid() {
        return doctoradviceid;
    }

    public void setDoctoradviceid(Integer doctoradviceid) {
        this.doctoradviceid = doctoradviceid;
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
        Check other = (Check) that;
        return (this.getCheckid() == null ? other.getCheckid() == null : this.getCheckid().equals(other.getCheckid()))
            && (this.getCheckdoctor() == null ? other.getCheckdoctor() == null : this.getCheckdoctor().equals(other.getCheckdoctor()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getCheckprojectno() == null ? other.getCheckprojectno() == null : this.getCheckprojectno().equals(other.getCheckprojectno()))
            && (this.getCheckresult() == null ? other.getCheckresult() == null : this.getCheckresult().equals(other.getCheckresult()))
            && (this.getDoctoradviceid() == null ? other.getDoctoradviceid() == null : this.getDoctoradviceid().equals(other.getDoctoradviceid()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckid() == null) ? 0 : getCheckid().hashCode());
        result = prime * result + ((getCheckdoctor() == null) ? 0 : getCheckdoctor().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getCheckprojectno() == null) ? 0 : getCheckprojectno().hashCode());
        result = prime * result + ((getCheckresult() == null) ? 0 : getCheckresult().hashCode());
        result = prime * result + ((getDoctoradviceid() == null) ? 0 : getDoctoradviceid().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkid=").append(checkid);
        sb.append(", checkdoctor=").append(checkdoctor);
        sb.append(", checktime=").append(checktime);
        sb.append(", checkprojectno=").append(checkprojectno);
        sb.append(", checkresult=").append(checkresult);
        sb.append(", doctoradviceid=").append(doctoradviceid);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}