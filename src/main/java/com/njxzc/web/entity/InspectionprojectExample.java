package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class InspectionprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InspectionprojectExample() {
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

        public Criteria andInspectionnumberIsNull() {
            addCriterion("inspectionNumber is null");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberIsNotNull() {
            addCriterion("inspectionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberEqualTo(Integer value) {
            addCriterion("inspectionNumber =", value, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberNotEqualTo(Integer value) {
            addCriterion("inspectionNumber <>", value, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberGreaterThan(Integer value) {
            addCriterion("inspectionNumber >", value, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionNumber >=", value, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberLessThan(Integer value) {
            addCriterion("inspectionNumber <", value, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionNumber <=", value, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberIn(List<Integer> values) {
            addCriterion("inspectionNumber in", values, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberNotIn(List<Integer> values) {
            addCriterion("inspectionNumber not in", values, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberBetween(Integer value1, Integer value2) {
            addCriterion("inspectionNumber between", value1, value2, "inspectionnumber");
            return (Criteria) this;
        }

        public Criteria andInspectionnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionNumber not between", value1, value2, "inspectionnumber");
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

        public Criteria andInspectionpersonIsNull() {
            addCriterion("inspectionPerson is null");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonIsNotNull() {
            addCriterion("inspectionPerson is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonEqualTo(String value) {
            addCriterion("inspectionPerson =", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonNotEqualTo(String value) {
            addCriterion("inspectionPerson <>", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonGreaterThan(String value) {
            addCriterion("inspectionPerson >", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonGreaterThanOrEqualTo(String value) {
            addCriterion("inspectionPerson >=", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonLessThan(String value) {
            addCriterion("inspectionPerson <", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonLessThanOrEqualTo(String value) {
            addCriterion("inspectionPerson <=", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonLike(String value) {
            addCriterion("inspectionPerson like", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonNotLike(String value) {
            addCriterion("inspectionPerson not like", value, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonIn(List<String> values) {
            addCriterion("inspectionPerson in", values, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonNotIn(List<String> values) {
            addCriterion("inspectionPerson not in", values, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonBetween(String value1, String value2) {
            addCriterion("inspectionPerson between", value1, value2, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andInspectionpersonNotBetween(String value1, String value2) {
            addCriterion("inspectionPerson not between", value1, value2, "inspectionperson");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberIsNull() {
            addCriterion("hospitalizationNumber is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberIsNotNull() {
            addCriterion("hospitalizationNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberEqualTo(Integer value) {
            addCriterion("hospitalizationNumber =", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberNotEqualTo(Integer value) {
            addCriterion("hospitalizationNumber <>", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberGreaterThan(Integer value) {
            addCriterion("hospitalizationNumber >", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationNumber >=", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberLessThan(Integer value) {
            addCriterion("hospitalizationNumber <", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationNumber <=", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberIn(List<Integer> values) {
            addCriterion("hospitalizationNumber in", values, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberNotIn(List<Integer> values) {
            addCriterion("hospitalizationNumber not in", values, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationNumber between", value1, value2, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationNumber not between", value1, value2, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentIsNull() {
            addCriterion("inspectionContent is null");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentIsNotNull() {
            addCriterion("inspectionContent is not null");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentEqualTo(String value) {
            addCriterion("inspectionContent =", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotEqualTo(String value) {
            addCriterion("inspectionContent <>", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentGreaterThan(String value) {
            addCriterion("inspectionContent >", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("inspectionContent >=", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentLessThan(String value) {
            addCriterion("inspectionContent <", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentLessThanOrEqualTo(String value) {
            addCriterion("inspectionContent <=", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentLike(String value) {
            addCriterion("inspectionContent like", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotLike(String value) {
            addCriterion("inspectionContent not like", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentIn(List<String> values) {
            addCriterion("inspectionContent in", values, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotIn(List<String> values) {
            addCriterion("inspectionContent not in", values, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentBetween(String value1, String value2) {
            addCriterion("inspectionContent between", value1, value2, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotBetween(String value1, String value2) {
            addCriterion("inspectionContent not between", value1, value2, "inspectioncontent");
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