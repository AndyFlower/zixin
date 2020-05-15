package com.cul.culsite.model;

public class CatCoolBean {
	/**事物ID（当前应用下不得重复，保证提交的唯一性）**/
	private String transID;
	/**手机号**/
	private String mobile;
	/**消费金额**/
	private String amount;
	/**交易时间**/
	private String tradeTime;
	/**该商户在猫酷系统中的唯一编号（与CrmShopID、DevShopID任其选一必填）**/
	private String mcShopID;
	/**该商户在商场CRM系统中的唯一编号（与McShopID、DevShopID任其选一必填）**/
	private String crmShopID;
	/**该商户在本开发者中的唯一编号，若使用此编号，则需提前将商户对应编号导入猫酷系统（与McShopID、CrmShopID任其选一必填）**/
	private String devShopID;
	/**交易流水号（同一posid下，交易流水号必须不同）**/
	private String tradeSerialNo;
	/**posID**/
	private String posID;
	/**公密**/
	private String publicKey;
	/**私密**/
	private String privateKey;
	/**微信公众号appId**/
	private String AppId;
	
	public String getTransID() {
		return transID;
	}
	public void setTransID(String transID) {
		this.transID = transID;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
	public String getMcShopID() {
		return mcShopID;
	}
	public void setMcShopID(String mcShopID) {
		this.mcShopID = mcShopID;
	}
	public String getCrmShopID() {
		return crmShopID;
	}
	public void setCrmShopID(String crmShopID) {
		this.crmShopID = crmShopID;
	}
	public String getDevShopID() {
		return devShopID;
	}
	public void setDevShopID(String devShopID) {
		this.devShopID = devShopID;
	}
	public String getTradeSerialNo() {
		return tradeSerialNo;
	}
	public void setTradeSerialNo(String tradeSerialNo) {
		this.tradeSerialNo = tradeSerialNo;
	}
	public String getPosID() {
		return posID;
	}
	public void setPosID(String posID) {
		this.posID = posID;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getAppId() {
		return AppId;
	}
	public void setAppId(String appId) {
		AppId = appId;
	}
	
}
