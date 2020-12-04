package com.evaluation.entity;

import java.util.ArrayList;
import java.util.List;

public class FenshuEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FenshuEntityExample() {
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

        public Criteria andFenshuIdIsNull() {
            addCriterion("fenshu_id is null");
            return (Criteria) this;
        }

        public Criteria andFenshuIdIsNotNull() {
            addCriterion("fenshu_id is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuIdEqualTo(Integer value) {
            addCriterion("fenshu_id =", value);
            return (Criteria) this;
        }

        public Criteria andFenshuIdNotEqualTo(Integer value) {
            addCriterion("fenshu_id <>", value);
            return (Criteria) this;
        }

        public Criteria andFenshuIdGreaterThan(Integer value) {
            addCriterion("fenshu_id >", value);
            return (Criteria) this;
        }

        public Criteria andFenshuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenshu_id >=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuIdLessThan(Integer value) {
            addCriterion("fenshu_id <", value);
            return (Criteria) this;
        }

        public Criteria andFenshuIdLessThanOrEqualTo(Integer value) {
            addCriterion("fenshu_id <=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuIdIn(List<Integer> values) {
            addCriterion("fenshu_id in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuIdNotIn(List<Integer> values) {
            addCriterion("fenshu_id not in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuIdBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_id between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_id not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuIsNull() {
            addCriterion("fenshu_fenshu is null");
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuIsNotNull() {
            addCriterion("fenshu_fenshu is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuEqualTo(Double value) {
            addCriterion("fenshu_fenshu =", value);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuNotEqualTo(Double value) {
            addCriterion("fenshu_fenshu <>", value);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuGreaterThan(Double value) {
            addCriterion("fenshu_fenshu >", value);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuGreaterThanOrEqualTo(Double value) {
            addCriterion("fenshu_fenshu >=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuLessThan(Double value) {
            addCriterion("fenshu_fenshu <", value);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuLessThanOrEqualTo(Double value) {
            addCriterion("fenshu_fenshu <=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuIn(List<Double> values) {
            addCriterion("fenshu_fenshu in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuNotIn(List<Double> values) {
            addCriterion("fenshu_fenshu not in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuBetween(Double value1, Double value2) {
            addCriterion("fenshu_fenshu between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuFenshuNotBetween(Double value1, Double value2) {
            addCriterion("fenshu_fenshu not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdIsNull() {
            addCriterion("fenshu_erjizhibiao_id is null");
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdIsNotNull() {
            addCriterion("fenshu_erjizhibiao_id is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdEqualTo(Integer value) {
            addCriterion("fenshu_erjizhibiao_id =", value);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdNotEqualTo(Integer value) {
            addCriterion("fenshu_erjizhibiao_id <>", value);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdGreaterThan(Integer value) {
            addCriterion("fenshu_erjizhibiao_id >", value);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenshu_erjizhibiao_id >=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdLessThan(Integer value) {
            addCriterion("fenshu_erjizhibiao_id <", value);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("fenshu_erjizhibiao_id <=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdIn(List<Integer> values) {
            addCriterion("fenshu_erjizhibiao_id in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdNotIn(List<Integer> values) {
            addCriterion("fenshu_erjizhibiao_id not in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_erjizhibiao_id between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuErjizhibiaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_erjizhibiao_id not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidIsNull() {
            addCriterion("fenshu_teaId is null");
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidIsNotNull() {
            addCriterion("fenshu_teaId is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidEqualTo(Integer value) {
            addCriterion("fenshu_teaId =", value);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidNotEqualTo(Integer value) {
            addCriterion("fenshu_teaId <>", value);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidGreaterThan(Integer value) {
            addCriterion("fenshu_teaId >", value);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenshu_teaId >=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidLessThan(Integer value) {
            addCriterion("fenshu_teaId <", value);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidLessThanOrEqualTo(Integer value) {
            addCriterion("fenshu_teaId <=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidIn(List<Integer> values) {
            addCriterion("fenshu_teaId in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidNotIn(List<Integer> values) {
            addCriterion("fenshu_teaId not in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_teaId between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuTeaidNotBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_teaId not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidIsNull() {
            addCriterion("fenshu_stuId is null");
            return (Criteria) this;
        }

        public Criteria andFenshuStuidIsNotNull() {
            addCriterion("fenshu_stuId is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuStuidEqualTo(Integer value) {
            addCriterion("fenshu_stuId =", value);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidNotEqualTo(Integer value) {
            addCriterion("fenshu_stuId <>", value);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidGreaterThan(Integer value) {
            addCriterion("fenshu_stuId >", value);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenshu_stuId >=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidLessThan(Integer value) {
            addCriterion("fenshu_stuId <", value);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidLessThanOrEqualTo(Integer value) {
            addCriterion("fenshu_stuId <=", value);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidIn(List<Integer> values) {
            addCriterion("fenshu_stuId in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidNotIn(List<Integer> values) {
            addCriterion("fenshu_stuId not in", values);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_stuId between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andFenshuStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("fenshu_stuId not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andShijianIsNull() {
            addCriterion("shijian is null");
            return (Criteria) this;
        }

        public Criteria andShijianIsNotNull() {
            addCriterion("shijian is not null");
            return (Criteria) this;
        }

        public Criteria andShijianEqualTo(String value) {
            addCriterion("shijian =", value);
            return (Criteria) this;
        }

        public Criteria andShijianNotEqualTo(String value) {
            addCriterion("shijian <>", value);
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThan(String value) {
            addCriterion("shijian >", value);
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThanOrEqualTo(String value) {
            addCriterion("shijian >=", value);
            return (Criteria) this;
        }

        public Criteria andShijianLessThan(String value) {
            addCriterion("shijian <", value);
            return (Criteria) this;
        }

        public Criteria andShijianLessThanOrEqualTo(String value) {
            addCriterion("shijian <=", value);
            return (Criteria) this;
        }

        public Criteria andShijianLike(String value) {
            addCriterion("shijian like", value);
            return (Criteria) this;
        }

        public Criteria andShijianNotLike(String value) {
            addCriterion("shijian not like", value);
            return (Criteria) this;
        }

        public Criteria andShijianIn(List<String> values) {
            addCriterion("shijian in", values);
            return (Criteria) this;
        }

        public Criteria andShijianNotIn(List<String> values) {
            addCriterion("shijian not in", values);
            return (Criteria) this;
        }

        public Criteria andShijianBetween(String value1, String value2) {
            addCriterion("shijian between", value1, value2);
            return (Criteria) this;
        }

        public Criteria andShijianNotBetween(String value1, String value2) {
            addCriterion("shijian not between", value1, value2);
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