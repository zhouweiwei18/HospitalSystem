package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class HospitalizationcheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HospitalizationcheckExample() {
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

        public Criteria andHospitalizationchecknoIsNull() {
            addCriterion("hospitalizationCheckNo is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoIsNotNull() {
            addCriterion("hospitalizationCheckNo is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoEqualTo(Integer value) {
            addCriterion("hospitalizationCheckNo =", value, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoNotEqualTo(Integer value) {
            addCriterion("hospitalizationCheckNo <>", value, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoGreaterThan(Integer value) {
            addCriterion("hospitalizationCheckNo >", value, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationCheckNo >=", value, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoLessThan(Integer value) {
            addCriterion("hospitalizationCheckNo <", value, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationCheckNo <=", value, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoIn(List<Integer> values) {
            addCriterion("hospitalizationCheckNo in", values, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoNotIn(List<Integer> values) {
            addCriterion("hospitalizationCheckNo not in", values, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationCheckNo between", value1, value2, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationchecknoNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationCheckNo not between", value1, value2, "hospitalizationcheckno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidIsNull() {
            addCriterion("hospitalizationAdviceId is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidIsNotNull() {
            addCriterion("hospitalizationAdviceId is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId =", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidNotEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId <>", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidGreaterThan(Integer value) {
            addCriterion("hospitalizationAdviceId >", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId >=", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidLessThan(Integer value) {
            addCriterion("hospitalizationAdviceId <", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId <=", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidIn(List<Integer> values) {
            addCriterion("hospitalizationAdviceId in", values, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidNotIn(List<Integer> values) {
            addCriterion("hospitalizationAdviceId not in", values, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationAdviceId between", value1, value2, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationAdviceId not between", value1, value2, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridIsNull() {
            addCriterion("inspectionDoctorId is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridIsNotNull() {
            addCriterion("inspectionDoctorId is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridEqualTo(Integer value) {
            addCriterion("inspectionDoctorId =", value, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridNotEqualTo(Integer value) {
            addCriterion("inspectionDoctorId <>", value, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridGreaterThan(Integer value) {
            addCriterion("inspectionDoctorId >", value, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionDoctorId >=", value, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridLessThan(Integer value) {
            addCriterion("inspectionDoctorId <", value, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionDoctorId <=", value, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridIn(List<Integer> values) {
            addCriterion("inspectionDoctorId in", values, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridNotIn(List<Integer> values) {
            addCriterion("inspectionDoctorId not in", values, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridBetween(Integer value1, Integer value2) {
            addCriterion("inspectionDoctorId between", value1, value2, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectiondoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionDoctorId not between", value1, value2, "inspectiondoctorid");
            return (Criteria) this;
        }

        public Criteria andInspectionnoIsNull() {
            addCriterion("inspectionNo is null");
            return (Criteria) this;
        }

        public Criteria andInspectionnoIsNotNull() {
            addCriterion("inspectionNo is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionnoEqualTo(Integer value) {
            addCriterion("inspectionNo =", value, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoNotEqualTo(Integer value) {
            addCriterion("inspectionNo <>", value, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoGreaterThan(Integer value) {
            addCriterion("inspectionNo >", value, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionNo >=", value, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoLessThan(Integer value) {
            addCriterion("inspectionNo <", value, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionNo <=", value, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoIn(List<Integer> values) {
            addCriterion("inspectionNo in", values, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoNotIn(List<Integer> values) {
            addCriterion("inspectionNo not in", values, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoBetween(Integer value1, Integer value2) {
            addCriterion("inspectionNo between", value1, value2, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectionnoNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionNo not between", value1, value2, "inspectionno");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNull() {
            addCriterion("inspectionDate is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNotNull() {
            addCriterion("inspectionDate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateEqualTo(String value) {
            addCriterion("inspectionDate =", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotEqualTo(String value) {
            addCriterion("inspectionDate <>", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThan(String value) {
            addCriterion("inspectionDate >", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThanOrEqualTo(String value) {
            addCriterion("inspectionDate >=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThan(String value) {
            addCriterion("inspectionDate <", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThanOrEqualTo(String value) {
            addCriterion("inspectionDate <=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLike(String value) {
            addCriterion("inspectionDate like", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotLike(String value) {
            addCriterion("inspectionDate not like", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIn(List<String> values) {
            addCriterion("inspectionDate in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotIn(List<String> values) {
            addCriterion("inspectionDate not in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateBetween(String value1, String value2) {
            addCriterion("inspectionDate between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotBetween(String value1, String value2) {
            addCriterion("inspectionDate not between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectionresultIsNull() {
            addCriterion("inspectionResult is null");
            return (Criteria) this;
        }

        public Criteria andInspectionresultIsNotNull() {
            addCriterion("inspectionResult is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionresultEqualTo(String value) {
            addCriterion("inspectionResult =", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotEqualTo(String value) {
            addCriterion("inspectionResult <>", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultGreaterThan(String value) {
            addCriterion("inspectionResult >", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultGreaterThanOrEqualTo(String value) {
            addCriterion("inspectionResult >=", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultLessThan(String value) {
            addCriterion("inspectionResult <", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultLessThanOrEqualTo(String value) {
            addCriterion("inspectionResult <=", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultLike(String value) {
            addCriterion("inspectionResult like", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotLike(String value) {
            addCriterion("inspectionResult not like", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultIn(List<String> values) {
            addCriterion("inspectionResult in", values, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotIn(List<String> values) {
            addCriterion("inspectionResult not in", values, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultBetween(String value1, String value2) {
            addCriterion("inspectionResult between", value1, value2, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotBetween(String value1, String value2) {
            addCriterion("inspectionResult not between", value1, value2, "inspectionresult");
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