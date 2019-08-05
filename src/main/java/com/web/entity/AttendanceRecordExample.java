package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class AttendanceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AttendanceRecordExample() {
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

        public Criteria andAttdidIsNull() {
            addCriterion("attdId is null");
            return (Criteria) this;
        }

        public Criteria andAttdidIsNotNull() {
            addCriterion("attdId is not null");
            return (Criteria) this;
        }

        public Criteria andAttdidEqualTo(Integer value) {
            addCriterion("attdId =", value, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidNotEqualTo(Integer value) {
            addCriterion("attdId <>", value, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidGreaterThan(Integer value) {
            addCriterion("attdId >", value, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("attdId >=", value, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidLessThan(Integer value) {
            addCriterion("attdId <", value, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidLessThanOrEqualTo(Integer value) {
            addCriterion("attdId <=", value, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidIn(List<Integer> values) {
            addCriterion("attdId in", values, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidNotIn(List<Integer> values) {
            addCriterion("attdId not in", values, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidBetween(Integer value1, Integer value2) {
            addCriterion("attdId between", value1, value2, "attdid");
            return (Criteria) this;
        }

        public Criteria andAttdidNotBetween(Integer value1, Integer value2) {
            addCriterion("attdId not between", value1, value2, "attdid");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNull() {
            addCriterion("workerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNotNull() {
            addCriterion("workerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernameEqualTo(String value) {
            addCriterion("workerName =", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotEqualTo(String value) {
            addCriterion("workerName <>", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThan(String value) {
            addCriterion("workerName >", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThanOrEqualTo(String value) {
            addCriterion("workerName >=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThan(String value) {
            addCriterion("workerName <", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThanOrEqualTo(String value) {
            addCriterion("workerName <=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLike(String value) {
            addCriterion("workerName like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotLike(String value) {
            addCriterion("workerName not like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameIn(List<String> values) {
            addCriterion("workerName in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotIn(List<String> values) {
            addCriterion("workerName not in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameBetween(String value1, String value2) {
            addCriterion("workerName between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotBetween(String value1, String value2) {
            addCriterion("workerName not between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsIsNull() {
            addCriterion("workingConditions is null");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsIsNotNull() {
            addCriterion("workingConditions is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsEqualTo(String value) {
            addCriterion("workingConditions =", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsNotEqualTo(String value) {
            addCriterion("workingConditions <>", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsGreaterThan(String value) {
            addCriterion("workingConditions >", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsGreaterThanOrEqualTo(String value) {
            addCriterion("workingConditions >=", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsLessThan(String value) {
            addCriterion("workingConditions <", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsLessThanOrEqualTo(String value) {
            addCriterion("workingConditions <=", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsLike(String value) {
            addCriterion("workingConditions like", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsNotLike(String value) {
            addCriterion("workingConditions not like", value, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsIn(List<String> values) {
            addCriterion("workingConditions in", values, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsNotIn(List<String> values) {
            addCriterion("workingConditions not in", values, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsBetween(String value1, String value2) {
            addCriterion("workingConditions between", value1, value2, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andWorkingconditionsNotBetween(String value1, String value2) {
            addCriterion("workingConditions not between", value1, value2, "workingconditions");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsIsNull() {
            addCriterion("closingConditionns is null");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsIsNotNull() {
            addCriterion("closingConditionns is not null");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsEqualTo(String value) {
            addCriterion("closingConditionns =", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsNotEqualTo(String value) {
            addCriterion("closingConditionns <>", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsGreaterThan(String value) {
            addCriterion("closingConditionns >", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsGreaterThanOrEqualTo(String value) {
            addCriterion("closingConditionns >=", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsLessThan(String value) {
            addCriterion("closingConditionns <", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsLessThanOrEqualTo(String value) {
            addCriterion("closingConditionns <=", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsLike(String value) {
            addCriterion("closingConditionns like", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsNotLike(String value) {
            addCriterion("closingConditionns not like", value, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsIn(List<String> values) {
            addCriterion("closingConditionns in", values, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsNotIn(List<String> values) {
            addCriterion("closingConditionns not in", values, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsBetween(String value1, String value2) {
            addCriterion("closingConditionns between", value1, value2, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andClosingconditionnsNotBetween(String value1, String value2) {
            addCriterion("closingConditionns not between", value1, value2, "closingconditionns");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
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