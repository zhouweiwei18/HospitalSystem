package com.web.entity;

import java.io.Serializable;

/**
 * drugstorage
 * @author 
 */
public class Drugstorage implements Serializable {
    /**
     * 药库
     */
    private Integer drugstorageid;

    /**
     * 类别
     */
    private String category;

    /**
     * 负责人id
     */
    private Integer inchargeperson;

    /**
     * 面积
     */
    private Double area;

    private Integer isdelete;
    
    private User user;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private static final long serialVersionUID = 1L;

    public Integer getDrugstorageid() {
        return drugstorageid;
    }

    public void setDrugstorageid(Integer drugstorageid) {
        this.drugstorageid = drugstorageid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getInchargeperson() {
        return inchargeperson;
    }

    public void setInchargeperson(Integer inchargeperson) {
        this.inchargeperson = inchargeperson;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
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
        Drugstorage other = (Drugstorage) that;
        return (this.getDrugstorageid() == null ? other.getDrugstorageid() == null : this.getDrugstorageid().equals(other.getDrugstorageid()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getInchargeperson() == null ? other.getInchargeperson() == null : this.getInchargeperson().equals(other.getInchargeperson()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrugstorageid() == null) ? 0 : getDrugstorageid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getInchargeperson() == null) ? 0 : getInchargeperson().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugstorageid=").append(drugstorageid);
        sb.append(", category=").append(category);
        sb.append(", inchargeperson=").append(inchargeperson);
        sb.append(", area=").append(area);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}