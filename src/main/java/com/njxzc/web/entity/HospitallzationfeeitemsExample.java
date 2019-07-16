package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class HospitallzationfeeitemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HospitallzationfeeitemsExample() {
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

        public Criteria andProjecdidIsNull() {
            addCriterion("projecdId is null");
            return (Criteria) this;
        }

        public Criteria andProjecdidIsNotNull() {
            addCriterion("projecdId is not null");
            return (Criteria) this;
        }

        public Criteria andProjecdidEqualTo(Integer value) {
            addCriterion("projecdId =", value, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidNotEqualTo(Integer value) {
            addCriterion("projecdId <>", value, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidGreaterThan(Integer value) {
            addCriterion("projecdId >", value, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projecdId >=", value, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidLessThan(Integer value) {
            addCriterion("projecdId <", value, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidLessThanOrEqualTo(Integer value) {
            addCriterion("projecdId <=", value, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidIn(List<Integer> values) {
            addCriterion("projecdId in", values, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidNotIn(List<Integer> values) {
            addCriterion("projecdId not in", values, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidBetween(Integer value1, Integer value2) {
            addCriterion("projecdId between", value1, value2, "projecdid");
            return (Criteria) this;
        }

        public Criteria andProjecdidNotBetween(Integer value1, Integer value2) {
            addCriterion("projecdId not between", value1, value2, "projecdid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidIsNull() {
            addCriterion("prescriptionid is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidIsNotNull() {
            addCriterion("prescriptionid is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidEqualTo(Integer value) {
            addCriterion("prescriptionid =", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidNotEqualTo(Integer value) {
            addCriterion("prescriptionid <>", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidGreaterThan(Integer value) {
            addCriterion("prescriptionid >", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescriptionid >=", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidLessThan(Integer value) {
            addCriterion("prescriptionid <", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidLessThanOrEqualTo(Integer value) {
            addCriterion("prescriptionid <=", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidIn(List<Integer> values) {
            addCriterion("prescriptionid in", values, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidNotIn(List<Integer> values) {
            addCriterion("prescriptionid not in", values, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionid between", value1, value2, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidNotBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionid not between", value1, value2, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidIsNull() {
            addCriterion("correspondingId is null");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidIsNotNull() {
            addCriterion("correspondingId is not null");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidEqualTo(Integer value) {
            addCriterion("correspondingId =", value, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidNotEqualTo(Integer value) {
            addCriterion("correspondingId <>", value, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidGreaterThan(Integer value) {
            addCriterion("correspondingId >", value, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("correspondingId >=", value, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidLessThan(Integer value) {
            addCriterion("correspondingId <", value, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidLessThanOrEqualTo(Integer value) {
            addCriterion("correspondingId <=", value, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidIn(List<Integer> values) {
            addCriterion("correspondingId in", values, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidNotIn(List<Integer> values) {
            addCriterion("correspondingId not in", values, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidBetween(Integer value1, Integer value2) {
            addCriterion("correspondingId between", value1, value2, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andCorrespondingidNotBetween(Integer value1, Integer value2) {
            addCriterion("correspondingId not between", value1, value2, "correspondingid");
            return (Criteria) this;
        }

        public Criteria andChargetypeIsNull() {
            addCriterion("chargeType is null");
            return (Criteria) this;
        }

        public Criteria andChargetypeIsNotNull() {
            addCriterion("chargeType is not null");
            return (Criteria) this;
        }

        public Criteria andChargetypeEqualTo(Integer value) {
            addCriterion("chargeType =", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeNotEqualTo(Integer value) {
            addCriterion("chargeType <>", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeGreaterThan(Integer value) {
            addCriterion("chargeType >", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeType >=", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeLessThan(Integer value) {
            addCriterion("chargeType <", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeLessThanOrEqualTo(Integer value) {
            addCriterion("chargeType <=", value, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeIn(List<Integer> values) {
            addCriterion("chargeType in", values, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeNotIn(List<Integer> values) {
            addCriterion("chargeType not in", values, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeBetween(Integer value1, Integer value2) {
            addCriterion("chargeType between", value1, value2, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeType not between", value1, value2, "chargetype");
            return (Criteria) this;
        }

        public Criteria andChargemoneyIsNull() {
            addCriterion("chargeMoney is null");
            return (Criteria) this;
        }

        public Criteria andChargemoneyIsNotNull() {
            addCriterion("chargeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andChargemoneyEqualTo(Double value) {
            addCriterion("chargeMoney =", value, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyNotEqualTo(Double value) {
            addCriterion("chargeMoney <>", value, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyGreaterThan(Double value) {
            addCriterion("chargeMoney >", value, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("chargeMoney >=", value, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyLessThan(Double value) {
            addCriterion("chargeMoney <", value, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyLessThanOrEqualTo(Double value) {
            addCriterion("chargeMoney <=", value, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyIn(List<Double> values) {
            addCriterion("chargeMoney in", values, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyNotIn(List<Double> values) {
            addCriterion("chargeMoney not in", values, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyBetween(Double value1, Double value2) {
            addCriterion("chargeMoney between", value1, value2, "chargemoney");
            return (Criteria) this;
        }

        public Criteria andChargemoneyNotBetween(Double value1, Double value2) {
            addCriterion("chargeMoney not between", value1, value2, "chargemoney");
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

        public Criteria andCheckoutstatusIsNull() {
            addCriterion("checkoutStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusIsNotNull() {
            addCriterion("checkoutStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusEqualTo(Integer value) {
            addCriterion("checkoutStatus =", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusNotEqualTo(Integer value) {
            addCriterion("checkoutStatus <>", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusGreaterThan(Integer value) {
            addCriterion("checkoutStatus >", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkoutStatus >=", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusLessThan(Integer value) {
            addCriterion("checkoutStatus <", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusLessThanOrEqualTo(Integer value) {
            addCriterion("checkoutStatus <=", value, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusIn(List<Integer> values) {
            addCriterion("checkoutStatus in", values, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusNotIn(List<Integer> values) {
            addCriterion("checkoutStatus not in", values, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusBetween(Integer value1, Integer value2) {
            addCriterion("checkoutStatus between", value1, value2, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checkoutStatus not between", value1, value2, "checkoutstatus");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyIsNull() {
            addCriterion("checkoutMoney is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyIsNotNull() {
            addCriterion("checkoutMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyEqualTo(Double value) {
            addCriterion("checkoutMoney =", value, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyNotEqualTo(Double value) {
            addCriterion("checkoutMoney <>", value, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyGreaterThan(Double value) {
            addCriterion("checkoutMoney >", value, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("checkoutMoney >=", value, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyLessThan(Double value) {
            addCriterion("checkoutMoney <", value, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyLessThanOrEqualTo(Double value) {
            addCriterion("checkoutMoney <=", value, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyIn(List<Double> values) {
            addCriterion("checkoutMoney in", values, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyNotIn(List<Double> values) {
            addCriterion("checkoutMoney not in", values, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyBetween(Double value1, Double value2) {
            addCriterion("checkoutMoney between", value1, value2, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andCheckoutmoneyNotBetween(Double value1, Double value2) {
            addCriterion("checkoutMoney not between", value1, value2, "checkoutmoney");
            return (Criteria) this;
        }

        public Criteria andTransferornotIsNull() {
            addCriterion("transferOrNot is null");
            return (Criteria) this;
        }

        public Criteria andTransferornotIsNotNull() {
            addCriterion("transferOrNot is not null");
            return (Criteria) this;
        }

        public Criteria andTransferornotEqualTo(Integer value) {
            addCriterion("transferOrNot =", value, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotNotEqualTo(Integer value) {
            addCriterion("transferOrNot <>", value, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotGreaterThan(Integer value) {
            addCriterion("transferOrNot >", value, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotGreaterThanOrEqualTo(Integer value) {
            addCriterion("transferOrNot >=", value, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotLessThan(Integer value) {
            addCriterion("transferOrNot <", value, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotLessThanOrEqualTo(Integer value) {
            addCriterion("transferOrNot <=", value, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotIn(List<Integer> values) {
            addCriterion("transferOrNot in", values, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotNotIn(List<Integer> values) {
            addCriterion("transferOrNot not in", values, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotBetween(Integer value1, Integer value2) {
            addCriterion("transferOrNot between", value1, value2, "transferornot");
            return (Criteria) this;
        }

        public Criteria andTransferornotNotBetween(Integer value1, Integer value2) {
            addCriterion("transferOrNot not between", value1, value2, "transferornot");
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