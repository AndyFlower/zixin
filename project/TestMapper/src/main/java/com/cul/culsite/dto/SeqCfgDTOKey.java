package com.cul.culsite.dto;

public class SeqCfgDTOKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.SEQ_CFG.SYSTEM_CODE
     *
     * @mbggenerated
     */
    private String systemCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.SEQ_CFG.DTO_NAME
     *
     * @mbggenerated
     */
    private String dtoName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.SEQ_CFG.DTO_FIELD_NAME
     *
     * @mbggenerated
     */
    private String dtoFieldName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.SEQ_CFG.SYSTEM_CODE
     *
     * @return the value of CULSITE.SEQ_CFG.SYSTEM_CODE
     *
     * @mbggenerated
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.SEQ_CFG.SYSTEM_CODE
     *
     * @param systemCode the value for CULSITE.SEQ_CFG.SYSTEM_CODE
     *
     * @mbggenerated
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.SEQ_CFG.DTO_NAME
     *
     * @return the value of CULSITE.SEQ_CFG.DTO_NAME
     *
     * @mbggenerated
     */
    public String getDtoName() {
        return dtoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.SEQ_CFG.DTO_NAME
     *
     * @param dtoName the value for CULSITE.SEQ_CFG.DTO_NAME
     *
     * @mbggenerated
     */
    public void setDtoName(String dtoName) {
        this.dtoName = dtoName == null ? null : dtoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.SEQ_CFG.DTO_FIELD_NAME
     *
     * @return the value of CULSITE.SEQ_CFG.DTO_FIELD_NAME
     *
     * @mbggenerated
     */
    public String getDtoFieldName() {
        return dtoFieldName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.SEQ_CFG.DTO_FIELD_NAME
     *
     * @param dtoFieldName the value for CULSITE.SEQ_CFG.DTO_FIELD_NAME
     *
     * @mbggenerated
     */
    public void setDtoFieldName(String dtoFieldName) {
        this.dtoFieldName = dtoFieldName == null ? null : dtoFieldName.trim();
    }
}