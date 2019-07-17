package com.web.entity;

import java.io.Serializable;

/**
 * processingscheme
 * @author 
 */
public class Processingscheme implements Serializable {
    /**
     * 处理方案号
     */
    private Integer processingschemeno;

    /**
     * 医师id
     */
    private Integer physicianid;

    /**
     * 开出时间
     */
    private String begintime;

    /**
     * 处理方案内容
     */
    private String processingschemecontext;

    private static final long serialVersionUID = 1L;

    public Integer getProcessingschemeno() {
        return processingschemeno;
    }

    public void setProcessingschemeno(Integer processingschemeno) {
        this.processingschemeno = processingschemeno;
    }

    public Integer getPhysicianid() {
        return physicianid;
    }

    public void setPhysicianid(Integer physicianid) {
        this.physicianid = physicianid;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getProcessingschemecontext() {
        return processingschemecontext;
    }

    public void setProcessingschemecontext(String processingschemecontext) {
        this.processingschemecontext = processingschemecontext;
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
        Processingscheme other = (Processingscheme) that;
        return (this.getProcessingschemeno() == null ? other.getProcessingschemeno() == null : this.getProcessingschemeno().equals(other.getProcessingschemeno()))
            && (this.getPhysicianid() == null ? other.getPhysicianid() == null : this.getPhysicianid().equals(other.getPhysicianid()))
            && (this.getBegintime() == null ? other.getBegintime() == null : this.getBegintime().equals(other.getBegintime()))
            && (this.getProcessingschemecontext() == null ? other.getProcessingschemecontext() == null : this.getProcessingschemecontext().equals(other.getProcessingschemecontext()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProcessingschemeno() == null) ? 0 : getProcessingschemeno().hashCode());
        result = prime * result + ((getPhysicianid() == null) ? 0 : getPhysicianid().hashCode());
        result = prime * result + ((getBegintime() == null) ? 0 : getBegintime().hashCode());
        result = prime * result + ((getProcessingschemecontext() == null) ? 0 : getProcessingschemecontext().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processingschemeno=").append(processingschemeno);
        sb.append(", physicianid=").append(physicianid);
        sb.append(", begintime=").append(begintime);
        sb.append(", processingschemecontext=").append(processingschemecontext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}