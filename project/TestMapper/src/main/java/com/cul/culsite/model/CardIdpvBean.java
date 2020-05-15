package com.cul.culsite.model;

import com.cul.culsite.dto.MOrderTxnDTO;

public class CardIdpvBean {

	private String merchantNo;
	
	private String issuerId;
	
	private String billNo;
	
	private String totalAmount;
	
	private String buyerMobile;
	
	private String cardNum;
	
	private String userId;
	
	private String channel;
	
	private String orderPayAmount;
	
	private String cardNo;
	
	private String expiryDate;
	
	private String buyChannel;
	
	private String payBillNo;
	
	private CodeMsg codeMsg; //充值结果
	private MOrderTxnDTO mOrderTxnDTO; //充值流水记录
	
	private String activityId;
	
	private String termNo;

	private String custSeq;
	
	private String accountType; // 充值类型
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public CodeMsg getCodeMsg() {
		return codeMsg;
	}

	public void setCodeMsg(CodeMsg codeMsg) {
		this.codeMsg = codeMsg;
	}

	public MOrderTxnDTO getmOrderTxnDTO() {
		return mOrderTxnDTO;
	}

	public void setmOrderTxnDTO(MOrderTxnDTO mOrderTxnDTO) {
		this.mOrderTxnDTO = mOrderTxnDTO;
	}

	public String getPayBillNo() {
		return payBillNo;
	}

	public void setPayBillNo(String payBillNo) {
		this.payBillNo = payBillNo;
	}

	public String getBuyChannel() {
		return buyChannel;
	}

	public void setBuyChannel(String buyChannel) {
		this.buyChannel = buyChannel;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getBuyerMobile() {
		return buyerMobile;
	}

	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOrderPayAmount() {
		return orderPayAmount;
	}

	public void setOrderPayAmount(String orderPayAmount) {
		this.orderPayAmount = orderPayAmount;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
