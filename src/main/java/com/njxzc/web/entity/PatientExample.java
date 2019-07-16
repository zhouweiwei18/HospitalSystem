package com.njxzc.web.entity;

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

        public Criteria andMedicalrecordIsNull() {
            addCriterion("medicalRecord is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIsNotNull() {
            addCriterion("medicalRecord is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordEqualTo(Integer value) {
            addCriterion("medicalRecord =", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordNotEqualTo(Integer value) {
            addCriterion("medicalRecord <>", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordGreaterThan(Integer value) {
            addCriterion("medicalRecord >", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecord >=", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordLessThan(Integer value) {
            addCriterion("medicalRecord <", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecord <=", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIn(List<Integer> values) {
            addCriterion("medicalRecord in", values, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordNotIn(List<Integer> values) {
            addCriterion("medicalRecord not in", values, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecord between", value1, value2, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecord not between", value1, value2, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andChargenoIsNull() {
            addCriterion("chargeNo is null");
            return (Criteria) this;
        }

        public Criteria andChargenoIsNotNull() {
            addCriterion("chargeNo is not null");
            return (Criteria) this;
        }

        public Criteria andChargenoEqualTo(Integer value) {
            addCriterion("chargeNo =", value, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoNotEqualTo(Integer value) {
            addCriterion("chargeNo <>", value, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoGreaterThan(Integer value) {
            addCriterion("chargeNo >", value, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeNo >=", value, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoLessThan(Integer value) {
            addCriterion("chargeNo <", value, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoLessThanOrEqualTo(Integer value) {
            addCriterion("chargeNo <=", value, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoIn(List<Integer> values) {
            addCriterion("chargeNo in", values, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoNotIn(List<Integer> values) {
            addCriterion("chargeNo not in", values, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoBetween(Integer value1, Integer value2) {
            addCriterion("chargeNo between", value1, value2, "chargeno");
            return (Criteria) this;
        }

        public Criteria andChargenoNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeNo not between", value1, value2, "chargeno");
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

        public Criteria andIdNumberIsNull() {
            addCriterion("\"ID number\" is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("\"ID number\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("\"ID number\" =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("\"ID number\" <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("\"ID number\" >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("\"ID number\" >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("\"ID number\" <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("\"ID number\" <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("\"ID number\" like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("\"ID number\" not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("\"ID number\" in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("\"ID number\" not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("\"ID number\" between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("\"ID number\" not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressIsNull() {
            addCriterion("\"company and address\" is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressIsNotNull() {
            addCriterion("\"company and address\" is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressEqualTo(String value) {
            addCriterion("\"company and address\" =", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressNotEqualTo(String value) {
            addCriterion("\"company and address\" <>", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressGreaterThan(String value) {
            addCriterion("\"company and address\" >", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressGreaterThanOrEqualTo(String value) {
            addCriterion("\"company and address\" >=", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressLessThan(String value) {
            addCriterion("\"company and address\" <", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressLessThanOrEqualTo(String value) {
            addCriterion("\"company and address\" <=", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressLike(String value) {
            addCriterion("\"company and address\" like", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressNotLike(String value) {
            addCriterion("\"company and address\" not like", value, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressIn(List<String> values) {
            addCriterion("\"company and address\" in", values, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressNotIn(List<String> values) {
            addCriterion("\"company and address\" not in", values, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressBetween(String value1, String value2) {
            addCriterion("\"company and address\" between", value1, value2, "companyAndAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAndAddressNotBetween(String value1, String value2) {
            addCriterion("\"company and address\" not between", value1, value2, "companyAndAddress");
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

        public Criteria andPostalCodeIsNull() {
            addCriterion("\"postal code\" is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("\"postal code\" is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(Integer value) {
            addCriterion("\"postal code\" =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(Integer value) {
            addCriterion("\"postal code\" <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(Integer value) {
            addCriterion("\"postal code\" >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"postal code\" >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(Integer value) {
            addCriterion("\"postal code\" <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(Integer value) {
            addCriterion("\"postal code\" <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<Integer> values) {
            addCriterion("\"postal code\" in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<Integer> values) {
            addCriterion("\"postal code\" not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(Integer value1, Integer value2) {
            addCriterion("\"postal code\" between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"postal code\" not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("\"registered address\" is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("\"registered address\" is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("\"registered address\" =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("\"registered address\" <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("\"registered address\" >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("\"registered address\" >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("\"registered address\" <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("\"registered address\" <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("\"registered address\" like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("\"registered address\" not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("\"registered address\" in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("\"registered address\" not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("\"registered address\" between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("\"registered address\" not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("\"contacts name\" is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("\"contacts name\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("\"contacts name\" =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("\"contacts name\" <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("\"contacts name\" >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"contacts name\" >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("\"contacts name\" <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("\"contacts name\" <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("\"contacts name\" like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("\"contacts name\" not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("\"contacts name\" in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("\"contacts name\" not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("\"contacts name\" between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("\"contacts name\" not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsAddressIsNull() {
            addCriterion("\"contacts address\" is null");
            return (Criteria) this;
        }

        public Criteria andContactsAddressIsNotNull() {
            addCriterion("\"contacts address\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactsAddressEqualTo(String value) {
            addCriterion("\"contacts address\" =", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressNotEqualTo(String value) {
            addCriterion("\"contacts address\" <>", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressGreaterThan(String value) {
            addCriterion("\"contacts address\" >", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("\"contacts address\" >=", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressLessThan(String value) {
            addCriterion("\"contacts address\" <", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressLessThanOrEqualTo(String value) {
            addCriterion("\"contacts address\" <=", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressLike(String value) {
            addCriterion("\"contacts address\" like", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressNotLike(String value) {
            addCriterion("\"contacts address\" not like", value, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressIn(List<String> values) {
            addCriterion("\"contacts address\" in", values, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressNotIn(List<String> values) {
            addCriterion("\"contacts address\" not in", values, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressBetween(String value1, String value2) {
            addCriterion("\"contacts address\" between", value1, value2, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsAddressNotBetween(String value1, String value2) {
            addCriterion("\"contacts address\" not between", value1, value2, "contactsAddress");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipIsNull() {
            addCriterion("\"contacts relationship\" is null");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipIsNotNull() {
            addCriterion("\"contacts relationship\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipEqualTo(String value) {
            addCriterion("\"contacts relationship\" =", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipNotEqualTo(String value) {
            addCriterion("\"contacts relationship\" <>", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipGreaterThan(String value) {
            addCriterion("\"contacts relationship\" >", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("\"contacts relationship\" >=", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipLessThan(String value) {
            addCriterion("\"contacts relationship\" <", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipLessThanOrEqualTo(String value) {
            addCriterion("\"contacts relationship\" <=", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipLike(String value) {
            addCriterion("\"contacts relationship\" like", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipNotLike(String value) {
            addCriterion("\"contacts relationship\" not like", value, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipIn(List<String> values) {
            addCriterion("\"contacts relationship\" in", values, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipNotIn(List<String> values) {
            addCriterion("\"contacts relationship\" not in", values, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipBetween(String value1, String value2) {
            addCriterion("\"contacts relationship\" between", value1, value2, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsRelationshipNotBetween(String value1, String value2) {
            addCriterion("\"contacts relationship\" not between", value1, value2, "contactsRelationship");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneIsNull() {
            addCriterion("\"contacts telephone\" is null");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneIsNotNull() {
            addCriterion("\"contacts telephone\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneEqualTo(String value) {
            addCriterion("\"contacts telephone\" =", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneNotEqualTo(String value) {
            addCriterion("\"contacts telephone\" <>", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneGreaterThan(String value) {
            addCriterion("\"contacts telephone\" >", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("\"contacts telephone\" >=", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneLessThan(String value) {
            addCriterion("\"contacts telephone\" <", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneLessThanOrEqualTo(String value) {
            addCriterion("\"contacts telephone\" <=", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneLike(String value) {
            addCriterion("\"contacts telephone\" like", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneNotLike(String value) {
            addCriterion("\"contacts telephone\" not like", value, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneIn(List<String> values) {
            addCriterion("\"contacts telephone\" in", values, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneNotIn(List<String> values) {
            addCriterion("\"contacts telephone\" not in", values, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneBetween(String value1, String value2) {
            addCriterion("\"contacts telephone\" between", value1, value2, "contactsTelephone");
            return (Criteria) this;
        }

        public Criteria andContactsTelephoneNotBetween(String value1, String value2) {
            addCriterion("\"contacts telephone\" not between", value1, value2, "contactsTelephone");
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