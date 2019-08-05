package com.web.entity;

import java.io.Serializable;

/**
 * hospitalizationPrescription
 * @author 
 */
public class Hospitalizationprescription implements Serializable {
    /**
     * 处方号
     */
    private Integer prescriptionno;

    /**
     * 医嘱序号
     */
    private Integer residentadviceid;

    /**
     * 处方内容
     */
    private Integer drugsid;

    /**
     * 住院医师
     */
    private Integer drugno;

    private Integer isdelete;
    
    private Patient patient;
    
    private Drugs drugs;
    
    private Hospitalizationadvice hospitalizationadvice;
    
    private Inpatient inpatient;
    
    public Hospitalizationadvice getHospitalizationadvice() {
		return hospitalizationadvice;
	}

	public void setHospitalizationadvice(Hospitalizationadvice hospitalizationadvice) {
		this.hospitalizationadvice = hospitalizationadvice;
	}

	public Inpatient getInpatient() {
		return inpatient;
	}

	public void setInpatient(Inpatient inpatient) {
		this.inpatient = inpatient;
	}
    
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

    private static final long serialVersionUID = 1L;

    public Integer getPrescriptionno() {
        return prescriptionno;
    }

    public void setPrescriptionno(Integer prescriptionno) {
        this.prescriptionno = prescriptionno;
    }

    public Integer getResidentadviceid() {
        return residentadviceid;
    }

    public void setResidentadviceid(Integer residentadviceid) {
        this.residentadviceid = residentadviceid;
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
        Hospitalizationprescription other = (Hospitalizationprescription) that;
        return (this.getPrescriptionno() == null ? other.getPrescriptionno() == null : this.getPrescriptionno().equals(other.getPrescriptionno()))
            && (this.getResidentadviceid() == null ? other.getResidentadviceid() == null : this.getResidentadviceid().equals(other.getResidentadviceid()))
            && (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()))
            && (this.getDrugno() == null ? other.getDrugno() == null : this.getDrugno().equals(other.getDrugno()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescriptionno() == null) ? 0 : getPrescriptionno().hashCode());
        result = prime * result + ((getResidentadviceid() == null) ? 0 : getResidentadviceid().hashCode());
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        result = prime * result + ((getDrugno() == null) ? 0 : getDrugno().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescriptionno=").append(prescriptionno);
        sb.append(", residentadviceid=").append(residentadviceid);
        sb.append(", drugsid=").append(drugsid);
        sb.append(", drugno=").append(drugno);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}