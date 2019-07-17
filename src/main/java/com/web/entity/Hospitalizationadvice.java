package com.web.entity;

import java.io.Serializable;

/**
 * hospitalizationAdvice
 * @author 
 */
public class Hospitalizationadvice implements Serializable {
    /**
     * 住院医嘱id
     */
    private Integer hospitalizationadviceid;

    /**
     * 疾病名称
     */
    private String diseasename;

    /**
     * 住院时间
     */
    private String hospitalizationtime;

    private String advicecontent;

    private Integer doctorid;

    private Integer hospitalizationid;

    /**
     * 情况
     */
    private String situation;

    private String diachargetime;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalizationadviceid() {
        return hospitalizationadviceid;
    }

    public void setHospitalizationadviceid(Integer hospitalizationadviceid) {
        this.hospitalizationadviceid = hospitalizationadviceid;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public String getHospitalizationtime() {
        return hospitalizationtime;
    }

    public void setHospitalizationtime(String hospitalizationtime) {
        this.hospitalizationtime = hospitalizationtime;
    }

    public String getAdvicecontent() {
        return advicecontent;
    }

    public void setAdvicecontent(String advicecontent) {
        this.advicecontent = advicecontent;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Integer getHospitalizationid() {
        return hospitalizationid;
    }

    public void setHospitalizationid(Integer hospitalizationid) {
        this.hospitalizationid = hospitalizationid;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getDiachargetime() {
        return diachargetime;
    }

    public void setDiachargetime(String diachargetime) {
        this.diachargetime = diachargetime;
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
        Hospitalizationadvice other = (Hospitalizationadvice) that;
        return (this.getHospitalizationadviceid() == null ? other.getHospitalizationadviceid() == null : this.getHospitalizationadviceid().equals(other.getHospitalizationadviceid()))
            && (this.getDiseasename() == null ? other.getDiseasename() == null : this.getDiseasename().equals(other.getDiseasename()))
            && (this.getHospitalizationtime() == null ? other.getHospitalizationtime() == null : this.getHospitalizationtime().equals(other.getHospitalizationtime()))
            && (this.getAdvicecontent() == null ? other.getAdvicecontent() == null : this.getAdvicecontent().equals(other.getAdvicecontent()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getHospitalizationid() == null ? other.getHospitalizationid() == null : this.getHospitalizationid().equals(other.getHospitalizationid()))
            && (this.getSituation() == null ? other.getSituation() == null : this.getSituation().equals(other.getSituation()))
            && (this.getDiachargetime() == null ? other.getDiachargetime() == null : this.getDiachargetime().equals(other.getDiachargetime()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalizationadviceid() == null) ? 0 : getHospitalizationadviceid().hashCode());
        result = prime * result + ((getDiseasename() == null) ? 0 : getDiseasename().hashCode());
        result = prime * result + ((getHospitalizationtime() == null) ? 0 : getHospitalizationtime().hashCode());
        result = prime * result + ((getAdvicecontent() == null) ? 0 : getAdvicecontent().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getHospitalizationid() == null) ? 0 : getHospitalizationid().hashCode());
        result = prime * result + ((getSituation() == null) ? 0 : getSituation().hashCode());
        result = prime * result + ((getDiachargetime() == null) ? 0 : getDiachargetime().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalizationadviceid=").append(hospitalizationadviceid);
        sb.append(", diseasename=").append(diseasename);
        sb.append(", hospitalizationtime=").append(hospitalizationtime);
        sb.append(", advicecontent=").append(advicecontent);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", hospitalizationid=").append(hospitalizationid);
        sb.append(", situation=").append(situation);
        sb.append(", diachargetime=").append(diachargetime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}