package com.evaluation.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherEntityExample() {
        oredCriteria = new ArrayList<>();
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
        if (oredCriteria.isEmpty()) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        return new Criteria();
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return !criteria.isEmpty();
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value) {
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2) {
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value);
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value);
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value);
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value);
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value);
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value);
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values);
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values);
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoIsNull() {
            addCriterion("tea_bianhao is null");
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoIsNotNull() {
            addCriterion("tea_bianhao is not null");
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoEqualTo(String value) {
            addCriterion("tea_bianhao =", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoNotEqualTo(String value) {
            addCriterion("tea_bianhao <>", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoGreaterThan(String value) {
            addCriterion("tea_bianhao >", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("tea_bianhao >=", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoLessThan(String value) {
            addCriterion("tea_bianhao <", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoLessThanOrEqualTo(String value) {
            addCriterion("tea_bianhao <=", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoLike(String value) {
            addCriterion("tea_bianhao like", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoNotLike(String value) {
            addCriterion("tea_bianhao not like", value);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoIn(List<String> values) {
            addCriterion("tea_bianhao in", values);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoNotIn(List<String> values) {
            addCriterion("tea_bianhao not in", values);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoBetween(String value1, String value2) {
            addCriterion("tea_bianhao between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaBianhaoNotBetween(String value1, String value2) {
            addCriterion("tea_bianhao not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameIsNull() {
            addCriterion("tea_realname is null");
            return (Criteria) this;
        }

        public Criteria andTeaRealnameIsNotNull() {
            addCriterion("tea_realname is not null");
            return (Criteria) this;
        }

        public Criteria andTeaRealnameEqualTo(String value) {
            addCriterion("tea_realname =", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameNotEqualTo(String value) {
            addCriterion("tea_realname <>", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameGreaterThan(String value) {
            addCriterion("tea_realname >", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_realname >=", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameLessThan(String value) {
            addCriterion("tea_realname <", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameLessThanOrEqualTo(String value) {
            addCriterion("tea_realname <=", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameLike(String value) {
            addCriterion("tea_realname like", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameNotLike(String value) {
            addCriterion("tea_realname not like", value);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameIn(List<String> values) {
            addCriterion("tea_realname in", values);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameNotIn(List<String> values) {
            addCriterion("tea_realname not in", values);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameBetween(String value1, String value2) {
            addCriterion("tea_realname between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaRealnameNotBetween(String value1, String value2) {
            addCriterion("tea_realname not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(String value) {
            addCriterion("tea_sex =", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(String value) {
            addCriterion("tea_sex <>", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(String value) {
            addCriterion("tea_sex >", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(String value) {
            addCriterion("tea_sex >=", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(String value) {
            addCriterion("tea_sex <", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(String value) {
            addCriterion("tea_sex <=", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexLike(String value) {
            addCriterion("tea_sex like", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexNotLike(String value) {
            addCriterion("tea_sex not like", value);
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<String> values) {
            addCriterion("tea_sex in", values);
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<String> values) {
            addCriterion("tea_sex not in", values);
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(String value1, String value2) {
            addCriterion("tea_sex between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(String value1, String value2) {
            addCriterion("tea_sex not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNull() {
            addCriterion("tea_age is null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNotNull() {
            addCriterion("tea_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeEqualTo(String value) {
            addCriterion("tea_age =", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotEqualTo(String value) {
            addCriterion("tea_age <>", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThan(String value) {
            addCriterion("tea_age >", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThanOrEqualTo(String value) {
            addCriterion("tea_age >=", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThan(String value) {
            addCriterion("tea_age <", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThanOrEqualTo(String value) {
            addCriterion("tea_age <=", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeLike(String value) {
            addCriterion("tea_age like", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotLike(String value) {
            addCriterion("tea_age not like", value);
            return (Criteria) this;
        }

        public Criteria andTeaAgeIn(List<String> values) {
            addCriterion("tea_age in", values);
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotIn(List<String> values) {
            addCriterion("tea_age not in", values);
            return (Criteria) this;
        }

        public Criteria andTeaAgeBetween(String value1, String value2) {
            addCriterion("tea_age between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotBetween(String value1, String value2) {
            addCriterion("tea_age not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value);
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values);
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values);
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andLoginPwIsNull() {
            addCriterion("login_pw is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwIsNotNull() {
            addCriterion("login_pw is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwEqualTo(String value) {
            addCriterion("login_pw =", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwNotEqualTo(String value) {
            addCriterion("login_pw <>", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwGreaterThan(String value) {
            addCriterion("login_pw >", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwGreaterThanOrEqualTo(String value) {
            addCriterion("login_pw >=", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwLessThan(String value) {
            addCriterion("login_pw <", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwLessThanOrEqualTo(String value) {
            addCriterion("login_pw <=", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwLike(String value) {
            addCriterion("login_pw like", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwNotLike(String value) {
            addCriterion("login_pw not like", value);
            return (Criteria) this;
        }

        public Criteria andLoginPwIn(List<String> values) {
            addCriterion("login_pw in", values);
            return (Criteria) this;
        }

        public Criteria andLoginPwNotIn(List<String> values) {
            addCriterion("login_pw not in", values);
            return (Criteria) this;
        }

        public Criteria andLoginPwBetween(String value1, String value2) {
            addCriterion("login_pw between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andLoginPwNotBetween(String value1, String value2) {
            addCriterion("login_pw not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(String value) {
            addCriterion("del =", value);
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(String value) {
            addCriterion("del <>", value);
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(String value) {
            addCriterion("del >", value);
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(String value) {
            addCriterion("del >=", value);
            return (Criteria) this;
        }

        public Criteria andDelLessThan(String value) {
            addCriterion("del <", value);
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(String value) {
            addCriterion("del <=", value);
            return (Criteria) this;
        }

        public Criteria andDelLike(String value) {
            addCriterion("del like", value);
            return (Criteria) this;
        }

        public Criteria andDelNotLike(String value) {
            addCriterion("del not like", value);
            return (Criteria) this;
        }

        public Criteria andDelIn(List<String> values) {
            addCriterion("del in", values);
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<String> values) {
            addCriterion("del not in", values);
            return (Criteria) this;
        }

        public Criteria andDelBetween(String value1, String value2) {
            addCriterion("del between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(String value1, String value2) {
            addCriterion("del not between", value1, value2);
            return (Criteria) this;
        }
    }

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