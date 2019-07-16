package com.njxzc.web.entity;

import java.io.Serializable;

/**
 * bed
 * @author 
 */
public class Bed implements Serializable {
    /**
     * 床号
     */
    private Integer bednumber;

    /**
     * 住院号
     */
    private Integer admissionnumber;

    /**
     * 主管医师
     */
    private Integer competentphysician;

    /**
     * 值班员ID
     */
    private Integer watchkeeperid;

    /**
     * 治疗结果
     */
    private String therapeuticoutcome;

    private Integer diseasearea;

    private Integer bedemptyornot;

    private Integer bedrent;

    private static final long serialVersionUID = 1L;

    public Integer getBednumber() {
        return bednumber;
    }

    public void setBednumber(Integer bednumber) {
        this.bednumber = bednumber;
    }

    public Integer getAdmissionnumber() {
        return admissionnumber;
    }

    public void setAdmissionnumber(Integer admissionnumber) {
        this.admissionnumber = admissionnumber;
    }

    public Integer getCompetentphysician() {
        return competentphysician;
    }

    public void setCompetentphysician(Integer competentphysician) {
        this.competentphysician = competentphysician;
    }

    public Integer getWatchkeeperid() {
        return watchkeeperid;
    }

    public void setWatchkeeperid(Integer watchkeeperid) {
        this.watchkeeperid = watchkeeperid;
    }

    public String getTherapeuticoutcome() {
        return therapeuticoutcome;
    }

    public void setTherapeuticoutcome(String therapeuticoutcome) {
        this.therapeuticoutcome = therapeuticoutcome;
    }

    public Integer getDiseasearea() {
        return diseasearea;
    }

    public void setDiseasearea(Integer diseasearea) {
        this.diseasearea = diseasearea;
    }

    public Integer getBedemptyornot() {
        return bedemptyornot;
    }

    public void setBedemptyornot(Integer bedemptyornot) {
        this.bedemptyornot = bedemptyornot;
    }

    public Integer getBedrent() {
        return bedrent;
    }

    public void setBedrent(Integer bedrent) {
        this.bedrent = bedrent;
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
        Bed other = (Bed) that;
        return (this.getBednumber() == null ? other.getBednumber() == null : this.getBednumber().equals(other.getBednumber()))
            && (this.getAdmissionnumber() == null ? other.getAdmissionnumber() == null : this.getAdmissionnumber().equals(other.getAdmissionnumber()))
            && (this.getCompetentphysician() == null ? other.getCompetentphysician() == null : this.getCompetentphysician().equals(other.getCompetentphysician()))
            && (this.getWatchkeeperid() == null ? other.getWatchkeeperid() == null : this.getWatchkeeperid().equals(other.getWatchkeeperid()))
            && (this.getTherapeuticoutcome() == null ? other.getTherapeuticoutcome() == null : this.getTherapeuticoutcome().equals(other.getTherapeuticoutcome()))
            && (this.getDiseasearea() == null ? other.getDiseasearea() == null : this.getDiseasearea().equals(other.getDiseasearea()))
            && (this.getBedemptyornot() == null ? other.getBedemptyornot() == null : this.getBedemptyornot().equals(other.getBedemptyornot()))
            && (this.getBedrent() == null ? other.getBedrent() == null : this.getBedrent().equals(other.getBedrent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBednumber() == null) ? 0 : getBednumber().hashCode());
        result = prime * result + ((getAdmissionnumber() == null) ? 0 : getAdmissionnumber().hashCode());
        result = prime * result + ((getCompetentphysician() == null) ? 0 : getCompetentphysician().hashCode());
        result = prime * result + ((getWatchkeeperid() == null) ? 0 : getWatchkeeperid().hashCode());
        result = prime * result + ((getTherapeuticoutcome() == null) ? 0 : getTherapeuticoutcome().hashCode());
        result = prime * result + ((getDiseasearea() == null) ? 0 : getDiseasearea().hashCode());
        result = prime * result + ((getBedemptyornot() == null) ? 0 : getBedemptyornot().hashCode());
        result = prime * result + ((getBedrent() == null) ? 0 : getBedrent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bednumber=").append(bednumber);
        sb.append(", admissionnumber=").append(admissionnumber);
        sb.append(", competentphysician=").append(competentphysician);
        sb.append(", watchkeeperid=").append(watchkeeperid);
        sb.append(", therapeuticoutcome=").append(therapeuticoutcome);
        sb.append(", diseasearea=").append(diseasearea);
        sb.append(", bedemptyornot=").append(bedemptyornot);
        sb.append(", bedrent=").append(bedrent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}