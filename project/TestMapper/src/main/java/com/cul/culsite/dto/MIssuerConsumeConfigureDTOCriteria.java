package com.cul.culsite.dto;

import java.util.ArrayList;
import java.util.List;

public class MIssuerConsumeConfigureDTOCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    public MIssuerConsumeConfigureDTOCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
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
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
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
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
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
     * This class corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIssuserIdIsNull() {
            addCriterion("ISSUSER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIssuserIdIsNotNull() {
            addCriterion("ISSUSER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIssuserIdEqualTo(String value) {
            addCriterion("ISSUSER_ID =", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdNotEqualTo(String value) {
            addCriterion("ISSUSER_ID <>", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdGreaterThan(String value) {
            addCriterion("ISSUSER_ID >", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUSER_ID >=", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdLessThan(String value) {
            addCriterion("ISSUSER_ID <", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdLessThanOrEqualTo(String value) {
            addCriterion("ISSUSER_ID <=", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdLike(String value) {
            addCriterion("ISSUSER_ID like", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdNotLike(String value) {
            addCriterion("ISSUSER_ID not like", value, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdIn(List<String> values) {
            addCriterion("ISSUSER_ID in", values, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdNotIn(List<String> values) {
            addCriterion("ISSUSER_ID not in", values, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdBetween(String value1, String value2) {
            addCriterion("ISSUSER_ID between", value1, value2, "issuserId");
            return (Criteria) this;
        }

        public Criteria andIssuserIdNotBetween(String value1, String value2) {
            addCriterion("ISSUSER_ID not between", value1, value2, "issuserId");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeIsNull() {
            addCriterion("COUNTER_UP_GOODS_MODE is null");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeIsNotNull() {
            addCriterion("COUNTER_UP_GOODS_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeEqualTo(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE =", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeNotEqualTo(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE <>", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeGreaterThan(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE >", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE >=", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeLessThan(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE <", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeLessThanOrEqualTo(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE <=", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeLike(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE like", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeNotLike(String value) {
            addCriterion("COUNTER_UP_GOODS_MODE not like", value, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeIn(List<String> values) {
            addCriterion("COUNTER_UP_GOODS_MODE in", values, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeNotIn(List<String> values) {
            addCriterion("COUNTER_UP_GOODS_MODE not in", values, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeBetween(String value1, String value2) {
            addCriterion("COUNTER_UP_GOODS_MODE between", value1, value2, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterUpGoodsModeNotBetween(String value1, String value2) {
            addCriterion("COUNTER_UP_GOODS_MODE not between", value1, value2, "counterUpGoodsMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeIsNull() {
            addCriterion("COUNTER_DOWN_PRINT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeIsNotNull() {
            addCriterion("COUNTER_DOWN_PRINT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeEqualTo(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE =", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeNotEqualTo(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE <>", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeGreaterThan(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE >", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE >=", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeLessThan(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE <", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeLessThanOrEqualTo(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE <=", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeLike(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE like", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeNotLike(String value) {
            addCriterion("COUNTER_DOWN_PRINT_MODE not like", value, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeIn(List<String> values) {
            addCriterion("COUNTER_DOWN_PRINT_MODE in", values, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeNotIn(List<String> values) {
            addCriterion("COUNTER_DOWN_PRINT_MODE not in", values, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeBetween(String value1, String value2) {
            addCriterion("COUNTER_DOWN_PRINT_MODE between", value1, value2, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andCounterDownPrintModeNotBetween(String value1, String value2) {
            addCriterion("COUNTER_DOWN_PRINT_MODE not between", value1, value2, "counterDownPrintMode");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgIsNull() {
            addCriterion("IS_MEMBER_FLG is null");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgIsNotNull() {
            addCriterion("IS_MEMBER_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgEqualTo(String value) {
            addCriterion("IS_MEMBER_FLG =", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgNotEqualTo(String value) {
            addCriterion("IS_MEMBER_FLG <>", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgGreaterThan(String value) {
            addCriterion("IS_MEMBER_FLG >", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MEMBER_FLG >=", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgLessThan(String value) {
            addCriterion("IS_MEMBER_FLG <", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgLessThanOrEqualTo(String value) {
            addCriterion("IS_MEMBER_FLG <=", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgLike(String value) {
            addCriterion("IS_MEMBER_FLG like", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgNotLike(String value) {
            addCriterion("IS_MEMBER_FLG not like", value, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgIn(List<String> values) {
            addCriterion("IS_MEMBER_FLG in", values, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgNotIn(List<String> values) {
            addCriterion("IS_MEMBER_FLG not in", values, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgBetween(String value1, String value2) {
            addCriterion("IS_MEMBER_FLG between", value1, value2, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsMemberFlgNotBetween(String value1, String value2) {
            addCriterion("IS_MEMBER_FLG not between", value1, value2, "isMemberFlg");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeIsNull() {
            addCriterion("IS_PART_CONSUME is null");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeIsNotNull() {
            addCriterion("IS_PART_CONSUME is not null");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeEqualTo(String value) {
            addCriterion("IS_PART_CONSUME =", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeNotEqualTo(String value) {
            addCriterion("IS_PART_CONSUME <>", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeGreaterThan(String value) {
            addCriterion("IS_PART_CONSUME >", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PART_CONSUME >=", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeLessThan(String value) {
            addCriterion("IS_PART_CONSUME <", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeLessThanOrEqualTo(String value) {
            addCriterion("IS_PART_CONSUME <=", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeLike(String value) {
            addCriterion("IS_PART_CONSUME like", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeNotLike(String value) {
            addCriterion("IS_PART_CONSUME not like", value, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeIn(List<String> values) {
            addCriterion("IS_PART_CONSUME in", values, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeNotIn(List<String> values) {
            addCriterion("IS_PART_CONSUME not in", values, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeBetween(String value1, String value2) {
            addCriterion("IS_PART_CONSUME between", value1, value2, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsPartConsumeNotBetween(String value1, String value2) {
            addCriterion("IS_PART_CONSUME not between", value1, value2, "isPartConsume");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayIsNull() {
            addCriterion("IS_JOIN_PAY is null");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayIsNotNull() {
            addCriterion("IS_JOIN_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayEqualTo(String value) {
            addCriterion("IS_JOIN_PAY =", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayNotEqualTo(String value) {
            addCriterion("IS_JOIN_PAY <>", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayGreaterThan(String value) {
            addCriterion("IS_JOIN_PAY >", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_JOIN_PAY >=", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayLessThan(String value) {
            addCriterion("IS_JOIN_PAY <", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayLessThanOrEqualTo(String value) {
            addCriterion("IS_JOIN_PAY <=", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayLike(String value) {
            addCriterion("IS_JOIN_PAY like", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayNotLike(String value) {
            addCriterion("IS_JOIN_PAY not like", value, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayIn(List<String> values) {
            addCriterion("IS_JOIN_PAY in", values, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayNotIn(List<String> values) {
            addCriterion("IS_JOIN_PAY not in", values, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayBetween(String value1, String value2) {
            addCriterion("IS_JOIN_PAY between", value1, value2, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsJoinPayNotBetween(String value1, String value2) {
            addCriterion("IS_JOIN_PAY not between", value1, value2, "isJoinPay");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmIsNull() {
            addCriterion("IS_LINK_CRM is null");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmIsNotNull() {
            addCriterion("IS_LINK_CRM is not null");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmEqualTo(String value) {
            addCriterion("IS_LINK_CRM =", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmNotEqualTo(String value) {
            addCriterion("IS_LINK_CRM <>", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmGreaterThan(String value) {
            addCriterion("IS_LINK_CRM >", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LINK_CRM >=", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmLessThan(String value) {
            addCriterion("IS_LINK_CRM <", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmLessThanOrEqualTo(String value) {
            addCriterion("IS_LINK_CRM <=", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmLike(String value) {
            addCriterion("IS_LINK_CRM like", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmNotLike(String value) {
            addCriterion("IS_LINK_CRM not like", value, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmIn(List<String> values) {
            addCriterion("IS_LINK_CRM in", values, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmNotIn(List<String> values) {
            addCriterion("IS_LINK_CRM not in", values, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmBetween(String value1, String value2) {
            addCriterion("IS_LINK_CRM between", value1, value2, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andIsLinkCrmNotBetween(String value1, String value2) {
            addCriterion("IS_LINK_CRM not between", value1, value2, "isLinkCrm");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsPointPayIsNull() {
            addCriterion("IS_POINT_PAY is null");
            return (Criteria) this;
        }

        public Criteria andIsPointPayIsNotNull() {
            addCriterion("IS_POINT_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsPointPayEqualTo(String value) {
            addCriterion("IS_POINT_PAY =", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayNotEqualTo(String value) {
            addCriterion("IS_POINT_PAY <>", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayGreaterThan(String value) {
            addCriterion("IS_POINT_PAY >", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_POINT_PAY >=", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayLessThan(String value) {
            addCriterion("IS_POINT_PAY <", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayLessThanOrEqualTo(String value) {
            addCriterion("IS_POINT_PAY <=", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayLike(String value) {
            addCriterion("IS_POINT_PAY like", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayNotLike(String value) {
            addCriterion("IS_POINT_PAY not like", value, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayIn(List<String> values) {
            addCriterion("IS_POINT_PAY in", values, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayNotIn(List<String> values) {
            addCriterion("IS_POINT_PAY not in", values, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayBetween(String value1, String value2) {
            addCriterion("IS_POINT_PAY between", value1, value2, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsPointPayNotBetween(String value1, String value2) {
            addCriterion("IS_POINT_PAY not between", value1, value2, "isPointPay");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdIsNull() {
            addCriterion("IS_CHECK_PWD is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdIsNotNull() {
            addCriterion("IS_CHECK_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdEqualTo(String value) {
            addCriterion("IS_CHECK_PWD =", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdNotEqualTo(String value) {
            addCriterion("IS_CHECK_PWD <>", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdGreaterThan(String value) {
            addCriterion("IS_CHECK_PWD >", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHECK_PWD >=", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdLessThan(String value) {
            addCriterion("IS_CHECK_PWD <", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdLessThanOrEqualTo(String value) {
            addCriterion("IS_CHECK_PWD <=", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdLike(String value) {
            addCriterion("IS_CHECK_PWD like", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdNotLike(String value) {
            addCriterion("IS_CHECK_PWD not like", value, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdIn(List<String> values) {
            addCriterion("IS_CHECK_PWD in", values, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdNotIn(List<String> values) {
            addCriterion("IS_CHECK_PWD not in", values, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdBetween(String value1, String value2) {
            addCriterion("IS_CHECK_PWD between", value1, value2, "isCheckPwd");
            return (Criteria) this;
        }

        public Criteria andIsCheckPwdNotBetween(String value1, String value2) {
            addCriterion("IS_CHECK_PWD not between", value1, value2, "isCheckPwd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
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
     * This class corresponds to the database table M_ISSUER_CONSUME_CONFIGURE
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