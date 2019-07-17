package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DrugsExample() {
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

        public Criteria andDrugsidIsNull() {
            addCriterion("drugsId is null");
            return (Criteria) this;
        }

        public Criteria andDrugsidIsNotNull() {
            addCriterion("drugsId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsidEqualTo(Integer value) {
            addCriterion("drugsId =", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotEqualTo(Integer value) {
            addCriterion("drugsId <>", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThan(Integer value) {
            addCriterion("drugsId >", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsId >=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThan(Integer value) {
            addCriterion("drugsId <", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThanOrEqualTo(Integer value) {
            addCriterion("drugsId <=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidIn(List<Integer> values) {
            addCriterion("drugsId in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotIn(List<Integer> values) {
            addCriterion("drugsId not in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidBetween(Integer value1, Integer value2) {
            addCriterion("drugsId between", value1, value2, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsId not between", value1, value2, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIsNull() {
            addCriterion("drugStorageid is null");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIsNotNull() {
            addCriterion("drugStorageid is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidEqualTo(Integer value) {
            addCriterion("drugStorageid =", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotEqualTo(Integer value) {
            addCriterion("drugStorageid <>", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidGreaterThan(Integer value) {
            addCriterion("drugStorageid >", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugStorageid >=", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidLessThan(Integer value) {
            addCriterion("drugStorageid <", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidLessThanOrEqualTo(Integer value) {
            addCriterion("drugStorageid <=", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIn(List<Integer> values) {
            addCriterion("drugStorageid in", values, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotIn(List<Integer> values) {
            addCriterion("drugStorageid not in", values, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidBetween(Integer value1, Integer value2) {
            addCriterion("drugStorageid between", value1, value2, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugStorageid not between", value1, value2, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugsnameIsNull() {
            addCriterion("drugsName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsnameIsNotNull() {
            addCriterion("drugsName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsnameEqualTo(String value) {
            addCriterion("drugsName =", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotEqualTo(String value) {
            addCriterion("drugsName <>", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameGreaterThan(String value) {
            addCriterion("drugsName >", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameGreaterThanOrEqualTo(String value) {
            addCriterion("drugsName >=", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameLessThan(String value) {
            addCriterion("drugsName <", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameLessThanOrEqualTo(String value) {
            addCriterion("drugsName <=", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameLike(String value) {
            addCriterion("drugsName like", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotLike(String value) {
            addCriterion("drugsName not like", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameIn(List<String> values) {
            addCriterion("drugsName in", values, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotIn(List<String> values) {
            addCriterion("drugsName not in", values, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameBetween(String value1, String value2) {
            addCriterion("drugsName between", value1, value2, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotBetween(String value1, String value2) {
            addCriterion("drugsName not between", value1, value2, "drugsname");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andManufacturedateIsNull() {
            addCriterion("manufactureDate is null");
            return (Criteria) this;
        }

        public Criteria andManufacturedateIsNotNull() {
            addCriterion("manufactureDate is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturedateEqualTo(String value) {
            addCriterion("manufactureDate =", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotEqualTo(String value) {
            addCriterion("manufactureDate <>", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateGreaterThan(String value) {
            addCriterion("manufactureDate >", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateGreaterThanOrEqualTo(String value) {
            addCriterion("manufactureDate >=", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateLessThan(String value) {
            addCriterion("manufactureDate <", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateLessThanOrEqualTo(String value) {
            addCriterion("manufactureDate <=", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateLike(String value) {
            addCriterion("manufactureDate like", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotLike(String value) {
            addCriterion("manufactureDate not like", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateIn(List<String> values) {
            addCriterion("manufactureDate in", values, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotIn(List<String> values) {
            addCriterion("manufactureDate not in", values, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateBetween(String value1, String value2) {
            addCriterion("manufactureDate between", value1, value2, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotBetween(String value1, String value2) {
            addCriterion("manufactureDate not between", value1, value2, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeIsNull() {
            addCriterion("guaranteeTime is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeIsNotNull() {
            addCriterion("guaranteeTime is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeEqualTo(String value) {
            addCriterion("guaranteeTime =", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeNotEqualTo(String value) {
            addCriterion("guaranteeTime <>", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeGreaterThan(String value) {
            addCriterion("guaranteeTime >", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeGreaterThanOrEqualTo(String value) {
            addCriterion("guaranteeTime >=", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeLessThan(String value) {
            addCriterion("guaranteeTime <", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeLessThanOrEqualTo(String value) {
            addCriterion("guaranteeTime <=", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeLike(String value) {
            addCriterion("guaranteeTime like", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeNotLike(String value) {
            addCriterion("guaranteeTime not like", value, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeIn(List<String> values) {
            addCriterion("guaranteeTime in", values, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeNotIn(List<String> values) {
            addCriterion("guaranteeTime not in", values, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeBetween(String value1, String value2) {
            addCriterion("guaranteeTime between", value1, value2, "guaranteetime");
            return (Criteria) this;
        }

        public Criteria andGuaranteetimeNotBetween(String value1, String value2) {
            addCriterion("guaranteeTime not between", value1, value2, "guaranteetime");
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