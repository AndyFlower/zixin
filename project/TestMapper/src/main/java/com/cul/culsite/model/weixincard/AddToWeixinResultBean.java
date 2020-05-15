package com.cul.culsite.model.weixincard;

public class AddToWeixinResultBean {
	private String appId;
	private String nonceStr;
	private String configSignature;
	private String cardSignature;
	private String cardNo;
	private String cardId;
	private long timestamp;
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getNonceStr() {
		return nonceStr;
	}
	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
	public String getConfigSignature() {
		return configSignature;
	}
	public void setConfigSignature(String configSignature) {
		this.configSignature = configSignature;
	}
	public String getCardSignature() {
		return cardSignature;
	}
	public void setCardSignature(String cardSignature) {
		this.cardSignature = cardSignature;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "AddToWeixinResultBean [appId=" + appId + ", nonceStr="
				+ nonceStr + ", configSignature=" + configSignature
				+ ", cardSignature=" + cardSignature + ", cardNo=" + cardNo
				+ ", cardId=" + cardId + ", timestamp=" + timestamp + ", url="
				+ url + "]";
	}
	
}
