package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderdetailsExample() {
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

        public Criteria andOrderdetailsidIsNull() {
            addCriterion("orderDetailsId is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidIsNotNull() {
            addCriterion("orderDetailsId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidEqualTo(Integer value) {
            addCriterion("orderDetailsId =", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidNotEqualTo(Integer value) {
            addCriterion("orderDetailsId <>", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidGreaterThan(Integer value) {
            addCriterion("orderDetailsId >", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderDetailsId >=", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidLessThan(Integer value) {
            addCriterion("orderDetailsId <", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("orderDetailsId <=", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidIn(List<Integer> values) {
            addCriterion("orderDetailsId in", values, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidNotIn(List<Integer> values) {
            addCriterion("orderDetailsId not in", values, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidBetween(Integer value1, Integer value2) {
            addCriterion("orderDetailsId between", value1, value2, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderDetailsId not between", value1, value2, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
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

        public Criteria andDrugamountIsNull() {
            addCriterion("drugAmount is null");
            return (Criteria) this;
        }

        public Criteria andDrugamountIsNotNull() {
            addCriterion("drugAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDrugamountEqualTo(Integer value) {
            addCriterion("drugAmount =", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountNotEqualTo(Integer value) {
            addCriterion("drugAmount <>", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountGreaterThan(Integer value) {
            addCriterion("drugAmount >", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugAmount >=", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountLessThan(Integer value) {
            addCriterion("drugAmount <", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountLessThanOrEqualTo(Integer value) {
            addCriterion("drugAmount <=", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountIn(List<Integer> values) {
            addCriterion("drugAmount in", values, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountNotIn(List<Integer> values) {
            addCriterion("drugAmount not in", values, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountBetween(Integer value1, Integer value2) {
            addCriterion("drugAmount between", value1, value2, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountNotBetween(Integer value1, Integer value2) {
            addCriterion("drugAmount not between", value1, value2, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIsNull() {
            addCriterion("drugPrice is null");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIsNotNull() {
            addCriterion("drugPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugpriceEqualTo(Double value) {
            addCriterion("drugPrice =", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotEqualTo(Double value) {
            addCriterion("drugPrice <>", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThan(Double value) {
            addCriterion("drugPrice >", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("drugPrice >=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThan(Double value) {
            addCriterion("drugPrice <", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThanOrEqualTo(Double value) {
            addCriterion("drugPrice <=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIn(List<Double> values) {
            addCriterion("drugPrice in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotIn(List<Double> values) {
            addCriterion("drugPrice not in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceBetween(Double value1, Double value2) {
            addCriterion("drugPrice between", value1, value2, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotBetween(Double value1, Double value2) {
            addCriterion("drugPrice not between", value1, value2, "drugprice");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("batchNumber is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("batchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("batchNumber =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("batchNumber <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("batchNumber >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("batchNumber >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("batchNumber <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("batchNumber <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("batchNumber like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("batchNumber not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("batchNumber in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("batchNumber not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("batchNumber between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("batchNumber not between", value1, value2, "batchnumber");
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