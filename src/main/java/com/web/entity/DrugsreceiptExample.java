package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugsreceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DrugsreceiptExample() {
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

        public Criteria andReceiptidIsNull() {
            addCriterion("receiptId is null");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNotNull() {
            addCriterion("receiptId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptidEqualTo(Integer value) {
            addCriterion("receiptId =", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotEqualTo(Integer value) {
            addCriterion("receiptId <>", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThan(Integer value) {
            addCriterion("receiptId >", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiptId >=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThan(Integer value) {
            addCriterion("receiptId <", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThanOrEqualTo(Integer value) {
            addCriterion("receiptId <=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIn(List<Integer> values) {
            addCriterion("receiptId in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotIn(List<Integer> values) {
            addCriterion("receiptId not in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidBetween(Integer value1, Integer value2) {
            addCriterion("receiptId between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiptId not between", value1, value2, "receiptid");
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

        public Criteria andDrugsidIsNull() {
            addCriterion("drugsId is null");
            return (Criteria) this;
        }

        public Criteria andDrugsidIsNotNull() {
            addCriterion("drugsId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsidEqualTo(Integer value) {
            addCriterion("drugsId =", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotEqualTo(Integer value) {
            addCriterion("drugsId <>", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThan(Integer value) {
            addCriterion("drugsId >", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsId >=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThan(Integer value) {
            addCriterion("drugsId <", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThanOrEqualTo(Integer value) {
            addCriterion("drugsId <=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidIn(List<Integer> values) {
            addCriterion("drugsId in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotIn(List<Integer> values) {
            addCriterion("drugsId not in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidBetween(Integer value1, Integer value2) {
            addCriterion("drugsId between", value1, value2, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsId not between", value1, value2, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugscountIsNull() {
            addCriterion("drugsCount is null");
            return (Criteria) this;
        }

        public Criteria andDrugscountIsNotNull() {
            addCriterion("drugsCount is not null");
            return (Criteria) this;
        }

        public Criteria andDrugscountEqualTo(Integer value) {
            addCriterion("drugsCount =", value, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountNotEqualTo(Integer value) {
            addCriterion("drugsCount <>", value, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountGreaterThan(Integer value) {
            addCriterion("drugsCount >", value, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsCount >=", value, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountLessThan(Integer value) {
            addCriterion("drugsCount <", value, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountLessThanOrEqualTo(Integer value) {
            addCriterion("drugsCount <=", value, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountIn(List<Integer> values) {
            addCriterion("drugsCount in", values, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountNotIn(List<Integer> values) {
            addCriterion("drugsCount not in", values, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountBetween(Integer value1, Integer value2) {
            addCriterion("drugsCount between", value1, value2, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugscountNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsCount not between", value1, value2, "drugscount");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIsNull() {
            addCriterion("drugStorageId is null");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIsNotNull() {
            addCriterion("drugStorageId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidEqualTo(Integer value) {
            addCriterion("drugStorageId =", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotEqualTo(Integer value) {
            addCriterion("drugStorageId <>", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidGreaterThan(Integer value) {
            addCriterion("drugStorageId >", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugStorageId >=", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidLessThan(Integer value) {
            addCriterion("drugStorageId <", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidLessThanOrEqualTo(Integer value) {
            addCriterion("drugStorageId <=", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIn(List<Integer> values) {
            addCriterion("drugStorageId in", values, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotIn(List<Integer> values) {
            addCriterion("drugStorageId not in", values, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidBetween(Integer value1, Integer value2) {
            addCriterion("drugStorageId between", value1, value2, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugStorageId not between", value1, value2, "drugstorageid");
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