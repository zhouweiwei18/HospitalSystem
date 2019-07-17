package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class OutpatientMedicalRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OutpatientMedicalRecordExample() {
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

        public Criteria andMedicalrecordnoIsNull() {
            addCriterion("medicalRecordNo is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoIsNotNull() {
            addCriterion("medicalRecordNo is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoEqualTo(Integer value) {
            addCriterion("medicalRecordNo =", value, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoNotEqualTo(Integer value) {
            addCriterion("medicalRecordNo <>", value, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoGreaterThan(Integer value) {
            addCriterion("medicalRecordNo >", value, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordNo >=", value, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoLessThan(Integer value) {
            addCriterion("medicalRecordNo <", value, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordNo <=", value, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoIn(List<Integer> values) {
            addCriterion("medicalRecordNo in", values, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoNotIn(List<Integer> values) {
            addCriterion("medicalRecordNo not in", values, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordNo between", value1, value2, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordnoNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordNo not between", value1, value2, "medicalrecordno");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNull() {
            addCriterion("registerId is null");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNotNull() {
            addCriterion("registerId is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteridEqualTo(Integer value) {
            addCriterion("registerId =", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotEqualTo(Integer value) {
            addCriterion("registerId <>", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThan(Integer value) {
            addCriterion("registerId >", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("registerId >=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThan(Integer value) {
            addCriterion("registerId <", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThanOrEqualTo(Integer value) {
            addCriterion("registerId <=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridIn(List<Integer> values) {
            addCriterion("registerId in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotIn(List<Integer> values) {
            addCriterion("registerId not in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridBetween(Integer value1, Integer value2) {
            addCriterion("registerId between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotBetween(Integer value1, Integer value2) {
            addCriterion("registerId not between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andPhysicianIsNull() {
            addCriterion("physician is null");
            return (Criteria) this;
        }

        public Criteria andPhysicianIsNotNull() {
            addCriterion("physician is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicianEqualTo(Integer value) {
            addCriterion("physician =", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianNotEqualTo(Integer value) {
            addCriterion("physician <>", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianGreaterThan(Integer value) {
            addCriterion("physician >", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianGreaterThanOrEqualTo(Integer value) {
            addCriterion("physician >=", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianLessThan(Integer value) {
            addCriterion("physician <", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianLessThanOrEqualTo(Integer value) {
            addCriterion("physician <=", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianIn(List<Integer> values) {
            addCriterion("physician in", values, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianNotIn(List<Integer> values) {
            addCriterion("physician not in", values, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianBetween(Integer value1, Integer value2) {
            addCriterion("physician between", value1, value2, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianNotBetween(Integer value1, Integer value2) {
            addCriterion("physician not between", value1, value2, "physician");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeIsNull() {
            addCriterion("diagnosticTime is null");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeIsNotNull() {
            addCriterion("diagnosticTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeEqualTo(String value) {
            addCriterion("diagnosticTime =", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeNotEqualTo(String value) {
            addCriterion("diagnosticTime <>", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeGreaterThan(String value) {
            addCriterion("diagnosticTime >", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosticTime >=", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeLessThan(String value) {
            addCriterion("diagnosticTime <", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeLessThanOrEqualTo(String value) {
            addCriterion("diagnosticTime <=", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeLike(String value) {
            addCriterion("diagnosticTime like", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeNotLike(String value) {
            addCriterion("diagnosticTime not like", value, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeIn(List<String> values) {
            addCriterion("diagnosticTime in", values, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeNotIn(List<String> values) {
            addCriterion("diagnosticTime not in", values, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeBetween(String value1, String value2) {
            addCriterion("diagnosticTime between", value1, value2, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andDiagnostictimeNotBetween(String value1, String value2) {
            addCriterion("diagnosticTime not between", value1, value2, "diagnostictime");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentIsNull() {
            addCriterion("medicalRecordContent is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentIsNotNull() {
            addCriterion("medicalRecordContent is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentEqualTo(String value) {
            addCriterion("medicalRecordContent =", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentNotEqualTo(String value) {
            addCriterion("medicalRecordContent <>", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentGreaterThan(String value) {
            addCriterion("medicalRecordContent >", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentGreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecordContent >=", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentLessThan(String value) {
            addCriterion("medicalRecordContent <", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentLessThanOrEqualTo(String value) {
            addCriterion("medicalRecordContent <=", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentLike(String value) {
            addCriterion("medicalRecordContent like", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentNotLike(String value) {
            addCriterion("medicalRecordContent not like", value, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentIn(List<String> values) {
            addCriterion("medicalRecordContent in", values, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentNotIn(List<String> values) {
            addCriterion("medicalRecordContent not in", values, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentBetween(String value1, String value2) {
            addCriterion("medicalRecordContent between", value1, value2, "medicalrecordcontent");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordcontentNotBetween(String value1, String value2) {
            addCriterion("medicalRecordContent not between", value1, value2, "medicalrecordcontent");
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