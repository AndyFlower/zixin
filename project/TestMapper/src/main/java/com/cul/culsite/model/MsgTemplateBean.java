package com.cul.culsite.model;

public class MsgTemplateBean {

	private String issuerId;
	private String transType;
	private String sendChannel;
	private String productId;
	private String language;
	private String getChannel;
	public String getGetChannel() {
		return getChannel;
	}
	public void setGetChannel(String getChannel) {
		this.getChannel = getChannel;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getSendChannel() {
		return sendChannel;
	}
	public void setSendChannel(String sendChannel) {
		this.sendChannel = sendChannel;
	}
}
