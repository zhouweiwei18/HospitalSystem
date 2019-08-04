package com.web.entity;

import java.io.Serializable;

/**
 * salary
 * 
 * @author
 */
public class Salary implements Serializable {
	private Integer salaryid;

	private Integer salary;

	private Integer uid;

	private Integer isdelete;

	private User user;

	private static final long serialVersionUID = 1L;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getSalaryid() {
		return salaryid;
	}

	public void setSalaryid(Integer salaryid) {
		this.salaryid = salaryid;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
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
		Salary other = (Salary) that;
		return (this.getSalaryid() == null ? other.getSalaryid() == null
				: this.getSalaryid().equals(other.getSalaryid()))
				&& (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
				&& (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
				&& (this.getIsdelete() == null ? other.getIsdelete() == null
						: this.getIsdelete().equals(other.getIsdelete()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSalaryid() == null) ? 0 : getSalaryid().hashCode());
		result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
		result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
		result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", salaryid=").append(salaryid);
		sb.append(", salary=").append(salary);
		sb.append(", uid=").append(uid);
		sb.append(", isdelete=").append(isdelete);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}