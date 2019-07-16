package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutpatientprescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OutpatientprescriptionExample() {
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

        public Criteria andPrescriptionnumberIsNull() {
            addCriterion("prescriptionNumber is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberIsNotNull() {
            addCriterion("prescriptionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberEqualTo(Integer value) {
            addCriterion("prescriptionNumber =", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberNotEqualTo(Integer value) {
            addCriterion("prescriptionNumber <>", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberGreaterThan(Integer value) {
            addCriterion("prescriptionNumber >", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescriptionNumber >=", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberLessThan(Integer value) {
            addCriterion("prescriptionNumber <", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberLessThanOrEqualTo(Integer value) {
            addCriterion("prescriptionNumber <=", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberIn(List<Integer> values) {
            addCriterion("prescriptionNumber in", values, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberNotIn(List<Integer> values) {
            addCriterion("prescriptionNumber not in", values, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionNumber between", value1, value2, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionNumber not between", value1, value2, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andAdoctornameIsNull() {
            addCriterion("aDoctorName is null");
            return (Criteria) this;
        }

        public Criteria andAdoctornameIsNotNull() {
            addCriterion("aDoctorName is not null");
            return (Criteria) this;
        }

        public Criteria andAdoctornameEqualTo(Integer value) {
            addCriterion("aDoctorName =", value, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameNotEqualTo(Integer value) {
            addCriterion("aDoctorName <>", value, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameGreaterThan(Integer value) {
            addCriterion("aDoctorName >", value, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameGreaterThanOrEqualTo(Integer value) {
            addCriterion("aDoctorName >=", value, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameLessThan(Integer value) {
            addCriterion("aDoctorName <", value, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameLessThanOrEqualTo(Integer value) {
            addCriterion("aDoctorName <=", value, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameIn(List<Integer> values) {
            addCriterion("aDoctorName in", values, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameNotIn(List<Integer> values) {
            addCriterion("aDoctorName not in", values, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameBetween(Integer value1, Integer value2) {
            addCriterion("aDoctorName between", value1, value2, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andAdoctornameNotBetween(Integer value1, Integer value2) {
            addCriterion("aDoctorName not between", value1, value2, "adoctorname");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidIsNull() {
            addCriterion("medicalRecordId is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidIsNotNull() {
            addCriterion("medicalRecordId is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidEqualTo(Integer value) {
            addCriterion("medicalRecordId =", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotEqualTo(Integer value) {
            addCriterion("medicalRecordId <>", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidGreaterThan(Integer value) {
            addCriterion("medicalRecordId >", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordId >=", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidLessThan(Integer value) {
            addCriterion("medicalRecordId <", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordId <=", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidIn(List<Integer> values) {
            addCriterion("medicalRecordId in", values, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotIn(List<Integer> values) {
            addCriterion("medicalRecordId not in", values, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordId between", value1, value2, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordId not between", value1, value2, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andPrecontentIsNull() {
            addCriterion("preContent is null");
            return (Criteria) this;
        }

        public Criteria andPrecontentIsNotNull() {
            addCriterion("preContent is not null");
            return (Criteria) this;
        }

        public Criteria andPrecontentEqualTo(String value) {
            addCriterion("preContent =", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentNotEqualTo(String value) {
            addCriterion("preContent <>", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentGreaterThan(String value) {
            addCriterion("preContent >", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentGreaterThanOrEqualTo(String value) {
            addCriterion("preContent >=", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentLessThan(String value) {
            addCriterion("preContent <", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentLessThanOrEqualTo(String value) {
            addCriterion("preContent <=", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentLike(String value) {
            addCriterion("preContent like", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentNotLike(String value) {
            addCriterion("preContent not like", value, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentIn(List<String> values) {
            addCriterion("preContent in", values, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentNotIn(List<String> values) {
            addCriterion("preContent not in", values, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentBetween(String value1, String value2) {
            addCriterion("preContent between", value1, value2, "precontent");
            return (Criteria) this;
        }

        public Criteria andPrecontentNotBetween(String value1, String value2) {
            addCriterion("preContent not between", value1, value2, "precontent");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("openTime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("openTime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(Date value) {
            addCriterion("openTime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(Date value) {
            addCriterion("openTime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(Date value) {
            addCriterion("openTime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("openTime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(Date value) {
            addCriterion("openTime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("openTime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<Date> values) {
            addCriterion("openTime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<Date> values) {
            addCriterion("openTime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(Date value1, Date value2) {
            addCriterion("openTime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("openTime not between", value1, value2, "opentime");
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