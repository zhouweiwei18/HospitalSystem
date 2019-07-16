package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class GenerateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GenerateExample() {
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

        public Criteria andReceiptIsNull() {
            addCriterion("receipt is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNotNull() {
            addCriterion("receipt is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEqualTo(Integer value) {
            addCriterion("receipt =", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotEqualTo(Integer value) {
            addCriterion("receipt <>", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThan(Integer value) {
            addCriterion("receipt >", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt >=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThan(Integer value) {
            addCriterion("receipt <", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThanOrEqualTo(Integer value) {
            addCriterion("receipt <=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptIn(List<Integer> values) {
            addCriterion("receipt in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotIn(List<Integer> values) {
            addCriterion("receipt not in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptBetween(Integer value1, Integer value2) {
            addCriterion("receipt between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt not between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIsNull() {
            addCriterion("prescription is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIsNotNull() {
            addCriterion("prescription is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionEqualTo(Integer value) {
            addCriterion("prescription =", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotEqualTo(Integer value) {
            addCriterion("prescription <>", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGreaterThan(Integer value) {
            addCriterion("prescription >", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescription >=", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionLessThan(Integer value) {
            addCriterion("prescription <", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionLessThanOrEqualTo(Integer value) {
            addCriterion("prescription <=", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIn(List<Integer> values) {
            addCriterion("prescription in", values, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotIn(List<Integer> values) {
            addCriterion("prescription not in", values, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionBetween(Integer value1, Integer value2) {
            addCriterion("prescription between", value1, value2, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotBetween(Integer value1, Integer value2) {
            addCriterion("prescription not between", value1, value2, "prescription");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNull() {
            addCriterion("serialNumber is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNotNull() {
            addCriterion("serialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberEqualTo(Integer value) {
            addCriterion("serialNumber =", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotEqualTo(Integer value) {
            addCriterion("serialNumber <>", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThan(Integer value) {
            addCriterion("serialNumber >", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("serialNumber >=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThan(Integer value) {
            addCriterion("serialNumber <", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThanOrEqualTo(Integer value) {
            addCriterion("serialNumber <=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIn(List<Integer> values) {
            addCriterion("serialNumber in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotIn(List<Integer> values) {
            addCriterion("serialNumber not in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberBetween(Integer value1, Integer value2) {
            addCriterion("serialNumber between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("serialNumber not between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andGenerateIsNull() {
            addCriterion("generate is null");
            return (Criteria) this;
        }

        public Criteria andGenerateIsNotNull() {
            addCriterion("generate is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateEqualTo(Integer value) {
            addCriterion("generate =", value, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateNotEqualTo(Integer value) {
            addCriterion("generate <>", value, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateGreaterThan(Integer value) {
            addCriterion("generate >", value, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateGreaterThanOrEqualTo(Integer value) {
            addCriterion("generate >=", value, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateLessThan(Integer value) {
            addCriterion("generate <", value, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateLessThanOrEqualTo(Integer value) {
            addCriterion("generate <=", value, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateIn(List<Integer> values) {
            addCriterion("generate in", values, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateNotIn(List<Integer> values) {
            addCriterion("generate not in", values, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateBetween(Integer value1, Integer value2) {
            addCriterion("generate between", value1, value2, "generate");
            return (Criteria) this;
        }

        public Criteria andGenerateNotBetween(Integer value1, Integer value2) {
            addCriterion("generate not between", value1, value2, "generate");
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