package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * checkproject
 * @author 
 */
public class Checkproject implements Serializable {
    /**
     * 检查序号
     */
    private Integer checknumber;

    /**
     * 检查日期安排
     */
    private String checkdate;

    /**
     * 检察负责人员
     */
    private String checkperson;

    /**
     * 住院号
     */
    private Integer hospitalizationnumber;

    /**
     * 检查内容
     */
    private String checkcontent;

    /**
     * 检查结果
     */
    private String checkresult;

    private static final long serialVersionUID = 1L;

    public Integer getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(Integer checknumber) {
        this.checknumber = checknumber;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson;
    }

    public Integer getHospitalizationnumber() {
        return hospitalizationnumber;
    }

    public void setHospitalizationnumber(Integer hospitalizationnumber) {
        this.hospitalizationnumber = hospitalizationnumber;
    }

    public String getCheckcontent() {
        return checkcontent;
    }

    public void setCheckcontent(String checkcontent) {
        this.checkcontent = checkcontent;
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
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
        Checkproject other = (Checkproject) that;
        return (this.getChecknumber() == null ? other.getChecknumber() == null : this.getChecknumber().equals(other.getChecknumber()))
            && (this.getCheckdate() == null ? other.getCheckdate() == null : this.getCheckdate().equals(other.getCheckdate()))
            && (this.getCheckperson() == null ? other.getCheckperson() == null : this.getCheckperson().equals(other.getCheckperson()))
            && (this.getHospitalizationnumber() == null ? other.getHospitalizationnumber() == null : this.getHospitalizationnumber().equals(other.getHospitalizationnumber()))
            && (this.getCheckcontent() == null ? other.getCheckcontent() == null : this.getCheckcontent().equals(other.getCheckcontent()))
            && (this.getCheckresult() == null ? other.getCheckresult() == null : this.getCheckresult().equals(other.getCheckresult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChecknumber() == null) ? 0 : getChecknumber().hashCode());
        result = prime * result + ((getCheckdate() == null) ? 0 : getCheckdate().hashCode());
        result = prime * result + ((getCheckperson() == null) ? 0 : getCheckperson().hashCode());
        result = prime * result + ((getHospitalizationnumber() == null) ? 0 : getHospitalizationnumber().hashCode());
        result = prime * result + ((getCheckcontent() == null) ? 0 : getCheckcontent().hashCode());
        result = prime * result + ((getCheckresult() == null) ? 0 : getCheckresult().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checknumber=").append(checknumber);
        sb.append(", checkdate=").append(checkdate);
        sb.append(", checkperson=").append(checkperson);
        sb.append(", hospitalizationnumber=").append(hospitalizationnumber);
        sb.append(", checkcontent=").append(checkcontent);
        sb.append(", checkresult=").append(checkresult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}