package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class BedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BedExample() {
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

        public Criteria andIcuidIsNull() {
            addCriterion("icuId is null");
            return (Criteria) this;
        }

        public Criteria andIcuidIsNotNull() {
            addCriterion("icuId is not null");
            return (Criteria) this;
        }

        public Criteria andIcuidEqualTo(Integer value) {
            addCriterion("icuId =", value, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidNotEqualTo(Integer value) {
            addCriterion("icuId <>", value, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidGreaterThan(Integer value) {
            addCriterion("icuId >", value, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("icuId >=", value, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidLessThan(Integer value) {
            addCriterion("icuId <", value, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidLessThanOrEqualTo(Integer value) {
            addCriterion("icuId <=", value, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidIn(List<Integer> values) {
            addCriterion("icuId in", values, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidNotIn(List<Integer> values) {
            addCriterion("icuId not in", values, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidBetween(Integer value1, Integer value2) {
            addCriterion("icuId between", value1, value2, "icuid");
            return (Criteria) this;
        }

        public Criteria andIcuidNotBetween(Integer value1, Integer value2) {
            addCriterion("icuId not between", value1, value2, "icuid");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianIsNull() {
            addCriterion("competentPhysician is null");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianIsNotNull() {
            addCriterion("competentPhysician is not null");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianEqualTo(Integer value) {
            addCriterion("competentPhysician =", value, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianNotEqualTo(Integer value) {
            addCriterion("competentPhysician <>", value, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianGreaterThan(Integer value) {
            addCriterion("competentPhysician >", value, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianGreaterThanOrEqualTo(Integer value) {
            addCriterion("competentPhysician >=", value, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianLessThan(Integer value) {
            addCriterion("competentPhysician <", value, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianLessThanOrEqualTo(Integer value) {
            addCriterion("competentPhysician <=", value, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianIn(List<Integer> values) {
            addCriterion("competentPhysician in", values, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianNotIn(List<Integer> values) {
            addCriterion("competentPhysician not in", values, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianBetween(Integer value1, Integer value2) {
            addCriterion("competentPhysician between", value1, value2, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andCompetentphysicianNotBetween(Integer value1, Integer value2) {
            addCriterion("competentPhysician not between", value1, value2, "competentphysician");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidIsNull() {
            addCriterion("watchKeeperId is null");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidIsNotNull() {
            addCriterion("watchKeeperId is not null");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidEqualTo(Integer value) {
            addCriterion("watchKeeperId =", value, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidNotEqualTo(Integer value) {
            addCriterion("watchKeeperId <>", value, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidGreaterThan(Integer value) {
            addCriterion("watchKeeperId >", value, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchKeeperId >=", value, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidLessThan(Integer value) {
            addCriterion("watchKeeperId <", value, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidLessThanOrEqualTo(Integer value) {
            addCriterion("watchKeeperId <=", value, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidIn(List<Integer> values) {
            addCriterion("watchKeeperId in", values, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidNotIn(List<Integer> values) {
            addCriterion("watchKeeperId not in", values, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidBetween(Integer value1, Integer value2) {
            addCriterion("watchKeeperId between", value1, value2, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andWatchkeeperidNotBetween(Integer value1, Integer value2) {
            addCriterion("watchKeeperId not between", value1, value2, "watchkeeperid");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeIsNull() {
            addCriterion("therapeuticOutcome is null");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeIsNotNull() {
            addCriterion("therapeuticOutcome is not null");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeEqualTo(String value) {
            addCriterion("therapeuticOutcome =", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeNotEqualTo(String value) {
            addCriterion("therapeuticOutcome <>", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeGreaterThan(String value) {
            addCriterion("therapeuticOutcome >", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeGreaterThanOrEqualTo(String value) {
            addCriterion("therapeuticOutcome >=", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeLessThan(String value) {
            addCriterion("therapeuticOutcome <", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeLessThanOrEqualTo(String value) {
            addCriterion("therapeuticOutcome <=", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeLike(String value) {
            addCriterion("therapeuticOutcome like", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeNotLike(String value) {
            addCriterion("therapeuticOutcome not like", value, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeIn(List<String> values) {
            addCriterion("therapeuticOutcome in", values, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeNotIn(List<String> values) {
            addCriterion("therapeuticOutcome not in", values, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeBetween(String value1, String value2) {
            addCriterion("therapeuticOutcome between", value1, value2, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andTherapeuticoutcomeNotBetween(String value1, String value2) {
            addCriterion("therapeuticOutcome not between", value1, value2, "therapeuticoutcome");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotIsNull() {
            addCriterion("bedEmptyOrNot is null");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotIsNotNull() {
            addCriterion("bedEmptyOrNot is not null");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotEqualTo(Integer value) {
            addCriterion("bedEmptyOrNot =", value, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotNotEqualTo(Integer value) {
            addCriterion("bedEmptyOrNot <>", value, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotGreaterThan(Integer value) {
            addCriterion("bedEmptyOrNot >", value, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedEmptyOrNot >=", value, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotLessThan(Integer value) {
            addCriterion("bedEmptyOrNot <", value, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotLessThanOrEqualTo(Integer value) {
            addCriterion("bedEmptyOrNot <=", value, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotIn(List<Integer> values) {
            addCriterion("bedEmptyOrNot in", values, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotNotIn(List<Integer> values) {
            addCriterion("bedEmptyOrNot not in", values, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotBetween(Integer value1, Integer value2) {
            addCriterion("bedEmptyOrNot between", value1, value2, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedemptyornotNotBetween(Integer value1, Integer value2) {
            addCriterion("bedEmptyOrNot not between", value1, value2, "bedemptyornot");
            return (Criteria) this;
        }

        public Criteria andBedrentIsNull() {
            addCriterion("bedRent is null");
            return (Criteria) this;
        }

        public Criteria andBedrentIsNotNull() {
            addCriterion("bedRent is not null");
            return (Criteria) this;
        }

        public Criteria andBedrentEqualTo(Integer value) {
            addCriterion("bedRent =", value, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentNotEqualTo(Integer value) {
            addCriterion("bedRent <>", value, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentGreaterThan(Integer value) {
            addCriterion("bedRent >", value, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedRent >=", value, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentLessThan(Integer value) {
            addCriterion("bedRent <", value, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentLessThanOrEqualTo(Integer value) {
            addCriterion("bedRent <=", value, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentIn(List<Integer> values) {
            addCriterion("bedRent in", values, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentNotIn(List<Integer> values) {
            addCriterion("bedRent not in", values, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentBetween(Integer value1, Integer value2) {
            addCriterion("bedRent between", value1, value2, "bedrent");
            return (Criteria) this;
        }

        public Criteria andBedrentNotBetween(Integer value1, Integer value2) {
            addCriterion("bedRent not between", value1, value2, "bedrent");
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