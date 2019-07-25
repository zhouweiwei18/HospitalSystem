package com.web.entity;

import java.io.Serializable;

/**
 * position
 * @author 
 */
public class Position implements Serializable {
    /**
     * 岗位编号
     */
    private Integer postnumber;

    /**
     * 岗位名称
     */
    private String postname;

    /**
     * 科室编号
     */
    private Integer departmentid;

    /**
     * 岗位工资
     */
    private Integer postsalary;
    
    private Department department;// 多对一

    private static final long serialVersionUID = 1L;
     
    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getPostnumber() {
        return postnumber;
    }

    public void setPostnumber(Integer postnumber) {
        this.postnumber = postnumber;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getPostsalary() {
        return postsalary;
    }

    public void setPostsalary(Integer postsalary) {
        this.postsalary = postsalary;
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
        Position other = (Position) that;
        return (this.getPostnumber() == null ? other.getPostnumber() == null : this.getPostnumber().equals(other.getPostnumber()))
            && (this.getPostname() == null ? other.getPostname() == null : this.getPostname().equals(other.getPostname()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getPostsalary() == null ? other.getPostsalary() == null : this.getPostsalary().equals(other.getPostsalary()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostnumber() == null) ? 0 : getPostnumber().hashCode());
        result = prime * result + ((getPostname() == null) ? 0 : getPostname().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getPostsalary() == null) ? 0 : getPostsalary().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postnumber=").append(postnumber);
        sb.append(", postname=").append(postname);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", postsalary=").append(postsalary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}