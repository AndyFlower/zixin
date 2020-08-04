package com.cul.culsite.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MPointsRecordDetailDTOCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    public MPointsRecordDetailDTOCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
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
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
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
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
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
     * This class corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMprdIdIsNull() {
            addCriterion("MPRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andMprdIdIsNotNull() {
            addCriterion("MPRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMprdIdEqualTo(String value) {
            addCriterion("MPRD_ID =", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdNotEqualTo(String value) {
            addCriterion("MPRD_ID <>", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdGreaterThan(String value) {
            addCriterion("MPRD_ID >", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdGreaterThanOrEqualTo(String value) {
            addCriterion("MPRD_ID >=", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdLessThan(String value) {
            addCriterion("MPRD_ID <", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdLessThanOrEqualTo(String value) {
            addCriterion("MPRD_ID <=", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdLike(String value) {
            addCriterion("MPRD_ID like", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdNotLike(String value) {
            addCriterion("MPRD_ID not like", value, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdIn(List<String> values) {
            addCriterion("MPRD_ID in", values, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdNotIn(List<String> values) {
            addCriterion("MPRD_ID not in", values, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdBetween(String value1, String value2) {
            addCriterion("MPRD_ID between", value1, value2, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdIdNotBetween(String value1, String value2) {
            addCriterion("MPRD_ID not between", value1, value2, "mprdId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdIsNull() {
            addCriterion("MPRD_TXN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdIsNotNull() {
            addCriterion("MPRD_TXN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdEqualTo(String value) {
            addCriterion("MPRD_TXN_ID =", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdNotEqualTo(String value) {
            addCriterion("MPRD_TXN_ID <>", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdGreaterThan(String value) {
            addCriterion("MPRD_TXN_ID >", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdGreaterThanOrEqualTo(String value) {
            addCriterion("MPRD_TXN_ID >=", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdLessThan(String value) {
            addCriterion("MPRD_TXN_ID <", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdLessThanOrEqualTo(String value) {
            addCriterion("MPRD_TXN_ID <=", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdLike(String value) {
            addCriterion("MPRD_TXN_ID like", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdNotLike(String value) {
            addCriterion("MPRD_TXN_ID not like", value, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdIn(List<String> values) {
            addCriterion("MPRD_TXN_ID in", values, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdNotIn(List<String> values) {
            addCriterion("MPRD_TXN_ID not in", values, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdBetween(String value1, String value2) {
            addCriterion("MPRD_TXN_ID between", value1, value2, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdTxnIdNotBetween(String value1, String value2) {
            addCriterion("MPRD_TXN_ID not between", value1, value2, "mprdTxnId");
            return (Criteria) this;
        }

        public Criteria andMprdPointsIsNull() {
            addCriterion("MPRD_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andMprdPointsIsNotNull() {
            addCriterion("MPRD_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andMprdPointsEqualTo(BigDecimal value) {
            addCriterion("MPRD_POINTS =", value, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsNotEqualTo(BigDecimal value) {
            addCriterion("MPRD_POINTS <>", value, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsGreaterThan(BigDecimal value) {
            addCriterion("MPRD_POINTS >", value, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MPRD_POINTS >=", value, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsLessThan(BigDecimal value) {
            addCriterion("MPRD_POINTS <", value, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MPRD_POINTS <=", value, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsIn(List<BigDecimal> values) {
            addCriterion("MPRD_POINTS in", values, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsNotIn(List<BigDecimal> values) {
            addCriterion("MPRD_POINTS not in", values, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPRD_POINTS between", value1, value2, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andMprdPointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPRD_POINTS not between", value1, value2, "mprdPoints");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNull() {
            addCriterion("CREATE_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNotNull() {
            addCriterion("CREATE_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampEqualTo(Date value) {
            addCriterion("CREATE_TIMESTAMP =", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotEqualTo(Date value) {
            addCriterion("CREATE_TIMESTAMP <>", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThan(Date value) {
            addCriterion("CREATE_TIMESTAMP >", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIMESTAMP >=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThan(Date value) {
            addCriterion("CREATE_TIMESTAMP <", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIMESTAMP <=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIn(List<Date> values) {
            addCriterion("CREATE_TIMESTAMP in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotIn(List<Date> values) {
            addCriterion("CREATE_TIMESTAMP not in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIMESTAMP between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIMESTAMP not between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNull() {
            addCriterion("UPDATE_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNotNull() {
            addCriterion("UPDATE_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP =", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP <>", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThan(Date value) {
            addCriterion("UPDATE_TIMESTAMP >", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP >=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThan(Date value) {
            addCriterion("UPDATE_TIMESTAMP <", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP <=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIn(List<Date> values) {
            addCriterion("UPDATE_TIMESTAMP in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotIn(List<Date> values) {
            addCriterion("UPDATE_TIMESTAMP not in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIMESTAMP between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIMESTAMP not between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateIsNull() {
            addCriterion("MPRD_EXPIRY_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateIsNotNull() {
            addCriterion("MPRD_EXPIRY_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE =", value, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE <>", value, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE >", value, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE >=", value, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateLessThan(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE <", value, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE <=", value, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE in", values, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE not in", values, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE between", value1, value2, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MPRD_EXPIRY_START_DATE not between", value1, value2, "mprdExpiryStartDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateIsNull() {
            addCriterion("MPRD_EXPIRY_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateIsNotNull() {
            addCriterion("MPRD_EXPIRY_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE =", value, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE <>", value, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE >", value, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE >=", value, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateLessThan(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE <", value, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE <=", value, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE in", values, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE not in", values, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE between", value1, value2, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdExpiryEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MPRD_EXPIRY_END_DATE not between", value1, value2, "mprdExpiryEndDate");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeIsNull() {
            addCriterion("MPRD_POINTS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeIsNotNull() {
            addCriterion("MPRD_POINTS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeEqualTo(String value) {
            addCriterion("MPRD_POINTS_TYPE =", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeNotEqualTo(String value) {
            addCriterion("MPRD_POINTS_TYPE <>", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeGreaterThan(String value) {
            addCriterion("MPRD_POINTS_TYPE >", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MPRD_POINTS_TYPE >=", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeLessThan(String value) {
            addCriterion("MPRD_POINTS_TYPE <", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeLessThanOrEqualTo(String value) {
            addCriterion("MPRD_POINTS_TYPE <=", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeLike(String value) {
            addCriterion("MPRD_POINTS_TYPE like", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeNotLike(String value) {
            addCriterion("MPRD_POINTS_TYPE not like", value, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeIn(List<String> values) {
            addCriterion("MPRD_POINTS_TYPE in", values, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeNotIn(List<String> values) {
            addCriterion("MPRD_POINTS_TYPE not in", values, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeBetween(String value1, String value2) {
            addCriterion("MPRD_POINTS_TYPE between", value1, value2, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMprdPointsTypeNotBetween(String value1, String value2) {
            addCriterion("MPRD_POINTS_TYPE not between", value1, value2, "mprdPointsType");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdIsNull() {
            addCriterion("M_MEMBER_POINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdIsNotNull() {
            addCriterion("M_MEMBER_POINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdEqualTo(String value) {
            addCriterion("M_MEMBER_POINT_ID =", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdNotEqualTo(String value) {
            addCriterion("M_MEMBER_POINT_ID <>", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdGreaterThan(String value) {
            addCriterion("M_MEMBER_POINT_ID >", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("M_MEMBER_POINT_ID >=", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdLessThan(String value) {
            addCriterion("M_MEMBER_POINT_ID <", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdLessThanOrEqualTo(String value) {
            addCriterion("M_MEMBER_POINT_ID <=", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdLike(String value) {
            addCriterion("M_MEMBER_POINT_ID like", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdNotLike(String value) {
            addCriterion("M_MEMBER_POINT_ID not like", value, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdIn(List<String> values) {
            addCriterion("M_MEMBER_POINT_ID in", values, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdNotIn(List<String> values) {
            addCriterion("M_MEMBER_POINT_ID not in", values, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdBetween(String value1, String value2) {
            addCriterion("M_MEMBER_POINT_ID between", value1, value2, "mMemberPointId");
            return (Criteria) this;
        }

        public Criteria andMMemberPointIdNotBetween(String value1, String value2) {
            addCriterion("M_MEMBER_POINT_ID not between", value1, value2, "mMemberPointId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
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
     * This class corresponds to the database table CULSITE.M_POINTS_RECORD_DETAIL
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