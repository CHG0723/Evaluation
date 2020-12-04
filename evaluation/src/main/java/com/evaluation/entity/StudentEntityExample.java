package com.evaluation.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentEntityExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value);
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value);
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value);
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value);
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value);
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value);
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values);
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values);
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoIsNull() {
            addCriterion("stu_xuehao is null");
            return (Criteria) this;
        }

        public Criteria andStuXuehaoIsNotNull() {
            addCriterion("stu_xuehao is not null");
            return (Criteria) this;
        }

        public Criteria andStuXuehaoEqualTo(String value) {
            addCriterion("stu_xuehao =", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoNotEqualTo(String value) {
            addCriterion("stu_xuehao <>", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoGreaterThan(String value) {
            addCriterion("stu_xuehao >", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoGreaterThanOrEqualTo(String value) {
            addCriterion("stu_xuehao >=", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoLessThan(String value) {
            addCriterion("stu_xuehao <", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoLessThanOrEqualTo(String value) {
            addCriterion("stu_xuehao <=", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoLike(String value) {
            addCriterion("stu_xuehao like", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoNotLike(String value) {
            addCriterion("stu_xuehao not like", value);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoIn(List<String> values) {
            addCriterion("stu_xuehao in", values);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoNotIn(List<String> values) {
            addCriterion("stu_xuehao not in", values);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoBetween(String value1, String value2) {
            addCriterion("stu_xuehao between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuXuehaoNotBetween(String value1, String value2) {
            addCriterion("stu_xuehao not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuRealnameIsNull() {
            addCriterion("stu_realname is null");
            return (Criteria) this;
        }

        public Criteria andStuRealnameIsNotNull() {
            addCriterion("stu_realname is not null");
            return (Criteria) this;
        }

        public Criteria andStuRealnameEqualTo(String value) {
            addCriterion("stu_realname =", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameNotEqualTo(String value) {
            addCriterion("stu_realname <>", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameGreaterThan(String value) {
            addCriterion("stu_realname >", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_realname >=", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameLessThan(String value) {
            addCriterion("stu_realname <", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameLessThanOrEqualTo(String value) {
            addCriterion("stu_realname <=", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameLike(String value) {
            addCriterion("stu_realname like", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameNotLike(String value) {
            addCriterion("stu_realname not like", value);
            return (Criteria) this;
        }

        public Criteria andStuRealnameIn(List<String> values) {
            addCriterion("stu_realname in", values);
            return (Criteria) this;
        }

        public Criteria andStuRealnameNotIn(List<String> values) {
            addCriterion("stu_realname not in", values);
            return (Criteria) this;
        }

        public Criteria andStuRealnameBetween(String value1, String value2) {
            addCriterion("stu_realname between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuRealnameNotBetween(String value1, String value2) {
            addCriterion("stu_realname not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value);
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value);
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value);
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value);
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value);
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value);
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value);
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value);
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values);
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values);
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNull() {
            addCriterion("stu_age is null");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNotNull() {
            addCriterion("stu_age is not null");
            return (Criteria) this;
        }

        public Criteria andStuAgeEqualTo(String value) {
            addCriterion("stu_age =", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeNotEqualTo(String value) {
            addCriterion("stu_age <>", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThan(String value) {
            addCriterion("stu_age >", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_age >=", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThan(String value) {
            addCriterion("stu_age <", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThanOrEqualTo(String value) {
            addCriterion("stu_age <=", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeLike(String value) {
            addCriterion("stu_age like", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeNotLike(String value) {
            addCriterion("stu_age not like", value);
            return (Criteria) this;
        }

        public Criteria andStuAgeIn(List<String> values) {
            addCriterion("stu_age in", values);
            return (Criteria) this;
        }

        public Criteria andStuAgeNotIn(List<String> values) {
            addCriterion("stu_age not in", values);
            return (Criteria) this;
        }

        public Criteria andStuAgeBetween(String value1, String value2) {
            addCriterion("stu_age between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuAgeNotBetween(String value1, String value2) {
            addCriterion("stu_age not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuCardIsNull() {
            addCriterion("stu_card is null");
            return (Criteria) this;
        }

        public Criteria andStuCardIsNotNull() {
            addCriterion("stu_card is not null");
            return (Criteria) this;
        }

        public Criteria andStuCardEqualTo(String value) {
            addCriterion("stu_card =", value);
            return (Criteria) this;
        }

        public Criteria andStuCardNotEqualTo(String value) {
            addCriterion("stu_card <>", value);
            return (Criteria) this;
        }

        public Criteria andStuCardGreaterThan(String value) {
            addCriterion("stu_card >", value);
            return (Criteria) this;
        }

        public Criteria andStuCardGreaterThanOrEqualTo(String value) {
            addCriterion("stu_card >=", value);
            return (Criteria) this;
        }

        public Criteria andStuCardLessThan(String value) {
            addCriterion("stu_card <", value);
            return (Criteria) this;
        }

        public Criteria andStuCardLessThanOrEqualTo(String value) {
            addCriterion("stu_card <=", value);
            return (Criteria) this;
        }

        public Criteria andStuCardLike(String value) {
            addCriterion("stu_card like", value);
            return (Criteria) this;
        }

        public Criteria andStuCardNotLike(String value) {
            addCriterion("stu_card not like", value);
            return (Criteria) this;
        }

        public Criteria andStuCardIn(List<String> values) {
            addCriterion("stu_card in", values);
            return (Criteria) this;
        }

        public Criteria andStuCardNotIn(List<String> values) {
            addCriterion("stu_card not in", values);
            return (Criteria) this;
        }

        public Criteria andStuCardBetween(String value1, String value2) {
            addCriterion("stu_card between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuCardNotBetween(String value1, String value2) {
            addCriterion("stu_card not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoIsNull() {
            addCriterion("stu_zhengzhimianmao is null");
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoIsNotNull() {
            addCriterion("stu_zhengzhimianmao is not null");
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoEqualTo(String value) {
            addCriterion("stu_zhengzhimianmao =", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoNotEqualTo(String value) {
            addCriterion("stu_zhengzhimianmao <>", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoGreaterThan(String value) {
            addCriterion("stu_zhengzhimianmao >", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoGreaterThanOrEqualTo(String value) {
            addCriterion("stu_zhengzhimianmao >=", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoLessThan(String value) {
            addCriterion("stu_zhengzhimianmao <", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoLessThanOrEqualTo(String value) {
            addCriterion("stu_zhengzhimianmao <=", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoLike(String value) {
            addCriterion("stu_zhengzhimianmao like", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoNotLike(String value) {
            addCriterion("stu_zhengzhimianmao not like", value);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoIn(List<String> values) {
            addCriterion("stu_zhengzhimianmao in", values);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoNotIn(List<String> values) {
            addCriterion("stu_zhengzhimianmao not in", values);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoBetween(String value1, String value2) {
            addCriterion("stu_zhengzhimianmao between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andStuZhengzhimianmaoNotBetween(String value1, String value2) {
            addCriterion("stu_zhengzhimianmao not between", value1, value2);
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