package com.web.entity;

import java.io.Serializable;

/**
 * department
 * 
 * @author
 */
public class Department implements Serializable {
	/**
	 * 科室编号
	 */
	private Integer departmentid;

	/**
	 * 科室名称
	 */
	private String departmentname;

	/**
	 * 科室地址
	 */
	private String departmentaddress;

	/**
	 * 科室电话
	 */
	private String departmenttelephone;

	/**
	 * 用户ID
	 */
	private Integer userid;

	/**
	 * 删除
	 */
	private String isdelete;

	private static final long serialVersionUID = 1L;
 
	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentaddress() {
		return departmentaddress;
	}

	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}

	public String getDepartmenttelephone() {
		return departmenttelephone;
	}

	public void setDepartmenttelephone(String departmenttelephone) {
		this.departmenttelephone = departmenttelephone;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
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
		Department other = (Department) that;
		return (this.getDepartmentid() == null ? other.getDepartmentid() == null
				: this.getDepartmentid().equals(other.getDepartmentid()))
				&& (this.getDepartmentname() == null ? other.getDepartmentname() == null
						: this.getDepartmentname().equals(other.getDepartmentname()))
				&& (this.getDepartmentaddress() == null ? other.getDepartmentaddress() == null
						: this.getDepartmentaddress().equals(other.getDepartmentaddress()))
				&& (this.getDepartmenttelephone() == null ? other.getDepartmenttelephone() == null
						: this.getDepartmenttelephone().equals(other.getDepartmenttelephone()))
				&& (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
				&& (this.getIsdelete() == null ? other.getIsdelete() == null
						: this.getIsdelete().equals(other.getIsdelete()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
		result = prime * result + ((getDepartmentname() == null) ? 0 : getDepartmentname().hashCode());
		result = prime * result + ((getDepartmentaddress() == null) ? 0 : getDepartmentaddress().hashCode());
		result = prime * result + ((getDepartmenttelephone() == null) ? 0 : getDepartmenttelephone().hashCode());
		result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
		result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", departmentid=").append(departmentid);
		sb.append(", departmentname=").append(departmentname);
		sb.append(", departmentaddress=").append(departmentaddress);
		sb.append(", departmenttelephone=").append(departmenttelephone);
		sb.append(", userid=").append(userid);
		sb.append(", isdelete=").append(isdelete);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}