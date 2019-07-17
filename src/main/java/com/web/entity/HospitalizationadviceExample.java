package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class HospitalizationadviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HospitalizationadviceExample() {
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

        public Criteria andHospitalizationadviceidIsNull() {
            addCriterion("hospitalizationAdviceId is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidIsNotNull() {
            addCriterion("hospitalizationAdviceId is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId =", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidNotEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId <>", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidGreaterThan(Integer value) {
            addCriterion("hospitalizationAdviceId >", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId >=", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidLessThan(Integer value) {
            addCriterion("hospitalizationAdviceId <", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalizationAdviceId <=", value, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidIn(List<Integer> values) {
            addCriterion("hospitalizationAdviceId in", values, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidNotIn(List<Integer> values) {
            addCriterion("hospitalizationAdviceId not in", values, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationAdviceId between", value1, value2, "hospitalizationadviceid");
            return (Criteria) this;
        }

        public Criteria andHospitalizationadviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalizationAdviceId not between", value1, value2, "hospitalizationadviceid");
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

        public Criteria andAdvicecontentIsNull() {
            addCriterion("adviceContent is null");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentIsNotNull() {
            addCriterion("adviceContent is not null");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentEqualTo(String value) {
            addCriterion("adviceContent =", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentNotEqualTo(String value) {
            addCriterion("adviceContent <>", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentGreaterThan(String value) {
            addCriterion("adviceContent >", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentGreaterThanOrEqualTo(String value) {
            addCriterion("adviceContent >=", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentLessThan(String value) {
            addCriterion("adviceContent <", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentLessThanOrEqualTo(String value) {
            addCriterion("adviceContent <=", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentLike(String value) {
            addCriterion("adviceContent like", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentNotLike(String value) {
            addCriterion("adviceContent not like", value, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentIn(List<String> values) {
            addCriterion("adviceContent in", values, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentNotIn(List<String> values) {
            addCriterion("adviceContent not in", values, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentBetween(String value1, String value2) {
            addCriterion("adviceContent between", value1, value2, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andAdvicecontentNotBetween(String value1, String value2) {
            addCriterion("adviceContent not between", value1, value2, "advicecontent");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("doctorId =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("doctorId <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("doctorId >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorId >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("doctorId <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("doctorId <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("doctorId in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("doctorId not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("doctorId between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorId not between", value1, value2, "doctorid");
            return (Criteria) this;
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

        public Criteria andDiachargetimeIsNull() {
            addCriterion("diachargeTime is null");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeIsNotNull() {
            addCriterion("diachargeTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeEqualTo(String value) {
            addCriterion("diachargeTime =", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeNotEqualTo(String value) {
            addCriterion("diachargeTime <>", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeGreaterThan(String value) {
            addCriterion("diachargeTime >", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeGreaterThanOrEqualTo(String value) {
            addCriterion("diachargeTime >=", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeLessThan(String value) {
            addCriterion("diachargeTime <", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeLessThanOrEqualTo(String value) {
            addCriterion("diachargeTime <=", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeLike(String value) {
            addCriterion("diachargeTime like", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeNotLike(String value) {
            addCriterion("diachargeTime not like", value, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeIn(List<String> values) {
            addCriterion("diachargeTime in", values, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeNotIn(List<String> values) {
            addCriterion("diachargeTime not in", values, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeBetween(String value1, String value2) {
            addCriterion("diachargeTime between", value1, value2, "diachargetime");
            return (Criteria) this;
        }

        public Criteria andDiachargetimeNotBetween(String value1, String value2) {
            addCriterion("diachargeTime not between", value1, value2, "diachargetime");
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