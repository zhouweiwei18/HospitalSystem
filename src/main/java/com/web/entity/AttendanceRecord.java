package com.web.entity;

import java.io.Serializable;

/**
 * attendance_record
 * @author 
 */
public class AttendanceRecord implements Serializable {
    /**
     * 考勤记录编号
     */
    private Integer attdid;

    /**
     * 人员姓名
     */
    private String workername;

    /**
     * 上班情况
     */
    private String workingconditions;

    /**
     * 下班情况
     */
    private String closingconditionns;

    /**
     * 是否删除：1已删除 ；0未删除
     */
    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getAttdid() {
        return attdid;
    }

    public void setAttdid(Integer attdid) {
        this.attdid = attdid;
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername;
    }

    public String getWorkingconditions() {
        return workingconditions;
    }

    public void setWorkingconditions(String workingconditions) {
        this.workingconditions = workingconditions;
    }

    public String getClosingconditionns() {
        return closingconditionns;
    }

    public void setClosingconditionns(String closingconditionns) {
        this.closingconditionns = closingconditionns;
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
        AttendanceRecord other = (AttendanceRecord) that;
        return (this.getAttdid() == null ? other.getAttdid() == null : this.getAttdid().equals(other.getAttdid()))
            && (this.getWorkername() == null ? other.getWorkername() == null : this.getWorkername().equals(other.getWorkername()))
            && (this.getWorkingconditions() == null ? other.getWorkingconditions() == null : this.getWorkingconditions().equals(other.getWorkingconditions()))
            && (this.getClosingconditionns() == null ? other.getClosingconditionns() == null : this.getClosingconditionns().equals(other.getClosingconditionns()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttdid() == null) ? 0 : getAttdid().hashCode());
        result = prime * result + ((getWorkername() == null) ? 0 : getWorkername().hashCode());
        result = prime * result + ((getWorkingconditions() == null) ? 0 : getWorkingconditions().hashCode());
        result = prime * result + ((getClosingconditionns() == null) ? 0 : getClosingconditionns().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attdid=").append(attdid);
        sb.append(", workername=").append(workername);
        sb.append(", workingconditions=").append(workingconditions);
        sb.append(", closingconditionns=").append(closingconditionns);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}