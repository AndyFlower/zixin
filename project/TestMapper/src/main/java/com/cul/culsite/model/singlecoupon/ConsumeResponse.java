package com.cul.culsite.model.singlecoupon;

import com.cul.culsite.dto.MOrderTxnDTO;

public class ConsumeResponse {
	private String code;

	private String msg;
	
	private String motTxnId;
	
	private String totalPayAmount;//实际支付总金额 单位 元
	
	private String totalCouponAmount;// 实际券支付金额 单位 元
	
	private String  bzAmount;// 不足金额
	
	private String accountBalance;// 账户余额
	
	private String cardType;//接口返回值，首张卡对应的卡类型信息：卡类型
	private String cardTypeDesc;//接口返回值，首张卡对应的卡类型信息：卡类型描述
	/** 支付渠道*/
	private String pay_channel;
	
	
	private SingleCouponConsumeData singleCouponConsumeData ;
	
	private MOrderTxnDTO voucherOrderTxn;
	
	// 返回报文
	private String cc;
	private int paraNum;
	private String issuerIdForMis;
	
	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public MOrderTxnDTO getVoucherOrderTxn() {
		return voucherOrderTxn;
	}

	public void setVoucherOrderTxn(MOrderTxnDTO voucherOrderTxn) {
		this.voucherOrderTxn = voucherOrderTxn;
	}

	public String getIssuerIdForMis() {
		return issuerIdForMis;
	}

	public void setIssuerIdForMis(String issuerIdForMis) {
		this.issuerIdForMis = issuerIdForMis;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public int getParaNum() {
		return paraNum;
	}

	public void setParaNum(int paraNum) {
		this.paraNum = paraNum;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMotTxnId() {
		return motTxnId;
	}

	public void setMotTxnId(String motTxnId) {
		this.motTxnId = motTxnId;
	}

	public String getTotalPayAmount() {
		return totalPayAmount;
	}

	public void setTotalPayAmount(String totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}

	public String getTotalCouponAmount() {
		return totalCouponAmount;
	}

	public void setTotalCouponAmount(String totalCouponAmount) {
		this.totalCouponAmount = totalCouponAmount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardTypeDesc() {
		return cardTypeDesc;
	}

	public void setCardTypeDesc(String cardTypeDesc) {
		this.cardTypeDesc = cardTypeDesc;
	}

	public String getPay_channel() {
		return pay_channel;
	}

	public void setPay_channel(String pay_channel) {
		this.pay_channel = pay_channel;
	}

	
	public SingleCouponConsumeData getSingleCouponConsumeData() {
		return singleCouponConsumeData;
	}

	public void setSingleCouponConsumeData(
			SingleCouponConsumeData singleCouponConsumeData) {
		this.singleCouponConsumeData = singleCouponConsumeData;
	}

	public String getBzAmount() {
		return bzAmount;
	}

	public void setBzAmount(String bzAmount) {
		this.bzAmount = bzAmount;
	}
	
}
