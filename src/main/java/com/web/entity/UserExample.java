package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("userPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("userPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("userPwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("userPwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("userPwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("userPwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("userPwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("userPwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("userPwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("userPwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("userPwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("userPwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("userPwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("userPwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("userSex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("userSex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("userSex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("userSex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("userSex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("userSex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("userSex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("userSex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("userSex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("userSex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("userSex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("userSex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNull() {
            addCriterion("userPhoto is null");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNotNull() {
            addCriterion("userPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andUserphotoEqualTo(String value) {
            addCriterion("userPhoto =", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotEqualTo(String value) {
            addCriterion("userPhoto <>", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThan(String value) {
            addCriterion("userPhoto >", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThanOrEqualTo(String value) {
            addCriterion("userPhoto >=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThan(String value) {
            addCriterion("userPhoto <", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThanOrEqualTo(String value) {
            addCriterion("userPhoto <=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLike(String value) {
            addCriterion("userPhoto like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotLike(String value) {
            addCriterion("userPhoto not like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoIn(List<String> values) {
            addCriterion("userPhoto in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotIn(List<String> values) {
            addCriterion("userPhoto not in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoBetween(String value1, String value2) {
            addCriterion("userPhoto between", value1, value2, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotBetween(String value1, String value2) {
            addCriterion("userPhoto not between", value1, value2, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUsercardIsNull() {
            addCriterion("userCard is null");
            return (Criteria) this;
        }

        public Criteria andUsercardIsNotNull() {
            addCriterion("userCard is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardEqualTo(String value) {
            addCriterion("userCard =", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotEqualTo(String value) {
            addCriterion("userCard <>", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardGreaterThan(String value) {
            addCriterion("userCard >", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardGreaterThanOrEqualTo(String value) {
            addCriterion("userCard >=", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLessThan(String value) {
            addCriterion("userCard <", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLessThanOrEqualTo(String value) {
            addCriterion("userCard <=", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLike(String value) {
            addCriterion("userCard like", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotLike(String value) {
            addCriterion("userCard not like", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardIn(List<String> values) {
            addCriterion("userCard in", values, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotIn(List<String> values) {
            addCriterion("userCard not in", values, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardBetween(String value1, String value2) {
            addCriterion("userCard between", value1, value2, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotBetween(String value1, String value2) {
            addCriterion("userCard not between", value1, value2, "usercard");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postId not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andDesccIsNull() {
            addCriterion("descc is null");
            return (Criteria) this;
        }

        public Criteria andDesccIsNotNull() {
            addCriterion("descc is not null");
            return (Criteria) this;
        }

        public Criteria andDesccEqualTo(String value) {
            addCriterion("descc =", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccNotEqualTo(String value) {
            addCriterion("descc <>", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccGreaterThan(String value) {
            addCriterion("descc >", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccGreaterThanOrEqualTo(String value) {
            addCriterion("descc >=", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccLessThan(String value) {
            addCriterion("descc <", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccLessThanOrEqualTo(String value) {
            addCriterion("descc <=", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccLike(String value) {
            addCriterion("descc like", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccNotLike(String value) {
            addCriterion("descc not like", value, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccIn(List<String> values) {
            addCriterion("descc in", values, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccNotIn(List<String> values) {
            addCriterion("descc not in", values, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccBetween(String value1, String value2) {
            addCriterion("descc between", value1, value2, "descc");
            return (Criteria) this;
        }

        public Criteria andDesccNotBetween(String value1, String value2) {
            addCriterion("descc not between", value1, value2, "descc");
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