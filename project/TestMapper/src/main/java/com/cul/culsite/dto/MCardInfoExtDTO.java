package com.cul.culsite.dto;

import java.util.Date;

public class MCardInfoExtDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_CARD_INFO_EXT.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_CARD_INFO_EXT.CARD_NO
     *
     * @mbggenerated
     */
    private String cardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_CARD_INFO_EXT.ISSUER_ID
     *
     * @mbggenerated
     */
    private String issuerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_CARD_INFO_EXT.CATEGORY_ID
     *
     * @mbggenerated
     */
    private String categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_CARD_INFO_EXT.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_CARD_INFO_EXT.ID
     *
     * @return the value of CULSITE.M_CARD_INFO_EXT.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_CARD_INFO_EXT.ID
     *
     * @param id the value for CULSITE.M_CARD_INFO_EXT.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_CARD_INFO_EXT.CARD_NO
     *
     * @return the value of CULSITE.M_CARD_INFO_EXT.CARD_NO
     *
     * @mbggenerated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_CARD_INFO_EXT.CARD_NO
     *
     * @param cardNo the value for CULSITE.M_CARD_INFO_EXT.CARD_NO
     *
     * @mbggenerated
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_CARD_INFO_EXT.ISSUER_ID
     *
     * @return the value of CULSITE.M_CARD_INFO_EXT.ISSUER_ID
     *
     * @mbggenerated
     */
    public String getIssuerId() {
        return issuerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_CARD_INFO_EXT.ISSUER_ID
     *
     * @param issuerId the value for CULSITE.M_CARD_INFO_EXT.ISSUER_ID
     *
     * @mbggenerated
     */
    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId == null ? null : issuerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_CARD_INFO_EXT.CATEGORY_ID
     *
     * @return the value of CULSITE.M_CARD_INFO_EXT.CATEGORY_ID
     *
     * @mbggenerated
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_CARD_INFO_EXT.CATEGORY_ID
     *
     * @param categoryId the value for CULSITE.M_CARD_INFO_EXT.CATEGORY_ID
     *
     * @mbggenerated
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_CARD_INFO_EXT.CREATE_TIME
     *
     * @return the value of CULSITE.M_CARD_INFO_EXT.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_CARD_INFO_EXT.CREATE_TIME
     *
     * @param createTime the value for CULSITE.M_CARD_INFO_EXT.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}