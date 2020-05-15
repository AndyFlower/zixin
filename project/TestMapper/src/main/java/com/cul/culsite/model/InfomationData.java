package com.cul.culsite.model;

public class InfomationData {

	String totalBalance;
	CodeMsg codeMsg;
	CardInfomation[] cardInfomation;
	public String getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(String totalBalance) {
		this.totalBalance = totalBalance;
	}
	public CodeMsg getCodeMsg() {
		return codeMsg;
	}
	public void setCodeMsg(CodeMsg codeMsg) {
		this.codeMsg = codeMsg;
	}
	public CardInfomation[] getCardInfomation() {
		return cardInfomation;
	}
	public void setCardInfomation(CardInfomation[] cardInfomation) {
		this.cardInfomation = cardInfomation;
	}
}
