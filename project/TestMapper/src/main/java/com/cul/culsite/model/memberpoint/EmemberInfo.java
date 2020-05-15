package com.cul.culsite.model.memberpoint;

public class EmemberInfo {
    private String uid;
	private String mobliePhone;
	//密保问题
	private String pwQuestion;
	private String pwAnswer;
	private String uName;
	private String email;
	//openId
	private String openId;
	//支付密码
	private String paypassword;
	private String merchantId;
	//是否设置免密支付
	private String usePassword;
	//证件类型 01 身份证
	private String certType;
	//身份证号
	private String certNo;
	// 电子会员卡
	private String eMemberCardNo;
	// 实体会员卡
	private String eMemberEntityCardNo;
	// 会员卡级别
	private String cardLever;
	// 会员等级
	private String midentity;
	// 发卡机构号
	private String issuerId;
	// 微信unionid
	private String unionId;
	// 永久积分
	private String permanentPoints;
	// 临时积分
	private String validPoints;
	
	public String getPermanentPoints() {
		return permanentPoints;
	}
	public void setPermanentPoints(String permanentPoints) {
		this.permanentPoints = permanentPoints;
	}
	public String getValidPoints() {
		return validPoints;
	}
	public void setValidPoints(String validPoints) {
		this.validPoints = validPoints;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getMobliePhone() {
		return mobliePhone;
	}
	public void setMobliePhone(String mobliePhone) {
		this.mobliePhone = mobliePhone;
	}
	public String getPwQuestion() {
		return pwQuestion;
	}
	public void setPwQuestion(String pwQuestion) {
		this.pwQuestion = pwQuestion;
	}
	public String getPwAnswer() {
		return pwAnswer;
	}
	public void setPwAnswer(String pwAnswer) {
		this.pwAnswer = pwAnswer;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getPaypassword() {
		return paypassword;
	}
	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getUsePassword() {
		return usePassword;
	}
	public void setUsePassword(String usePassword) {
		this.usePassword = usePassword;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String geteMemberCardNo() {
		return eMemberCardNo;
	}
	public void seteMemberCardNo(String eMemberCardNo) {
		this.eMemberCardNo = eMemberCardNo;
	}
	public String geteMemberEntityCardNo() {
		return eMemberEntityCardNo;
	}
	public void seteMemberEntityCardNo(String eMemberEntityCardNo) {
		this.eMemberEntityCardNo = eMemberEntityCardNo;
	}
	public String getCardLever() {
		return cardLever;
	}
	public void setCardLever(String cardLever) {
		this.cardLever = cardLever;
	}
	public String getMidentity() {
		return midentity;
	}
	public void setMidentity(String midentity) {
		this.midentity = midentity;
	}
	public String getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}
	public String getUnionId() {
		return unionId;
	}
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	
}
