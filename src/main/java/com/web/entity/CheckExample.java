package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class CheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CheckExample() {
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

        public Criteria andCheckidIsNull() {
            addCriterion("checkId is null");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNotNull() {
            addCriterion("checkId is not null");
            return (Criteria) this;
        }

        public Criteria andCheckidEqualTo(Integer value) {
            addCriterion("checkId =", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotEqualTo(Integer value) {
            addCriterion("checkId <>", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThan(Integer value) {
            addCriterion("checkId >", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkId >=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThan(Integer value) {
            addCriterion("checkId <", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThanOrEqualTo(Integer value) {
            addCriterion("checkId <=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidIn(List<Integer> values) {
            addCriterion("checkId in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotIn(List<Integer> values) {
            addCriterion("checkId not in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidBetween(Integer value1, Integer value2) {
            addCriterion("checkId between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkId not between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorIsNull() {
            addCriterion("checkDoctor is null");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorIsNotNull() {
            addCriterion("checkDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorEqualTo(Integer value) {
            addCriterion("checkDoctor =", value, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorNotEqualTo(Integer value) {
            addCriterion("checkDoctor <>", value, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorGreaterThan(Integer value) {
            addCriterion("checkDoctor >", value, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkDoctor >=", value, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorLessThan(Integer value) {
            addCriterion("checkDoctor <", value, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorLessThanOrEqualTo(Integer value) {
            addCriterion("checkDoctor <=", value, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorIn(List<Integer> values) {
            addCriterion("checkDoctor in", values, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorNotIn(List<Integer> values) {
            addCriterion("checkDoctor not in", values, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorBetween(Integer value1, Integer value2) {
            addCriterion("checkDoctor between", value1, value2, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andCheckdoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("checkDoctor not between", value1, value2, "checkdoctor");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("checkTime like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("checkTime not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoIsNull() {
            addCriterion("checkProjectNo is null");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoIsNotNull() {
            addCriterion("checkProjectNo is not null");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoEqualTo(Integer value) {
            addCriterion("checkProjectNo =", value, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoNotEqualTo(Integer value) {
            addCriterion("checkProjectNo <>", value, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoGreaterThan(Integer value) {
            addCriterion("checkProjectNo >", value, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkProjectNo >=", value, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoLessThan(Integer value) {
            addCriterion("checkProjectNo <", value, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoLessThanOrEqualTo(Integer value) {
            addCriterion("checkProjectNo <=", value, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoIn(List<Integer> values) {
            addCriterion("checkProjectNo in", values, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoNotIn(List<Integer> values) {
            addCriterion("checkProjectNo not in", values, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoBetween(Integer value1, Integer value2) {
            addCriterion("checkProjectNo between", value1, value2, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckprojectnoNotBetween(Integer value1, Integer value2) {
            addCriterion("checkProjectNo not between", value1, value2, "checkprojectno");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("checkResult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("checkResult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("checkResult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("checkResult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("checkResult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("checkResult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("checkResult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("checkResult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("checkResult like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("checkResult not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("checkResult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("checkResult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("checkResult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("checkResult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidIsNull() {
            addCriterion("doctorAdviceId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidIsNotNull() {
            addCriterion("doctorAdviceId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidEqualTo(Integer value) {
            addCriterion("doctorAdviceId =", value, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidNotEqualTo(Integer value) {
            addCriterion("doctorAdviceId <>", value, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidGreaterThan(Integer value) {
            addCriterion("doctorAdviceId >", value, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorAdviceId >=", value, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidLessThan(Integer value) {
            addCriterion("doctorAdviceId <", value, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidLessThanOrEqualTo(Integer value) {
            addCriterion("doctorAdviceId <=", value, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidIn(List<Integer> values) {
            addCriterion("doctorAdviceId in", values, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidNotIn(List<Integer> values) {
            addCriterion("doctorAdviceId not in", values, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidBetween(Integer value1, Integer value2) {
            addCriterion("doctorAdviceId between", value1, value2, "doctoradviceid");
            return (Criteria) this;
        }

        public Criteria andDoctoradviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorAdviceId not between", value1, value2, "doctoradviceid");
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