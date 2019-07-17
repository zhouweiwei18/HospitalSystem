package com.web.entity;

import java.io.Serializable;

/**
 * positionmenu
 * @author 
 */
public class Positionmenu implements Serializable {
    private Integer postid;

    private Integer menuid;

    /**
     * 岗位编号
     */
    private Integer postnumber;

    private static final long serialVersionUID = 1L;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getPostnumber() {
        return postnumber;
    }

    public void setPostnumber(Integer postnumber) {
        this.postnumber = postnumber;
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
        Positionmenu other = (Positionmenu) that;
        return (this.getPostid() == null ? other.getPostid() == null : this.getPostid().equals(other.getPostid()))
            && (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()))
            && (this.getPostnumber() == null ? other.getPostnumber() == null : this.getPostnumber().equals(other.getPostnumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostid() == null) ? 0 : getPostid().hashCode());
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        result = prime * result + ((getPostnumber() == null) ? 0 : getPostnumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postid=").append(postid);
        sb.append(", menuid=").append(menuid);
        sb.append(", postnumber=").append(postnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}