package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class OutpatientCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OutpatientCheckExample() {
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

        public Criteria andCheckdoctornameIsNull() {
            addCriterion("checkDoctorName is null");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameIsNotNull() {
            addCriterion("checkDoctorName is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameEqualTo(Integer value) {
            addCriterion("checkDoctorName =", value, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameNotEqualTo(Integer value) {
            addCriterion("checkDoctorName <>", value, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameGreaterThan(Integer value) {
            addCriterion("checkDoctorName >", value, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkDoctorName >=", value, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameLessThan(Integer value) {
            addCriterion("checkDoctorName <", value, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameLessThanOrEqualTo(Integer value) {
            addCriterion("checkDoctorName <=", value, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameIn(List<Integer> values) {
            addCriterion("checkDoctorName in", values, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameNotIn(List<Integer> values) {
            addCriterion("checkDoctorName not in", values, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameBetween(Integer value1, Integer value2) {
            addCriterion("checkDoctorName between", value1, value2, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andCheckdoctornameNotBetween(Integer value1, Integer value2) {
            addCriterion("checkDoctorName not between", value1, value2, "checkdoctorname");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("checkTime like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("checkTime not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andCheckcontextIsNull() {
            addCriterion("checkContext is null");
            return (Criteria) this;
        }

        public Criteria andCheckcontextIsNotNull() {
            addCriterion("checkContext is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcontextEqualTo(String value) {
            addCriterion("checkContext =", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextNotEqualTo(String value) {
            addCriterion("checkContext <>", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextGreaterThan(String value) {
            addCriterion("checkContext >", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextGreaterThanOrEqualTo(String value) {
            addCriterion("checkContext >=", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextLessThan(String value) {
            addCriterion("checkContext <", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextLessThanOrEqualTo(String value) {
            addCriterion("checkContext <=", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextLike(String value) {
            addCriterion("checkContext like", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextNotLike(String value) {
            addCriterion("checkContext not like", value, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextIn(List<String> values) {
            addCriterion("checkContext in", values, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextNotIn(List<String> values) {
            addCriterion("checkContext not in", values, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextBetween(String value1, String value2) {
            addCriterion("checkContext between", value1, value2, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckcontextNotBetween(String value1, String value2) {
            addCriterion("checkContext not between", value1, value2, "checkcontext");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisIsNull() {
            addCriterion("checkAnalysis is null");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisIsNotNull() {
            addCriterion("checkAnalysis is not null");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisEqualTo(String value) {
            addCriterion("checkAnalysis =", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisNotEqualTo(String value) {
            addCriterion("checkAnalysis <>", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisGreaterThan(String value) {
            addCriterion("checkAnalysis >", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisGreaterThanOrEqualTo(String value) {
            addCriterion("checkAnalysis >=", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisLessThan(String value) {
            addCriterion("checkAnalysis <", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisLessThanOrEqualTo(String value) {
            addCriterion("checkAnalysis <=", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisLike(String value) {
            addCriterion("checkAnalysis like", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisNotLike(String value) {
            addCriterion("checkAnalysis not like", value, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisIn(List<String> values) {
            addCriterion("checkAnalysis in", values, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisNotIn(List<String> values) {
            addCriterion("checkAnalysis not in", values, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisBetween(String value1, String value2) {
            addCriterion("checkAnalysis between", value1, value2, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckanalysisNotBetween(String value1, String value2) {
            addCriterion("checkAnalysis not between", value1, value2, "checkanalysis");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("checkResult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("checkResult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("checkResult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("checkResult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("checkResult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("checkResult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("checkResult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("checkResult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("checkResult like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("checkResult not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("checkResult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("checkResult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("checkResult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("checkResult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckchargeIsNull() {
            addCriterion("checkCharge is null");
            return (Criteria) this;
        }

        public Criteria andCheckchargeIsNotNull() {
            addCriterion("checkCharge is not null");
            return (Criteria) this;
        }

        public Criteria andCheckchargeEqualTo(Double value) {
            addCriterion("checkCharge =", value, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeNotEqualTo(Double value) {
            addCriterion("checkCharge <>", value, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeGreaterThan(Double value) {
            addCriterion("checkCharge >", value, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeGreaterThanOrEqualTo(Double value) {
            addCriterion("checkCharge >=", value, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeLessThan(Double value) {
            addCriterion("checkCharge <", value, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeLessThanOrEqualTo(Double value) {
            addCriterion("checkCharge <=", value, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeIn(List<Double> values) {
            addCriterion("checkCharge in", values, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeNotIn(List<Double> values) {
            addCriterion("checkCharge not in", values, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeBetween(Double value1, Double value2) {
            addCriterion("checkCharge between", value1, value2, "checkcharge");
            return (Criteria) this;
        }

        public Criteria andCheckchargeNotBetween(Double value1, Double value2) {
            addCriterion("checkCharge not between", value1, value2, "checkcharge");
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