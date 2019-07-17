package com.web.entity;

import java.io.Serializable;

/**
 * operationRoom
 * @author 
 */
public class Operationroom implements Serializable {
    private Integer operationroomid;

    private String address;

    private Integer inchargeperson;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getOperationroomid() {
        return operationroomid;
    }

    public void setOperationroomid(Integer operationroomid) {
        this.operationroomid = operationroomid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getInchargeperson() {
        return inchargeperson;
    }

    public void setInchargeperson(Integer inchargeperson) {
        this.inchargeperson = inchargeperson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Operationroom other = (Operationroom) that;
        return (this.getOperationroomid() == null ? other.getOperationroomid() == null : this.getOperationroomid().equals(other.getOperationroomid()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getInchargeperson() == null ? other.getInchargeperson() == null : this.getInchargeperson().equals(other.getInchargeperson()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationroomid() == null) ? 0 : getOperationroomid().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getInchargeperson() == null) ? 0 : getInchargeperson().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationroomid=").append(operationroomid);
        sb.append(", address=").append(address);
        sb.append(", inchargeperson=").append(inchargeperson);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}