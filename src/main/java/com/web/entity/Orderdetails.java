package com.web.entity;

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
    private Integer drugsid;

    /**
     * 规格
     */
    private String specifications;

    private Integer drugamount;

    private Double drugprice;

    /**
     * 此类药品的准批号
     */
    private String batchnumber;

    private Integer isdelete;
    
    private Drugs drugs;

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

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Integer getDrugamount() {
		return drugamount;
	}

	public void setDrugamount(Integer drugamount) {
		this.drugamount = drugamount;
	}

	public Double getDrugprice() {
		return drugprice;
	}

	public void setDrugprice(Double drugprice) {
		this.drugprice = drugprice;
	}

	public Drugs getDrugs() {
		return drugs;
	}

	public void setDrugs(Drugs drugs) {
		this.drugs = drugs;
	}

	public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber;
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
        Orderdetails other = (Orderdetails) that;
        return (this.getOrderdetailsid() == null ? other.getOrderdetailsid() == null : this.getOrderdetailsid().equals(other.getOrderdetailsid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()))
            && (this.getSpecifications() == null ? other.getSpecifications() == null : this.getSpecifications().equals(other.getSpecifications()))
            && (this.getDrugamount() == null ? other.getDrugamount() == null : this.getDrugamount().equals(other.getDrugamount()))
            && (this.getDrugprice() == null ? other.getDrugprice() == null : this.getDrugprice().equals(other.getDrugprice()))
            && (this.getBatchnumber() == null ? other.getBatchnumber() == null : this.getBatchnumber().equals(other.getBatchnumber()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderdetailsid() == null) ? 0 : getOrderdetailsid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        result = prime * result + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        result = prime * result + ((getDrugamount() == null) ? 0 : getDrugamount().hashCode());
        result = prime * result + ((getDrugprice() == null) ? 0 : getDrugprice().hashCode());
        result = prime * result + ((getBatchnumber() == null) ? 0 : getBatchnumber().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
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
        sb.append(", drugsid=").append(drugsid);
        sb.append(", specifications=").append(specifications);
        sb.append(", drugamount=").append(drugamount);
        sb.append(", drugprice=").append(drugprice);
        sb.append(", batchnumber=").append(batchnumber);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}