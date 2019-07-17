package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PrescriptionExample() {
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

        public Criteria andPrescriptionnumberIsNull() {
            addCriterion("prescriptionNumber is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberIsNotNull() {
            addCriterion("prescriptionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberEqualTo(Integer value) {
            addCriterion("prescriptionNumber =", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberNotEqualTo(Integer value) {
            addCriterion("prescriptionNumber <>", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberGreaterThan(Integer value) {
            addCriterion("prescriptionNumber >", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescriptionNumber >=", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberLessThan(Integer value) {
            addCriterion("prescriptionNumber <", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberLessThanOrEqualTo(Integer value) {
            addCriterion("prescriptionNumber <=", value, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberIn(List<Integer> values) {
            addCriterion("prescriptionNumber in", values, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberNotIn(List<Integer> values) {
            addCriterion("prescriptionNumber not in", values, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionNumber between", value1, value2, "prescriptionnumber");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionNumber not between", value1, value2, "prescriptionnumber");
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

        public Criteria andDrugnoIsNull() {
            addCriterion("drugNo is null");
            return (Criteria) this;
        }

        public Criteria andDrugnoIsNotNull() {
            addCriterion("drugNo is not null");
            return (Criteria) this;
        }

        public Criteria andDrugnoEqualTo(Integer value) {
            addCriterion("drugNo =", value, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoNotEqualTo(Integer value) {
            addCriterion("drugNo <>", value, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoGreaterThan(Integer value) {
            addCriterion("drugNo >", value, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugNo >=", value, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoLessThan(Integer value) {
            addCriterion("drugNo <", value, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoLessThanOrEqualTo(Integer value) {
            addCriterion("drugNo <=", value, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoIn(List<Integer> values) {
            addCriterion("drugNo in", values, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoNotIn(List<Integer> values) {
            addCriterion("drugNo not in", values, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoBetween(Integer value1, Integer value2) {
            addCriterion("drugNo between", value1, value2, "drugno");
            return (Criteria) this;
        }

        public Criteria andDrugnoNotBetween(Integer value1, Integer value2) {
            addCriterion("drugNo not between", value1, value2, "drugno");
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