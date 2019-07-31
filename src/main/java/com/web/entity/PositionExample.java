package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PositionExample() {
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

        public Criteria andPostnumberIsNull() {
            addCriterion("postNumber is null");
            return (Criteria) this;
        }

        public Criteria andPostnumberIsNotNull() {
            addCriterion("postNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPostnumberEqualTo(Integer value) {
            addCriterion("postNumber =", value, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberNotEqualTo(Integer value) {
            addCriterion("postNumber <>", value, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberGreaterThan(Integer value) {
            addCriterion("postNumber >", value, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("postNumber >=", value, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberLessThan(Integer value) {
            addCriterion("postNumber <", value, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberLessThanOrEqualTo(Integer value) {
            addCriterion("postNumber <=", value, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberIn(List<Integer> values) {
            addCriterion("postNumber in", values, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberNotIn(List<Integer> values) {
            addCriterion("postNumber not in", values, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberBetween(Integer value1, Integer value2) {
            addCriterion("postNumber between", value1, value2, "postnumber");
            return (Criteria) this;
        }

        public Criteria andPostnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("postNumber not between", value1, value2, "postnumber");
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

        public Criteria andPostnameIsNull() {
            addCriterion("postName is null");
            return (Criteria) this;
        }

        public Criteria andPostnameIsNotNull() {
            addCriterion("postName is not null");
            return (Criteria) this;
        }

        public Criteria andPostnameEqualTo(String value) {
            addCriterion("postName =", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotEqualTo(String value) {
            addCriterion("postName <>", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThan(String value) {
            addCriterion("postName >", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThanOrEqualTo(String value) {
            addCriterion("postName >=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThan(String value) {
            addCriterion("postName <", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThanOrEqualTo(String value) {
            addCriterion("postName <=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLike(String value) {
            addCriterion("postName like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotLike(String value) {
            addCriterion("postName not like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameIn(List<String> values) {
            addCriterion("postName in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotIn(List<String> values) {
            addCriterion("postName not in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameBetween(String value1, String value2) {
            addCriterion("postName between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotBetween(String value1, String value2) {
            addCriterion("postName not between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andPostsalaryIsNull() {
            addCriterion("postSalary is null");
            return (Criteria) this;
        }

        public Criteria andPostsalaryIsNotNull() {
            addCriterion("postSalary is not null");
            return (Criteria) this;
        }

        public Criteria andPostsalaryEqualTo(Integer value) {
            addCriterion("postSalary =", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryNotEqualTo(Integer value) {
            addCriterion("postSalary <>", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryGreaterThan(Integer value) {
            addCriterion("postSalary >", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("postSalary >=", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryLessThan(Integer value) {
            addCriterion("postSalary <", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("postSalary <=", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryIn(List<Integer> values) {
            addCriterion("postSalary in", values, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryNotIn(List<Integer> values) {
            addCriterion("postSalary not in", values, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryBetween(Integer value1, Integer value2) {
            addCriterion("postSalary between", value1, value2, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("postSalary not between", value1, value2, "postsalary");
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