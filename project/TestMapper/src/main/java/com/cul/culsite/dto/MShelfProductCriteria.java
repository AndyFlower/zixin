package com.cul.culsite.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MShelfProductCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    public MShelfProductCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
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
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
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
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
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
     * This class corresponds to the database table CULSITE.M_SHELF_PRODUCT
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

        public Criteria andSpidIsNull() {
            addCriterion("SPID is null");
            return (Criteria) this;
        }

        public Criteria andSpidIsNotNull() {
            addCriterion("SPID is not null");
            return (Criteria) this;
        }

        public Criteria andSpidEqualTo(String value) {
            addCriterion("SPID =", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotEqualTo(String value) {
            addCriterion("SPID <>", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThan(String value) {
            addCriterion("SPID >", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThanOrEqualTo(String value) {
            addCriterion("SPID >=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThan(String value) {
            addCriterion("SPID <", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThanOrEqualTo(String value) {
            addCriterion("SPID <=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLike(String value) {
            addCriterion("SPID like", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotLike(String value) {
            addCriterion("SPID not like", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidIn(List<String> values) {
            addCriterion("SPID in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotIn(List<String> values) {
            addCriterion("SPID not in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidBetween(String value1, String value2) {
            addCriterion("SPID between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotBetween(String value1, String value2) {
            addCriterion("SPID not between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andShelfIdIsNull() {
            addCriterion("SHELF_ID is null");
            return (Criteria) this;
        }

        public Criteria andShelfIdIsNotNull() {
            addCriterion("SHELF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShelfIdEqualTo(String value) {
            addCriterion("SHELF_ID =", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotEqualTo(String value) {
            addCriterion("SHELF_ID <>", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThan(String value) {
            addCriterion("SHELF_ID >", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHELF_ID >=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThan(String value) {
            addCriterion("SHELF_ID <", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThanOrEqualTo(String value) {
            addCriterion("SHELF_ID <=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLike(String value) {
            addCriterion("SHELF_ID like", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotLike(String value) {
            addCriterion("SHELF_ID not like", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdIn(List<String> values) {
            addCriterion("SHELF_ID in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotIn(List<String> values) {
            addCriterion("SHELF_ID not in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdBetween(String value1, String value2) {
            addCriterion("SHELF_ID between", value1, value2, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotBetween(String value1, String value2) {
            addCriterion("SHELF_ID not between", value1, value2, "shelfId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNull() {
            addCriterion("VALID_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNotNull() {
            addCriterion("VALID_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andValidStatusEqualTo(String value) {
            addCriterion("VALID_STATUS =", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotEqualTo(String value) {
            addCriterion("VALID_STATUS <>", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThan(String value) {
            addCriterion("VALID_STATUS >", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_STATUS >=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThan(String value) {
            addCriterion("VALID_STATUS <", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThanOrEqualTo(String value) {
            addCriterion("VALID_STATUS <=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLike(String value) {
            addCriterion("VALID_STATUS like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotLike(String value) {
            addCriterion("VALID_STATUS not like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusIn(List<String> values) {
            addCriterion("VALID_STATUS in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotIn(List<String> values) {
            addCriterion("VALID_STATUS not in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusBetween(String value1, String value2) {
            addCriterion("VALID_STATUS between", value1, value2, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotBetween(String value1, String value2) {
            addCriterion("VALID_STATUS not between", value1, value2, "validStatus");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginIsNull() {
            addCriterion("EXPDATE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginIsNotNull() {
            addCriterion("EXPDATE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_BEGIN =", value, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_BEGIN <>", value, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("EXPDATE_BEGIN >", value, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_BEGIN >=", value, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginLessThan(Date value) {
            addCriterionForJDBCDate("EXPDATE_BEGIN <", value, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_BEGIN <=", value, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginIn(List<Date> values) {
            addCriterionForJDBCDate("EXPDATE_BEGIN in", values, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXPDATE_BEGIN not in", values, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPDATE_BEGIN between", value1, value2, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPDATE_BEGIN not between", value1, value2, "expdateBegin");
            return (Criteria) this;
        }

        public Criteria andExpdateEndIsNull() {
            addCriterion("EXPDATE_END is null");
            return (Criteria) this;
        }

        public Criteria andExpdateEndIsNotNull() {
            addCriterion("EXPDATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andExpdateEndEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_END =", value, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_END <>", value, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndGreaterThan(Date value) {
            addCriterionForJDBCDate("EXPDATE_END >", value, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_END >=", value, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndLessThan(Date value) {
            addCriterionForJDBCDate("EXPDATE_END <", value, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPDATE_END <=", value, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndIn(List<Date> values) {
            addCriterionForJDBCDate("EXPDATE_END in", values, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXPDATE_END not in", values, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPDATE_END between", value1, value2, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andExpdateEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPDATE_END not between", value1, value2, "expdateEnd");
            return (Criteria) this;
        }

        public Criteria andUpdStautsIsNull() {
            addCriterion("UPD_STAUTS is null");
            return (Criteria) this;
        }

        public Criteria andUpdStautsIsNotNull() {
            addCriterion("UPD_STAUTS is not null");
            return (Criteria) this;
        }

        public Criteria andUpdStautsEqualTo(String value) {
            addCriterion("UPD_STAUTS =", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsNotEqualTo(String value) {
            addCriterion("UPD_STAUTS <>", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsGreaterThan(String value) {
            addCriterion("UPD_STAUTS >", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_STAUTS >=", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsLessThan(String value) {
            addCriterion("UPD_STAUTS <", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsLessThanOrEqualTo(String value) {
            addCriterion("UPD_STAUTS <=", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsLike(String value) {
            addCriterion("UPD_STAUTS like", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsNotLike(String value) {
            addCriterion("UPD_STAUTS not like", value, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsIn(List<String> values) {
            addCriterion("UPD_STAUTS in", values, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsNotIn(List<String> values) {
            addCriterion("UPD_STAUTS not in", values, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsBetween(String value1, String value2) {
            addCriterion("UPD_STAUTS between", value1, value2, "updStauts");
            return (Criteria) this;
        }

        public Criteria andUpdStautsNotBetween(String value1, String value2) {
            addCriterion("UPD_STAUTS not between", value1, value2, "updStauts");
            return (Criteria) this;
        }

        public Criteria andProductDiscountIsNull() {
            addCriterion("PRODUCT_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProductDiscountIsNotNull() {
            addCriterion("PRODUCT_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProductDiscountEqualTo(String value) {
            addCriterion("PRODUCT_DISCOUNT =", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountNotEqualTo(String value) {
            addCriterion("PRODUCT_DISCOUNT <>", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountGreaterThan(String value) {
            addCriterion("PRODUCT_DISCOUNT >", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DISCOUNT >=", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountLessThan(String value) {
            addCriterion("PRODUCT_DISCOUNT <", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DISCOUNT <=", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountLike(String value) {
            addCriterion("PRODUCT_DISCOUNT like", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountNotLike(String value) {
            addCriterion("PRODUCT_DISCOUNT not like", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountIn(List<String> values) {
            addCriterion("PRODUCT_DISCOUNT in", values, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountNotIn(List<String> values) {
            addCriterion("PRODUCT_DISCOUNT not in", values, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountBetween(String value1, String value2) {
            addCriterion("PRODUCT_DISCOUNT between", value1, value2, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DISCOUNT not between", value1, value2, "productDiscount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CULSITE.M_SHELF_PRODUCT
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
     * This class corresponds to the database table CULSITE.M_SHELF_PRODUCT
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