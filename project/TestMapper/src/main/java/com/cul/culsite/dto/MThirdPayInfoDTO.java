package com.cul.culsite.dto;

import java.math.BigDecimal;
import java.util.Date;

public class MThirdPayInfoDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_THIRD_PAY_INFO.ID
     *
     * @mbggenerated
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_THIRD_PAY_INFO.BANK_CODE
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_THIRD_PAY_INFO.BANK_NAME
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_THIRD_PAY_INFO.PAY_CHANNEL
     *
     * @mbggenerated
     */
    private String payChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_THIRD_PAY_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_THIRD_PAY_INFO.ISSUER_ID
     *
     * @mbggenerated
     */
    private String issuerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_THIRD_PAY_INFO.ID
     *
     * @return the value of CULSITE.M_THIRD_PAY_INFO.ID
     *
     * @mbggenerated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_THIRD_PAY_INFO.ID
     *
     * @param id the value for CULSITE.M_THIRD_PAY_INFO.ID
     *
     * @mbggenerated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_THIRD_PAY_INFO.BANK_CODE
     *
     * @return the value of CULSITE.M_THIRD_PAY_INFO.BANK_CODE
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_THIRD_PAY_INFO.BANK_CODE
     *
     * @param bankCode the value for CULSITE.M_THIRD_PAY_INFO.BANK_CODE
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_THIRD_PAY_INFO.BANK_NAME
     *
     * @return the value of CULSITE.M_THIRD_PAY_INFO.BANK_NAME
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_THIRD_PAY_INFO.BANK_NAME
     *
     * @param bankName the value for CULSITE.M_THIRD_PAY_INFO.BANK_NAME
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_THIRD_PAY_INFO.PAY_CHANNEL
     *
     * @return the value of CULSITE.M_THIRD_PAY_INFO.PAY_CHANNEL
     *
     * @mbggenerated
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_THIRD_PAY_INFO.PAY_CHANNEL
     *
     * @param payChannel the value for CULSITE.M_THIRD_PAY_INFO.PAY_CHANNEL
     *
     * @mbggenerated
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_THIRD_PAY_INFO.CREATE_TIME
     *
     * @return the value of CULSITE.M_THIRD_PAY_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_THIRD_PAY_INFO.CREATE_TIME
     *
     * @param createTime the value for CULSITE.M_THIRD_PAY_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_THIRD_PAY_INFO.ISSUER_ID
     *
     * @return the value of CULSITE.M_THIRD_PAY_INFO.ISSUER_ID
     *
     * @mbggenerated
     */
    public String getIssuerId() {
        return issuerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_THIRD_PAY_INFO.ISSUER_ID
     *
     * @param issuerId the value for CULSITE.M_THIRD_PAY_INFO.ISSUER_ID
     *
     * @mbggenerated
     */
    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId == null ? null : issuerId.trim();
    }
}