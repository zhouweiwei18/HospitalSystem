package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutpatientPhysicianOnDutyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OutpatientPhysicianOnDutyExample() {
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

        public Criteria andOutpatientdoctoridIsNull() {
            addCriterion("outpatientDoctorId is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridIsNotNull() {
            addCriterion("outpatientDoctorId is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridEqualTo(Integer value) {
            addCriterion("outpatientDoctorId =", value, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridNotEqualTo(Integer value) {
            addCriterion("outpatientDoctorId <>", value, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridGreaterThan(Integer value) {
            addCriterion("outpatientDoctorId >", value, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("outpatientDoctorId >=", value, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridLessThan(Integer value) {
            addCriterion("outpatientDoctorId <", value, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("outpatientDoctorId <=", value, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridIn(List<Integer> values) {
            addCriterion("outpatientDoctorId in", values, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridNotIn(List<Integer> values) {
            addCriterion("outpatientDoctorId not in", values, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridBetween(Integer value1, Integer value2) {
            addCriterion("outpatientDoctorId between", value1, value2, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andOutpatientdoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("outpatientDoctorId not between", value1, value2, "outpatientdoctorid");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(Integer value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(Integer value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(Integer value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(Integer value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(Integer value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(Integer value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<Integer> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<Integer> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(Integer value1, Integer value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(Integer value1, Integer value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("doctorId =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("doctorId <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("doctorId >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorId >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("doctorId <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("doctorId <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("doctorId in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("doctorId not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("doctorId between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorId not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDutydateIsNull() {
            addCriterion("dutyDate is null");
            return (Criteria) this;
        }

        public Criteria andDutydateIsNotNull() {
            addCriterion("dutyDate is not null");
            return (Criteria) this;
        }

        public Criteria andDutydateEqualTo(Date value) {
            addCriterion("dutyDate =", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateNotEqualTo(Date value) {
            addCriterion("dutyDate <>", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateGreaterThan(Date value) {
            addCriterion("dutyDate >", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateGreaterThanOrEqualTo(Date value) {
            addCriterion("dutyDate >=", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateLessThan(Date value) {
            addCriterion("dutyDate <", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateLessThanOrEqualTo(Date value) {
            addCriterion("dutyDate <=", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateIn(List<Date> values) {
            addCriterion("dutyDate in", values, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateNotIn(List<Date> values) {
            addCriterion("dutyDate not in", values, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateBetween(Date value1, Date value2) {
            addCriterion("dutyDate between", value1, value2, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateNotBetween(Date value1, Date value2) {
            addCriterion("dutyDate not between", value1, value2, "dutydate");
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