package com.cul.culsite.model;

public class CouponOrderTxnInfo {

	private String orderId;
	private String merId;
	private String tranDate;
	private String tranTime;
	private String orderType;
	private String issuerId;
	private String custSeq;
	private String couponNo;
	private Long totalPayAmount;
	
	private String couponTxnId;
	private Integer couponFaceValueInfen; 
	
	private Integer couponMinOrderAmount; //使用门槛卡/券的最低门槛金额

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public Long getTotalPayAmount() {
		return totalPayAmount;
	}

	public void setTotalPayAmount(Long totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponTxnId() {
		return couponTxnId;
	}

	public void setCouponTxnId(String couponTxnId) {
		this.couponTxnId = couponTxnId;
	}

	public Integer getCouponFaceValueInfen() {
		return couponFaceValueInfen;
	}

	public void setCouponFaceValueInfen(Integer couponFaceValueInfen) {
		this.couponFaceValueInfen = couponFaceValueInfen;
	}

	public Integer getCouponMinOrderAmount() {
		return couponMinOrderAmount;
	}

	public void setCouponMinOrderAmount(Integer couponMinOrderAmount) {
		this.couponMinOrderAmount = couponMinOrderAmount;
	}

}
