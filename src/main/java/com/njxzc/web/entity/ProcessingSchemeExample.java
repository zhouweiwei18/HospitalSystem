package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class ProcessingSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProcessingSchemeExample() {
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

        public Criteria andProcessingschemenoIsNull() {
            addCriterion("processingSchemeNo is null");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoIsNotNull() {
            addCriterion("processingSchemeNo is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoEqualTo(Integer value) {
            addCriterion("processingSchemeNo =", value, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoNotEqualTo(Integer value) {
            addCriterion("processingSchemeNo <>", value, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoGreaterThan(Integer value) {
            addCriterion("processingSchemeNo >", value, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("processingSchemeNo >=", value, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoLessThan(Integer value) {
            addCriterion("processingSchemeNo <", value, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoLessThanOrEqualTo(Integer value) {
            addCriterion("processingSchemeNo <=", value, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoIn(List<Integer> values) {
            addCriterion("processingSchemeNo in", values, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoNotIn(List<Integer> values) {
            addCriterion("processingSchemeNo not in", values, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoBetween(Integer value1, Integer value2) {
            addCriterion("processingSchemeNo between", value1, value2, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andProcessingschemenoNotBetween(Integer value1, Integer value2) {
            addCriterion("processingSchemeNo not between", value1, value2, "processingschemeno");
            return (Criteria) this;
        }

        public Criteria andPhysicianidIsNull() {
            addCriterion("physicianId is null");
            return (Criteria) this;
        }

        public Criteria andPhysicianidIsNotNull() {
            addCriterion("physicianId is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicianidEqualTo(Integer value) {
            addCriterion("physicianId =", value, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidNotEqualTo(Integer value) {
            addCriterion("physicianId <>", value, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidGreaterThan(Integer value) {
            addCriterion("physicianId >", value, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("physicianId >=", value, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidLessThan(Integer value) {
            addCriterion("physicianId <", value, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidLessThanOrEqualTo(Integer value) {
            addCriterion("physicianId <=", value, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidIn(List<Integer> values) {
            addCriterion("physicianId in", values, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidNotIn(List<Integer> values) {
            addCriterion("physicianId not in", values, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidBetween(Integer value1, Integer value2) {
            addCriterion("physicianId between", value1, value2, "physicianid");
            return (Criteria) this;
        }

        public Criteria andPhysicianidNotBetween(Integer value1, Integer value2) {
            addCriterion("physicianId not between", value1, value2, "physicianid");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("beginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(String value) {
            addCriterion("beginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(String value) {
            addCriterion("beginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(String value) {
            addCriterion("beginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("beginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(String value) {
            addCriterion("beginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(String value) {
            addCriterion("beginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLike(String value) {
            addCriterion("beginTime like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotLike(String value) {
            addCriterion("beginTime not like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<String> values) {
            addCriterion("beginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<String> values) {
            addCriterion("beginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(String value1, String value2) {
            addCriterion("beginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(String value1, String value2) {
            addCriterion("beginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextIsNull() {
            addCriterion("processingSchemeContext is null");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextIsNotNull() {
            addCriterion("processingSchemeContext is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextEqualTo(String value) {
            addCriterion("processingSchemeContext =", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextNotEqualTo(String value) {
            addCriterion("processingSchemeContext <>", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextGreaterThan(String value) {
            addCriterion("processingSchemeContext >", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextGreaterThanOrEqualTo(String value) {
            addCriterion("processingSchemeContext >=", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextLessThan(String value) {
            addCriterion("processingSchemeContext <", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextLessThanOrEqualTo(String value) {
            addCriterion("processingSchemeContext <=", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextLike(String value) {
            addCriterion("processingSchemeContext like", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextNotLike(String value) {
            addCriterion("processingSchemeContext not like", value, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextIn(List<String> values) {
            addCriterion("processingSchemeContext in", values, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextNotIn(List<String> values) {
            addCriterion("processingSchemeContext not in", values, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextBetween(String value1, String value2) {
            addCriterion("processingSchemeContext between", value1, value2, "processingschemecontext");
            return (Criteria) this;
        }

        public Criteria andProcessingschemecontextNotBetween(String value1, String value2) {
            addCriterion("processingSchemeContext not between", value1, value2, "processingschemecontext");
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