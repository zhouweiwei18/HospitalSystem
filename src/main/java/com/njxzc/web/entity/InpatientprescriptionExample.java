package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class InpatientprescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InpatientprescriptionExample() {
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

        public Criteria andCaseidIsNull() {
            addCriterion("caseId is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("caseId is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(Integer value) {
            addCriterion("caseId =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(Integer value) {
            addCriterion("caseId <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(Integer value) {
            addCriterion("caseId >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caseId >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(Integer value) {
            addCriterion("caseId <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(Integer value) {
            addCriterion("caseId <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<Integer> values) {
            addCriterion("caseId in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<Integer> values) {
            addCriterion("caseId not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(Integer value1, Integer value2) {
            addCriterion("caseId between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("caseId not between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentIsNull() {
            addCriterion("prescriptionContent is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentIsNotNull() {
            addCriterion("prescriptionContent is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentEqualTo(String value) {
            addCriterion("prescriptionContent =", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentNotEqualTo(String value) {
            addCriterion("prescriptionContent <>", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentGreaterThan(String value) {
            addCriterion("prescriptionContent >", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("prescriptionContent >=", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentLessThan(String value) {
            addCriterion("prescriptionContent <", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentLessThanOrEqualTo(String value) {
            addCriterion("prescriptionContent <=", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentLike(String value) {
            addCriterion("prescriptionContent like", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentNotLike(String value) {
            addCriterion("prescriptionContent not like", value, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentIn(List<String> values) {
            addCriterion("prescriptionContent in", values, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentNotIn(List<String> values) {
            addCriterion("prescriptionContent not in", values, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentBetween(String value1, String value2) {
            addCriterion("prescriptionContent between", value1, value2, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncontentNotBetween(String value1, String value2) {
            addCriterion("prescriptionContent not between", value1, value2, "prescriptioncontent");
            return (Criteria) this;
        }

        public Criteria andResidentsIsNull() {
            addCriterion("residents is null");
            return (Criteria) this;
        }

        public Criteria andResidentsIsNotNull() {
            addCriterion("residents is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsEqualTo(Integer value) {
            addCriterion("residents =", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsNotEqualTo(Integer value) {
            addCriterion("residents <>", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsGreaterThan(Integer value) {
            addCriterion("residents >", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("residents >=", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsLessThan(Integer value) {
            addCriterion("residents <", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsLessThanOrEqualTo(Integer value) {
            addCriterion("residents <=", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsIn(List<Integer> values) {
            addCriterion("residents in", values, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsNotIn(List<Integer> values) {
            addCriterion("residents not in", values, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsBetween(Integer value1, Integer value2) {
            addCriterion("residents between", value1, value2, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsNotBetween(Integer value1, Integer value2) {
            addCriterion("residents not between", value1, value2, "residents");
            return (Criteria) this;
        }

        public Criteria andPatientIsNull() {
            addCriterion("patient is null");
            return (Criteria) this;
        }

        public Criteria andPatientIsNotNull() {
            addCriterion("patient is not null");
            return (Criteria) this;
        }

        public Criteria andPatientEqualTo(Integer value) {
            addCriterion("patient =", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotEqualTo(Integer value) {
            addCriterion("patient <>", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientGreaterThan(Integer value) {
            addCriterion("patient >", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient >=", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLessThan(Integer value) {
            addCriterion("patient <", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLessThanOrEqualTo(Integer value) {
            addCriterion("patient <=", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientIn(List<Integer> values) {
            addCriterion("patient in", values, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotIn(List<Integer> values) {
            addCriterion("patient not in", values, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientBetween(Integer value1, Integer value2) {
            addCriterion("patient between", value1, value2, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotBetween(Integer value1, Integer value2) {
            addCriterion("patient not between", value1, value2, "patient");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(Integer value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(Integer value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(Integer value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(Integer value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(Integer value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<Integer> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<Integer> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(Integer value1, Integer value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(Integer value1, Integer value2) {
            addCriterion("note not between", value1, value2, "note");
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