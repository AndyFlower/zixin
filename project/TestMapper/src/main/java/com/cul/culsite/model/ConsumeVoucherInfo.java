package com.cul.culsite.model;

public class ConsumeVoucherInfo {
	private String issuerId;//发卡机构
	private String merchant;//消费门店
	private String cardCategoryNo;//二级商品门店
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getCardCategoryNo() {
		return cardCategoryNo;
	}
	public void setCardCategoryNo(String cardCategoryNo) {
		this.cardCategoryNo = cardCategoryNo;
	}
	public String getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}
	
	

}
