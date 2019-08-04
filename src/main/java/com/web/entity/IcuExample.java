package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IcuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public IcuExample() {
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

        public Criteria andBednoIsNull() {
            addCriterion("bedNo is null");
            return (Criteria) this;
        }

        public Criteria andBednoIsNotNull() {
            addCriterion("bedNo is not null");
            return (Criteria) this;
        }

        public Criteria andBednoEqualTo(Integer value) {
            addCriterion("bedNo =", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotEqualTo(Integer value) {
            addCriterion("bedNo <>", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThan(Integer value) {
            addCriterion("bedNo >", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedNo >=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThan(Integer value) {
            addCriterion("bedNo <", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThanOrEqualTo(Integer value) {
            addCriterion("bedNo <=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoIn(List<Integer> values) {
            addCriterion("bedNo in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotIn(List<Integer> values) {
            addCriterion("bedNo not in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoBetween(Integer value1, Integer value2) {
            addCriterion("bedNo between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotBetween(Integer value1, Integer value2) {
            addCriterion("bedNo not between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andIcunameIsNull() {
            addCriterion("icuName is null");
            return (Criteria) this;
        }

        public Criteria andIcunameIsNotNull() {
            addCriterion("icuName is not null");
            return (Criteria) this;
        }

        public Criteria andIcunameEqualTo(String value) {
            addCriterion("icuName =", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameNotEqualTo(String value) {
            addCriterion("icuName <>", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameGreaterThan(String value) {
            addCriterion("icuName >", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameGreaterThanOrEqualTo(String value) {
            addCriterion("icuName >=", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameLessThan(String value) {
            addCriterion("icuName <", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameLessThanOrEqualTo(String value) {
            addCriterion("icuName <=", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameLike(String value) {
            addCriterion("icuName like", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameNotLike(String value) {
            addCriterion("icuName not like", value, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameIn(List<String> values) {
            addCriterion("icuName in", values, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameNotIn(List<String> values) {
            addCriterion("icuName not in", values, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameBetween(String value1, String value2) {
            addCriterion("icuName between", value1, value2, "icuname");
            return (Criteria) this;
        }

        public Criteria andIcunameNotBetween(String value1, String value2) {
            addCriterion("icuName not between", value1, value2, "icuname");
            return (Criteria) this;
        }

        public Criteria andChargepersonIsNull() {
            addCriterion("chargePerson is null");
            return (Criteria) this;
        }

        public Criteria andChargepersonIsNotNull() {
            addCriterion("chargePerson is not null");
            return (Criteria) this;
        }

        public Criteria andChargepersonEqualTo(Integer value) {
            addCriterion("chargePerson =", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonNotEqualTo(Integer value) {
            addCriterion("chargePerson <>", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonGreaterThan(Integer value) {
            addCriterion("chargePerson >", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargePerson >=", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonLessThan(Integer value) {
            addCriterion("chargePerson <", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonLessThanOrEqualTo(Integer value) {
            addCriterion("chargePerson <=", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonIn(List<Integer> values) {
            addCriterion("chargePerson in", values, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonNotIn(List<Integer> values) {
            addCriterion("chargePerson not in", values, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonBetween(Integer value1, Integer value2) {
            addCriterion("chargePerson between", value1, value2, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonNotBetween(Integer value1, Integer value2) {
            addCriterion("chargePerson not between", value1, value2, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoIsNull() {
            addCriterion("occupantsNo is null");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoIsNotNull() {
            addCriterion("occupantsNo is not null");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoEqualTo(Integer value) {
            addCriterion("occupantsNo =", value, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoNotEqualTo(Integer value) {
            addCriterion("occupantsNo <>", value, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoGreaterThan(Integer value) {
            addCriterion("occupantsNo >", value, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupantsNo >=", value, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoLessThan(Integer value) {
            addCriterion("occupantsNo <", value, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoLessThanOrEqualTo(Integer value) {
            addCriterion("occupantsNo <=", value, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoIn(List<Integer> values) {
            addCriterion("occupantsNo in", values, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoNotIn(List<Integer> values) {
            addCriterion("occupantsNo not in", values, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoBetween(Integer value1, Integer value2) {
            addCriterion("occupantsNo between", value1, value2, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andOccupantsnoNotBetween(Integer value1, Integer value2) {
            addCriterion("occupantsNo not between", value1, value2, "occupantsno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoIsNull() {
            addCriterion("dischargesNo is null");
            return (Criteria) this;
        }

        public Criteria andDischargesnoIsNotNull() {
            addCriterion("dischargesNo is not null");
            return (Criteria) this;
        }

        public Criteria andDischargesnoEqualTo(Integer value) {
            addCriterion("dischargesNo =", value, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoNotEqualTo(Integer value) {
            addCriterion("dischargesNo <>", value, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoGreaterThan(Integer value) {
            addCriterion("dischargesNo >", value, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dischargesNo >=", value, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoLessThan(Integer value) {
            addCriterion("dischargesNo <", value, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoLessThanOrEqualTo(Integer value) {
            addCriterion("dischargesNo <=", value, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoIn(List<Integer> values) {
            addCriterion("dischargesNo in", values, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoNotIn(List<Integer> values) {
            addCriterion("dischargesNo not in", values, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoBetween(Integer value1, Integer value2) {
            addCriterion("dischargesNo between", value1, value2, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andDischargesnoNotBetween(Integer value1, Integer value2) {
            addCriterion("dischargesNo not between", value1, value2, "dischargesno");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateIsNull() {
            addCriterion("treatmentRate is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateIsNotNull() {
            addCriterion("treatmentRate is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateEqualTo(Double value) {
            addCriterion("treatmentRate =", value, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateNotEqualTo(Double value) {
            addCriterion("treatmentRate <>", value, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateGreaterThan(Double value) {
            addCriterion("treatmentRate >", value, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateGreaterThanOrEqualTo(Double value) {
            addCriterion("treatmentRate >=", value, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateLessThan(Double value) {
            addCriterion("treatmentRate <", value, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateLessThanOrEqualTo(Double value) {
            addCriterion("treatmentRate <=", value, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateIn(List<Double> values) {
            addCriterion("treatmentRate in", values, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateNotIn(List<Double> values) {
            addCriterion("treatmentRate not in", values, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateBetween(Double value1, Double value2) {
            addCriterion("treatmentRate between", value1, value2, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andTreatmentrateNotBetween(Double value1, Double value2) {
            addCriterion("treatmentRate not between", value1, value2, "treatmentrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateIsNull() {
            addCriterion("improvementRate is null");
            return (Criteria) this;
        }

        public Criteria andImprovementrateIsNotNull() {
            addCriterion("improvementRate is not null");
            return (Criteria) this;
        }

        public Criteria andImprovementrateEqualTo(Double value) {
            addCriterion("improvementRate =", value, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateNotEqualTo(Double value) {
            addCriterion("improvementRate <>", value, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateGreaterThan(Double value) {
            addCriterion("improvementRate >", value, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateGreaterThanOrEqualTo(Double value) {
            addCriterion("improvementRate >=", value, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateLessThan(Double value) {
            addCriterion("improvementRate <", value, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateLessThanOrEqualTo(Double value) {
            addCriterion("improvementRate <=", value, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateIn(List<Double> values) {
            addCriterion("improvementRate in", values, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateNotIn(List<Double> values) {
            addCriterion("improvementRate not in", values, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateBetween(Double value1, Double value2) {
            addCriterion("improvementRate between", value1, value2, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andImprovementrateNotBetween(Double value1, Double value2) {
            addCriterion("improvementRate not between", value1, value2, "improvementrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateIsNull() {
            addCriterion("unhealedRate is null");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateIsNotNull() {
            addCriterion("unhealedRate is not null");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateEqualTo(Double value) {
            addCriterion("unhealedRate =", value, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateNotEqualTo(Double value) {
            addCriterion("unhealedRate <>", value, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateGreaterThan(Double value) {
            addCriterion("unhealedRate >", value, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateGreaterThanOrEqualTo(Double value) {
            addCriterion("unhealedRate >=", value, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateLessThan(Double value) {
            addCriterion("unhealedRate <", value, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateLessThanOrEqualTo(Double value) {
            addCriterion("unhealedRate <=", value, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateIn(List<Double> values) {
            addCriterion("unhealedRate in", values, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateNotIn(List<Double> values) {
            addCriterion("unhealedRate not in", values, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateBetween(Double value1, Double value2) {
            addCriterion("unhealedRate between", value1, value2, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andUnhealedrateNotBetween(Double value1, Double value2) {
            addCriterion("unhealedRate not between", value1, value2, "unhealedrate");
            return (Criteria) this;
        }

        public Criteria andMortalityIsNull() {
            addCriterion("mortality is null");
            return (Criteria) this;
        }

        public Criteria andMortalityIsNotNull() {
            addCriterion("mortality is not null");
            return (Criteria) this;
        }

        public Criteria andMortalityEqualTo(Double value) {
            addCriterion("mortality =", value, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityNotEqualTo(Double value) {
            addCriterion("mortality <>", value, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityGreaterThan(Double value) {
            addCriterion("mortality >", value, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityGreaterThanOrEqualTo(Double value) {
            addCriterion("mortality >=", value, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityLessThan(Double value) {
            addCriterion("mortality <", value, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityLessThanOrEqualTo(Double value) {
            addCriterion("mortality <=", value, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityIn(List<Double> values) {
            addCriterion("mortality in", values, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityNotIn(List<Double> values) {
            addCriterion("mortality not in", values, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityBetween(Double value1, Double value2) {
            addCriterion("mortality between", value1, value2, "mortality");
            return (Criteria) this;
        }

        public Criteria andMortalityNotBetween(Double value1, Double value2) {
            addCriterion("mortality not between", value1, value2, "mortality");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceIsNull() {
            addCriterion("diagnosticCoincidence is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceIsNotNull() {
            addCriterion("diagnosticCoincidence is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceEqualTo(String value) {
            addCriterion("diagnosticCoincidence =", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceNotEqualTo(String value) {
            addCriterion("diagnosticCoincidence <>", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceGreaterThan(String value) {
            addCriterion("diagnosticCoincidence >", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosticCoincidence >=", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceLessThan(String value) {
            addCriterion("diagnosticCoincidence <", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceLessThanOrEqualTo(String value) {
            addCriterion("diagnosticCoincidence <=", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceLike(String value) {
            addCriterion("diagnosticCoincidence like", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceNotLike(String value) {
            addCriterion("diagnosticCoincidence not like", value, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceIn(List<String> values) {
            addCriterion("diagnosticCoincidence in", values, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceNotIn(List<String> values) {
            addCriterion("diagnosticCoincidence not in", values, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceBetween(String value1, String value2) {
            addCriterion("diagnosticCoincidence between", value1, value2, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andDiagnosticcoincidenceNotBetween(String value1, String value2) {
            addCriterion("diagnosticCoincidence not between", value1, value2, "diagnosticcoincidence");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateIsNull() {
            addCriterion("bedUtilizationRate is null");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateIsNotNull() {
            addCriterion("bedUtilizationRate is not null");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateEqualTo(Double value) {
            addCriterion("bedUtilizationRate =", value, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateNotEqualTo(Double value) {
            addCriterion("bedUtilizationRate <>", value, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateGreaterThan(Double value) {
            addCriterion("bedUtilizationRate >", value, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateGreaterThanOrEqualTo(Double value) {
            addCriterion("bedUtilizationRate >=", value, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateLessThan(Double value) {
            addCriterion("bedUtilizationRate <", value, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateLessThanOrEqualTo(Double value) {
            addCriterion("bedUtilizationRate <=", value, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateIn(List<Double> values) {
            addCriterion("bedUtilizationRate in", values, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateNotIn(List<Double> values) {
            addCriterion("bedUtilizationRate not in", values, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateBetween(Double value1, Double value2) {
            addCriterion("bedUtilizationRate between", value1, value2, "bedutilizationrate");
            return (Criteria) this;
        }

        public Criteria andBedutilizationrateNotBetween(Double value1, Double value2) {
            addCriterion("bedUtilizationRate not between", value1, value2, "bedutilizationrate");
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