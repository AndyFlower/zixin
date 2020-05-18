package com.cul.culsite.dto;

import java.util.Date;

public class MTransHeaderDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_ID
     *
     * @mbggenerated
     */
    private String mthTransId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_ORG_TXN_ID
     *
     * @mbggenerated
     */
    private String mthOrgTxnId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_MERCHANT_NO
     *
     * @mbggenerated
     */
    private String mthMerchantNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_DT
     *
     * @mbggenerated
     */
    private String mthDt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_STAN
     *
     * @mbggenerated
     */
    private String mthStan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_STATUS
     *
     * @mbggenerated
     */
    private String mthStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.CREATE_USER
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.UPDATE_USER
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    private Date updateTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_SOURCE_ID
     *
     * @mbggenerated
     */
    private String mthSourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_USERID
     *
     * @mbggenerated
     */
    private String mthUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_TERM_NO
     *
     * @mbggenerated
     */
    private String mthTermNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_R_CODE
     *
     * @mbggenerated
     */
    private String mthRCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_TRANSID
     *
     * @mbggenerated
     */
    private String mthTransid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_TYPE
     *
     * @mbggenerated
     */
    private String mthTransType;

    private String issuerId;
    
    public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_CHANNEL
     *
     * @mbggenerated
     */
    private String mthChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID
     *
     * @mbggenerated
     */
    private String mthExternalTxnid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID_OWNER
     *
     * @mbggenerated
     */
    private String mthExternalTxnidOwner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_ORDER_ID
     *
     * @mbggenerated
     */
    private String mthTransOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_CASHIER_INFORMATION
     *
     * @mbggenerated
     */
    private String mthCashierInformation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_RRN
     *
     * @mbggenerated
     */
    private String mthRrn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.M_TRANS_HEADER.MTH_SETTLE_DATE
     *
     * @mbggenerated
     */
    private String mthSettleDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_ID
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_TRANS_ID
     *
     * @mbggenerated
     */
    public String getMthTransId() {
        return mthTransId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_ID
     *
     * @param mthTransId the value for CULSITE.M_TRANS_HEADER.MTH_TRANS_ID
     *
     * @mbggenerated
     */
    public void setMthTransId(String mthTransId) {
        this.mthTransId = mthTransId == null ? null : mthTransId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_ORG_TXN_ID
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_ORG_TXN_ID
     *
     * @mbggenerated
     */
    public String getMthOrgTxnId() {
        return mthOrgTxnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_ORG_TXN_ID
     *
     * @param mthOrgTxnId the value for CULSITE.M_TRANS_HEADER.MTH_ORG_TXN_ID
     *
     * @mbggenerated
     */
    public void setMthOrgTxnId(String mthOrgTxnId) {
        this.mthOrgTxnId = mthOrgTxnId == null ? null : mthOrgTxnId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_MERCHANT_NO
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_MERCHANT_NO
     *
     * @mbggenerated
     */
    public String getMthMerchantNo() {
        return mthMerchantNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_MERCHANT_NO
     *
     * @param mthMerchantNo the value for CULSITE.M_TRANS_HEADER.MTH_MERCHANT_NO
     *
     * @mbggenerated
     */
    public void setMthMerchantNo(String mthMerchantNo) {
        this.mthMerchantNo = mthMerchantNo == null ? null : mthMerchantNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_DT
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_DT
     *
     * @mbggenerated
     */
    public String getMthDt() {
        return mthDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_DT
     *
     * @param mthDt the value for CULSITE.M_TRANS_HEADER.MTH_DT
     *
     * @mbggenerated
     */
    public void setMthDt(String mthDt) {
        this.mthDt = mthDt == null ? null : mthDt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_STAN
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_STAN
     *
     * @mbggenerated
     */
    public String getMthStan() {
        return mthStan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_STAN
     *
     * @param mthStan the value for CULSITE.M_TRANS_HEADER.MTH_STAN
     *
     * @mbggenerated
     */
    public void setMthStan(String mthStan) {
        this.mthStan = mthStan == null ? null : mthStan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_STATUS
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_STATUS
     *
     * @mbggenerated
     */
    public String getMthStatus() {
        return mthStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_STATUS
     *
     * @param mthStatus the value for CULSITE.M_TRANS_HEADER.MTH_STATUS
     *
     * @mbggenerated
     */
    public void setMthStatus(String mthStatus) {
        this.mthStatus = mthStatus == null ? null : mthStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.CREATE_USER
     *
     * @return the value of CULSITE.M_TRANS_HEADER.CREATE_USER
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.CREATE_USER
     *
     * @param createUser the value for CULSITE.M_TRANS_HEADER.CREATE_USER
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.CREATE_TIMESTAMP
     *
     * @return the value of CULSITE.M_TRANS_HEADER.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.CREATE_TIMESTAMP
     *
     * @param createTimestamp the value for CULSITE.M_TRANS_HEADER.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.UPDATE_USER
     *
     * @return the value of CULSITE.M_TRANS_HEADER.UPDATE_USER
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.UPDATE_USER
     *
     * @param updateUser the value for CULSITE.M_TRANS_HEADER.UPDATE_USER
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.UPDATE_TIMESTAMP
     *
     * @return the value of CULSITE.M_TRANS_HEADER.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.UPDATE_TIMESTAMP
     *
     * @param updateTimestamp the value for CULSITE.M_TRANS_HEADER.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_SOURCE_ID
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_SOURCE_ID
     *
     * @mbggenerated
     */
    public String getMthSourceId() {
        return mthSourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_SOURCE_ID
     *
     * @param mthSourceId the value for CULSITE.M_TRANS_HEADER.MTH_SOURCE_ID
     *
     * @mbggenerated
     */
    public void setMthSourceId(String mthSourceId) {
        this.mthSourceId = mthSourceId == null ? null : mthSourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_USERID
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_USERID
     *
     * @mbggenerated
     */
    public String getMthUserid() {
        return mthUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_USERID
     *
     * @param mthUserid the value for CULSITE.M_TRANS_HEADER.MTH_USERID
     *
     * @mbggenerated
     */
    public void setMthUserid(String mthUserid) {
        this.mthUserid = mthUserid == null ? null : mthUserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_TERM_NO
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_TERM_NO
     *
     * @mbggenerated
     */
    public String getMthTermNo() {
        return mthTermNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_TERM_NO
     *
     * @param mthTermNo the value for CULSITE.M_TRANS_HEADER.MTH_TERM_NO
     *
     * @mbggenerated
     */
    public void setMthTermNo(String mthTermNo) {
        this.mthTermNo = mthTermNo == null ? null : mthTermNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_R_CODE
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_R_CODE
     *
     * @mbggenerated
     */
    public String getMthRCode() {
        return mthRCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_R_CODE
     *
     * @param mthRCode the value for CULSITE.M_TRANS_HEADER.MTH_R_CODE
     *
     * @mbggenerated
     */
    public void setMthRCode(String mthRCode) {
        this.mthRCode = mthRCode == null ? null : mthRCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANSID
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_TRANSID
     *
     * @mbggenerated
     */
    public String getMthTransid() {
        return mthTransid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANSID
     *
     * @param mthTransid the value for CULSITE.M_TRANS_HEADER.MTH_TRANSID
     *
     * @mbggenerated
     */
    public void setMthTransid(String mthTransid) {
        this.mthTransid = mthTransid == null ? null : mthTransid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_TYPE
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_TRANS_TYPE
     *
     * @mbggenerated
     */
    public String getMthTransType() {
        return mthTransType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_TYPE
     *
     * @param mthTransType the value for CULSITE.M_TRANS_HEADER.MTH_TRANS_TYPE
     *
     * @mbggenerated
     */
    public void setMthTransType(String mthTransType) {
        this.mthTransType = mthTransType == null ? null : mthTransType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_CHANNEL
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_CHANNEL
     *
     * @mbggenerated
     */
    public String getMthChannel() {
        return mthChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_CHANNEL
     *
     * @param mthChannel the value for CULSITE.M_TRANS_HEADER.MTH_CHANNEL
     *
     * @mbggenerated
     */
    public void setMthChannel(String mthChannel) {
        this.mthChannel = mthChannel == null ? null : mthChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID
     *
     * @mbggenerated
     */
    public String getMthExternalTxnid() {
        return mthExternalTxnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID
     *
     * @param mthExternalTxnid the value for CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID
     *
     * @mbggenerated
     */
    public void setMthExternalTxnid(String mthExternalTxnid) {
        this.mthExternalTxnid = mthExternalTxnid == null ? null : mthExternalTxnid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID_OWNER
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID_OWNER
     *
     * @mbggenerated
     */
    public String getMthExternalTxnidOwner() {
        return mthExternalTxnidOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID_OWNER
     *
     * @param mthExternalTxnidOwner the value for CULSITE.M_TRANS_HEADER.MTH_EXTERNAL_TXNID_OWNER
     *
     * @mbggenerated
     */
    public void setMthExternalTxnidOwner(String mthExternalTxnidOwner) {
        this.mthExternalTxnidOwner = mthExternalTxnidOwner == null ? null : mthExternalTxnidOwner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_ORDER_ID
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_TRANS_ORDER_ID
     *
     * @mbggenerated
     */
    public String getMthTransOrderId() {
        return mthTransOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_TRANS_ORDER_ID
     *
     * @param mthTransOrderId the value for CULSITE.M_TRANS_HEADER.MTH_TRANS_ORDER_ID
     *
     * @mbggenerated
     */
    public void setMthTransOrderId(String mthTransOrderId) {
        this.mthTransOrderId = mthTransOrderId == null ? null : mthTransOrderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_CASHIER_INFORMATION
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_CASHIER_INFORMATION
     *
     * @mbggenerated
     */
    public String getMthCashierInformation() {
        return mthCashierInformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_CASHIER_INFORMATION
     *
     * @param mthCashierInformation the value for CULSITE.M_TRANS_HEADER.MTH_CASHIER_INFORMATION
     *
     * @mbggenerated
     */
    public void setMthCashierInformation(String mthCashierInformation) {
        this.mthCashierInformation = mthCashierInformation == null ? null : mthCashierInformation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_RRN
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_RRN
     *
     * @mbggenerated
     */
    public String getMthRrn() {
        return mthRrn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_RRN
     *
     * @param mthRrn the value for CULSITE.M_TRANS_HEADER.MTH_RRN
     *
     * @mbggenerated
     */
    public void setMthRrn(String mthRrn) {
        this.mthRrn = mthRrn == null ? null : mthRrn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.M_TRANS_HEADER.MTH_SETTLE_DATE
     *
     * @return the value of CULSITE.M_TRANS_HEADER.MTH_SETTLE_DATE
     *
     * @mbggenerated
     */
    public String getMthSettleDate() {
        return mthSettleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.M_TRANS_HEADER.MTH_SETTLE_DATE
     *
     * @param mthSettleDate the value for CULSITE.M_TRANS_HEADER.MTH_SETTLE_DATE
     *
     * @mbggenerated
     */
    public void setMthSettleDate(String mthSettleDate) {
        this.mthSettleDate = mthSettleDate == null ? null : mthSettleDate.trim();
    }
}