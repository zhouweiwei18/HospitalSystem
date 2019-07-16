package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * drugstorage
 * @author 
 */
public class Drugstorage implements Serializable {
    /**
     * 药库
     */
    private Integer dsid;

    private Integer ykfzid;

    /**
     * 负责人id
     */
    private String picid;

    private Double area;

    private static final long serialVersionUID = 1L;

    public Integer getDsid() {
        return dsid;
    }

    public void setDsid(Integer dsid) {
        this.dsid = dsid;
    }

    public Integer getYkfzid() {
        return ykfzid;
    }

    public void setYkfzid(Integer ykfzid) {
        this.ykfzid = ykfzid;
    }

    public String getPicid() {
        return picid;
    }

    public void setPicid(String picid) {
        this.picid = picid;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
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
        return (this.getDsid() == null ? other.getDsid() == null : this.getDsid().equals(other.getDsid()))
            && (this.getYkfzid() == null ? other.getYkfzid() == null : this.getYkfzid().equals(other.getYkfzid()))
            && (this.getPicid() == null ? other.getPicid() == null : this.getPicid().equals(other.getPicid()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDsid() == null) ? 0 : getDsid().hashCode());
        result = prime * result + ((getYkfzid() == null) ? 0 : getYkfzid().hashCode());
        result = prime * result + ((getPicid() == null) ? 0 : getPicid().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dsid=").append(dsid);
        sb.append(", ykfzid=").append(ykfzid);
        sb.append(", picid=").append(picid);
        sb.append(", area=").append(area);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}