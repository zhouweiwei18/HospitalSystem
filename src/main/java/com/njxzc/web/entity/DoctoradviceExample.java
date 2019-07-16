package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctoradviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DoctoradviceExample() {
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

        public Criteria andMedicalrecordIsNull() {
            addCriterion("medicalRecord is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIsNotNull() {
            addCriterion("medicalRecord is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordEqualTo(Integer value) {
            addCriterion("medicalRecord =", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordNotEqualTo(Integer value) {
            addCriterion("medicalRecord <>", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordGreaterThan(Integer value) {
            addCriterion("medicalRecord >", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecord >=", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordLessThan(Integer value) {
            addCriterion("medicalRecord <", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecord <=", value, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIn(List<Integer> values) {
            addCriterion("medicalRecord in", values, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordNotIn(List<Integer> values) {
            addCriterion("medicalRecord not in", values, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecord between", value1, value2, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecord not between", value1, value2, "medicalrecord");
            return (Criteria) this;
        }

        public Criteria andStartupdateIsNull() {
            addCriterion("startupDate is null");
            return (Criteria) this;
        }

        public Criteria andStartupdateIsNotNull() {
            addCriterion("startupDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartupdateEqualTo(Date value) {
            addCriterion("startupDate =", value, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateNotEqualTo(Date value) {
            addCriterion("startupDate <>", value, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateGreaterThan(Date value) {
            addCriterion("startupDate >", value, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startupDate >=", value, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateLessThan(Date value) {
            addCriterion("startupDate <", value, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateLessThanOrEqualTo(Date value) {
            addCriterion("startupDate <=", value, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateIn(List<Date> values) {
            addCriterion("startupDate in", values, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateNotIn(List<Date> values) {
            addCriterion("startupDate not in", values, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateBetween(Date value1, Date value2) {
            addCriterion("startupDate between", value1, value2, "startupdate");
            return (Criteria) this;
        }

        public Criteria andStartupdateNotBetween(Date value1, Date value2) {
            addCriterion("startupDate not between", value1, value2, "startupdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateIsNull() {
            addCriterion("processingDate is null");
            return (Criteria) this;
        }

        public Criteria andProcessingdateIsNotNull() {
            addCriterion("processingDate is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingdateEqualTo(Date value) {
            addCriterion("processingDate =", value, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateNotEqualTo(Date value) {
            addCriterion("processingDate <>", value, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateGreaterThan(Date value) {
            addCriterion("processingDate >", value, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("processingDate >=", value, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateLessThan(Date value) {
            addCriterion("processingDate <", value, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateLessThanOrEqualTo(Date value) {
            addCriterion("processingDate <=", value, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateIn(List<Date> values) {
            addCriterion("processingDate in", values, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateNotIn(List<Date> values) {
            addCriterion("processingDate not in", values, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateBetween(Date value1, Date value2) {
            addCriterion("processingDate between", value1, value2, "processingdate");
            return (Criteria) this;
        }

        public Criteria andProcessingdateNotBetween(Date value1, Date value2) {
            addCriterion("processingDate not between", value1, value2, "processingdate");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentIsNull() {
            addCriterion("doctorAdviceContent is null");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentIsNotNull() {
            addCriterion("doctorAdviceContent is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentEqualTo(String value) {
            addCriterion("doctorAdviceContent =", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentNotEqualTo(String value) {
            addCriterion("doctorAdviceContent <>", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentGreaterThan(String value) {
            addCriterion("doctorAdviceContent >", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentGreaterThanOrEqualTo(String value) {
            addCriterion("doctorAdviceContent >=", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentLessThan(String value) {
            addCriterion("doctorAdviceContent <", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentLessThanOrEqualTo(String value) {
            addCriterion("doctorAdviceContent <=", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentLike(String value) {
            addCriterion("doctorAdviceContent like", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentNotLike(String value) {
            addCriterion("doctorAdviceContent not like", value, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentIn(List<String> values) {
            addCriterion("doctorAdviceContent in", values, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentNotIn(List<String> values) {
            addCriterion("doctorAdviceContent not in", values, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentBetween(String value1, String value2) {
            addCriterion("doctorAdviceContent between", value1, value2, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoradvicecontentNotBetween(String value1, String value2) {
            addCriterion("doctorAdviceContent not between", value1, value2, "doctoradvicecontent");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorIsNull() {
            addCriterion("attendingDoctor is null");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorIsNotNull() {
            addCriterion("attendingDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorEqualTo(Integer value) {
            addCriterion("attendingDoctor =", value, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorNotEqualTo(Integer value) {
            addCriterion("attendingDoctor <>", value, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorGreaterThan(Integer value) {
            addCriterion("attendingDoctor >", value, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("attendingDoctor >=", value, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorLessThan(Integer value) {
            addCriterion("attendingDoctor <", value, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorLessThanOrEqualTo(Integer value) {
            addCriterion("attendingDoctor <=", value, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorIn(List<Integer> values) {
            addCriterion("attendingDoctor in", values, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorNotIn(List<Integer> values) {
            addCriterion("attendingDoctor not in", values, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorBetween(Integer value1, Integer value2) {
            addCriterion("attendingDoctor between", value1, value2, "attendingdoctor");
            return (Criteria) this;
        }

        public Criteria andAttendingdoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("attendingDoctor not between", value1, value2, "attendingdoctor");
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

        public Criteria andDiseasenameIsNull() {
            addCriterion("diseaseName is null");
            return (Criteria) this;
        }

        public Criteria andDiseasenameIsNotNull() {
            addCriterion("diseaseName is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasenameEqualTo(String value) {
            addCriterion("diseaseName =", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotEqualTo(String value) {
            addCriterion("diseaseName <>", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameGreaterThan(String value) {
            addCriterion("diseaseName >", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameGreaterThanOrEqualTo(String value) {
            addCriterion("diseaseName >=", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameLessThan(String value) {
            addCriterion("diseaseName <", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameLessThanOrEqualTo(String value) {
            addCriterion("diseaseName <=", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameLike(String value) {
            addCriterion("diseaseName like", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotLike(String value) {
            addCriterion("diseaseName not like", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameIn(List<String> values) {
            addCriterion("diseaseName in", values, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotIn(List<String> values) {
            addCriterion("diseaseName not in", values, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameBetween(String value1, String value2) {
            addCriterion("diseaseName between", value1, value2, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotBetween(String value1, String value2) {
            addCriterion("diseaseName not between", value1, value2, "diseasename");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaIsNull() {
            addCriterion("leaveHospita is null");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaIsNotNull() {
            addCriterion("leaveHospita is not null");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaEqualTo(Integer value) {
            addCriterion("leaveHospita =", value, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaNotEqualTo(Integer value) {
            addCriterion("leaveHospita <>", value, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaGreaterThan(Integer value) {
            addCriterion("leaveHospita >", value, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveHospita >=", value, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaLessThan(Integer value) {
            addCriterion("leaveHospita <", value, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaLessThanOrEqualTo(Integer value) {
            addCriterion("leaveHospita <=", value, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaIn(List<Integer> values) {
            addCriterion("leaveHospita in", values, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaNotIn(List<Integer> values) {
            addCriterion("leaveHospita not in", values, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaBetween(Integer value1, Integer value2) {
            addCriterion("leaveHospita between", value1, value2, "leavehospita");
            return (Criteria) this;
        }

        public Criteria andLeavehospitaNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveHospita not between", value1, value2, "leavehospita");
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