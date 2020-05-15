package com.cul.culsite.model.transation.refund;

import java.math.BigDecimal;

public class CardRefundDetailBean {

	String cardNo;
	String amount; // 请求退货金额
	
	BigDecimal refundedAmount; // 已退货金额
	BigDecimal redeemAmount; // 已消费金额
	String lmstxnId;//消费时LmsId
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getLmstxnId() {
		return lmstxnId;
	}
	public void setLmstxnId(String lmstxnId) {
		this.lmstxnId = lmstxnId;
	}
	public BigDecimal getRefundedAmount() {
		return refundedAmount;
	}
	public void setRefundedAmount(BigDecimal refundedAmount) {
		this.refundedAmount = refundedAmount;
	}
	public BigDecimal getRedeemAmount() {
		return redeemAmount;
	}
	public void setRedeemAmount(BigDecimal redeemAmount) {
		this.redeemAmount = redeemAmount;
	}
}
