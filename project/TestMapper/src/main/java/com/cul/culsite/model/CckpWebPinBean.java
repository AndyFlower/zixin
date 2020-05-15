package com.cul.culsite.model;

public class CckpWebPinBean {
	private String merchantNo;

	private String userId;

	private String cardNo;

	private String password;

	//是否校验线上密码；（Y-校验线上密码，N-校验线下密码）
	private String checkWebPin;

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

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheckWebPin() {
		return checkWebPin;
	}

	public void setCheckWebPin(String checkWebPin) {
		this.checkWebPin = checkWebPin;
	}
	
	
}
