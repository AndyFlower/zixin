package com.cul.culsite.dto;

public class MPointsRecordDetailDTOKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_POINTS_RECORD_DETAIL.MPRD_ID
     *
     * @mbggenerated
     */
    private String mprdId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_POINTS_RECORD_DETAIL.MPRD_TXN_ID
     *
     * @mbggenerated
     */
    private String mprdTxnId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_POINTS_RECORD_DETAIL.MPRD_ID
     *
     * @return the value of M_POINTS_RECORD_DETAIL.MPRD_ID
     *
     * @mbggenerated
     */
    public String getMprdId() {
        return mprdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_POINTS_RECORD_DETAIL.MPRD_ID
     *
     * @param mprdId the value for M_POINTS_RECORD_DETAIL.MPRD_ID
     *
     * @mbggenerated
     */
    public void setMprdId(String mprdId) {
        this.mprdId = mprdId == null ? null : mprdId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_POINTS_RECORD_DETAIL.MPRD_TXN_ID
     *
     * @return the value of M_POINTS_RECORD_DETAIL.MPRD_TXN_ID
     *
     * @mbggenerated
     */
    public String getMprdTxnId() {
        return mprdTxnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_POINTS_RECORD_DETAIL.MPRD_TXN_ID
     *
     * @param mprdTxnId the value for M_POINTS_RECORD_DETAIL.MPRD_TXN_ID
     *
     * @mbggenerated
     */
    public void setMprdTxnId(String mprdTxnId) {
        this.mprdTxnId = mprdTxnId == null ? null : mprdTxnId.trim();
    }
}