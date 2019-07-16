package com.njxzc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * outpatientprescription
 * @author 
 */
public class Outpatientprescription implements Serializable {
    /**
     * 处方号
     */
    private Integer prescriptionnumber;

    /**
     * 主治医师姓名
     */
    private Integer adoctorname;

    /**
     * 病历id
     */
    private Integer medicalrecordid;

    /**
     * 处方内容
     */
    private String precontent;

    /**
     * 开出病历时间
     */
    private Date opentime;

    private static final long serialVersionUID = 1L;

    public Integer getPrescriptionnumber() {
        return prescriptionnumber;
    }

    public void setPrescriptionnumber(Integer prescriptionnumber) {
        this.prescriptionnumber = prescriptionnumber;
    }

    public Integer getAdoctorname() {
        return adoctorname;
    }

    public void setAdoctorname(Integer adoctorname) {
        this.adoctorname = adoctorname;
    }

    public Integer getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(Integer medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }

    public String getPrecontent() {
        return precontent;
    }

    public void setPrecontent(String precontent) {
        this.precontent = precontent;
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
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
        Outpatientprescription other = (Outpatientprescription) that;
        return (this.getPrescriptionnumber() == null ? other.getPrescriptionnumber() == null : this.getPrescriptionnumber().equals(other.getPrescriptionnumber()))
            && (this.getAdoctorname() == null ? other.getAdoctorname() == null : this.getAdoctorname().equals(other.getAdoctorname()))
            && (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getPrecontent() == null ? other.getPrecontent() == null : this.getPrecontent().equals(other.getPrecontent()))
            && (this.getOpentime() == null ? other.getOpentime() == null : this.getOpentime().equals(other.getOpentime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescriptionnumber() == null) ? 0 : getPrescriptionnumber().hashCode());
        result = prime * result + ((getAdoctorname() == null) ? 0 : getAdoctorname().hashCode());
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        result = prime * result + ((getPrecontent() == null) ? 0 : getPrecontent().hashCode());
        result = prime * result + ((getOpentime() == null) ? 0 : getOpentime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescriptionnumber=").append(prescriptionnumber);
        sb.append(", adoctorname=").append(adoctorname);
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", precontent=").append(precontent);
        sb.append(", opentime=").append(opentime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}