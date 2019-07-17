package com.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * patient
 * @author 
 */
public class Patient implements Serializable {
    /**
     * 病人ID
     */
    private Integer patientid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 婚姻情况
     */
    private String marrage;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 出生地
     */
    private String birthplace;

    /**
     * 民族
     */
    private String nation;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 单位及地址
     */
    private String companyandaddress;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 邮政编码
     */
    private Integer postalcode;

    /**
     * 户口地址
     */
    private String registeredaddress;

    /**
     * 联系人姓名
     */
    private String contactsname;

    /**
     * 联系人地址
     */
    private String contactsaddress;

    /**
     * 联系人关系
     */
    private String contactsrelationship;

    /**
     * 联系人电话
     */
    private String contactstelephone;

    /**
     * 是否删除
     */
    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMarrage() {
        return marrage;
    }

    public void setMarrage(String marrage) {
        this.marrage = marrage;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getCompanyandaddress() {
        return companyandaddress;
    }

    public void setCompanyandaddress(String companyandaddress) {
        this.companyandaddress = companyandaddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getRegisteredaddress() {
        return registeredaddress;
    }

    public void setRegisteredaddress(String registeredaddress) {
        this.registeredaddress = registeredaddress;
    }

    public String getContactsname() {
        return contactsname;
    }

    public void setContactsname(String contactsname) {
        this.contactsname = contactsname;
    }

    public String getContactsaddress() {
        return contactsaddress;
    }

    public void setContactsaddress(String contactsaddress) {
        this.contactsaddress = contactsaddress;
    }

    public String getContactsrelationship() {
        return contactsrelationship;
    }

    public void setContactsrelationship(String contactsrelationship) {
        this.contactsrelationship = contactsrelationship;
    }

    public String getContactstelephone() {
        return contactstelephone;
    }

    public void setContactstelephone(String contactstelephone) {
        this.contactstelephone = contactstelephone;
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
        Patient other = (Patient) that;
        return (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getMarrage() == null ? other.getMarrage() == null : this.getMarrage().equals(other.getMarrage()))
            && (this.getOccupation() == null ? other.getOccupation() == null : this.getOccupation().equals(other.getOccupation()))
            && (this.getBirthplace() == null ? other.getBirthplace() == null : this.getBirthplace().equals(other.getBirthplace()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getCompanyandaddress() == null ? other.getCompanyandaddress() == null : this.getCompanyandaddress().equals(other.getCompanyandaddress()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getPostalcode() == null ? other.getPostalcode() == null : this.getPostalcode().equals(other.getPostalcode()))
            && (this.getRegisteredaddress() == null ? other.getRegisteredaddress() == null : this.getRegisteredaddress().equals(other.getRegisteredaddress()))
            && (this.getContactsname() == null ? other.getContactsname() == null : this.getContactsname().equals(other.getContactsname()))
            && (this.getContactsaddress() == null ? other.getContactsaddress() == null : this.getContactsaddress().equals(other.getContactsaddress()))
            && (this.getContactsrelationship() == null ? other.getContactsrelationship() == null : this.getContactsrelationship().equals(other.getContactsrelationship()))
            && (this.getContactstelephone() == null ? other.getContactstelephone() == null : this.getContactstelephone().equals(other.getContactstelephone()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getMarrage() == null) ? 0 : getMarrage().hashCode());
        result = prime * result + ((getOccupation() == null) ? 0 : getOccupation().hashCode());
        result = prime * result + ((getBirthplace() == null) ? 0 : getBirthplace().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getCompanyandaddress() == null) ? 0 : getCompanyandaddress().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getPostalcode() == null) ? 0 : getPostalcode().hashCode());
        result = prime * result + ((getRegisteredaddress() == null) ? 0 : getRegisteredaddress().hashCode());
        result = prime * result + ((getContactsname() == null) ? 0 : getContactsname().hashCode());
        result = prime * result + ((getContactsaddress() == null) ? 0 : getContactsaddress().hashCode());
        result = prime * result + ((getContactsrelationship() == null) ? 0 : getContactsrelationship().hashCode());
        result = prime * result + ((getContactstelephone() == null) ? 0 : getContactstelephone().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientid=").append(patientid);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", marrage=").append(marrage);
        sb.append(", occupation=").append(occupation);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", nation=").append(nation);
        sb.append(", nationality=").append(nationality);
        sb.append(", idcard=").append(idcard);
        sb.append(", companyandaddress=").append(companyandaddress);
        sb.append(", telephone=").append(telephone);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", registeredaddress=").append(registeredaddress);
        sb.append(", contactsname=").append(contactsname);
        sb.append(", contactsaddress=").append(contactsaddress);
        sb.append(", contactsrelationship=").append(contactsrelationship);
        sb.append(", contactstelephone=").append(contactstelephone);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}