package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class ChargeitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ChargeitemExample() {
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

        public Criteria andChargeidIsNull() {
            addCriterion("chargeId is null");
            return (Criteria) this;
        }

        public Criteria andChargeidIsNotNull() {
            addCriterion("chargeId is not null");
            return (Criteria) this;
        }

        public Criteria andChargeidEqualTo(Integer value) {
            addCriterion("chargeId =", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidNotEqualTo(Integer value) {
            addCriterion("chargeId <>", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidGreaterThan(Integer value) {
            addCriterion("chargeId >", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeId >=", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidLessThan(Integer value) {
            addCriterion("chargeId <", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidLessThanOrEqualTo(Integer value) {
            addCriterion("chargeId <=", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidIn(List<Integer> values) {
            addCriterion("chargeId in", values, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidNotIn(List<Integer> values) {
            addCriterion("chargeId not in", values, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidBetween(Integer value1, Integer value2) {
            addCriterion("chargeId between", value1, value2, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeId not between", value1, value2, "chargeid");
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

        public Criteria andMedicinefreeIsNull() {
            addCriterion("medicineFree is null");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeIsNotNull() {
            addCriterion("medicineFree is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeEqualTo(Integer value) {
            addCriterion("medicineFree =", value, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeNotEqualTo(Integer value) {
            addCriterion("medicineFree <>", value, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeGreaterThan(Integer value) {
            addCriterion("medicineFree >", value, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicineFree >=", value, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeLessThan(Integer value) {
            addCriterion("medicineFree <", value, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeLessThanOrEqualTo(Integer value) {
            addCriterion("medicineFree <=", value, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeIn(List<Integer> values) {
            addCriterion("medicineFree in", values, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeNotIn(List<Integer> values) {
            addCriterion("medicineFree not in", values, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeBetween(Integer value1, Integer value2) {
            addCriterion("medicineFree between", value1, value2, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andMedicinefreeNotBetween(Integer value1, Integer value2) {
            addCriterion("medicineFree not between", value1, value2, "medicinefree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeIsNull() {
            addCriterion("inspectionFree is null");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeIsNotNull() {
            addCriterion("inspectionFree is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeEqualTo(Double value) {
            addCriterion("inspectionFree =", value, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeNotEqualTo(Double value) {
            addCriterion("inspectionFree <>", value, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeGreaterThan(Double value) {
            addCriterion("inspectionFree >", value, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeGreaterThanOrEqualTo(Double value) {
            addCriterion("inspectionFree >=", value, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeLessThan(Double value) {
            addCriterion("inspectionFree <", value, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeLessThanOrEqualTo(Double value) {
            addCriterion("inspectionFree <=", value, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeIn(List<Double> values) {
            addCriterion("inspectionFree in", values, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeNotIn(List<Double> values) {
            addCriterion("inspectionFree not in", values, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeBetween(Double value1, Double value2) {
            addCriterion("inspectionFree between", value1, value2, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andInspectionfreeNotBetween(Double value1, Double value2) {
            addCriterion("inspectionFree not between", value1, value2, "inspectionfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeIsNull() {
            addCriterion("checkFree is null");
            return (Criteria) this;
        }

        public Criteria andCheckfreeIsNotNull() {
            addCriterion("checkFree is not null");
            return (Criteria) this;
        }

        public Criteria andCheckfreeEqualTo(Double value) {
            addCriterion("checkFree =", value, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeNotEqualTo(Double value) {
            addCriterion("checkFree <>", value, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeGreaterThan(Double value) {
            addCriterion("checkFree >", value, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeGreaterThanOrEqualTo(Double value) {
            addCriterion("checkFree >=", value, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeLessThan(Double value) {
            addCriterion("checkFree <", value, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeLessThanOrEqualTo(Double value) {
            addCriterion("checkFree <=", value, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeIn(List<Double> values) {
            addCriterion("checkFree in", values, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeNotIn(List<Double> values) {
            addCriterion("checkFree not in", values, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeBetween(Double value1, Double value2) {
            addCriterion("checkFree between", value1, value2, "checkfree");
            return (Criteria) this;
        }

        public Criteria andCheckfreeNotBetween(Double value1, Double value2) {
            addCriterion("checkFree not between", value1, value2, "checkfree");
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