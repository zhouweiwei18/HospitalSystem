package com.njxzc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class OperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OperationExample() {
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

        public Criteria andOperationnumberIsNull() {
            addCriterion("\" operationNumber\" is null");
            return (Criteria) this;
        }

        public Criteria andOperationnumberIsNotNull() {
            addCriterion("\" operationNumber\" is not null");
            return (Criteria) this;
        }

        public Criteria andOperationnumberEqualTo(Integer value) {
            addCriterion("\" operationNumber\" =", value, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberNotEqualTo(Integer value) {
            addCriterion("\" operationNumber\" <>", value, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberGreaterThan(Integer value) {
            addCriterion("\" operationNumber\" >", value, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" operationNumber\" >=", value, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberLessThan(Integer value) {
            addCriterion("\" operationNumber\" <", value, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberLessThanOrEqualTo(Integer value) {
            addCriterion("\" operationNumber\" <=", value, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberIn(List<Integer> values) {
            addCriterion("\" operationNumber\" in", values, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberNotIn(List<Integer> values) {
            addCriterion("\" operationNumber\" not in", values, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberBetween(Integer value1, Integer value2) {
            addCriterion("\" operationNumber\" between", value1, value2, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andOperationnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("\" operationNumber\" not between", value1, value2, "operationnumber");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidIsNull() {
            addCriterion("chiefSurgeonId is null");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidIsNotNull() {
            addCriterion("chiefSurgeonId is not null");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidEqualTo(Integer value) {
            addCriterion("chiefSurgeonId =", value, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidNotEqualTo(Integer value) {
            addCriterion("chiefSurgeonId <>", value, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidGreaterThan(Integer value) {
            addCriterion("chiefSurgeonId >", value, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chiefSurgeonId >=", value, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidLessThan(Integer value) {
            addCriterion("chiefSurgeonId <", value, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidLessThanOrEqualTo(Integer value) {
            addCriterion("chiefSurgeonId <=", value, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidIn(List<Integer> values) {
            addCriterion("chiefSurgeonId in", values, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidNotIn(List<Integer> values) {
            addCriterion("chiefSurgeonId not in", values, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidBetween(Integer value1, Integer value2) {
            addCriterion("chiefSurgeonId between", value1, value2, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andChiefsurgeonidNotBetween(Integer value1, Integer value2) {
            addCriterion("chiefSurgeonId not between", value1, value2, "chiefsurgeonid");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberIsNull() {
            addCriterion("admissionNumber is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberIsNotNull() {
            addCriterion("admissionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberEqualTo(Integer value) {
            addCriterion("admissionNumber =", value, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberNotEqualTo(Integer value) {
            addCriterion("admissionNumber <>", value, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberGreaterThan(Integer value) {
            addCriterion("admissionNumber >", value, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("admissionNumber >=", value, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberLessThan(Integer value) {
            addCriterion("admissionNumber <", value, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberLessThanOrEqualTo(Integer value) {
            addCriterion("admissionNumber <=", value, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberIn(List<Integer> values) {
            addCriterion("admissionNumber in", values, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberNotIn(List<Integer> values) {
            addCriterion("admissionNumber not in", values, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberBetween(Integer value1, Integer value2) {
            addCriterion("admissionNumber between", value1, value2, "admissionnumber");
            return (Criteria) this;
        }

        public Criteria andAdmissionnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("admissionNumber not between", value1, value2, "admissionnumber");
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

        public Criteria andOperationnameIsNull() {
            addCriterion("operationName is null");
            return (Criteria) this;
        }

        public Criteria andOperationnameIsNotNull() {
            addCriterion("operationName is not null");
            return (Criteria) this;
        }

        public Criteria andOperationnameEqualTo(String value) {
            addCriterion("operationName =", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotEqualTo(String value) {
            addCriterion("operationName <>", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameGreaterThan(String value) {
            addCriterion("operationName >", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameGreaterThanOrEqualTo(String value) {
            addCriterion("operationName >=", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLessThan(String value) {
            addCriterion("operationName <", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLessThanOrEqualTo(String value) {
            addCriterion("operationName <=", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLike(String value) {
            addCriterion("operationName like", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotLike(String value) {
            addCriterion("operationName not like", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameIn(List<String> values) {
            addCriterion("operationName in", values, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotIn(List<String> values) {
            addCriterion("operationName not in", values, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameBetween(String value1, String value2) {
            addCriterion("operationName between", value1, value2, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotBetween(String value1, String value2) {
            addCriterion("operationName not between", value1, value2, "operationname");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeIsNull() {
            addCriterion("anaesthesiaMode is null");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeIsNotNull() {
            addCriterion("anaesthesiaMode is not null");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeEqualTo(Integer value) {
            addCriterion("anaesthesiaMode =", value, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeNotEqualTo(Integer value) {
            addCriterion("anaesthesiaMode <>", value, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeGreaterThan(Integer value) {
            addCriterion("anaesthesiaMode >", value, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("anaesthesiaMode >=", value, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeLessThan(Integer value) {
            addCriterion("anaesthesiaMode <", value, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeLessThanOrEqualTo(Integer value) {
            addCriterion("anaesthesiaMode <=", value, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeIn(List<Integer> values) {
            addCriterion("anaesthesiaMode in", values, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeNotIn(List<Integer> values) {
            addCriterion("anaesthesiaMode not in", values, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeBetween(Integer value1, Integer value2) {
            addCriterion("anaesthesiaMode between", value1, value2, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andAnaesthesiamodeNotBetween(Integer value1, Integer value2) {
            addCriterion("anaesthesiaMode not between", value1, value2, "anaesthesiamode");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionIsNull() {
            addCriterion("incisionCondition is null");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionIsNotNull() {
            addCriterion("incisionCondition is not null");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionEqualTo(String value) {
            addCriterion("incisionCondition =", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionNotEqualTo(String value) {
            addCriterion("incisionCondition <>", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionGreaterThan(String value) {
            addCriterion("incisionCondition >", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionGreaterThanOrEqualTo(String value) {
            addCriterion("incisionCondition >=", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionLessThan(String value) {
            addCriterion("incisionCondition <", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionLessThanOrEqualTo(String value) {
            addCriterion("incisionCondition <=", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionLike(String value) {
            addCriterion("incisionCondition like", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionNotLike(String value) {
            addCriterion("incisionCondition not like", value, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionIn(List<String> values) {
            addCriterion("incisionCondition in", values, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionNotIn(List<String> values) {
            addCriterion("incisionCondition not in", values, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionBetween(String value1, String value2) {
            addCriterion("incisionCondition between", value1, value2, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andIncisionconditionNotBetween(String value1, String value2) {
            addCriterion("incisionCondition not between", value1, value2, "incisioncondition");
            return (Criteria) this;
        }

        public Criteria andOperationdateIsNull() {
            addCriterion("\" operationDate\" is null");
            return (Criteria) this;
        }

        public Criteria andOperationdateIsNotNull() {
            addCriterion("\" operationDate\" is not null");
            return (Criteria) this;
        }

        public Criteria andOperationdateEqualTo(String value) {
            addCriterion("\" operationDate\" =", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateNotEqualTo(String value) {
            addCriterion("\" operationDate\" <>", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateGreaterThan(String value) {
            addCriterion("\" operationDate\" >", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateGreaterThanOrEqualTo(String value) {
            addCriterion("\" operationDate\" >=", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateLessThan(String value) {
            addCriterion("\" operationDate\" <", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateLessThanOrEqualTo(String value) {
            addCriterion("\" operationDate\" <=", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateLike(String value) {
            addCriterion("\" operationDate\" like", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateNotLike(String value) {
            addCriterion("\" operationDate\" not like", value, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateIn(List<String> values) {
            addCriterion("\" operationDate\" in", values, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateNotIn(List<String> values) {
            addCriterion("\" operationDate\" not in", values, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateBetween(String value1, String value2) {
            addCriterion("\" operationDate\" between", value1, value2, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdateNotBetween(String value1, String value2) {
            addCriterion("\" operationDate\" not between", value1, value2, "operationdate");
            return (Criteria) this;
        }

        public Criteria andOperationdurationIsNull() {
            addCriterion("operationDuration is null");
            return (Criteria) this;
        }

        public Criteria andOperationdurationIsNotNull() {
            addCriterion("operationDuration is not null");
            return (Criteria) this;
        }

        public Criteria andOperationdurationEqualTo(String value) {
            addCriterion("operationDuration =", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationNotEqualTo(String value) {
            addCriterion("operationDuration <>", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationGreaterThan(String value) {
            addCriterion("operationDuration >", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationGreaterThanOrEqualTo(String value) {
            addCriterion("operationDuration >=", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationLessThan(String value) {
            addCriterion("operationDuration <", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationLessThanOrEqualTo(String value) {
            addCriterion("operationDuration <=", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationLike(String value) {
            addCriterion("operationDuration like", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationNotLike(String value) {
            addCriterion("operationDuration not like", value, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationIn(List<String> values) {
            addCriterion("operationDuration in", values, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationNotIn(List<String> values) {
            addCriterion("operationDuration not in", values, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationBetween(String value1, String value2) {
            addCriterion("operationDuration between", value1, value2, "operationduration");
            return (Criteria) this;
        }

        public Criteria andOperationdurationNotBetween(String value1, String value2) {
            addCriterion("operationDuration not between", value1, value2, "operationduration");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsIsNull() {
            addCriterion("surgicalResults is null");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsIsNotNull() {
            addCriterion("surgicalResults is not null");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsEqualTo(String value) {
            addCriterion("surgicalResults =", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsNotEqualTo(String value) {
            addCriterion("surgicalResults <>", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsGreaterThan(String value) {
            addCriterion("surgicalResults >", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsGreaterThanOrEqualTo(String value) {
            addCriterion("surgicalResults >=", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsLessThan(String value) {
            addCriterion("surgicalResults <", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsLessThanOrEqualTo(String value) {
            addCriterion("surgicalResults <=", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsLike(String value) {
            addCriterion("surgicalResults like", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsNotLike(String value) {
            addCriterion("surgicalResults not like", value, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsIn(List<String> values) {
            addCriterion("surgicalResults in", values, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsNotIn(List<String> values) {
            addCriterion("surgicalResults not in", values, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsBetween(String value1, String value2) {
            addCriterion("surgicalResults between", value1, value2, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andSurgicalresultsNotBetween(String value1, String value2) {
            addCriterion("surgicalResults not between", value1, value2, "surgicalresults");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberIsNull() {
            addCriterion("operatingRoomNumber is null");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberIsNotNull() {
            addCriterion("operatingRoomNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberEqualTo(Integer value) {
            addCriterion("operatingRoomNumber =", value, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberNotEqualTo(Integer value) {
            addCriterion("operatingRoomNumber <>", value, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberGreaterThan(Integer value) {
            addCriterion("operatingRoomNumber >", value, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("operatingRoomNumber >=", value, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberLessThan(Integer value) {
            addCriterion("operatingRoomNumber <", value, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberLessThanOrEqualTo(Integer value) {
            addCriterion("operatingRoomNumber <=", value, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberIn(List<Integer> values) {
            addCriterion("operatingRoomNumber in", values, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberNotIn(List<Integer> values) {
            addCriterion("operatingRoomNumber not in", values, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberBetween(Integer value1, Integer value2) {
            addCriterion("operatingRoomNumber between", value1, value2, "operatingroomnumber");
            return (Criteria) this;
        }

        public Criteria andOperatingroomnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("operatingRoomNumber not between", value1, value2, "operatingroomnumber");
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