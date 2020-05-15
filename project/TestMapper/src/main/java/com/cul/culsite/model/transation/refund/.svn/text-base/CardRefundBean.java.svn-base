package com.cul.culsite.model.transation.refund;

import java.util.List;

/**
 * 退货交易对象
 * 支持多种退货方式
 * @author liwenbo
 * 2015-6-16 下午05:12:53
 * @Description:
 * @version V 1.0
 * @JDK  V 1.6.22
 */
public class CardRefundBean {

	/** 退货订单号  */
	private String txnId;

	private String totalAmount;

	private String merchantNo;

	private String userId;

	private String channel;

	private String mobile;

	private String issuerId;
	/** 条码号  */
	private String tranId;
	/** 原消费流水号  */
	private String orderTxnId;
	/** 原消费订单号  */
	private String orderId;
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	private String termNo;

	// 线下退货pos信息
	private String sourceId;
	private String sysTraNo;
	private String transmsnDtTm;
	private String receiverCode;
	//by zsm for iprfmuitlpart
	private String inputChannel;//退货渠道
	
	private String lmstxnId;//消费时LmsId
	
	private String reqId; // 退货订单号
	
	private String accountSysRefundOrderId;// 帐务系统退货订单号 回写
	
	// 退货类型
	private RefundType refundType;
	// 退货流水明细
	List<CardRefundDetailBean> cardRefundDetailBeanList;
	
	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public String getOrderTxnId() {
		return orderTxnId;
	}

	public void setOrderTxnId(String orderTxnId) {
		this.orderTxnId = orderTxnId;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSysTraNo() {
		return sysTraNo;
	}

	public void setSysTraNo(String sysTraNo) {
		this.sysTraNo = sysTraNo;
	}

	public String getTransmsnDtTm() {
		return transmsnDtTm;
	}

	public void setTransmsnDtTm(String transmsnDtTm) {
		this.transmsnDtTm = transmsnDtTm;
	}

	public String getReceiverCode() {
		return receiverCode;
	}

	public void setReceiverCode(String receiverCode) {
		this.receiverCode = receiverCode;
	}

	public String getInputChannel() {
		return inputChannel;
	}

	public void setInputChannel(String inputChannel) {
		this.inputChannel = inputChannel;
	}

	public String getLmstxnId() {
		return lmstxnId;
	}

	public void setLmstxnId(String lmstxnId) {
		this.lmstxnId = lmstxnId;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getAccountSysRefundOrderId() {
		return accountSysRefundOrderId;
	}

	public void setAccountSysRefundOrderId(String accountSysRefundOrderId) {
		this.accountSysRefundOrderId = accountSysRefundOrderId;
	}

	public List<CardRefundDetailBean> getCardRefundDetailBeanList() {
		return cardRefundDetailBeanList;
	}

	public void setCardRefundDetailBeanList(
			List<CardRefundDetailBean> cardRefundDetailBeanList) {
		this.cardRefundDetailBeanList = cardRefundDetailBeanList;
	}

	public RefundType getRefundType() {
		return refundType;
	}

	public void setRefundType(RefundType refundType) {
		this.refundType = refundType;
	}

	@Override
	public String toString() {
		return "CardRefundBean [txnId=" + txnId + ", totalAmount=" + totalAmount + ", merchantNo=" + merchantNo + ", userId=" + userId + ", channel="
				+ channel + ", mobile=" + mobile + ", issuerId=" + issuerId + ", tranId=" + tranId + ", orderTxnId=" + orderTxnId + ", orderId="
				+ orderId + ", termNo=" + termNo + ", sourceId=" + sourceId + ", sysTraNo=" + sysTraNo + ", transmsnDtTm=" + transmsnDtTm
				+ ", receiverCode=" + receiverCode + ", inputChannel=" + inputChannel + ", lmstxnId=" + lmstxnId + ", reqId=" + reqId
				+ ", accountSysRefundOrderId=" + accountSysRefundOrderId + ", refundType=" + refundType + ", cardRefundDetailBeanList="
				+ cardRefundDetailBeanList + "]";
	}
	
}
