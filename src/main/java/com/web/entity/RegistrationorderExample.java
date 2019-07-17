package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class RegistrationorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RegistrationorderExample() {
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

        public Criteria andRegisteridIsNull() {
            addCriterion("registerId is null");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNotNull() {
            addCriterion("registerId is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteridEqualTo(Integer value) {
            addCriterion("registerId =", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotEqualTo(Integer value) {
            addCriterion("registerId <>", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThan(Integer value) {
            addCriterion("registerId >", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("registerId >=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThan(Integer value) {
            addCriterion("registerId <", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThanOrEqualTo(Integer value) {
            addCriterion("registerId <=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridIn(List<Integer> values) {
            addCriterion("registerId in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotIn(List<Integer> values) {
            addCriterion("registerId not in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridBetween(Integer value1, Integer value2) {
            addCriterion("registerId between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotBetween(Integer value1, Integer value2) {
            addCriterion("registerId not between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIsNull() {
            addCriterion("registrationNumber is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIsNotNull() {
            addCriterion("registrationNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberEqualTo(Integer value) {
            addCriterion("registrationNumber =", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotEqualTo(Integer value) {
            addCriterion("registrationNumber <>", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberGreaterThan(Integer value) {
            addCriterion("registrationNumber >", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrationNumber >=", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberLessThan(Integer value) {
            addCriterion("registrationNumber <", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberLessThanOrEqualTo(Integer value) {
            addCriterion("registrationNumber <=", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIn(List<Integer> values) {
            addCriterion("registrationNumber in", values, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotIn(List<Integer> values) {
            addCriterion("registrationNumber not in", values, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberBetween(Integer value1, Integer value2) {
            addCriterion("registrationNumber between", value1, value2, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("registrationNumber not between", value1, value2, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNull() {
            addCriterion("registrationDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNotNull() {
            addCriterion("registrationDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateEqualTo(String value) {
            addCriterion("registrationDate =", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotEqualTo(String value) {
            addCriterion("registrationDate <>", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThan(String value) {
            addCriterion("registrationDate >", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThanOrEqualTo(String value) {
            addCriterion("registrationDate >=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThan(String value) {
            addCriterion("registrationDate <", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThanOrEqualTo(String value) {
            addCriterion("registrationDate <=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLike(String value) {
            addCriterion("registrationDate like", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotLike(String value) {
            addCriterion("registrationDate not like", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIn(List<String> values) {
            addCriterion("registrationDate in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotIn(List<String> values) {
            addCriterion("registrationDate not in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateBetween(String value1, String value2) {
            addCriterion("registrationDate between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotBetween(String value1, String value2) {
            addCriterion("registrationDate not between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeIsNull() {
            addCriterion("registeredFee is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeIsNotNull() {
            addCriterion("registeredFee is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeEqualTo(Double value) {
            addCriterion("registeredFee =", value, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeNotEqualTo(Double value) {
            addCriterion("registeredFee <>", value, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeGreaterThan(Double value) {
            addCriterion("registeredFee >", value, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredFee >=", value, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeLessThan(Double value) {
            addCriterion("registeredFee <", value, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeLessThanOrEqualTo(Double value) {
            addCriterion("registeredFee <=", value, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeIn(List<Double> values) {
            addCriterion("registeredFee in", values, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeNotIn(List<Double> values) {
            addCriterion("registeredFee not in", values, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeBetween(Double value1, Double value2) {
            addCriterion("registeredFee between", value1, value2, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegisteredfeeNotBetween(Double value1, Double value2) {
            addCriterion("registeredFee not between", value1, value2, "registeredfee");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentIsNull() {
            addCriterion("registrationDepartment is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentIsNotNull() {
            addCriterion("registrationDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentEqualTo(Integer value) {
            addCriterion("registrationDepartment =", value, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentNotEqualTo(Integer value) {
            addCriterion("registrationDepartment <>", value, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentGreaterThan(Integer value) {
            addCriterion("registrationDepartment >", value, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrationDepartment >=", value, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentLessThan(Integer value) {
            addCriterion("registrationDepartment <", value, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("registrationDepartment <=", value, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentIn(List<Integer> values) {
            addCriterion("registrationDepartment in", values, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentNotIn(List<Integer> values) {
            addCriterion("registrationDepartment not in", values, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentBetween(Integer value1, Integer value2) {
            addCriterion("registrationDepartment between", value1, value2, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationdepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("registrationDepartment not between", value1, value2, "registrationdepartment");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeIsNull() {
            addCriterion("physicianInCharge is null");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeIsNotNull() {
            addCriterion("physicianInCharge is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeEqualTo(Integer value) {
            addCriterion("physicianInCharge =", value, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeNotEqualTo(Integer value) {
            addCriterion("physicianInCharge <>", value, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeGreaterThan(Integer value) {
            addCriterion("physicianInCharge >", value, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("physicianInCharge >=", value, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeLessThan(Integer value) {
            addCriterion("physicianInCharge <", value, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeLessThanOrEqualTo(Integer value) {
            addCriterion("physicianInCharge <=", value, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeIn(List<Integer> values) {
            addCriterion("physicianInCharge in", values, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeNotIn(List<Integer> values) {
            addCriterion("physicianInCharge not in", values, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeBetween(Integer value1, Integer value2) {
            addCriterion("physicianInCharge between", value1, value2, "physicianincharge");
            return (Criteria) this;
        }

        public Criteria andPhysicianinchargeNotBetween(Integer value1, Integer value2) {
            addCriterion("physicianInCharge not between", value1, value2, "physicianincharge");
            return (Criteria) this;
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

        public Criteria andRegisteredpersonidIsNull() {
            addCriterion("registeredPersonId is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidIsNotNull() {
            addCriterion("registeredPersonId is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidEqualTo(Integer value) {
            addCriterion("registeredPersonId =", value, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidNotEqualTo(Integer value) {
            addCriterion("registeredPersonId <>", value, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidGreaterThan(Integer value) {
            addCriterion("registeredPersonId >", value, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("registeredPersonId >=", value, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidLessThan(Integer value) {
            addCriterion("registeredPersonId <", value, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidLessThanOrEqualTo(Integer value) {
            addCriterion("registeredPersonId <=", value, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidIn(List<Integer> values) {
            addCriterion("registeredPersonId in", values, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidNotIn(List<Integer> values) {
            addCriterion("registeredPersonId not in", values, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidBetween(Integer value1, Integer value2) {
            addCriterion("registeredPersonId between", value1, value2, "registeredpersonid");
            return (Criteria) this;
        }

        public Criteria andRegisteredpersonidNotBetween(Integer value1, Integer value2) {
            addCriterion("registeredPersonId not between", value1, value2, "registeredpersonid");
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