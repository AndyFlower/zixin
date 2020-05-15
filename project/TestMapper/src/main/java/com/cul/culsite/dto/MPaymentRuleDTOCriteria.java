package com.cul.culsite.dto;

import java.util.ArrayList;
import java.util.List;

public class MPaymentRuleDTOCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public MPaymentRuleDTOCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
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

        public Criteria andRuleIdIsNull() {
            addCriterion("RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(String value) {
            addCriterion("RULE_ID =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(String value) {
            addCriterion("RULE_ID <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(String value) {
            addCriterion("RULE_ID >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_ID >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(String value) {
            addCriterion("RULE_ID <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(String value) {
            addCriterion("RULE_ID <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLike(String value) {
            addCriterion("RULE_ID like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotLike(String value) {
            addCriterion("RULE_ID not like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<String> values) {
            addCriterion("RULE_ID in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<String> values) {
            addCriterion("RULE_ID not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(String value1, String value2) {
            addCriterion("RULE_ID between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(String value1, String value2) {
            addCriterion("RULE_ID not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("RULE_NAME =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("RULE_NAME <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("RULE_NAME >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_NAME >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("RULE_NAME <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("RULE_NAME <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("RULE_NAME like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("RULE_NAME not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("RULE_NAME in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("RULE_NAME not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("RULE_NAME between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("RULE_NAME not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNull() {
            addCriterion("CARDNUM is null");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNotNull() {
            addCriterion("CARDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumEqualTo(Long value) {
            addCriterion("CARDNUM =", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotEqualTo(Long value) {
            addCriterion("CARDNUM <>", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThan(Long value) {
            addCriterion("CARDNUM >", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThanOrEqualTo(Long value) {
            addCriterion("CARDNUM >=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThan(Long value) {
            addCriterion("CARDNUM <", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThanOrEqualTo(Long value) {
            addCriterion("CARDNUM <=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumIn(List<Long> values) {
            addCriterion("CARDNUM in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotIn(List<Long> values) {
            addCriterion("CARDNUM not in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumBetween(Long value1, Long value2) {
            addCriterion("CARDNUM between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotBetween(Long value1, Long value2) {
            addCriterion("CARDNUM not between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andMaxamountIsNull() {
            addCriterion("MAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMaxamountIsNotNull() {
            addCriterion("MAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxamountEqualTo(Long value) {
            addCriterion("MAXAMOUNT =", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountNotEqualTo(Long value) {
            addCriterion("MAXAMOUNT <>", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountGreaterThan(Long value) {
            addCriterion("MAXAMOUNT >", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountGreaterThanOrEqualTo(Long value) {
            addCriterion("MAXAMOUNT >=", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountLessThan(Long value) {
            addCriterion("MAXAMOUNT <", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountLessThanOrEqualTo(Long value) {
            addCriterion("MAXAMOUNT <=", value, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountIn(List<Long> values) {
            addCriterion("MAXAMOUNT in", values, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountNotIn(List<Long> values) {
            addCriterion("MAXAMOUNT not in", values, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountBetween(Long value1, Long value2) {
            addCriterion("MAXAMOUNT between", value1, value2, "maxamount");
            return (Criteria) this;
        }

        public Criteria andMaxamountNotBetween(Long value1, Long value2) {
            addCriterion("MAXAMOUNT not between", value1, value2, "maxamount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table M_PAYMENT_RULE
     *
     * @mbggenerated
     */
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