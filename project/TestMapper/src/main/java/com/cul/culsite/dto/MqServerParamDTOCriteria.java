package com.cul.culsite.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MqServerParamDTOCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    public MqServerParamDTOCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
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
     * This method corresponds to the database table MQ_SERVER_PARAM
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
     * This method corresponds to the database table MQ_SERVER_PARAM
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MQ_SERVER_PARAM
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
     * This class corresponds to the database table MQ_SERVER_PARAM
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

        public Criteria andParamIdIsNull() {
            addCriterion("PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andParamIdIsNotNull() {
            addCriterion("PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParamIdEqualTo(String value) {
            addCriterion("PARAM_ID =", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotEqualTo(String value) {
            addCriterion("PARAM_ID <>", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThan(String value) {
            addCriterion("PARAM_ID >", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_ID >=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThan(String value) {
            addCriterion("PARAM_ID <", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThanOrEqualTo(String value) {
            addCriterion("PARAM_ID <=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLike(String value) {
            addCriterion("PARAM_ID like", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotLike(String value) {
            addCriterion("PARAM_ID not like", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdIn(List<String> values) {
            addCriterion("PARAM_ID in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotIn(List<String> values) {
            addCriterion("PARAM_ID not in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdBetween(String value1, String value2) {
            addCriterion("PARAM_ID between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotBetween(String value1, String value2) {
            addCriterion("PARAM_ID not between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdIsNull() {
            addCriterion("ISSUER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIssuerIdIsNotNull() {
            addCriterion("ISSUER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerIdEqualTo(String value) {
            addCriterion("ISSUER_ID =", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdNotEqualTo(String value) {
            addCriterion("ISSUER_ID <>", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdGreaterThan(String value) {
            addCriterion("ISSUER_ID >", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUER_ID >=", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdLessThan(String value) {
            addCriterion("ISSUER_ID <", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdLessThanOrEqualTo(String value) {
            addCriterion("ISSUER_ID <=", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdLike(String value) {
            addCriterion("ISSUER_ID like", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdNotLike(String value) {
            addCriterion("ISSUER_ID not like", value, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdIn(List<String> values) {
            addCriterion("ISSUER_ID in", values, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdNotIn(List<String> values) {
            addCriterion("ISSUER_ID not in", values, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdBetween(String value1, String value2) {
            addCriterion("ISSUER_ID between", value1, value2, "issuerId");
            return (Criteria) this;
        }

        public Criteria andIssuerIdNotBetween(String value1, String value2) {
            addCriterion("ISSUER_ID not between", value1, value2, "issuerId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessServerIsNull() {
            addCriterion("BUSINESS_SERVER is null");
            return (Criteria) this;
        }

        public Criteria andBusinessServerIsNotNull() {
            addCriterion("BUSINESS_SERVER is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessServerEqualTo(String value) {
            addCriterion("BUSINESS_SERVER =", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerNotEqualTo(String value) {
            addCriterion("BUSINESS_SERVER <>", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerGreaterThan(String value) {
            addCriterion("BUSINESS_SERVER >", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SERVER >=", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerLessThan(String value) {
            addCriterion("BUSINESS_SERVER <", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SERVER <=", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerLike(String value) {
            addCriterion("BUSINESS_SERVER like", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerNotLike(String value) {
            addCriterion("BUSINESS_SERVER not like", value, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerIn(List<String> values) {
            addCriterion("BUSINESS_SERVER in", values, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerNotIn(List<String> values) {
            addCriterion("BUSINESS_SERVER not in", values, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerBetween(String value1, String value2) {
            addCriterion("BUSINESS_SERVER between", value1, value2, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessServerNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_SERVER not between", value1, value2, "businessServer");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNull() {
            addCriterion("BUSINESS_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNotNull() {
            addCriterion("BUSINESS_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS =", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS <>", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThan(String value) {
            addCriterion("BUSINESS_ADDRESS >", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS >=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThan(String value) {
            addCriterion("BUSINESS_ADDRESS <", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS <=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLike(String value) {
            addCriterion("BUSINESS_ADDRESS like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotLike(String value) {
            addCriterion("BUSINESS_ADDRESS not like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIn(List<String> values) {
            addCriterion("BUSINESS_ADDRESS in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotIn(List<String> values) {
            addCriterion("BUSINESS_ADDRESS not in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressBetween(String value1, String value2) {
            addCriterion("BUSINESS_ADDRESS between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_ADDRESS not between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcIsNull() {
            addCriterion("NOTIFY_RPC is null");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcIsNotNull() {
            addCriterion("NOTIFY_RPC is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcEqualTo(String value) {
            addCriterion("NOTIFY_RPC =", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcNotEqualTo(String value) {
            addCriterion("NOTIFY_RPC <>", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcGreaterThan(String value) {
            addCriterion("NOTIFY_RPC >", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_RPC >=", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcLessThan(String value) {
            addCriterion("NOTIFY_RPC <", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_RPC <=", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcLike(String value) {
            addCriterion("NOTIFY_RPC like", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcNotLike(String value) {
            addCriterion("NOTIFY_RPC not like", value, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcIn(List<String> values) {
            addCriterion("NOTIFY_RPC in", values, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcNotIn(List<String> values) {
            addCriterion("NOTIFY_RPC not in", values, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcBetween(String value1, String value2) {
            addCriterion("NOTIFY_RPC between", value1, value2, "notifyRpc");
            return (Criteria) this;
        }

        public Criteria andNotifyRpcNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_RPC not between", value1, value2, "notifyRpc");
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

        public Criteria andReponseAddressIsNull() {
            addCriterion("REPONSE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReponseAddressIsNotNull() {
            addCriterion("REPONSE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReponseAddressEqualTo(String value) {
            addCriterion("REPONSE_ADDRESS =", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressNotEqualTo(String value) {
            addCriterion("REPONSE_ADDRESS <>", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressGreaterThan(String value) {
            addCriterion("REPONSE_ADDRESS >", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REPONSE_ADDRESS >=", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressLessThan(String value) {
            addCriterion("REPONSE_ADDRESS <", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressLessThanOrEqualTo(String value) {
            addCriterion("REPONSE_ADDRESS <=", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressLike(String value) {
            addCriterion("REPONSE_ADDRESS like", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressNotLike(String value) {
            addCriterion("REPONSE_ADDRESS not like", value, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressIn(List<String> values) {
            addCriterion("REPONSE_ADDRESS in", values, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressNotIn(List<String> values) {
            addCriterion("REPONSE_ADDRESS not in", values, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressBetween(String value1, String value2) {
            addCriterion("REPONSE_ADDRESS between", value1, value2, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andReponseAddressNotBetween(String value1, String value2) {
            addCriterion("REPONSE_ADDRESS not between", value1, value2, "reponseAddress");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdIsNull() {
            addCriterion("MQ_WECHAT_APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdIsNotNull() {
            addCriterion("MQ_WECHAT_APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_ID =", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdNotEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_ID <>", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdGreaterThan(String value) {
            addCriterion("MQ_WECHAT_APP_ID >", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_ID >=", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdLessThan(String value) {
            addCriterion("MQ_WECHAT_APP_ID <", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdLessThanOrEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_ID <=", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdLike(String value) {
            addCriterion("MQ_WECHAT_APP_ID like", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdNotLike(String value) {
            addCriterion("MQ_WECHAT_APP_ID not like", value, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdIn(List<String> values) {
            addCriterion("MQ_WECHAT_APP_ID in", values, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdNotIn(List<String> values) {
            addCriterion("MQ_WECHAT_APP_ID not in", values, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdBetween(String value1, String value2) {
            addCriterion("MQ_WECHAT_APP_ID between", value1, value2, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppIdNotBetween(String value1, String value2) {
            addCriterion("MQ_WECHAT_APP_ID not between", value1, value2, "mqWechatAppId");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretIsNull() {
            addCriterion("MQ_WECHAT_APP_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretIsNotNull() {
            addCriterion("MQ_WECHAT_APP_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET =", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretNotEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET <>", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretGreaterThan(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET >", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET >=", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretLessThan(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET <", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretLessThanOrEqualTo(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET <=", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretLike(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET like", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretNotLike(String value) {
            addCriterion("MQ_WECHAT_APP_SECRET not like", value, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretIn(List<String> values) {
            addCriterion("MQ_WECHAT_APP_SECRET in", values, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretNotIn(List<String> values) {
            addCriterion("MQ_WECHAT_APP_SECRET not in", values, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretBetween(String value1, String value2) {
            addCriterion("MQ_WECHAT_APP_SECRET between", value1, value2, "mqWechatAppSecret");
            return (Criteria) this;
        }

        public Criteria andMqWechatAppSecretNotBetween(String value1, String value2) {
            addCriterion("MQ_WECHAT_APP_SECRET not between", value1, value2, "mqWechatAppSecret");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MQ_SERVER_PARAM
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
     * This class corresponds to the database table MQ_SERVER_PARAM
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