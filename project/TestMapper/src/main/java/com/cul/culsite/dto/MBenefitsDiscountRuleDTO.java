package com.cul.culsite.dto;

import java.math.BigDecimal;
import java.util.Date;

public class MBenefitsDiscountRuleDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBR_ID
     *
     * @mbggenerated
     */
    private String mbrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_TYPE
     *
     * @mbggenerated
     */
    private String mbdrType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DESCRIPTION
     *
     * @mbggenerated
     */
    private String mbdrDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_ISSUER_ID
     *
     * @mbggenerated
     */
    private String mbdrIssuerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_STATUS
     *
     * @mbggenerated
     */
    private String mbdrStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_START_DATE
     *
     * @mbggenerated
     */
    private Date mbdrStartDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_END_DATE
     *
     * @mbggenerated
     */
    private Date mbdrEndDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PROMOTION_TYPE
     *
     * @mbggenerated
     */
    private String mbdrPromotionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RULE_CODE
     *
     * @mbggenerated
     */
    private String mbdrRuleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FIXED
     *
     * @mbggenerated
     */
    private String mbdrIsFixed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RATE
     *
     * @mbggenerated
     */
    private String mbdrRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_COFFICIENT
     *
     * @mbggenerated
     */
    private BigDecimal mbdrCofficient;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal mbdrAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MIN_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal mbdrMinAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MAX_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal mbdrMaxAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MENCHANT_NO
     *
     * @mbggenerated
     */
    private String mbdrMenchantNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRODUCT_ID
     *
     * @mbggenerated
     */
    private String mbdrProductId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DISCOUNT_PRODUCT_ID
     *
     * @mbggenerated
     */
    private String mbdrDiscountProductId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRIORITY
     *
     * @mbggenerated
     */
    private BigDecimal mbdrPriority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_SUPERIMPOSED
     *
     * @mbggenerated
     */
    private String mbdrIsSuperimposed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FORMAT
     *
     * @mbggenerated
     */
    private String mbdrIsFormat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBR_ID
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBR_ID
     *
     * @mbggenerated
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBR_ID
     *
     * @param mbrId the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBR_ID
     *
     * @mbggenerated
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_TYPE
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_TYPE
     *
     * @mbggenerated
     */
    public String getMbdrType() {
        return mbdrType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_TYPE
     *
     * @param mbdrType the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_TYPE
     *
     * @mbggenerated
     */
    public void setMbdrType(String mbdrType) {
        this.mbdrType = mbdrType == null ? null : mbdrType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DESCRIPTION
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DESCRIPTION
     *
     * @mbggenerated
     */
    public String getMbdrDescription() {
        return mbdrDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DESCRIPTION
     *
     * @param mbdrDescription the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DESCRIPTION
     *
     * @mbggenerated
     */
    public void setMbdrDescription(String mbdrDescription) {
        this.mbdrDescription = mbdrDescription == null ? null : mbdrDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_ISSUER_ID
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_ISSUER_ID
     *
     * @mbggenerated
     */
    public String getMbdrIssuerId() {
        return mbdrIssuerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_ISSUER_ID
     *
     * @param mbdrIssuerId the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_ISSUER_ID
     *
     * @mbggenerated
     */
    public void setMbdrIssuerId(String mbdrIssuerId) {
        this.mbdrIssuerId = mbdrIssuerId == null ? null : mbdrIssuerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_STATUS
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_STATUS
     *
     * @mbggenerated
     */
    public String getMbdrStatus() {
        return mbdrStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_STATUS
     *
     * @param mbdrStatus the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_STATUS
     *
     * @mbggenerated
     */
    public void setMbdrStatus(String mbdrStatus) {
        this.mbdrStatus = mbdrStatus == null ? null : mbdrStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_START_DATE
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_START_DATE
     *
     * @mbggenerated
     */
    public Date getMbdrStartDate() {
        return mbdrStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_START_DATE
     *
     * @param mbdrStartDate the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_START_DATE
     *
     * @mbggenerated
     */
    public void setMbdrStartDate(Date mbdrStartDate) {
        this.mbdrStartDate = mbdrStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_END_DATE
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_END_DATE
     *
     * @mbggenerated
     */
    public Date getMbdrEndDate() {
        return mbdrEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_END_DATE
     *
     * @param mbdrEndDate the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_END_DATE
     *
     * @mbggenerated
     */
    public void setMbdrEndDate(Date mbdrEndDate) {
        this.mbdrEndDate = mbdrEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PROMOTION_TYPE
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PROMOTION_TYPE
     *
     * @mbggenerated
     */
    public String getMbdrPromotionType() {
        return mbdrPromotionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PROMOTION_TYPE
     *
     * @param mbdrPromotionType the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PROMOTION_TYPE
     *
     * @mbggenerated
     */
    public void setMbdrPromotionType(String mbdrPromotionType) {
        this.mbdrPromotionType = mbdrPromotionType == null ? null : mbdrPromotionType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RULE_CODE
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RULE_CODE
     *
     * @mbggenerated
     */
    public String getMbdrRuleCode() {
        return mbdrRuleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RULE_CODE
     *
     * @param mbdrRuleCode the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RULE_CODE
     *
     * @mbggenerated
     */
    public void setMbdrRuleCode(String mbdrRuleCode) {
        this.mbdrRuleCode = mbdrRuleCode == null ? null : mbdrRuleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FIXED
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FIXED
     *
     * @mbggenerated
     */
    public String getMbdrIsFixed() {
        return mbdrIsFixed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FIXED
     *
     * @param mbdrIsFixed the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FIXED
     *
     * @mbggenerated
     */
    public void setMbdrIsFixed(String mbdrIsFixed) {
        this.mbdrIsFixed = mbdrIsFixed == null ? null : mbdrIsFixed.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RATE
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RATE
     *
     * @mbggenerated
     */
    public String getMbdrRate() {
        return mbdrRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RATE
     *
     * @param mbdrRate the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_RATE
     *
     * @mbggenerated
     */
    public void setMbdrRate(String mbdrRate) {
        this.mbdrRate = mbdrRate == null ? null : mbdrRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_COFFICIENT
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_COFFICIENT
     *
     * @mbggenerated
     */
    public BigDecimal getMbdrCofficient() {
        return mbdrCofficient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_COFFICIENT
     *
     * @param mbdrCofficient the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_COFFICIENT
     *
     * @mbggenerated
     */
    public void setMbdrCofficient(BigDecimal mbdrCofficient) {
        this.mbdrCofficient = mbdrCofficient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_AMOUNT
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getMbdrAmount() {
        return mbdrAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_AMOUNT
     *
     * @param mbdrAmount the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_AMOUNT
     *
     * @mbggenerated
     */
    public void setMbdrAmount(BigDecimal mbdrAmount) {
        this.mbdrAmount = mbdrAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MIN_AMOUNT
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MIN_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getMbdrMinAmount() {
        return mbdrMinAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MIN_AMOUNT
     *
     * @param mbdrMinAmount the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MIN_AMOUNT
     *
     * @mbggenerated
     */
    public void setMbdrMinAmount(BigDecimal mbdrMinAmount) {
        this.mbdrMinAmount = mbdrMinAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MAX_AMOUNT
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MAX_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getMbdrMaxAmount() {
        return mbdrMaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MAX_AMOUNT
     *
     * @param mbdrMaxAmount the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MAX_AMOUNT
     *
     * @mbggenerated
     */
    public void setMbdrMaxAmount(BigDecimal mbdrMaxAmount) {
        this.mbdrMaxAmount = mbdrMaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MENCHANT_NO
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MENCHANT_NO
     *
     * @mbggenerated
     */
    public String getMbdrMenchantNo() {
        return mbdrMenchantNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MENCHANT_NO
     *
     * @param mbdrMenchantNo the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_MENCHANT_NO
     *
     * @mbggenerated
     */
    public void setMbdrMenchantNo(String mbdrMenchantNo) {
        this.mbdrMenchantNo = mbdrMenchantNo == null ? null : mbdrMenchantNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRODUCT_ID
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRODUCT_ID
     *
     * @mbggenerated
     */
    public String getMbdrProductId() {
        return mbdrProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRODUCT_ID
     *
     * @param mbdrProductId the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRODUCT_ID
     *
     * @mbggenerated
     */
    public void setMbdrProductId(String mbdrProductId) {
        this.mbdrProductId = mbdrProductId == null ? null : mbdrProductId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DISCOUNT_PRODUCT_ID
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DISCOUNT_PRODUCT_ID
     *
     * @mbggenerated
     */
    public String getMbdrDiscountProductId() {
        return mbdrDiscountProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DISCOUNT_PRODUCT_ID
     *
     * @param mbdrDiscountProductId the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_DISCOUNT_PRODUCT_ID
     *
     * @mbggenerated
     */
    public void setMbdrDiscountProductId(String mbdrDiscountProductId) {
        this.mbdrDiscountProductId = mbdrDiscountProductId == null ? null : mbdrDiscountProductId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRIORITY
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRIORITY
     *
     * @mbggenerated
     */
    public BigDecimal getMbdrPriority() {
        return mbdrPriority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRIORITY
     *
     * @param mbdrPriority the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_PRIORITY
     *
     * @mbggenerated
     */
    public void setMbdrPriority(BigDecimal mbdrPriority) {
        this.mbdrPriority = mbdrPriority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_SUPERIMPOSED
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_SUPERIMPOSED
     *
     * @mbggenerated
     */
    public String getMbdrIsSuperimposed() {
        return mbdrIsSuperimposed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_SUPERIMPOSED
     *
     * @param mbdrIsSuperimposed the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_SUPERIMPOSED
     *
     * @mbggenerated
     */
    public void setMbdrIsSuperimposed(String mbdrIsSuperimposed) {
        this.mbdrIsSuperimposed = mbdrIsSuperimposed == null ? null : mbdrIsSuperimposed.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FORMAT
     *
     * @return the value of CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FORMAT
     *
     * @mbggenerated
     */
    public String getMbdrIsFormat() {
        return mbdrIsFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FORMAT
     *
     * @param mbdrIsFormat the value for CULSITE.M_BENEFITS_DISCOUNT_RULE.MBDR_IS_FORMAT
     *
     * @mbggenerated
     */
    public void setMbdrIsFormat(String mbdrIsFormat) {
        this.mbdrIsFormat = mbdrIsFormat == null ? null : mbdrIsFormat.trim();
    }
}