package com.cul.culsite.model.memberpoint;

import com.cul.culsite.model.CardInfomation;

public class QryBindCardData {
	private String code;

	private String msg;

	private CardInfomation[] cardInfomation;

	private String totalAmount = null;

	private String availableAmount = null;

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

	public CardInfomation[] getCardInfomation() {
		return cardInfomation;
	}

	public void setCardInfomation(CardInfomation[] cardInfomation) {
		this.cardInfomation = cardInfomation;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

}
