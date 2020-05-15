package com.cul.culsite.model;

public class CckpByAllBean {

	private String cardNo;
	private String webPin;
	/** 密文 **/
	private String posPin;
	/** 工作密码密文**/
	private String pik;
	/** 区域主密码索引 **/
	private String zmkIndex;
	
	private String checkPosPin;
	private String posPinPlainTextFlag;//Y:posPin为明文密码 N或空：密文密码
	private String checkWebPin;
	
	private String checkCvv2;
	private String cvv2;
	
	private String checkTrack2;
	private String track2Data;
	
	private String userId;
	
	public String getPik() {
		return pik;
	}
	public void setPik(String pik) {
		this.pik = pik;
	}
	public String getZmkIndex() {
		return zmkIndex;
	}
	public void setZmkIndex(String zmkIndex) {
		this.zmkIndex = zmkIndex;
	}
	public String getCheckTrack2() {
		return checkTrack2;
	}
	public void setCheckTrack2(String checkTrack2) {
		this.checkTrack2 = checkTrack2;
	}
	public String getTrack2Data() {
		return track2Data;
	}
	public void setTrack2Data(String track2Data) {
		this.track2Data = track2Data;
	}
	public String getCheckCvv2() {
		return checkCvv2;
	}
	public void setCheckCvv2(String checkCvv2) {
		this.checkCvv2 = checkCvv2;
	}
	public String getCvv2() {
		return cvv2;
	}
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getWebPin() {
		return webPin;
	}
	public void setWebPin(String webPin) {
		this.webPin = webPin;
	}
	public String getPosPin() {
		return posPin;
	}
	public void setPosPin(String posPin) {
		this.posPin = posPin;
	}
	public String getCheckPosPin() {
		return checkPosPin;
	}
	public void setCheckPosPin(String checkPosPin) {
		this.checkPosPin = checkPosPin;
	}
	public String getCheckWebPin() {
		return checkWebPin;
	}
	public void setCheckWebPin(String checkWebPin) {
		this.checkWebPin = checkWebPin;
	}
	public String getPosPinPlainTextFlag() {
		return posPinPlainTextFlag;
	}
	public void setPosPinPlainTextFlag(String posPinPlainTextFlag) {
		this.posPinPlainTextFlag = posPinPlainTextFlag;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
