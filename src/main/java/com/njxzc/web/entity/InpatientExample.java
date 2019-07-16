package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andHospitalizationnumberIsNull() {
            addCriterion("hospitalizationNumber is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberIsNotNull() {
            addCriterion("hospitalizationNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberEqualTo(Integer value) {
            addCriterion("hospitalizationNumber =", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberNotEqualTo(Integer value) {
            addCriterion("hospitalizationNumber <>", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberGreaterThan(Integer value) {
            addCriterion("hospitalizationNumber >", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationNumber >=", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberLessThan(Integer value) {
            addCriterion("hospitalizationNumber <", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationNumber <=", value, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberIn(List<Integer> values) {
            addCriterion("hospitalizationNumber in", values, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberNotIn(List<Integer> values) {
            addCriterion("hospitalizationNumber not in", values, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationNumber between", value1, value2, "hospitalizationnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalizationnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationNumber not between", value1, value2, "hospitalizationnumber");
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

        public Criteria andAdmissiondepartmentIsNull() {
            addCriterion("admissionDepartment is null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentIsNotNull() {
            addCriterion("admissionDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentEqualTo(String value) {
            addCriterion("admissionDepartment =", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentNotEqualTo(String value) {
            addCriterion("admissionDepartment <>", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentGreaterThan(String value) {
            addCriterion("admissionDepartment >", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("admissionDepartment >=", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentLessThan(String value) {
            addCriterion("admissionDepartment <", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentLessThanOrEqualTo(String value) {
            addCriterion("admissionDepartment <=", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentLike(String value) {
            addCriterion("admissionDepartment like", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentNotLike(String value) {
            addCriterion("admissionDepartment not like", value, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentIn(List<String> values) {
            addCriterion("admissionDepartment in", values, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentNotIn(List<String> values) {
            addCriterion("admissionDepartment not in", values, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentBetween(String value1, String value2) {
            addCriterion("admissionDepartment between", value1, value2, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiondepartmentNotBetween(String value1, String value2) {
            addCriterion("admissionDepartment not between", value1, value2, "admissiondepartment");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeIsNull() {
            addCriterion("admissionTime is null");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeIsNotNull() {
            addCriterion("admissionTime is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeEqualTo(Date value) {
            addCriterion("admissionTime =", value, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeNotEqualTo(Date value) {
            addCriterion("admissionTime <>", value, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeGreaterThan(Date value) {
            addCriterion("admissionTime >", value, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admissionTime >=", value, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeLessThan(Date value) {
            addCriterion("admissionTime <", value, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeLessThanOrEqualTo(Date value) {
            addCriterion("admissionTime <=", value, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeIn(List<Date> values) {
            addCriterion("admissionTime in", values, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeNotIn(List<Date> values) {
            addCriterion("admissionTime not in", values, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeBetween(Date value1, Date value2) {
            addCriterion("admissionTime between", value1, value2, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissiontimeNotBetween(Date value1, Date value2) {
            addCriterion("admissionTime not between", value1, value2, "admissiontime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationIsNull() {
            addCriterion("admissionSituation is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationIsNotNull() {
            addCriterion("admissionSituation is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationEqualTo(String value) {
            addCriterion("admissionSituation =", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationNotEqualTo(String value) {
            addCriterion("admissionSituation <>", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationGreaterThan(String value) {
            addCriterion("admissionSituation >", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationGreaterThanOrEqualTo(String value) {
            addCriterion("admissionSituation >=", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationLessThan(String value) {
            addCriterion("admissionSituation <", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationLessThanOrEqualTo(String value) {
            addCriterion("admissionSituation <=", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationLike(String value) {
            addCriterion("admissionSituation like", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationNotLike(String value) {
            addCriterion("admissionSituation not like", value, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationIn(List<String> values) {
            addCriterion("admissionSituation in", values, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationNotIn(List<String> values) {
            addCriterion("admissionSituation not in", values, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationBetween(String value1, String value2) {
            addCriterion("admissionSituation between", value1, value2, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andAdmissionsituationNotBetween(String value1, String value2) {
            addCriterion("admissionSituation not between", value1, value2, "admissionsituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationIsNull() {
            addCriterion("TransferSituation is null");
            return (Criteria) this;
        }

        public Criteria andTransfersituationIsNotNull() {
            addCriterion("TransferSituation is not null");
            return (Criteria) this;
        }

        public Criteria andTransfersituationEqualTo(Integer value) {
            addCriterion("TransferSituation =", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationNotEqualTo(Integer value) {
            addCriterion("TransferSituation <>", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationGreaterThan(Integer value) {
            addCriterion("TransferSituation >", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("TransferSituation >=", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationLessThan(Integer value) {
            addCriterion("TransferSituation <", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationLessThanOrEqualTo(Integer value) {
            addCriterion("TransferSituation <=", value, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationIn(List<Integer> values) {
            addCriterion("TransferSituation in", values, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationNotIn(List<Integer> values) {
            addCriterion("TransferSituation not in", values, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationBetween(Integer value1, Integer value2) {
            addCriterion("TransferSituation between", value1, value2, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andTransfersituationNotBetween(Integer value1, Integer value2) {
            addCriterion("TransferSituation not between", value1, value2, "transfersituation");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentIsNull() {
            addCriterion("dischargedDepartment is null");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentIsNotNull() {
            addCriterion("dischargedDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentEqualTo(String value) {
            addCriterion("dischargedDepartment =", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentNotEqualTo(String value) {
            addCriterion("dischargedDepartment <>", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentGreaterThan(String value) {
            addCriterion("dischargedDepartment >", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("dischargedDepartment >=", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentLessThan(String value) {
            addCriterion("dischargedDepartment <", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentLessThanOrEqualTo(String value) {
            addCriterion("dischargedDepartment <=", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentLike(String value) {
            addCriterion("dischargedDepartment like", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentNotLike(String value) {
            addCriterion("dischargedDepartment not like", value, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentIn(List<String> values) {
            addCriterion("dischargedDepartment in", values, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentNotIn(List<String> values) {
            addCriterion("dischargedDepartment not in", values, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentBetween(String value1, String value2) {
            addCriterion("dischargedDepartment between", value1, value2, "dischargeddepartment");
            return (Criteria) this;
        }

        public Criteria andDischargeddepartmentNotBetween(String value1, String value2) {
            addCriterion("dischargedDepartment not between", value1, value2, "dischargeddepartment");
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