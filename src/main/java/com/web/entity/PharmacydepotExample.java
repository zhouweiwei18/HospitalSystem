package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class PharmacydepotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PharmacydepotExample() {
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

        public Criteria andPharmacydepotidIsNull() {
            addCriterion("pharmacyDepotId is null");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidIsNotNull() {
            addCriterion("pharmacyDepotId is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidEqualTo(Integer value) {
            addCriterion("pharmacyDepotId =", value, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidNotEqualTo(Integer value) {
            addCriterion("pharmacyDepotId <>", value, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidGreaterThan(Integer value) {
            addCriterion("pharmacyDepotId >", value, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pharmacyDepotId >=", value, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidLessThan(Integer value) {
            addCriterion("pharmacyDepotId <", value, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidLessThanOrEqualTo(Integer value) {
            addCriterion("pharmacyDepotId <=", value, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidIn(List<Integer> values) {
            addCriterion("pharmacyDepotId in", values, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidNotIn(List<Integer> values) {
            addCriterion("pharmacyDepotId not in", values, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidBetween(Integer value1, Integer value2) {
            addCriterion("pharmacyDepotId between", value1, value2, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andPharmacydepotidNotBetween(Integer value1, Integer value2) {
            addCriterion("pharmacyDepotId not between", value1, value2, "pharmacydepotid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNull() {
            addCriterion("receiptId is null");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNotNull() {
            addCriterion("receiptId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptidEqualTo(Integer value) {
            addCriterion("receiptId =", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotEqualTo(Integer value) {
            addCriterion("receiptId <>", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThan(Integer value) {
            addCriterion("receiptId >", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiptId >=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThan(Integer value) {
            addCriterion("receiptId <", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThanOrEqualTo(Integer value) {
            addCriterion("receiptId <=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIn(List<Integer> values) {
            addCriterion("receiptId in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotIn(List<Integer> values) {
            addCriterion("receiptId not in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidBetween(Integer value1, Integer value2) {
            addCriterion("receiptId between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiptId not between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidIsNull() {
            addCriterion("chargePersonId is null");
            return (Criteria) this;
        }

        public Criteria andChargepersonidIsNotNull() {
            addCriterion("chargePersonId is not null");
            return (Criteria) this;
        }

        public Criteria andChargepersonidEqualTo(Integer value) {
            addCriterion("chargePersonId =", value, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidNotEqualTo(Integer value) {
            addCriterion("chargePersonId <>", value, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidGreaterThan(Integer value) {
            addCriterion("chargePersonId >", value, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargePersonId >=", value, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidLessThan(Integer value) {
            addCriterion("chargePersonId <", value, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidLessThanOrEqualTo(Integer value) {
            addCriterion("chargePersonId <=", value, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidIn(List<Integer> values) {
            addCriterion("chargePersonId in", values, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidNotIn(List<Integer> values) {
            addCriterion("chargePersonId not in", values, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidBetween(Integer value1, Integer value2) {
            addCriterion("chargePersonId between", value1, value2, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andChargepersonidNotBetween(Integer value1, Integer value2) {
            addCriterion("chargePersonId not between", value1, value2, "chargepersonid");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Double value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Double value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Double value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Double value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Double value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Double> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Double> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Double value1, Double value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Double value1, Double value2) {
            addCriterion("area not between", value1, value2, "area");
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