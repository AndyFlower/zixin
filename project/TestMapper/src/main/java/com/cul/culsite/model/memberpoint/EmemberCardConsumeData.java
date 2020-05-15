package com.cul.culsite.model.memberpoint;

import java.math.BigDecimal;
import java.util.List;

import com.cul.culsite.dto.MOrderTxnDTO;

public class EmemberCardConsumeData {
	private String issuerId;
	private String txnId;
	private List<String> EMemberPayType;// 支付方式汇总
	private List<String> EMemberPayAmount;// 各种支付方式的支付金额
	// 积分联付时积分抵扣值
	private BigDecimal pointsDiscount; // 积分值

	private BigDecimal pointsDiscountAmount; // 积分对应的金额
	
	private BigDecimal voucherSaleAmount;  ////-------

	// 券组 for 报文返回
	// 券信息
	private List<VoucherDiscountInfo> voucherDiscountInfoList;
	private BigDecimal voucherDiscountAmount;
	// 可用卡余额
	private BigDecimal cardBalance;

	public BigDecimal getCardBalance() {
		return cardBalance;
	}

	public void setCardBalance(BigDecimal cardBalance) {
		this.cardBalance = cardBalance;
	}

	public List<VoucherDiscountInfo> getVoucherDiscountInfoList() {
		return voucherDiscountInfoList;
	}

	public void setVoucherDiscountInfoList(
			List<VoucherDiscountInfo> voucherDiscountInfoList) {
		this.voucherDiscountInfoList = voucherDiscountInfoList;
	}

	public BigDecimal getVoucherDiscountAmount() {
		return voucherDiscountAmount;
	}

	public void setVoucherDiscountAmount(BigDecimal voucherDiscountAmount) {
		this.voucherDiscountAmount = voucherDiscountAmount;
	}

	public BigDecimal getPointsDiscount() {
		return pointsDiscount;
	}

	public void setPointsDiscount(BigDecimal pointsDiscount) {
		this.pointsDiscount = pointsDiscount;
	}

	public BigDecimal getPointsDiscountAmount() {
		return pointsDiscountAmount;
	}

	public void setPointsDiscountAmount(BigDecimal pointsDiscountAmount) {
		this.pointsDiscountAmount = pointsDiscountAmount;
	}

	// 折扣流水
	private List<MOrderTxnDTO> mOrderTxnList;

	public List<MOrderTxnDTO> getmOrderTxnList() {
		return mOrderTxnList;
	}

	public void setmOrderTxnList(List<MOrderTxnDTO> mOrderTxnList) {
		this.mOrderTxnList = mOrderTxnList;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public List<String> getEMemberPayType() {
		return EMemberPayType;
	}

	public void setEMemberPayType(List<String> eMemberPayType) {
		EMemberPayType = eMemberPayType;
	}

	public List<String> getEMemberPayAmount() {
		return EMemberPayAmount;
	}

	public void setEMemberPayAmount(List<String> eMemberPayAmount) {
		EMemberPayAmount = eMemberPayAmount;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	

	public BigDecimal getVoucherSaleAmount() {
		return voucherSaleAmount;
	}

	public void setVoucherSaleAmount(BigDecimal voucherSaleAmount) {
		this.voucherSaleAmount = voucherSaleAmount;
	}

}
