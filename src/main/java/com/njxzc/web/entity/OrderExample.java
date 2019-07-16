package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderExample() {
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

        public Criteria andOrderitemsIsNull() {
            addCriterion("orderItems is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemsIsNotNull() {
            addCriterion("orderItems is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemsEqualTo(Integer value) {
            addCriterion("orderItems =", value, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsNotEqualTo(Integer value) {
            addCriterion("orderItems <>", value, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsGreaterThan(Integer value) {
            addCriterion("orderItems >", value, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItems >=", value, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsLessThan(Integer value) {
            addCriterion("orderItems <", value, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsLessThanOrEqualTo(Integer value) {
            addCriterion("orderItems <=", value, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsIn(List<Integer> values) {
            addCriterion("orderItems in", values, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsNotIn(List<Integer> values) {
            addCriterion("orderItems not in", values, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsBetween(Integer value1, Integer value2) {
            addCriterion("orderItems between", value1, value2, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderitemsNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItems not between", value1, value2, "orderitems");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("orderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("orderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("orderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("orderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("orderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("orderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("orderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("orderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("orderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("deliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("deliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("deliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("deliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("deliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("deliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("deliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("deliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("deliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("deliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("deliveryDate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andProductionplaceIsNull() {
            addCriterion("productionPlace is null");
            return (Criteria) this;
        }

        public Criteria andProductionplaceIsNotNull() {
            addCriterion("productionPlace is not null");
            return (Criteria) this;
        }

        public Criteria andProductionplaceEqualTo(String value) {
            addCriterion("productionPlace =", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceNotEqualTo(String value) {
            addCriterion("productionPlace <>", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceGreaterThan(String value) {
            addCriterion("productionPlace >", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceGreaterThanOrEqualTo(String value) {
            addCriterion("productionPlace >=", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceLessThan(String value) {
            addCriterion("productionPlace <", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceLessThanOrEqualTo(String value) {
            addCriterion("productionPlace <=", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceLike(String value) {
            addCriterion("productionPlace like", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceNotLike(String value) {
            addCriterion("productionPlace not like", value, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceIn(List<String> values) {
            addCriterion("productionPlace in", values, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceNotIn(List<String> values) {
            addCriterion("productionPlace not in", values, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceBetween(String value1, String value2) {
            addCriterion("productionPlace between", value1, value2, "productionplace");
            return (Criteria) this;
        }

        public Criteria andProductionplaceNotBetween(String value1, String value2) {
            addCriterion("productionPlace not between", value1, value2, "productionplace");
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