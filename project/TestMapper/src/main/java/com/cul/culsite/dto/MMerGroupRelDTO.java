package com.cul.culsite.dto;

public class MMerGroupRelDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_MER_GROUP_REL.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_MER_GROUP_REL.MER_GROUP_ID
     *
     * @mbggenerated
     */
    private String merGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_MER_GROUP_REL.MER_ID
     *
     * @mbggenerated
     */
    private String merId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_MER_GROUP_REL.CREATE_TIME
     *
     * @mbggenerated
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_MER_GROUP_REL.CREATE_USER
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_MER_GROUP_REL.MER_RIGHT_ID
     *
     * @mbggenerated
     */
    private String merRightId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_MER_GROUP_REL.ID
     *
     * @return the value of M_MER_GROUP_REL.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_MER_GROUP_REL.ID
     *
     * @param id the value for M_MER_GROUP_REL.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_MER_GROUP_REL.MER_GROUP_ID
     *
     * @return the value of M_MER_GROUP_REL.MER_GROUP_ID
     *
     * @mbggenerated
     */
    public String getMerGroupId() {
        return merGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_MER_GROUP_REL.MER_GROUP_ID
     *
     * @param merGroupId the value for M_MER_GROUP_REL.MER_GROUP_ID
     *
     * @mbggenerated
     */
    public void setMerGroupId(String merGroupId) {
        this.merGroupId = merGroupId == null ? null : merGroupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_MER_GROUP_REL.MER_ID
     *
     * @return the value of M_MER_GROUP_REL.MER_ID
     *
     * @mbggenerated
     */
    public String getMerId() {
        return merId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_MER_GROUP_REL.MER_ID
     *
     * @param merId the value for M_MER_GROUP_REL.MER_ID
     *
     * @mbggenerated
     */
    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_MER_GROUP_REL.CREATE_TIME
     *
     * @return the value of M_MER_GROUP_REL.CREATE_TIME
     *
     * @mbggenerated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_MER_GROUP_REL.CREATE_TIME
     *
     * @param createTime the value for M_MER_GROUP_REL.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_MER_GROUP_REL.CREATE_USER
     *
     * @return the value of M_MER_GROUP_REL.CREATE_USER
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_MER_GROUP_REL.CREATE_USER
     *
     * @param createUser the value for M_MER_GROUP_REL.CREATE_USER
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_MER_GROUP_REL.MER_RIGHT_ID
     *
     * @return the value of M_MER_GROUP_REL.MER_RIGHT_ID
     *
     * @mbggenerated
     */
    public String getMerRightId() {
        return merRightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_MER_GROUP_REL.MER_RIGHT_ID
     *
     * @param merRightId the value for M_MER_GROUP_REL.MER_RIGHT_ID
     *
     * @mbggenerated
     */
    public void setMerRightId(String merRightId) {
        this.merRightId = merRightId == null ? null : merRightId.trim();
    }
}