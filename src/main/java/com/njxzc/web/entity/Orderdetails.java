package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * orderdetails
 * @author 
 */
public class Orderdetails implements Serializable {
    /**
     * 订单细则id
     */
    private Integer orderdetailsid;

    /**
     * 订单号
     */
    private Integer orderid;

    /**
     * 药品编号
     */
    private Integer drugnumber;

    /**
     * 规格
     */
    private String specifications;

    /**
     * 此类药品的准批号
     */
    private String batchnumber;

    private static final long serialVersionUID = 1L;

    public Integer getOrderdetailsid() {
        return orderdetailsid;
    }

    public void setOrderdetailsid(Integer orderdetailsid) {
        this.orderdetailsid = orderdetailsid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getDrugnumber() {
        return drugnumber;
    }

    public void setDrugnumber(Integer drugnumber) {
        this.drugnumber = drugnumber;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber;
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
        Orderdetails other = (Orderdetails) that;
        return (this.getOrderdetailsid() == null ? other.getOrderdetailsid() == null : this.getOrderdetailsid().equals(other.getOrderdetailsid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getDrugnumber() == null ? other.getDrugnumber() == null : this.getDrugnumber().equals(other.getDrugnumber()))
            && (this.getSpecifications() == null ? other.getSpecifications() == null : this.getSpecifications().equals(other.getSpecifications()))
            && (this.getBatchnumber() == null ? other.getBatchnumber() == null : this.getBatchnumber().equals(other.getBatchnumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderdetailsid() == null) ? 0 : getOrderdetailsid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getDrugnumber() == null) ? 0 : getDrugnumber().hashCode());
        result = prime * result + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        result = prime * result + ((getBatchnumber() == null) ? 0 : getBatchnumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderdetailsid=").append(orderdetailsid);
        sb.append(", orderid=").append(orderid);
        sb.append(", drugnumber=").append(drugnumber);
        sb.append(", specifications=").append(specifications);
        sb.append(", batchnumber=").append(batchnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}