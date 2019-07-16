package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SupplyExample() {
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

        public Criteria andProductnumberIsNull() {
            addCriterion("productNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductnumberIsNotNull() {
            addCriterion("productNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumberEqualTo(Integer value) {
            addCriterion("productNumber =", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotEqualTo(Integer value) {
            addCriterion("productNumber <>", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThan(Integer value) {
            addCriterion("productNumber >", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("productNumber >=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThan(Integer value) {
            addCriterion("productNumber <", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThanOrEqualTo(Integer value) {
            addCriterion("productNumber <=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberIn(List<Integer> values) {
            addCriterion("productNumber in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotIn(List<Integer> values) {
            addCriterion("productNumber not in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberBetween(Integer value1, Integer value2) {
            addCriterion("productNumber between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("productNumber not between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierId is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierId is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("supplierId =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("supplierId <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("supplierId >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplierId >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("supplierId <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("supplierId <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("supplierId in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("supplierId not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("supplierId between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("supplierId not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplynumberIsNull() {
            addCriterion("supplyNumber is null");
            return (Criteria) this;
        }

        public Criteria andSupplynumberIsNotNull() {
            addCriterion("supplyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSupplynumberEqualTo(Integer value) {
            addCriterion("supplyNumber =", value, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberNotEqualTo(Integer value) {
            addCriterion("supplyNumber <>", value, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberGreaterThan(Integer value) {
            addCriterion("supplyNumber >", value, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplyNumber >=", value, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberLessThan(Integer value) {
            addCriterion("supplyNumber <", value, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberLessThanOrEqualTo(Integer value) {
            addCriterion("supplyNumber <=", value, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberIn(List<Integer> values) {
            addCriterion("supplyNumber in", values, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberNotIn(List<Integer> values) {
            addCriterion("supplyNumber not in", values, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberBetween(Integer value1, Integer value2) {
            addCriterion("supplyNumber between", value1, value2, "supplynumber");
            return (Criteria) this;
        }

        public Criteria andSupplynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("supplyNumber not between", value1, value2, "supplynumber");
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