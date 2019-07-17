package com.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MedicalrecordExample() {
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

        public Criteria andMedicalrecordidIsNull() {
            addCriterion("medicalRecordId is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidIsNotNull() {
            addCriterion("medicalRecordId is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidEqualTo(Integer value) {
            addCriterion("medicalRecordId =", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotEqualTo(Integer value) {
            addCriterion("medicalRecordId <>", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidGreaterThan(Integer value) {
            addCriterion("medicalRecordId >", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordId >=", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidLessThan(Integer value) {
            addCriterion("medicalRecordId <", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordId <=", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidIn(List<Integer> values) {
            addCriterion("medicalRecordId in", values, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotIn(List<Integer> values) {
            addCriterion("medicalRecordId not in", values, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordId between", value1, value2, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordId not between", value1, value2, "medicalrecordid");
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

        public Criteria andCategoryIsNull() {
            addCriterion("\" category\" is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("\" category\" is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("\" category\" =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("\" category\" <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("\" category\" >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("\" category\" >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("\" category\" <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("\" category\" <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("\" category\" like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("\" category\" not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("\" category\" in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("\" category\" not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("\" category\" between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("\" category\" not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andAnamnesisIsNull() {
            addCriterion("anamnesis is null");
            return (Criteria) this;
        }

        public Criteria andAnamnesisIsNotNull() {
            addCriterion("anamnesis is not null");
            return (Criteria) this;
        }

        public Criteria andAnamnesisEqualTo(String value) {
            addCriterion("anamnesis =", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisNotEqualTo(String value) {
            addCriterion("anamnesis <>", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisGreaterThan(String value) {
            addCriterion("anamnesis >", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisGreaterThanOrEqualTo(String value) {
            addCriterion("anamnesis >=", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisLessThan(String value) {
            addCriterion("anamnesis <", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisLessThanOrEqualTo(String value) {
            addCriterion("anamnesis <=", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisLike(String value) {
            addCriterion("anamnesis like", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisNotLike(String value) {
            addCriterion("anamnesis not like", value, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisIn(List<String> values) {
            addCriterion("anamnesis in", values, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisNotIn(List<String> values) {
            addCriterion("anamnesis not in", values, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisBetween(String value1, String value2) {
            addCriterion("anamnesis between", value1, value2, "anamnesis");
            return (Criteria) this;
        }

        public Criteria andAnamnesisNotBetween(String value1, String value2) {
            addCriterion("anamnesis not between", value1, value2, "anamnesis");
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

        public Criteria andIddeleteIsNull() {
            addCriterion("idDelete is null");
            return (Criteria) this;
        }

        public Criteria andIddeleteIsNotNull() {
            addCriterion("idDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIddeleteEqualTo(String value) {
            addCriterion("idDelete =", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteNotEqualTo(String value) {
            addCriterion("idDelete <>", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteGreaterThan(String value) {
            addCriterion("idDelete >", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteGreaterThanOrEqualTo(String value) {
            addCriterion("idDelete >=", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteLessThan(String value) {
            addCriterion("idDelete <", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteLessThanOrEqualTo(String value) {
            addCriterion("idDelete <=", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteLike(String value) {
            addCriterion("idDelete like", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteNotLike(String value) {
            addCriterion("idDelete not like", value, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteIn(List<String> values) {
            addCriterion("idDelete in", values, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteNotIn(List<String> values) {
            addCriterion("idDelete not in", values, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteBetween(String value1, String value2) {
            addCriterion("idDelete between", value1, value2, "iddelete");
            return (Criteria) this;
        }

        public Criteria andIddeleteNotBetween(String value1, String value2) {
            addCriterion("idDelete not between", value1, value2, "iddelete");
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

        public Criteria andAdmissiondateIsNull() {
            addCriterion("admissionDate is null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateIsNotNull() {
            addCriterion("admissionDate is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateEqualTo(String value) {
            addCriterion("admissionDate =", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateNotEqualTo(String value) {
            addCriterion("admissionDate <>", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateGreaterThan(String value) {
            addCriterion("admissionDate >", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateGreaterThanOrEqualTo(String value) {
            addCriterion("admissionDate >=", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateLessThan(String value) {
            addCriterion("admissionDate <", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateLessThanOrEqualTo(String value) {
            addCriterion("admissionDate <=", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateLike(String value) {
            addCriterion("admissionDate like", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateNotLike(String value) {
            addCriterion("admissionDate not like", value, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateIn(List<String> values) {
            addCriterion("admissionDate in", values, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateNotIn(List<String> values) {
            addCriterion("admissionDate not in", values, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateBetween(String value1, String value2) {
            addCriterion("admissionDate between", value1, value2, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondateNotBetween(String value1, String value2) {
            addCriterion("admissionDate not between", value1, value2, "admissiondate");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisIsNull() {
            addCriterion("admissionDiagnosis is null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisIsNotNull() {
            addCriterion("admissionDiagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisEqualTo(String value) {
            addCriterion("admissionDiagnosis =", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisNotEqualTo(String value) {
            addCriterion("admissionDiagnosis <>", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisGreaterThan(String value) {
            addCriterion("admissionDiagnosis >", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("admissionDiagnosis >=", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisLessThan(String value) {
            addCriterion("admissionDiagnosis <", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisLessThanOrEqualTo(String value) {
            addCriterion("admissionDiagnosis <=", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisLike(String value) {
            addCriterion("admissionDiagnosis like", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisNotLike(String value) {
            addCriterion("admissionDiagnosis not like", value, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisIn(List<String> values) {
            addCriterion("admissionDiagnosis in", values, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisNotIn(List<String> values) {
            addCriterion("admissionDiagnosis not in", values, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisBetween(String value1, String value2) {
            addCriterion("admissionDiagnosis between", value1, value2, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissiondiagnosisNotBetween(String value1, String value2) {
            addCriterion("admissionDiagnosis not between", value1, value2, "admissiondiagnosis");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusIsNull() {
            addCriterion("admissionStatus is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusIsNotNull() {
            addCriterion("admissionStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusEqualTo(String value) {
            addCriterion("admissionStatus =", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusNotEqualTo(String value) {
            addCriterion("admissionStatus <>", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusGreaterThan(String value) {
            addCriterion("admissionStatus >", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("admissionStatus >=", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusLessThan(String value) {
            addCriterion("admissionStatus <", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusLessThanOrEqualTo(String value) {
            addCriterion("admissionStatus <=", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusLike(String value) {
            addCriterion("admissionStatus like", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusNotLike(String value) {
            addCriterion("admissionStatus not like", value, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusIn(List<String> values) {
            addCriterion("admissionStatus in", values, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusNotIn(List<String> values) {
            addCriterion("admissionStatus not in", values, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusBetween(String value1, String value2) {
            addCriterion("admissionStatus between", value1, value2, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andAdmissionstatusNotBetween(String value1, String value2) {
            addCriterion("admissionStatus not between", value1, value2, "admissionstatus");
            return (Criteria) this;
        }

        public Criteria andTransferIsNull() {
            addCriterion("transfer is null");
            return (Criteria) this;
        }

        public Criteria andTransferIsNotNull() {
            addCriterion("transfer is not null");
            return (Criteria) this;
        }

        public Criteria andTransferEqualTo(String value) {
            addCriterion("transfer =", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotEqualTo(String value) {
            addCriterion("transfer <>", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThan(String value) {
            addCriterion("transfer >", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThanOrEqualTo(String value) {
            addCriterion("transfer >=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThan(String value) {
            addCriterion("transfer <", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThanOrEqualTo(String value) {
            addCriterion("transfer <=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLike(String value) {
            addCriterion("transfer like", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotLike(String value) {
            addCriterion("transfer not like", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferIn(List<String> values) {
            addCriterion("transfer in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotIn(List<String> values) {
            addCriterion("transfer not in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferBetween(String value1, String value2) {
            addCriterion("transfer between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotBetween(String value1, String value2) {
            addCriterion("transfer not between", value1, value2, "transfer");
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

        public Criteria andDischargetimeEqualTo(Date value) {
            addCriterion("dischargeTime =", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeNotEqualTo(Date value) {
            addCriterion("dischargeTime <>", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeGreaterThan(Date value) {
            addCriterion("dischargeTime >", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dischargeTime >=", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeLessThan(Date value) {
            addCriterion("dischargeTime <", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeLessThanOrEqualTo(Date value) {
            addCriterion("dischargeTime <=", value, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeIn(List<Date> values) {
            addCriterion("dischargeTime in", values, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeNotIn(List<Date> values) {
            addCriterion("dischargeTime not in", values, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeBetween(Date value1, Date value2) {
            addCriterion("dischargeTime between", value1, value2, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargetimeNotBetween(Date value1, Date value2) {
            addCriterion("dischargeTime not between", value1, value2, "dischargetime");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisIsNull() {
            addCriterion("dischargeDiagnosis is null");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisIsNotNull() {
            addCriterion("dischargeDiagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisEqualTo(String value) {
            addCriterion("dischargeDiagnosis =", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisNotEqualTo(String value) {
            addCriterion("dischargeDiagnosis <>", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisGreaterThan(String value) {
            addCriterion("dischargeDiagnosis >", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("dischargeDiagnosis >=", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisLessThan(String value) {
            addCriterion("dischargeDiagnosis <", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisLessThanOrEqualTo(String value) {
            addCriterion("dischargeDiagnosis <=", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisLike(String value) {
            addCriterion("dischargeDiagnosis like", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisNotLike(String value) {
            addCriterion("dischargeDiagnosis not like", value, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisIn(List<String> values) {
            addCriterion("dischargeDiagnosis in", values, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisNotIn(List<String> values) {
            addCriterion("dischargeDiagnosis not in", values, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisBetween(String value1, String value2) {
            addCriterion("dischargeDiagnosis between", value1, value2, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargediagnosisNotBetween(String value1, String value2) {
            addCriterion("dischargeDiagnosis not between", value1, value2, "dischargediagnosis");
            return (Criteria) this;
        }

        public Criteria andDischargestatusIsNull() {
            addCriterion("dischargeStatus is null");
            return (Criteria) this;
        }

        public Criteria andDischargestatusIsNotNull() {
            addCriterion("dischargeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDischargestatusEqualTo(String value) {
            addCriterion("dischargeStatus =", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusNotEqualTo(String value) {
            addCriterion("dischargeStatus <>", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusGreaterThan(String value) {
            addCriterion("dischargeStatus >", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusGreaterThanOrEqualTo(String value) {
            addCriterion("dischargeStatus >=", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusLessThan(String value) {
            addCriterion("dischargeStatus <", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusLessThanOrEqualTo(String value) {
            addCriterion("dischargeStatus <=", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusLike(String value) {
            addCriterion("dischargeStatus like", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusNotLike(String value) {
            addCriterion("dischargeStatus not like", value, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusIn(List<String> values) {
            addCriterion("dischargeStatus in", values, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusNotIn(List<String> values) {
            addCriterion("dischargeStatus not in", values, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusBetween(String value1, String value2) {
            addCriterion("dischargeStatus between", value1, value2, "dischargestatus");
            return (Criteria) this;
        }

        public Criteria andDischargestatusNotBetween(String value1, String value2) {
            addCriterion("dischargeStatus not between", value1, value2, "dischargestatus");
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