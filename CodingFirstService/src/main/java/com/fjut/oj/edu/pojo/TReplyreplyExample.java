package com.fjut.oj.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TReplyreplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TReplyreplyExample() {
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

        public Criteria andReplyreplyidIsNull() {
            addCriterion("replyReplyId is null");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidIsNotNull() {
            addCriterion("replyReplyId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidEqualTo(Long value) {
            addCriterion("replyReplyId =", value, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidNotEqualTo(Long value) {
            addCriterion("replyReplyId <>", value, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidGreaterThan(Long value) {
            addCriterion("replyReplyId >", value, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidGreaterThanOrEqualTo(Long value) {
            addCriterion("replyReplyId >=", value, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidLessThan(Long value) {
            addCriterion("replyReplyId <", value, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidLessThanOrEqualTo(Long value) {
            addCriterion("replyReplyId <=", value, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidIn(List<Long> values) {
            addCriterion("replyReplyId in", values, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidNotIn(List<Long> values) {
            addCriterion("replyReplyId not in", values, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidBetween(Long value1, Long value2) {
            addCriterion("replyReplyId between", value1, value2, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyreplyidNotBetween(Long value1, Long value2) {
            addCriterion("replyReplyId not between", value1, value2, "replyreplyid");
            return (Criteria) this;
        }

        public Criteria andReplyidIsNull() {
            addCriterion("replyId is null");
            return (Criteria) this;
        }

        public Criteria andReplyidIsNotNull() {
            addCriterion("replyId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyidEqualTo(Long value) {
            addCriterion("replyId =", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotEqualTo(Long value) {
            addCriterion("replyId <>", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThan(Long value) {
            addCriterion("replyId >", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThanOrEqualTo(Long value) {
            addCriterion("replyId >=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThan(Long value) {
            addCriterion("replyId <", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThanOrEqualTo(Long value) {
            addCriterion("replyId <=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidIn(List<Long> values) {
            addCriterion("replyId in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotIn(List<Long> values) {
            addCriterion("replyId not in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidBetween(Long value1, Long value2) {
            addCriterion("replyId between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotBetween(Long value1, Long value2) {
            addCriterion("replyId not between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andDiscussidIsNull() {
            addCriterion("discussId is null");
            return (Criteria) this;
        }

        public Criteria andDiscussidIsNotNull() {
            addCriterion("discussId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussidEqualTo(Long value) {
            addCriterion("discussId =", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotEqualTo(Long value) {
            addCriterion("discussId <>", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidGreaterThan(Long value) {
            addCriterion("discussId >", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidGreaterThanOrEqualTo(Long value) {
            addCriterion("discussId >=", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidLessThan(Long value) {
            addCriterion("discussId <", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidLessThanOrEqualTo(Long value) {
            addCriterion("discussId <=", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidIn(List<Long> values) {
            addCriterion("discussId in", values, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotIn(List<Long> values) {
            addCriterion("discussId not in", values, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidBetween(Long value1, Long value2) {
            addCriterion("discussId between", value1, value2, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotBetween(Long value1, Long value2) {
            addCriterion("discussId not between", value1, value2, "discussid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("replyTime is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("replyTime is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(Date value) {
            addCriterion("replyTime =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(Date value) {
            addCriterion("replyTime <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(Date value) {
            addCriterion("replyTime >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("replyTime >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(Date value) {
            addCriterion("replyTime <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(Date value) {
            addCriterion("replyTime <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<Date> values) {
            addCriterion("replyTime in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<Date> values) {
            addCriterion("replyTime not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(Date value1, Date value2) {
            addCriterion("replyTime between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(Date value1, Date value2) {
            addCriterion("replyTime not between", value1, value2, "replytime");
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