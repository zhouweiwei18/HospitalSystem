package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MenuExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuId is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuId is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuId =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuId <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuId >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuId >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuId <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuId <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuId in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuId not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuId between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuId not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("menuURL is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("menuURL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("menuURL =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("menuURL <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("menuURL >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("menuURL >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("menuURL <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("menuURL <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("menuURL like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("menuURL not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("menuURL in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("menuURL not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("menuURL between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("menuURL not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageIsNull() {
            addCriterion("menuImage is null");
            return (Criteria) this;
        }

        public Criteria andMenuimageIsNotNull() {
            addCriterion("menuImage is not null");
            return (Criteria) this;
        }

        public Criteria andMenuimageEqualTo(String value) {
            addCriterion("menuImage =", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotEqualTo(String value) {
            addCriterion("menuImage <>", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageGreaterThan(String value) {
            addCriterion("menuImage >", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageGreaterThanOrEqualTo(String value) {
            addCriterion("menuImage >=", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageLessThan(String value) {
            addCriterion("menuImage <", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageLessThanOrEqualTo(String value) {
            addCriterion("menuImage <=", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageLike(String value) {
            addCriterion("menuImage like", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotLike(String value) {
            addCriterion("menuImage not like", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageIn(List<String> values) {
            addCriterion("menuImage in", values, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotIn(List<String> values) {
            addCriterion("menuImage not in", values, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageBetween(String value1, String value2) {
            addCriterion("menuImage between", value1, value2, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotBetween(String value1, String value2) {
            addCriterion("menuImage not between", value1, value2, "menuimage");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNull() {
            addCriterion("menuLevel is null");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNotNull() {
            addCriterion("menuLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMenulevelEqualTo(Integer value) {
            addCriterion("menuLevel =", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotEqualTo(Integer value) {
            addCriterion("menuLevel <>", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThan(Integer value) {
            addCriterion("menuLevel >", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuLevel >=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThan(Integer value) {
            addCriterion("menuLevel <", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThanOrEqualTo(Integer value) {
            addCriterion("menuLevel <=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelIn(List<Integer> values) {
            addCriterion("menuLevel in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotIn(List<Integer> values) {
            addCriterion("menuLevel not in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelBetween(Integer value1, Integer value2) {
            addCriterion("menuLevel between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotBetween(Integer value1, Integer value2) {
            addCriterion("menuLevel not between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenusortIsNull() {
            addCriterion("menuSort is null");
            return (Criteria) this;
        }

        public Criteria andMenusortIsNotNull() {
            addCriterion("menuSort is not null");
            return (Criteria) this;
        }

        public Criteria andMenusortEqualTo(Integer value) {
            addCriterion("menuSort =", value, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortNotEqualTo(Integer value) {
            addCriterion("menuSort <>", value, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortGreaterThan(Integer value) {
            addCriterion("menuSort >", value, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuSort >=", value, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortLessThan(Integer value) {
            addCriterion("menuSort <", value, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortLessThanOrEqualTo(Integer value) {
            addCriterion("menuSort <=", value, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortIn(List<Integer> values) {
            addCriterion("menuSort in", values, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortNotIn(List<Integer> values) {
            addCriterion("menuSort not in", values, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortBetween(Integer value1, Integer value2) {
            addCriterion("menuSort between", value1, value2, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenusortNotBetween(Integer value1, Integer value2) {
            addCriterion("menuSort not between", value1, value2, "menusort");
            return (Criteria) this;
        }

        public Criteria andMenudeleteIsNull() {
            addCriterion("menuDelete is null");
            return (Criteria) this;
        }

        public Criteria andMenudeleteIsNotNull() {
            addCriterion("menuDelete is not null");
            return (Criteria) this;
        }

        public Criteria andMenudeleteEqualTo(Integer value) {
            addCriterion("menuDelete =", value, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteNotEqualTo(Integer value) {
            addCriterion("menuDelete <>", value, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteGreaterThan(Integer value) {
            addCriterion("menuDelete >", value, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuDelete >=", value, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteLessThan(Integer value) {
            addCriterion("menuDelete <", value, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteLessThanOrEqualTo(Integer value) {
            addCriterion("menuDelete <=", value, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteIn(List<Integer> values) {
            addCriterion("menuDelete in", values, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteNotIn(List<Integer> values) {
            addCriterion("menuDelete not in", values, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteBetween(Integer value1, Integer value2) {
            addCriterion("menuDelete between", value1, value2, "menudelete");
            return (Criteria) this;
        }

        public Criteria andMenudeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("menuDelete not between", value1, value2, "menudelete");
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