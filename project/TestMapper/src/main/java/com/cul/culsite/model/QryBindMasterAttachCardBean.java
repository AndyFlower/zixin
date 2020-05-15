package com.cul.culsite.model;
import javax.xml.bind.annotation.XmlRootElement;
public class QryBindMasterAttachCardBean {

	private String issuerId;

	private String masterCardNo;

	private String masterCardPwd;

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getMasterCardNo() {
		return masterCardNo;
	}

	public void setMasterCardNo(String masterCardNo) {
		this.masterCardNo = masterCardNo;
	}

	public String getMasterCardPwd() {
		return masterCardPwd;
	}

	public void setMasterCardPwd(String masterCardPwd) {
		this.masterCardPwd = masterCardPwd;
	}

}
