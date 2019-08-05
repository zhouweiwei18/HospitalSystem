package com.web.entity;

import java.io.Serializable;

/**
 * prescription
 * @author 
 */
public class Prescription implements Serializable {
    /**
     * 处方号
     */
    private Integer prescriptionnumber;

    private Integer drugsid;

    private Integer drugno;

    /**
     * 所属医嘱号
     */
    private Integer doctoradviceid;

    private Integer isdelete;

    
    private Patient patient;
    private Drugs drugs;
    private Doctoradvice doctoradvice;
    
    public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Drugs getDrugs() {
		return drugs;
	}

	public void setDrugs(Drugs drugs) {
		this.drugs = drugs;
	}

	public Doctoradvice getDoctoradvice() {
		return doctoradvice;
	}

	public void setDoctoradvice(Doctoradvice doctoradvice) {
		this.doctoradvice = doctoradvice;
	}

	private static final long serialVersionUID = 1L;

    public Integer getPrescriptionnumber() {
        return prescriptionnumber;
    }

    public void setPrescriptionnumber(Integer prescriptionnumber) {
        this.prescriptionnumber = prescriptionnumber;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public Integer getDrugno() {
        return drugno;
    }

    public void setDrugno(Integer drugno) {
        this.drugno = drugno;
    }

    public Integer getDoctoradviceid() {
        return doctoradviceid;
    }

    public void setDoctoradviceid(Integer doctoradviceid) {
        this.doctoradviceid = doctoradviceid;
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
        Prescription other = (Prescription) that;
        return (this.getPrescriptionnumber() == null ? other.getPrescriptionnumber() == null : this.getPrescriptionnumber().equals(other.getPrescriptionnumber()))
            && (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()))
            && (this.getDrugno() == null ? other.getDrugno() == null : this.getDrugno().equals(other.getDrugno()))
            && (this.getDoctoradviceid() == null ? other.getDoctoradviceid() == null : this.getDoctoradviceid().equals(other.getDoctoradviceid()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescriptionnumber() == null) ? 0 : getPrescriptionnumber().hashCode());
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        result = prime * result + ((getDrugno() == null) ? 0 : getDrugno().hashCode());
        result = prime * result + ((getDoctoradviceid() == null) ? 0 : getDoctoradviceid().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescriptionnumber=").append(prescriptionnumber);
        sb.append(", drugsid=").append(drugsid);
        sb.append(", drugno=").append(drugno);
        sb.append(", doctoradviceid=").append(doctoradviceid);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}