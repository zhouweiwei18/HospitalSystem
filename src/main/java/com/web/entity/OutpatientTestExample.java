package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class OutpatientTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OutpatientTestExample() {
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

        public Criteria andPatienttestnoIsNull() {
            addCriterion("patientTestNo is null");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoIsNotNull() {
            addCriterion("patientTestNo is not null");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoEqualTo(Integer value) {
            addCriterion("patientTestNo =", value, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoNotEqualTo(Integer value) {
            addCriterion("patientTestNo <>", value, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoGreaterThan(Integer value) {
            addCriterion("patientTestNo >", value, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientTestNo >=", value, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoLessThan(Integer value) {
            addCriterion("patientTestNo <", value, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoLessThanOrEqualTo(Integer value) {
            addCriterion("patientTestNo <=", value, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoIn(List<Integer> values) {
            addCriterion("patientTestNo in", values, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoNotIn(List<Integer> values) {
            addCriterion("patientTestNo not in", values, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoBetween(Integer value1, Integer value2) {
            addCriterion("patientTestNo between", value1, value2, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andPatienttestnoNotBetween(Integer value1, Integer value2) {
            addCriterion("patientTestNo not between", value1, value2, "patienttestno");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidIsNull() {
            addCriterion("outpatientMedicalRecordId is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidIsNotNull() {
            addCriterion("outpatientMedicalRecordId is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidEqualTo(Integer value) {
            addCriterion("outpatientMedicalRecordId =", value, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidNotEqualTo(Integer value) {
            addCriterion("outpatientMedicalRecordId <>", value, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidGreaterThan(Integer value) {
            addCriterion("outpatientMedicalRecordId >", value, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("outpatientMedicalRecordId >=", value, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidLessThan(Integer value) {
            addCriterion("outpatientMedicalRecordId <", value, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("outpatientMedicalRecordId <=", value, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidIn(List<Integer> values) {
            addCriterion("outpatientMedicalRecordId in", values, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidNotIn(List<Integer> values) {
            addCriterion("outpatientMedicalRecordId not in", values, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidBetween(Integer value1, Integer value2) {
            addCriterion("outpatientMedicalRecordId between", value1, value2, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andOutpatientmedicalrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("outpatientMedicalRecordId not between", value1, value2, "outpatientmedicalrecordid");
            return (Criteria) this;
        }

        public Criteria andTestdoctorIsNull() {
            addCriterion("testDoctor is null");
            return (Criteria) this;
        }

        public Criteria andTestdoctorIsNotNull() {
            addCriterion("testDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andTestdoctorEqualTo(Integer value) {
            addCriterion("testDoctor =", value, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorNotEqualTo(Integer value) {
            addCriterion("testDoctor <>", value, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorGreaterThan(Integer value) {
            addCriterion("testDoctor >", value, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("testDoctor >=", value, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorLessThan(Integer value) {
            addCriterion("testDoctor <", value, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorLessThanOrEqualTo(Integer value) {
            addCriterion("testDoctor <=", value, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorIn(List<Integer> values) {
            addCriterion("testDoctor in", values, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorNotIn(List<Integer> values) {
            addCriterion("testDoctor not in", values, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorBetween(Integer value1, Integer value2) {
            addCriterion("testDoctor between", value1, value2, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTestdoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("testDoctor not between", value1, value2, "testdoctor");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNull() {
            addCriterion("testTime is null");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNotNull() {
            addCriterion("testTime is not null");
            return (Criteria) this;
        }

        public Criteria andTesttimeEqualTo(String value) {
            addCriterion("testTime =", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotEqualTo(String value) {
            addCriterion("testTime <>", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThan(String value) {
            addCriterion("testTime >", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThanOrEqualTo(String value) {
            addCriterion("testTime >=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThan(String value) {
            addCriterion("testTime <", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThanOrEqualTo(String value) {
            addCriterion("testTime <=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLike(String value) {
            addCriterion("testTime like", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotLike(String value) {
            addCriterion("testTime not like", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeIn(List<String> values) {
            addCriterion("testTime in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotIn(List<String> values) {
            addCriterion("testTime not in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeBetween(String value1, String value2) {
            addCriterion("testTime between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotBetween(String value1, String value2) {
            addCriterion("testTime not between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andTestcontextIsNull() {
            addCriterion("testContext is null");
            return (Criteria) this;
        }

        public Criteria andTestcontextIsNotNull() {
            addCriterion("testContext is not null");
            return (Criteria) this;
        }

        public Criteria andTestcontextEqualTo(String value) {
            addCriterion("testContext =", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextNotEqualTo(String value) {
            addCriterion("testContext <>", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextGreaterThan(String value) {
            addCriterion("testContext >", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextGreaterThanOrEqualTo(String value) {
            addCriterion("testContext >=", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextLessThan(String value) {
            addCriterion("testContext <", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextLessThanOrEqualTo(String value) {
            addCriterion("testContext <=", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextLike(String value) {
            addCriterion("testContext like", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextNotLike(String value) {
            addCriterion("testContext not like", value, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextIn(List<String> values) {
            addCriterion("testContext in", values, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextNotIn(List<String> values) {
            addCriterion("testContext not in", values, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextBetween(String value1, String value2) {
            addCriterion("testContext between", value1, value2, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestcontextNotBetween(String value1, String value2) {
            addCriterion("testContext not between", value1, value2, "testcontext");
            return (Criteria) this;
        }

        public Criteria andTestanalysisIsNull() {
            addCriterion("testAnalysis is null");
            return (Criteria) this;
        }

        public Criteria andTestanalysisIsNotNull() {
            addCriterion("testAnalysis is not null");
            return (Criteria) this;
        }

        public Criteria andTestanalysisEqualTo(String value) {
            addCriterion("testAnalysis =", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisNotEqualTo(String value) {
            addCriterion("testAnalysis <>", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisGreaterThan(String value) {
            addCriterion("testAnalysis >", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisGreaterThanOrEqualTo(String value) {
            addCriterion("testAnalysis >=", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisLessThan(String value) {
            addCriterion("testAnalysis <", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisLessThanOrEqualTo(String value) {
            addCriterion("testAnalysis <=", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisLike(String value) {
            addCriterion("testAnalysis like", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisNotLike(String value) {
            addCriterion("testAnalysis not like", value, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisIn(List<String> values) {
            addCriterion("testAnalysis in", values, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisNotIn(List<String> values) {
            addCriterion("testAnalysis not in", values, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisBetween(String value1, String value2) {
            addCriterion("testAnalysis between", value1, value2, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestanalysisNotBetween(String value1, String value2) {
            addCriterion("testAnalysis not between", value1, value2, "testanalysis");
            return (Criteria) this;
        }

        public Criteria andTestresultIsNull() {
            addCriterion("testResult is null");
            return (Criteria) this;
        }

        public Criteria andTestresultIsNotNull() {
            addCriterion("testResult is not null");
            return (Criteria) this;
        }

        public Criteria andTestresultEqualTo(String value) {
            addCriterion("testResult =", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotEqualTo(String value) {
            addCriterion("testResult <>", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultGreaterThan(String value) {
            addCriterion("testResult >", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultGreaterThanOrEqualTo(String value) {
            addCriterion("testResult >=", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultLessThan(String value) {
            addCriterion("testResult <", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultLessThanOrEqualTo(String value) {
            addCriterion("testResult <=", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultLike(String value) {
            addCriterion("testResult like", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotLike(String value) {
            addCriterion("testResult not like", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultIn(List<String> values) {
            addCriterion("testResult in", values, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotIn(List<String> values) {
            addCriterion("testResult not in", values, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultBetween(String value1, String value2) {
            addCriterion("testResult between", value1, value2, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotBetween(String value1, String value2) {
            addCriterion("testResult not between", value1, value2, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestchargeIsNull() {
            addCriterion("testCharge is null");
            return (Criteria) this;
        }

        public Criteria andTestchargeIsNotNull() {
            addCriterion("testCharge is not null");
            return (Criteria) this;
        }

        public Criteria andTestchargeEqualTo(Double value) {
            addCriterion("testCharge =", value, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeNotEqualTo(Double value) {
            addCriterion("testCharge <>", value, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeGreaterThan(Double value) {
            addCriterion("testCharge >", value, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeGreaterThanOrEqualTo(Double value) {
            addCriterion("testCharge >=", value, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeLessThan(Double value) {
            addCriterion("testCharge <", value, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeLessThanOrEqualTo(Double value) {
            addCriterion("testCharge <=", value, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeIn(List<Double> values) {
            addCriterion("testCharge in", values, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeNotIn(List<Double> values) {
            addCriterion("testCharge not in", values, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeBetween(Double value1, Double value2) {
            addCriterion("testCharge between", value1, value2, "testcharge");
            return (Criteria) this;
        }

        public Criteria andTestchargeNotBetween(Double value1, Double value2) {
            addCriterion("testCharge not between", value1, value2, "testcharge");
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