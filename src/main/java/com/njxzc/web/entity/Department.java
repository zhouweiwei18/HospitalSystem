package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * department
 * @author 
 */
public class Department implements Serializable {
    /**
     * 科室编号
     */
    private Integer departmentId;

    /**
     * 科室名称
     */
    private String departmentName;

    /**
     * 科室地址
     */
    private String departmentAddress;

    /**
     * 科室电话
     */
    private String departmentTelephone;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 删除
     */
    private String delete;

    private static final long serialVersionUID = 1L;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentTelephone() {
        return departmentTelephone;
    }

    public void setDepartmentTelephone(String departmentTelephone) {
        this.departmentTelephone = departmentTelephone;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
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
        Department other = (Department) that;
        return (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()))
            && (this.getDepartmentAddress() == null ? other.getDepartmentAddress() == null : this.getDepartmentAddress().equals(other.getDepartmentAddress()))
            && (this.getDepartmentTelephone() == null ? other.getDepartmentTelephone() == null : this.getDepartmentTelephone().equals(other.getDepartmentTelephone()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getDelete() == null ? other.getDelete() == null : this.getDelete().equals(other.getDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        result = prime * result + ((getDepartmentAddress() == null) ? 0 : getDepartmentAddress().hashCode());
        result = prime * result + ((getDepartmentTelephone() == null) ? 0 : getDepartmentTelephone().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departmentId=").append(departmentId);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", departmentAddress=").append(departmentAddress);
        sb.append(", departmentTelephone=").append(departmentTelephone);
        sb.append(", userid=").append(userid);
        sb.append(", delete=").append(delete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}