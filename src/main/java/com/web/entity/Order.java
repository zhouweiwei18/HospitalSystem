package com.web.entity;

import java.io.Serializable;

/**
 * order
 * @author 
 */
public class Order implements Serializable {
    /**
     * 订单号
     */
    private Integer orderid;

    /**
     * 供应商id
     */
    private Integer supplierid;

    /**
     * 订货项数
     */
    private Integer orderitems;

    /**
     * 订货日期
     */
    private String orderdate;

    /**
     * 交货日期
     */
    private String deliverydate;

    /**
     * 负责人
     */
    private Integer agent;

    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(Integer orderitems) {
        this.orderitems = orderitems;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Integer getAgent() {
        return agent;
    }

    public void setAgent(Integer agent) {
        this.agent = agent;
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
        Order other = (Order) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getSupplierid() == null ? other.getSupplierid() == null : this.getSupplierid().equals(other.getSupplierid()))
            && (this.getOrderitems() == null ? other.getOrderitems() == null : this.getOrderitems().equals(other.getOrderitems()))
            && (this.getOrderdate() == null ? other.getOrderdate() == null : this.getOrderdate().equals(other.getOrderdate()))
            && (this.getDeliverydate() == null ? other.getDeliverydate() == null : this.getDeliverydate().equals(other.getDeliverydate()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getSupplierid() == null) ? 0 : getSupplierid().hashCode());
        result = prime * result + ((getOrderitems() == null) ? 0 : getOrderitems().hashCode());
        result = prime * result + ((getOrderdate() == null) ? 0 : getOrderdate().hashCode());
        result = prime * result + ((getDeliverydate() == null) ? 0 : getDeliverydate().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", supplierid=").append(supplierid);
        sb.append(", orderitems=").append(orderitems);
        sb.append(", orderdate=").append(orderdate);
        sb.append(", deliverydate=").append(deliverydate);
        sb.append(", agent=").append(agent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}