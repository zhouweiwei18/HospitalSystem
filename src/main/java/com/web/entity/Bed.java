package com.web.entity;

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
     * 病区id
     */
    private Integer icuid;

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

    private Integer bedemptyornot;

    private Integer bedrent;

    private Integer isdelete;
    
    private User user;
    
    private Icu icu;
    
    public Icu getIcu() {
		return icu;
	}

	public void setIcu(Icu icu) {
		this.icu = icu;
	}
  
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    private static final long serialVersionUID = 1L;

    public Integer getBednumber() {
        return bednumber;
    }

    public void setBednumber(Integer bednumber) {
        this.bednumber = bednumber;
    }

    public Integer getIcuid() {
        return icuid;
    }

    public void setIcuid(Integer icuid) {
        this.icuid = icuid;
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
        Bed other = (Bed) that;
        return (this.getBednumber() == null ? other.getBednumber() == null : this.getBednumber().equals(other.getBednumber()))
            && (this.getIcuid() == null ? other.getIcuid() == null : this.getIcuid().equals(other.getIcuid()))
            && (this.getCompetentphysician() == null ? other.getCompetentphysician() == null : this.getCompetentphysician().equals(other.getCompetentphysician()))
            && (this.getWatchkeeperid() == null ? other.getWatchkeeperid() == null : this.getWatchkeeperid().equals(other.getWatchkeeperid()))
            && (this.getTherapeuticoutcome() == null ? other.getTherapeuticoutcome() == null : this.getTherapeuticoutcome().equals(other.getTherapeuticoutcome()))
            && (this.getBedemptyornot() == null ? other.getBedemptyornot() == null : this.getBedemptyornot().equals(other.getBedemptyornot()))
            && (this.getBedrent() == null ? other.getBedrent() == null : this.getBedrent().equals(other.getBedrent()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBednumber() == null) ? 0 : getBednumber().hashCode());
        result = prime * result + ((getIcuid() == null) ? 0 : getIcuid().hashCode());
        result = prime * result + ((getCompetentphysician() == null) ? 0 : getCompetentphysician().hashCode());
        result = prime * result + ((getWatchkeeperid() == null) ? 0 : getWatchkeeperid().hashCode());
        result = prime * result + ((getTherapeuticoutcome() == null) ? 0 : getTherapeuticoutcome().hashCode());
        result = prime * result + ((getBedemptyornot() == null) ? 0 : getBedemptyornot().hashCode());
        result = prime * result + ((getBedrent() == null) ? 0 : getBedrent().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bednumber=").append(bednumber);
        sb.append(", icuid=").append(icuid);
        sb.append(", competentphysician=").append(competentphysician);
        sb.append(", watchkeeperid=").append(watchkeeperid);
        sb.append(", therapeuticoutcome=").append(therapeuticoutcome);
        sb.append(", bedemptyornot=").append(bedemptyornot);
        sb.append(", bedrent=").append(bedrent);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}