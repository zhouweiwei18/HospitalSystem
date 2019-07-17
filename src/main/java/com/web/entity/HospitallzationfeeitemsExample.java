package com.web.entity;

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

        public Criteria andPrescriptionnoIsNull() {
            addCriterion("prescriptionNo is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoIsNotNull() {
            addCriterion("prescriptionNo is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoEqualTo(Integer value) {
            addCriterion("prescriptionNo =", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoNotEqualTo(Integer value) {
            addCriterion("prescriptionNo <>", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoGreaterThan(Integer value) {
            addCriterion("prescriptionNo >", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescriptionNo >=", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoLessThan(Integer value) {
            addCriterion("prescriptionNo <", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoLessThanOrEqualTo(Integer value) {
            addCriterion("prescriptionNo <=", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoIn(List<Integer> values) {
            addCriterion("prescriptionNo in", values, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoNotIn(List<Integer> values) {
            addCriterion("prescriptionNo not in", values, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionNo between", value1, value2, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoNotBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionNo not between", value1, value2, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidIsNull() {
            addCriterion("hospitalizationId is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidIsNotNull() {
            addCriterion("hospitalizationId is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidEqualTo(Integer value) {
            addCriterion("hospitalizationId =", value, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidNotEqualTo(Integer value) {
            addCriterion("hospitalizationId <>", value, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidGreaterThan(Integer value) {
            addCriterion("hospitalizationId >", value, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationId >=", value, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidLessThan(Integer value) {
            addCriterion("hospitalizationId <", value, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationId <=", value, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidIn(List<Integer> values) {
            addCriterion("hospitalizationId in", values, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidNotIn(List<Integer> values) {
            addCriterion("hospitalizationId not in", values, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationId between", value1, value2, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationId not between", value1, value2, "hospitalizationid");
            return (Criteria) this;
        }

        public Criteria andReceivabledateIsNull() {
            addCriterion("receivableDate is null");
            return (Criteria) this;
        }

        public Criteria andReceivabledateIsNotNull() {
            addCriterion("receivableDate is not null");
            return (Criteria) this;
        }

        public Criteria andReceivabledateEqualTo(String value) {
            addCriterion("receivableDate =", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateNotEqualTo(String value) {
            addCriterion("receivableDate <>", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateGreaterThan(String value) {
            addCriterion("receivableDate >", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateGreaterThanOrEqualTo(String value) {
            addCriterion("receivableDate >=", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateLessThan(String value) {
            addCriterion("receivableDate <", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateLessThanOrEqualTo(String value) {
            addCriterion("receivableDate <=", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateLike(String value) {
            addCriterion("receivableDate like", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateNotLike(String value) {
            addCriterion("receivableDate not like", value, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateIn(List<String> values) {
            addCriterion("receivableDate in", values, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateNotIn(List<String> values) {
            addCriterion("receivableDate not in", values, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateBetween(String value1, String value2) {
            addCriterion("receivableDate between", value1, value2, "receivabledate");
            return (Criteria) this;
        }

        public Criteria andReceivabledateNotBetween(String value1, String value2) {
            addCriterion("receivableDate not between", value1, value2, "receivabledate");
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