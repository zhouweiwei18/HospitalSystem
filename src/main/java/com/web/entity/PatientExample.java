package com.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PatientExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPatientidIsNull() {
            addCriterion("patientId is null");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNotNull() {
            addCriterion("patientId is not null");
            return (Criteria) this;
        }

        public Criteria andPatientidEqualTo(Integer value) {
            addCriterion("patientId =", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotEqualTo(Integer value) {
            addCriterion("patientId <>", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThan(Integer value) {
            addCriterion("patientId >", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientId >=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThan(Integer value) {
            addCriterion("patientId <", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThanOrEqualTo(Integer value) {
            addCriterion("patientId <=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidIn(List<Integer> values) {
            addCriterion("patientId in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotIn(List<Integer> values) {
            addCriterion("patientId not in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidBetween(Integer value1, Integer value2) {
            addCriterion("patientId between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotBetween(Integer value1, Integer value2) {
            addCriterion("patientId not between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andMarrageIsNull() {
            addCriterion("marrage is null");
            return (Criteria) this;
        }

        public Criteria andMarrageIsNotNull() {
            addCriterion("marrage is not null");
            return (Criteria) this;
        }

        public Criteria andMarrageEqualTo(String value) {
            addCriterion("marrage =", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageNotEqualTo(String value) {
            addCriterion("marrage <>", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageGreaterThan(String value) {
            addCriterion("marrage >", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageGreaterThanOrEqualTo(String value) {
            addCriterion("marrage >=", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageLessThan(String value) {
            addCriterion("marrage <", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageLessThanOrEqualTo(String value) {
            addCriterion("marrage <=", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageLike(String value) {
            addCriterion("marrage like", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageNotLike(String value) {
            addCriterion("marrage not like", value, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageIn(List<String> values) {
            addCriterion("marrage in", values, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageNotIn(List<String> values) {
            addCriterion("marrage not in", values, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageBetween(String value1, String value2) {
            addCriterion("marrage between", value1, value2, "marrage");
            return (Criteria) this;
        }

        public Criteria andMarrageNotBetween(String value1, String value2) {
            addCriterion("marrage not between", value1, value2, "marrage");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("birthPlace is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("birthPlace is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("birthPlace =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("birthPlace <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("birthPlace >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("birthPlace >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("birthPlace <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("birthPlace <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("birthPlace like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("birthPlace not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("birthPlace in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("birthPlace not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("birthPlace between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("birthPlace not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressIsNull() {
            addCriterion("companyAndAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressIsNotNull() {
            addCriterion("companyAndAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressEqualTo(String value) {
            addCriterion("companyAndAddress =", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressNotEqualTo(String value) {
            addCriterion("companyAndAddress <>", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressGreaterThan(String value) {
            addCriterion("companyAndAddress >", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyAndAddress >=", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressLessThan(String value) {
            addCriterion("companyAndAddress <", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressLessThanOrEqualTo(String value) {
            addCriterion("companyAndAddress <=", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressLike(String value) {
            addCriterion("companyAndAddress like", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressNotLike(String value) {
            addCriterion("companyAndAddress not like", value, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressIn(List<String> values) {
            addCriterion("companyAndAddress in", values, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressNotIn(List<String> values) {
            addCriterion("companyAndAddress not in", values, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressBetween(String value1, String value2) {
            addCriterion("companyAndAddress between", value1, value2, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyandaddressNotBetween(String value1, String value2) {
            addCriterion("companyAndAddress not between", value1, value2, "companyandaddress");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalCode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(Integer value) {
            addCriterion("postalCode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(Integer value) {
            addCriterion("postalCode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(Integer value) {
            addCriterion("postalCode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("postalCode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(Integer value) {
            addCriterion("postalCode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(Integer value) {
            addCriterion("postalCode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<Integer> values) {
            addCriterion("postalCode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<Integer> values) {
            addCriterion("postalCode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(Integer value1, Integer value2) {
            addCriterion("postalCode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("postalCode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressIsNull() {
            addCriterion("registeredAddress is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressIsNotNull() {
            addCriterion("registeredAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressEqualTo(String value) {
            addCriterion("registeredAddress =", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotEqualTo(String value) {
            addCriterion("registeredAddress <>", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressGreaterThan(String value) {
            addCriterion("registeredAddress >", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressGreaterThanOrEqualTo(String value) {
            addCriterion("registeredAddress >=", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressLessThan(String value) {
            addCriterion("registeredAddress <", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressLessThanOrEqualTo(String value) {
            addCriterion("registeredAddress <=", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressLike(String value) {
            addCriterion("registeredAddress like", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotLike(String value) {
            addCriterion("registeredAddress not like", value, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressIn(List<String> values) {
            addCriterion("registeredAddress in", values, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotIn(List<String> values) {
            addCriterion("registeredAddress not in", values, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressBetween(String value1, String value2) {
            addCriterion("registeredAddress between", value1, value2, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredaddressNotBetween(String value1, String value2) {
            addCriterion("registeredAddress not between", value1, value2, "registeredaddress");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNull() {
            addCriterion("contactsName is null");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNotNull() {
            addCriterion("contactsName is not null");
            return (Criteria) this;
        }

        public Criteria andContactsnameEqualTo(String value) {
            addCriterion("contactsName =", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotEqualTo(String value) {
            addCriterion("contactsName <>", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThan(String value) {
            addCriterion("contactsName >", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThanOrEqualTo(String value) {
            addCriterion("contactsName >=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThan(String value) {
            addCriterion("contactsName <", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThanOrEqualTo(String value) {
            addCriterion("contactsName <=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLike(String value) {
            addCriterion("contactsName like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotLike(String value) {
            addCriterion("contactsName not like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameIn(List<String> values) {
            addCriterion("contactsName in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotIn(List<String> values) {
            addCriterion("contactsName not in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameBetween(String value1, String value2) {
            addCriterion("contactsName between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotBetween(String value1, String value2) {
            addCriterion("contactsName not between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsaddressIsNull() {
            addCriterion("contactsAddress is null");
            return (Criteria) this;
        }

        public Criteria andContactsaddressIsNotNull() {
            addCriterion("contactsAddress is not null");
            return (Criteria) this;
        }

        public Criteria andContactsaddressEqualTo(String value) {
            addCriterion("contactsAddress =", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressNotEqualTo(String value) {
            addCriterion("contactsAddress <>", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressGreaterThan(String value) {
            addCriterion("contactsAddress >", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressGreaterThanOrEqualTo(String value) {
            addCriterion("contactsAddress >=", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressLessThan(String value) {
            addCriterion("contactsAddress <", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressLessThanOrEqualTo(String value) {
            addCriterion("contactsAddress <=", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressLike(String value) {
            addCriterion("contactsAddress like", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressNotLike(String value) {
            addCriterion("contactsAddress not like", value, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressIn(List<String> values) {
            addCriterion("contactsAddress in", values, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressNotIn(List<String> values) {
            addCriterion("contactsAddress not in", values, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressBetween(String value1, String value2) {
            addCriterion("contactsAddress between", value1, value2, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsaddressNotBetween(String value1, String value2) {
            addCriterion("contactsAddress not between", value1, value2, "contactsaddress");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipIsNull() {
            addCriterion("contactsRelationship is null");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipIsNotNull() {
            addCriterion("contactsRelationship is not null");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipEqualTo(String value) {
            addCriterion("contactsRelationship =", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipNotEqualTo(String value) {
            addCriterion("contactsRelationship <>", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipGreaterThan(String value) {
            addCriterion("contactsRelationship >", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("contactsRelationship >=", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipLessThan(String value) {
            addCriterion("contactsRelationship <", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipLessThanOrEqualTo(String value) {
            addCriterion("contactsRelationship <=", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipLike(String value) {
            addCriterion("contactsRelationship like", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipNotLike(String value) {
            addCriterion("contactsRelationship not like", value, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipIn(List<String> values) {
            addCriterion("contactsRelationship in", values, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipNotIn(List<String> values) {
            addCriterion("contactsRelationship not in", values, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipBetween(String value1, String value2) {
            addCriterion("contactsRelationship between", value1, value2, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactsrelationshipNotBetween(String value1, String value2) {
            addCriterion("contactsRelationship not between", value1, value2, "contactsrelationship");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneIsNull() {
            addCriterion("contactsTelephone is null");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneIsNotNull() {
            addCriterion("contactsTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneEqualTo(String value) {
            addCriterion("contactsTelephone =", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneNotEqualTo(String value) {
            addCriterion("contactsTelephone <>", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneGreaterThan(String value) {
            addCriterion("contactsTelephone >", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactsTelephone >=", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneLessThan(String value) {
            addCriterion("contactsTelephone <", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneLessThanOrEqualTo(String value) {
            addCriterion("contactsTelephone <=", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneLike(String value) {
            addCriterion("contactsTelephone like", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneNotLike(String value) {
            addCriterion("contactsTelephone not like", value, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneIn(List<String> values) {
            addCriterion("contactsTelephone in", values, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneNotIn(List<String> values) {
            addCriterion("contactsTelephone not in", values, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneBetween(String value1, String value2) {
            addCriterion("contactsTelephone between", value1, value2, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andContactstelephoneNotBetween(String value1, String value2) {
            addCriterion("contactsTelephone not between", value1, value2, "contactstelephone");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}