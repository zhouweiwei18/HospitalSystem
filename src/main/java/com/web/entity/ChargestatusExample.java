package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class ChargestatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ChargestatusExample() {
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

        public Criteria andChargestatusidIsNull() {
            addCriterion("chargeStatusId is null");
            return (Criteria) this;
        }

        public Criteria andChargestatusidIsNotNull() {
            addCriterion("chargeStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andChargestatusidEqualTo(Integer value) {
            addCriterion("chargeStatusId =", value, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidNotEqualTo(Integer value) {
            addCriterion("chargeStatusId <>", value, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidGreaterThan(Integer value) {
            addCriterion("chargeStatusId >", value, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeStatusId >=", value, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidLessThan(Integer value) {
            addCriterion("chargeStatusId <", value, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidLessThanOrEqualTo(Integer value) {
            addCriterion("chargeStatusId <=", value, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidIn(List<Integer> values) {
            addCriterion("chargeStatusId in", values, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidNotIn(List<Integer> values) {
            addCriterion("chargeStatusId not in", values, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidBetween(Integer value1, Integer value2) {
            addCriterion("chargeStatusId between", value1, value2, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargestatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeStatusId not between", value1, value2, "chargestatusid");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoIsNull() {
            addCriterion("chargeItemNo is null");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoIsNotNull() {
            addCriterion("chargeItemNo is not null");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoEqualTo(Integer value) {
            addCriterion("chargeItemNo =", value, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoNotEqualTo(Integer value) {
            addCriterion("chargeItemNo <>", value, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoGreaterThan(Integer value) {
            addCriterion("chargeItemNo >", value, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeItemNo >=", value, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoLessThan(Integer value) {
            addCriterion("chargeItemNo <", value, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoLessThanOrEqualTo(Integer value) {
            addCriterion("chargeItemNo <=", value, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoIn(List<Integer> values) {
            addCriterion("chargeItemNo in", values, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoNotIn(List<Integer> values) {
            addCriterion("chargeItemNo not in", values, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoBetween(Integer value1, Integer value2) {
            addCriterion("chargeItemNo between", value1, value2, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeitemnoNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeItemNo not between", value1, value2, "chargeitemno");
            return (Criteria) this;
        }

        public Criteria andChargeamountIsNull() {
            addCriterion("chargeAmount is null");
            return (Criteria) this;
        }

        public Criteria andChargeamountIsNotNull() {
            addCriterion("chargeAmount is not null");
            return (Criteria) this;
        }

        public Criteria andChargeamountEqualTo(Integer value) {
            addCriterion("chargeAmount =", value, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountNotEqualTo(Integer value) {
            addCriterion("chargeAmount <>", value, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountGreaterThan(Integer value) {
            addCriterion("chargeAmount >", value, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeAmount >=", value, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountLessThan(Integer value) {
            addCriterion("chargeAmount <", value, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountLessThanOrEqualTo(Integer value) {
            addCriterion("chargeAmount <=", value, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountIn(List<Integer> values) {
            addCriterion("chargeAmount in", values, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountNotIn(List<Integer> values) {
            addCriterion("chargeAmount not in", values, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountBetween(Integer value1, Integer value2) {
            addCriterion("chargeAmount between", value1, value2, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andChargeamountNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeAmount not between", value1, value2, "chargeamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountIsNull() {
            addCriterion("settleAmount is null");
            return (Criteria) this;
        }

        public Criteria andSettleamountIsNotNull() {
            addCriterion("settleAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSettleamountEqualTo(Double value) {
            addCriterion("settleAmount =", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotEqualTo(Double value) {
            addCriterion("settleAmount <>", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountGreaterThan(Double value) {
            addCriterion("settleAmount >", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountGreaterThanOrEqualTo(Double value) {
            addCriterion("settleAmount >=", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountLessThan(Double value) {
            addCriterion("settleAmount <", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountLessThanOrEqualTo(Double value) {
            addCriterion("settleAmount <=", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountIn(List<Double> values) {
            addCriterion("settleAmount in", values, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotIn(List<Double> values) {
            addCriterion("settleAmount not in", values, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountBetween(Double value1, Double value2) {
            addCriterion("settleAmount between", value1, value2, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotBetween(Double value1, Double value2) {
            addCriterion("settleAmount not between", value1, value2, "settleamount");
            return (Criteria) this;
        }

        public Criteria andCashierIsNull() {
            addCriterion("cashier is null");
            return (Criteria) this;
        }

        public Criteria andCashierIsNotNull() {
            addCriterion("cashier is not null");
            return (Criteria) this;
        }

        public Criteria andCashierEqualTo(Integer value) {
            addCriterion("cashier =", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotEqualTo(Integer value) {
            addCriterion("cashier <>", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThan(Integer value) {
            addCriterion("cashier >", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashier >=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThan(Integer value) {
            addCriterion("cashier <", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThanOrEqualTo(Integer value) {
            addCriterion("cashier <=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierIn(List<Integer> values) {
            addCriterion("cashier in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotIn(List<Integer> values) {
            addCriterion("cashier not in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierBetween(Integer value1, Integer value2) {
            addCriterion("cashier between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotBetween(Integer value1, Integer value2) {
            addCriterion("cashier not between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNull() {
            addCriterion("patientId is null");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNotNull() {
            addCriterion("patientId is not null");
            return (Criteria) this;
        }

        public Criteria andPatientidEqualTo(Integer value) {
            addCriterion("patientId =", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotEqualTo(Integer value) {
            addCriterion("patientId <>", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThan(Integer value) {
            addCriterion("patientId >", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientId >=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThan(Integer value) {
            addCriterion("patientId <", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThanOrEqualTo(Integer value) {
            addCriterion("patientId <=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidIn(List<Integer> values) {
            addCriterion("patientId in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotIn(List<Integer> values) {
            addCriterion("patientId not in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidBetween(Integer value1, Integer value2) {
            addCriterion("patientId between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotBetween(Integer value1, Integer value2) {
            addCriterion("patientId not between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusIsNull() {
            addCriterion("checkoutStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusIsNotNull() {
            addCriterion("checkoutStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusEqualTo(String value) {
            addCriterion("checkoutStatus =", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusNotEqualTo(String value) {
            addCriterion("checkoutStatus <>", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusGreaterThan(String value) {
            addCriterion("checkoutStatus >", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusGreaterThanOrEqualTo(String value) {
            addCriterion("checkoutStatus >=", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusLessThan(String value) {
            addCriterion("checkoutStatus <", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusLessThanOrEqualTo(String value) {
            addCriterion("checkoutStatus <=", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusLike(String value) {
            addCriterion("checkoutStatus like", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusNotLike(String value) {
            addCriterion("checkoutStatus not like", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusIn(List<String> values) {
            addCriterion("checkoutStatus in", values, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusNotIn(List<String> values) {
            addCriterion("checkoutStatus not in", values, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusBetween(String value1, String value2) {
            addCriterion("checkoutStatus between", value1, value2, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusNotBetween(String value1, String value2) {
            addCriterion("checkoutStatus not between", value1, value2, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andIstransferIsNull() {
            addCriterion("isTransfer is null");
            return (Criteria) this;
        }

        public Criteria andIstransferIsNotNull() {
            addCriterion("isTransfer is not null");
            return (Criteria) this;
        }

        public Criteria andIstransferEqualTo(String value) {
            addCriterion("isTransfer =", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotEqualTo(String value) {
            addCriterion("isTransfer <>", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferGreaterThan(String value) {
            addCriterion("isTransfer >", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferGreaterThanOrEqualTo(String value) {
            addCriterion("isTransfer >=", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferLessThan(String value) {
            addCriterion("isTransfer <", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferLessThanOrEqualTo(String value) {
            addCriterion("isTransfer <=", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferLike(String value) {
            addCriterion("isTransfer like", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotLike(String value) {
            addCriterion("isTransfer not like", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferIn(List<String> values) {
            addCriterion("isTransfer in", values, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotIn(List<String> values) {
            addCriterion("isTransfer not in", values, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferBetween(String value1, String value2) {
            addCriterion("isTransfer between", value1, value2, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotBetween(String value1, String value2) {
            addCriterion("isTransfer not between", value1, value2, "istransfer");
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