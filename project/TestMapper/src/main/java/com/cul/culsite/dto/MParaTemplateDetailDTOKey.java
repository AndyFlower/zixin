package com.cul.culsite.dto;

public class MParaTemplateDetailDTOKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PARA_TEMPLATE_DETAIL.MPTD_ID
     *
     * @mbggenerated
     */
    private String mptdId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PARA_TEMPLATE_DETAIL.MPTD_ITEM
     *
     * @mbggenerated
     */
    private Long mptdItem;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PARA_TEMPLATE_DETAIL.MPTD_ID
     *
     * @return the value of M_PARA_TEMPLATE_DETAIL.MPTD_ID
     *
     * @mbggenerated
     */
    public String getMptdId() {
        return mptdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PARA_TEMPLATE_DETAIL.MPTD_ID
     *
     * @param mptdId the value for M_PARA_TEMPLATE_DETAIL.MPTD_ID
     *
     * @mbggenerated
     */
    public void setMptdId(String mptdId) {
        this.mptdId = mptdId == null ? null : mptdId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PARA_TEMPLATE_DETAIL.MPTD_ITEM
     *
     * @return the value of M_PARA_TEMPLATE_DETAIL.MPTD_ITEM
     *
     * @mbggenerated
     */
    public Long getMptdItem() {
        return mptdItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PARA_TEMPLATE_DETAIL.MPTD_ITEM
     *
     * @param mptdItem the value for M_PARA_TEMPLATE_DETAIL.MPTD_ITEM
     *
     * @mbggenerated
     */
    public void setMptdItem(Long mptdItem) {
        this.mptdItem = mptdItem;
    }
}