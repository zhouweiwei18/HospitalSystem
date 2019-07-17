package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class InpatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InpatientExample() {
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

        public Criteria andAdmissiondepartmentIsNull() {
            addCriterion("admissionDepartment is null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentIsNotNull() {
            addCriterion("admissionDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentEqualTo(Integer value) {
            addCriterion("admissionDepartment =", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentNotEqualTo(Integer value) {
            addCriterion("admissionDepartment <>", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentGreaterThan(Integer value) {
            addCriterion("admissionDepartment >", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("admissionDepartment >=", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentLessThan(Integer value) {
            addCriterion("admissionDepartment <", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("admissionDepartment <=", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentIn(List<Integer> values) {
            addCriterion("admissionDepartment in", values, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentNotIn(List<Integer> values) {
            addCriterion("admissionDepartment not in", values, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentBetween(Integer value1, Integer value2) {
            addCriterion("admissionDepartment between", value1, value2, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("admissionDepartment not between", value1, value2, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeIsNull() {
            addCriterion("hospitalizationTime is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeIsNotNull() {
            addCriterion("hospitalizationTime is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeEqualTo(String value) {
            addCriterion("hospitalizationTime =", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeNotEqualTo(String value) {
            addCriterion("hospitalizationTime <>", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeGreaterThan(String value) {
            addCriterion("hospitalizationTime >", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalizationTime >=", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeLessThan(String value) {
            addCriterion("hospitalizationTime <", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeLessThanOrEqualTo(String value) {
            addCriterion("hospitalizationTime <=", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeLike(String value) {
            addCriterion("hospitalizationTime like", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeNotLike(String value) {
            addCriterion("hospitalizationTime not like", value, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeIn(List<String> values) {
            addCriterion("hospitalizationTime in", values, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeNotIn(List<String> values) {
            addCriterion("hospitalizationTime not in", values, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeBetween(String value1, String value2) {
            addCriterion("hospitalizationTime between", value1, value2, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andHospitalizationtimeNotBetween(String value1, String value2) {
            addCriterion("hospitalizationTime not between", value1, value2, "hospitalizationtime");
            return (Criteria) this;
        }

        public Criteria andBednumberIsNull() {
            addCriterion("bedNumber is null");
            return (Criteria) this;
        }

        public Criteria andBednumberIsNotNull() {
            addCriterion("bedNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBednumberEqualTo(Integer value) {
            addCriterion("bedNumber =", value, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberNotEqualTo(Integer value) {
            addCriterion("bedNumber <>", value, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberGreaterThan(Integer value) {
            addCriterion("bedNumber >", value, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedNumber >=", value, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberLessThan(Integer value) {
            addCriterion("bedNumber <", value, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberLessThanOrEqualTo(Integer value) {
            addCriterion("bedNumber <=", value, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberIn(List<Integer> values) {
            addCriterion("bedNumber in", values, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberNotIn(List<Integer> values) {
            addCriterion("bedNumber not in", values, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberBetween(Integer value1, Integer value2) {
            addCriterion("bedNumber between", value1, value2, "bednumber");
            return (Criteria) this;
        }

        public Criteria andBednumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bedNumber not between", value1, value2, "bednumber");
            return (Criteria) this;
        }

        public Criteria andSituationIsNull() {
            addCriterion("situation is null");
            return (Criteria) this;
        }

        public Criteria andSituationIsNotNull() {
            addCriterion("situation is not null");
            return (Criteria) this;
        }

        public Criteria andSituationEqualTo(String value) {
            addCriterion("situation =", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotEqualTo(String value) {
            addCriterion("situation <>", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThan(String value) {
            addCriterion("situation >", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThanOrEqualTo(String value) {
            addCriterion("situation >=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThan(String value) {
            addCriterion("situation <", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThanOrEqualTo(String value) {
            addCriterion("situation <=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLike(String value) {
            addCriterion("situation like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotLike(String value) {
            addCriterion("situation not like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationIn(List<String> values) {
            addCriterion("situation in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotIn(List<String> values) {
            addCriterion("situation not in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationBetween(String value1, String value2) {
            addCriterion("situation between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotBetween(String value1, String value2) {
            addCriterion("situation not between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationIsNull() {
            addCriterion("transferSituation is null");
            return (Criteria) this;
        }

        public Criteria andTransfersituationIsNotNull() {
            addCriterion("transferSituation is not null");
            return (Criteria) this;
        }

        public Criteria andTransfersituationEqualTo(Integer value) {
            addCriterion("transferSituation =", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationNotEqualTo(Integer value) {
            addCriterion("transferSituation <>", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationGreaterThan(Integer value) {
            addCriterion("transferSituation >", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("transferSituation >=", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationLessThan(Integer value) {
            addCriterion("transferSituation <", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationLessThanOrEqualTo(Integer value) {
            addCriterion("transferSituation <=", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationIn(List<Integer> values) {
            addCriterion("transferSituation in", values, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationNotIn(List<Integer> values) {
            addCriterion("transferSituation not in", values, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationBetween(Integer value1, Integer value2) {
            addCriterion("transferSituation between", value1, value2, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationNotBetween(Integer value1, Integer value2) {
            addCriterion("transferSituation not between", value1, value2, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andDischargetimeIsNull() {
            addCriterion("dischargeTime is null");
            return (Criteria) this;
        }

        public Criteria andDischargetimeIsNotNull() {
            addCriterion("dischargeTime is not null");
            return (Criteria) this;
        }

        public Criteria andDischargetimeEqualTo(String value) {
            addCriterion("dischargeTime =", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeNotEqualTo(String value) {
            addCriterion("dischargeTime <>", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeGreaterThan(String value) {
            addCriterion("dischargeTime >", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeGreaterThanOrEqualTo(String value) {
            addCriterion("dischargeTime >=", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeLessThan(String value) {
            addCriterion("dischargeTime <", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeLessThanOrEqualTo(String value) {
            addCriterion("dischargeTime <=", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeLike(String value) {
            addCriterion("dischargeTime like", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeNotLike(String value) {
            addCriterion("dischargeTime not like", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeIn(List<String> values) {
            addCriterion("dischargeTime in", values, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeNotIn(List<String> values) {
            addCriterion("dischargeTime not in", values, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeBetween(String value1, String value2) {
            addCriterion("dischargeTime between", value1, value2, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeNotBetween(String value1, String value2) {
            addCriterion("dischargeTime not between", value1, value2, "dischargetime");
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