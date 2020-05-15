package com.cul.culsite.model;

public class MutiPartReturnGoodsData {
	private String code;

	private String msg;

	private String resId;
	
	private String cardNo;

	private String txnAmount;
	
	// 卡有效期
	private String expirydate;
	
	// 卡交易后余额
	private String afterBalance;

	@Override
	public String toString(){
		return "MutiPartReturnGoodsData{" +
        "code=" + code +
        "msg=" + msg +
        "resId=" + resId +
        "cardNo=" + cardNo +
        "txnAmount=" + txnAmount +
        "expirydate=" + expirydate +
        "afterBalance=" + afterBalance +
        '}';
	}
	
	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getAfterBalance() {
		return afterBalance;
	}

	public void setAfterBalance(String afterBalance) {
		this.afterBalance = afterBalance;
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

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(String txnAmount) {
		this.txnAmount = txnAmount;
	}
   
	
}
