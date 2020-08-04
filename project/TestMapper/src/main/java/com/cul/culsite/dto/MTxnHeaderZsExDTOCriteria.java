package com.cul.culsite.dto;

import java.util.ArrayList;
import java.util.List;

public class MTxnHeaderZsExDTOCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    public MTxnHeaderZsExDTOCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
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
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
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
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
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
     * This class corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
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

        public Criteria andMzseIdIsNull() {
            addCriterion("MZSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMzseIdIsNotNull() {
            addCriterion("MZSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMzseIdEqualTo(String value) {
            addCriterion("MZSE_ID =", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdNotEqualTo(String value) {
            addCriterion("MZSE_ID <>", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdGreaterThan(String value) {
            addCriterion("MZSE_ID >", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_ID >=", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdLessThan(String value) {
            addCriterion("MZSE_ID <", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdLessThanOrEqualTo(String value) {
            addCriterion("MZSE_ID <=", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdLike(String value) {
            addCriterion("MZSE_ID like", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdNotLike(String value) {
            addCriterion("MZSE_ID not like", value, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdIn(List<String> values) {
            addCriterion("MZSE_ID in", values, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdNotIn(List<String> values) {
            addCriterion("MZSE_ID not in", values, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdBetween(String value1, String value2) {
            addCriterion("MZSE_ID between", value1, value2, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseIdNotBetween(String value1, String value2) {
            addCriterion("MZSE_ID not between", value1, value2, "mzseId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdIsNull() {
            addCriterion("MZSE_TXN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdIsNotNull() {
            addCriterion("MZSE_TXN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdEqualTo(String value) {
            addCriterion("MZSE_TXN_ID =", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdNotEqualTo(String value) {
            addCriterion("MZSE_TXN_ID <>", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdGreaterThan(String value) {
            addCriterion("MZSE_TXN_ID >", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_TXN_ID >=", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdLessThan(String value) {
            addCriterion("MZSE_TXN_ID <", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdLessThanOrEqualTo(String value) {
            addCriterion("MZSE_TXN_ID <=", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdLike(String value) {
            addCriterion("MZSE_TXN_ID like", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdNotLike(String value) {
            addCriterion("MZSE_TXN_ID not like", value, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdIn(List<String> values) {
            addCriterion("MZSE_TXN_ID in", values, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdNotIn(List<String> values) {
            addCriterion("MZSE_TXN_ID not in", values, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdBetween(String value1, String value2) {
            addCriterion("MZSE_TXN_ID between", value1, value2, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseTxnIdNotBetween(String value1, String value2) {
            addCriterion("MZSE_TXN_ID not between", value1, value2, "mzseTxnId");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateIsNull() {
            addCriterion("MZSE_LMS_POSTING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateIsNotNull() {
            addCriterion("MZSE_LMS_POSTING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateEqualTo(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE =", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateNotEqualTo(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE <>", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateGreaterThan(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE >", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE >=", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateLessThan(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE <", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateLessThanOrEqualTo(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE <=", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateLike(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE like", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateNotLike(String value) {
            addCriterion("MZSE_LMS_POSTING_DATE not like", value, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateIn(List<String> values) {
            addCriterion("MZSE_LMS_POSTING_DATE in", values, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateNotIn(List<String> values) {
            addCriterion("MZSE_LMS_POSTING_DATE not in", values, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateBetween(String value1, String value2) {
            addCriterion("MZSE_LMS_POSTING_DATE between", value1, value2, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseLmsPostingDateNotBetween(String value1, String value2) {
            addCriterion("MZSE_LMS_POSTING_DATE not between", value1, value2, "mzseLmsPostingDate");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoIsNull() {
            addCriterion("MZSE_COMMODITY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoIsNotNull() {
            addCriterion("MZSE_COMMODITY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoEqualTo(String value) {
            addCriterion("MZSE_COMMODITY_INFO =", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoNotEqualTo(String value) {
            addCriterion("MZSE_COMMODITY_INFO <>", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoGreaterThan(String value) {
            addCriterion("MZSE_COMMODITY_INFO >", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_COMMODITY_INFO >=", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoLessThan(String value) {
            addCriterion("MZSE_COMMODITY_INFO <", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoLessThanOrEqualTo(String value) {
            addCriterion("MZSE_COMMODITY_INFO <=", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoLike(String value) {
            addCriterion("MZSE_COMMODITY_INFO like", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoNotLike(String value) {
            addCriterion("MZSE_COMMODITY_INFO not like", value, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoIn(List<String> values) {
            addCriterion("MZSE_COMMODITY_INFO in", values, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoNotIn(List<String> values) {
            addCriterion("MZSE_COMMODITY_INFO not in", values, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoBetween(String value1, String value2) {
            addCriterion("MZSE_COMMODITY_INFO between", value1, value2, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseCommodityInfoNotBetween(String value1, String value2) {
            addCriterion("MZSE_COMMODITY_INFO not between", value1, value2, "mzseCommodityInfo");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdIsNull() {
            addCriterion("MZSE_SAP_MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdIsNotNull() {
            addCriterion("MZSE_SAP_MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdEqualTo(String value) {
            addCriterion("MZSE_SAP_MER_ID =", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdNotEqualTo(String value) {
            addCriterion("MZSE_SAP_MER_ID <>", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdGreaterThan(String value) {
            addCriterion("MZSE_SAP_MER_ID >", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_SAP_MER_ID >=", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdLessThan(String value) {
            addCriterion("MZSE_SAP_MER_ID <", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdLessThanOrEqualTo(String value) {
            addCriterion("MZSE_SAP_MER_ID <=", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdLike(String value) {
            addCriterion("MZSE_SAP_MER_ID like", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdNotLike(String value) {
            addCriterion("MZSE_SAP_MER_ID not like", value, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdIn(List<String> values) {
            addCriterion("MZSE_SAP_MER_ID in", values, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdNotIn(List<String> values) {
            addCriterion("MZSE_SAP_MER_ID not in", values, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdBetween(String value1, String value2) {
            addCriterion("MZSE_SAP_MER_ID between", value1, value2, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseSapMerIdNotBetween(String value1, String value2) {
            addCriterion("MZSE_SAP_MER_ID not between", value1, value2, "mzseSapMerId");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoIsNull() {
            addCriterion("MZSE_CASH_DESK_NO is null");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoIsNotNull() {
            addCriterion("MZSE_CASH_DESK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoEqualTo(String value) {
            addCriterion("MZSE_CASH_DESK_NO =", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoNotEqualTo(String value) {
            addCriterion("MZSE_CASH_DESK_NO <>", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoGreaterThan(String value) {
            addCriterion("MZSE_CASH_DESK_NO >", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_CASH_DESK_NO >=", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoLessThan(String value) {
            addCriterion("MZSE_CASH_DESK_NO <", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoLessThanOrEqualTo(String value) {
            addCriterion("MZSE_CASH_DESK_NO <=", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoLike(String value) {
            addCriterion("MZSE_CASH_DESK_NO like", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoNotLike(String value) {
            addCriterion("MZSE_CASH_DESK_NO not like", value, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoIn(List<String> values) {
            addCriterion("MZSE_CASH_DESK_NO in", values, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoNotIn(List<String> values) {
            addCriterion("MZSE_CASH_DESK_NO not in", values, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoBetween(String value1, String value2) {
            addCriterion("MZSE_CASH_DESK_NO between", value1, value2, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseCashDeskNoNotBetween(String value1, String value2) {
            addCriterion("MZSE_CASH_DESK_NO not between", value1, value2, "mzseCashDeskNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoIsNull() {
            addCriterion("MZSE_RECORD_NO is null");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoIsNotNull() {
            addCriterion("MZSE_RECORD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoEqualTo(String value) {
            addCriterion("MZSE_RECORD_NO =", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoNotEqualTo(String value) {
            addCriterion("MZSE_RECORD_NO <>", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoGreaterThan(String value) {
            addCriterion("MZSE_RECORD_NO >", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_RECORD_NO >=", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoLessThan(String value) {
            addCriterion("MZSE_RECORD_NO <", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoLessThanOrEqualTo(String value) {
            addCriterion("MZSE_RECORD_NO <=", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoLike(String value) {
            addCriterion("MZSE_RECORD_NO like", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoNotLike(String value) {
            addCriterion("MZSE_RECORD_NO not like", value, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoIn(List<String> values) {
            addCriterion("MZSE_RECORD_NO in", values, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoNotIn(List<String> values) {
            addCriterion("MZSE_RECORD_NO not in", values, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoBetween(String value1, String value2) {
            addCriterion("MZSE_RECORD_NO between", value1, value2, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRecordNoNotBetween(String value1, String value2) {
            addCriterion("MZSE_RECORD_NO not between", value1, value2, "mzseRecordNo");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksIsNull() {
            addCriterion("MZSE_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksIsNotNull() {
            addCriterion("MZSE_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksEqualTo(String value) {
            addCriterion("MZSE_REMARKS =", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksNotEqualTo(String value) {
            addCriterion("MZSE_REMARKS <>", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksGreaterThan(String value) {
            addCriterion("MZSE_REMARKS >", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_REMARKS >=", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksLessThan(String value) {
            addCriterion("MZSE_REMARKS <", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksLessThanOrEqualTo(String value) {
            addCriterion("MZSE_REMARKS <=", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksLike(String value) {
            addCriterion("MZSE_REMARKS like", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksNotLike(String value) {
            addCriterion("MZSE_REMARKS not like", value, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksIn(List<String> values) {
            addCriterion("MZSE_REMARKS in", values, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksNotIn(List<String> values) {
            addCriterion("MZSE_REMARKS not in", values, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksBetween(String value1, String value2) {
            addCriterion("MZSE_REMARKS between", value1, value2, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseRemarksNotBetween(String value1, String value2) {
            addCriterion("MZSE_REMARKS not between", value1, value2, "mzseRemarks");
            return (Criteria) this;
        }

        public Criteria andMzseCashierIsNull() {
            addCriterion("MZSE_CASHIER is null");
            return (Criteria) this;
        }

        public Criteria andMzseCashierIsNotNull() {
            addCriterion("MZSE_CASHIER is not null");
            return (Criteria) this;
        }

        public Criteria andMzseCashierEqualTo(String value) {
            addCriterion("MZSE_CASHIER =", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierNotEqualTo(String value) {
            addCriterion("MZSE_CASHIER <>", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierGreaterThan(String value) {
            addCriterion("MZSE_CASHIER >", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_CASHIER >=", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierLessThan(String value) {
            addCriterion("MZSE_CASHIER <", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierLessThanOrEqualTo(String value) {
            addCriterion("MZSE_CASHIER <=", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierLike(String value) {
            addCriterion("MZSE_CASHIER like", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierNotLike(String value) {
            addCriterion("MZSE_CASHIER not like", value, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierIn(List<String> values) {
            addCriterion("MZSE_CASHIER in", values, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierNotIn(List<String> values) {
            addCriterion("MZSE_CASHIER not in", values, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierBetween(String value1, String value2) {
            addCriterion("MZSE_CASHIER between", value1, value2, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseCashierNotBetween(String value1, String value2) {
            addCriterion("MZSE_CASHIER not between", value1, value2, "mzseCashier");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeIsNull() {
            addCriterion("MZSE_TXN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeIsNotNull() {
            addCriterion("MZSE_TXN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeEqualTo(String value) {
            addCriterion("MZSE_TXN_TYPE =", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeNotEqualTo(String value) {
            addCriterion("MZSE_TXN_TYPE <>", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeGreaterThan(String value) {
            addCriterion("MZSE_TXN_TYPE >", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MZSE_TXN_TYPE >=", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeLessThan(String value) {
            addCriterion("MZSE_TXN_TYPE <", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeLessThanOrEqualTo(String value) {
            addCriterion("MZSE_TXN_TYPE <=", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeLike(String value) {
            addCriterion("MZSE_TXN_TYPE like", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeNotLike(String value) {
            addCriterion("MZSE_TXN_TYPE not like", value, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeIn(List<String> values) {
            addCriterion("MZSE_TXN_TYPE in", values, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeNotIn(List<String> values) {
            addCriterion("MZSE_TXN_TYPE not in", values, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeBetween(String value1, String value2) {
            addCriterion("MZSE_TXN_TYPE between", value1, value2, "mzseTxnType");
            return (Criteria) this;
        }

        public Criteria andMzseTxnTypeNotBetween(String value1, String value2) {
            addCriterion("MZSE_TXN_TYPE not between", value1, value2, "mzseTxnType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
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
     * This class corresponds to the database table CULSITE.M_TXN_HEADER_ZS_EX
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