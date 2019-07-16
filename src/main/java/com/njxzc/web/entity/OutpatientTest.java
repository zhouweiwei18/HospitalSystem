package com.njxzc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * outpatient_test
 * @author 
 */
public class OutpatientTest implements Serializable {
    /**
     * 病人检验序列号
     */
    private Integer patienttestno;

    /**
     * 门诊病历id
     */
    private Integer outpatientmedicalrecordid;

    /**
     * 检验医师
     */
    private Integer testdoctor;

    /**
     * 检验时间安排
     */
    private Date testtime;

    /**
     * 检验内容
     */
    private String testcontext;

    /**
     * 检验结果分析
     */
    private String testanalysis;

    /**
     * 检验结果
     */
    private String testresult;

    /**
     * 检验收费情况
     */
    private Double testcharge;

    private static final long serialVersionUID = 1L;

    public Integer getPatienttestno() {
        return patienttestno;
    }

    public void setPatienttestno(Integer patienttestno) {
        this.patienttestno = patienttestno;
    }

    public Integer getOutpatientmedicalrecordid() {
        return outpatientmedicalrecordid;
    }

    public void setOutpatientmedicalrecordid(Integer outpatientmedicalrecordid) {
        this.outpatientmedicalrecordid = outpatientmedicalrecordid;
    }

    public Integer getTestdoctor() {
        return testdoctor;
    }

    public void setTestdoctor(Integer testdoctor) {
        this.testdoctor = testdoctor;
    }

    public Date getTesttime() {
        return testtime;
    }

    public void setTesttime(Date testtime) {
        this.testtime = testtime;
    }

    public String getTestcontext() {
        return testcontext;
    }

    public void setTestcontext(String testcontext) {
        this.testcontext = testcontext;
    }

    public String getTestanalysis() {
        return testanalysis;
    }

    public void setTestanalysis(String testanalysis) {
        this.testanalysis = testanalysis;
    }

    public String getTestresult() {
        return testresult;
    }

    public void setTestresult(String testresult) {
        this.testresult = testresult;
    }

    public Double getTestcharge() {
        return testcharge;
    }

    public void setTestcharge(Double testcharge) {
        this.testcharge = testcharge;
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
        OutpatientTest other = (OutpatientTest) that;
        return (this.getPatienttestno() == null ? other.getPatienttestno() == null : this.getPatienttestno().equals(other.getPatienttestno()))
            && (this.getOutpatientmedicalrecordid() == null ? other.getOutpatientmedicalrecordid() == null : this.getOutpatientmedicalrecordid().equals(other.getOutpatientmedicalrecordid()))
            && (this.getTestdoctor() == null ? other.getTestdoctor() == null : this.getTestdoctor().equals(other.getTestdoctor()))
            && (this.getTesttime() == null ? other.getTesttime() == null : this.getTesttime().equals(other.getTesttime()))
            && (this.getTestcontext() == null ? other.getTestcontext() == null : this.getTestcontext().equals(other.getTestcontext()))
            && (this.getTestanalysis() == null ? other.getTestanalysis() == null : this.getTestanalysis().equals(other.getTestanalysis()))
            && (this.getTestresult() == null ? other.getTestresult() == null : this.getTestresult().equals(other.getTestresult()))
            && (this.getTestcharge() == null ? other.getTestcharge() == null : this.getTestcharge().equals(other.getTestcharge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatienttestno() == null) ? 0 : getPatienttestno().hashCode());
        result = prime * result + ((getOutpatientmedicalrecordid() == null) ? 0 : getOutpatientmedicalrecordid().hashCode());
        result = prime * result + ((getTestdoctor() == null) ? 0 : getTestdoctor().hashCode());
        result = prime * result + ((getTesttime() == null) ? 0 : getTesttime().hashCode());
        result = prime * result + ((getTestcontext() == null) ? 0 : getTestcontext().hashCode());
        result = prime * result + ((getTestanalysis() == null) ? 0 : getTestanalysis().hashCode());
        result = prime * result + ((getTestresult() == null) ? 0 : getTestresult().hashCode());
        result = prime * result + ((getTestcharge() == null) ? 0 : getTestcharge().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patienttestno=").append(patienttestno);
        sb.append(", outpatientmedicalrecordid=").append(outpatientmedicalrecordid);
        sb.append(", testdoctor=").append(testdoctor);
        sb.append(", testtime=").append(testtime);
        sb.append(", testcontext=").append(testcontext);
        sb.append(", testanalysis=").append(testanalysis);
        sb.append(", testresult=").append(testresult);
        sb.append(", testcharge=").append(testcharge);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}