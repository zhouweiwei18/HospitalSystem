package com.njxzc.web.entity;

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
     * 病历号
     */
    private Integer medicalrecord;

    /**
     * 收费号
     */
    private Integer chargeno;

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
    private String idNumber;

    /**
     * 单位及地址
     */
    private String companyAndAddress;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 邮政编码
     */
    private Integer postalCode;

    /**
     * 户口地址
     */
    private String registeredAddress;

    /**
     * 联系人姓名
     */
    private String contactsName;

    /**
     * 联系人地址
     */
    private String contactsAddress;

    /**
     * 联系人关系
     */
    private String contactsRelationship;

    /**
     * 联系人电话
     */
    private String contactsTelephone;

    private static final long serialVersionUID = 1L;

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(Integer medicalrecord) {
        this.medicalrecord = medicalrecord;
    }

    public Integer getChargeno() {
        return chargeno;
    }

    public void setChargeno(Integer chargeno) {
        this.chargeno = chargeno;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCompanyAndAddress() {
        return companyAndAddress;
    }

    public void setCompanyAndAddress(String companyAndAddress) {
        this.companyAndAddress = companyAndAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getContactsAddress() {
        return contactsAddress;
    }

    public void setContactsAddress(String contactsAddress) {
        this.contactsAddress = contactsAddress;
    }

    public String getContactsRelationship() {
        return contactsRelationship;
    }

    public void setContactsRelationship(String contactsRelationship) {
        this.contactsRelationship = contactsRelationship;
    }

    public String getContactsTelephone() {
        return contactsTelephone;
    }

    public void setContactsTelephone(String contactsTelephone) {
        this.contactsTelephone = contactsTelephone;
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
            && (this.getMedicalrecord() == null ? other.getMedicalrecord() == null : this.getMedicalrecord().equals(other.getMedicalrecord()))
            && (this.getChargeno() == null ? other.getChargeno() == null : this.getChargeno().equals(other.getChargeno()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getMarrage() == null ? other.getMarrage() == null : this.getMarrage().equals(other.getMarrage()))
            && (this.getOccupation() == null ? other.getOccupation() == null : this.getOccupation().equals(other.getOccupation()))
            && (this.getBirthplace() == null ? other.getBirthplace() == null : this.getBirthplace().equals(other.getBirthplace()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getIdNumber() == null ? other.getIdNumber() == null : this.getIdNumber().equals(other.getIdNumber()))
            && (this.getCompanyAndAddress() == null ? other.getCompanyAndAddress() == null : this.getCompanyAndAddress().equals(other.getCompanyAndAddress()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getPostalCode() == null ? other.getPostalCode() == null : this.getPostalCode().equals(other.getPostalCode()))
            && (this.getRegisteredAddress() == null ? other.getRegisteredAddress() == null : this.getRegisteredAddress().equals(other.getRegisteredAddress()))
            && (this.getContactsName() == null ? other.getContactsName() == null : this.getContactsName().equals(other.getContactsName()))
            && (this.getContactsAddress() == null ? other.getContactsAddress() == null : this.getContactsAddress().equals(other.getContactsAddress()))
            && (this.getContactsRelationship() == null ? other.getContactsRelationship() == null : this.getContactsRelationship().equals(other.getContactsRelationship()))
            && (this.getContactsTelephone() == null ? other.getContactsTelephone() == null : this.getContactsTelephone().equals(other.getContactsTelephone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getMedicalrecord() == null) ? 0 : getMedicalrecord().hashCode());
        result = prime * result + ((getChargeno() == null) ? 0 : getChargeno().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getMarrage() == null) ? 0 : getMarrage().hashCode());
        result = prime * result + ((getOccupation() == null) ? 0 : getOccupation().hashCode());
        result = prime * result + ((getBirthplace() == null) ? 0 : getBirthplace().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getIdNumber() == null) ? 0 : getIdNumber().hashCode());
        result = prime * result + ((getCompanyAndAddress() == null) ? 0 : getCompanyAndAddress().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        result = prime * result + ((getRegisteredAddress() == null) ? 0 : getRegisteredAddress().hashCode());
        result = prime * result + ((getContactsName() == null) ? 0 : getContactsName().hashCode());
        result = prime * result + ((getContactsAddress() == null) ? 0 : getContactsAddress().hashCode());
        result = prime * result + ((getContactsRelationship() == null) ? 0 : getContactsRelationship().hashCode());
        result = prime * result + ((getContactsTelephone() == null) ? 0 : getContactsTelephone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientid=").append(patientid);
        sb.append(", medicalrecord=").append(medicalrecord);
        sb.append(", chargeno=").append(chargeno);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", marrage=").append(marrage);
        sb.append(", occupation=").append(occupation);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", nation=").append(nation);
        sb.append(", nationality=").append(nationality);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", companyAndAddress=").append(companyAndAddress);
        sb.append(", telephone=").append(telephone);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", registeredAddress=").append(registeredAddress);
        sb.append(", contactsName=").append(contactsName);
        sb.append(", contactsAddress=").append(contactsAddress);
        sb.append(", contactsRelationship=").append(contactsRelationship);
        sb.append(", contactsTelephone=").append(contactsTelephone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}