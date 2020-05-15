package com.cul.culsite.dto;

public class MProductCardRealKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_PRODUCT_CARD_REAL.CARD_NO
     *
     * @mbggenerated
     */
    private String cardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_PRODUCT_CARD_REAL.PRODUCT_ID
     *
     * @mbggenerated
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_PRODUCT_CARD_REAL.ISSUER_ID
     *
     * @mbggenerated
     */
    private String issuerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_PRODUCT_CARD_REAL.CARD_NO
     *
     * @return the value of CULSITE.M_PRODUCT_CARD_REAL.CARD_NO
     *
     * @mbggenerated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_PRODUCT_CARD_REAL.CARD_NO
     *
     * @param cardNo the value for CULSITE.M_PRODUCT_CARD_REAL.CARD_NO
     *
     * @mbggenerated
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_PRODUCT_CARD_REAL.PRODUCT_ID
     *
     * @return the value of CULSITE.M_PRODUCT_CARD_REAL.PRODUCT_ID
     *
     * @mbggenerated
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_PRODUCT_CARD_REAL.PRODUCT_ID
     *
     * @param productId the value for CULSITE.M_PRODUCT_CARD_REAL.PRODUCT_ID
     *
     * @mbggenerated
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_PRODUCT_CARD_REAL.ISSUER_ID
     *
     * @return the value of CULSITE.M_PRODUCT_CARD_REAL.ISSUER_ID
     *
     * @mbggenerated
     */
    public String getIssuerId() {
        return issuerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_PRODUCT_CARD_REAL.ISSUER_ID
     *
     * @param issuerId the value for CULSITE.M_PRODUCT_CARD_REAL.ISSUER_ID
     *
     * @mbggenerated
     */
    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId == null ? null : issuerId.trim();
    }
}