package com.cul.culsite.model;

import com.cul.culsite.dto.MMemberDTO;

public class WeChatBean {
	private String userName;
	private String productIds; // for query products in issuerId. split by _
	private String templateId; // 赠送模板id

	private String mobliePhone;

	private String openId;

	private String verifyCode;

	private String password;
	
	private String questionId; //密保问题id
	
	private String questionAnswer; //密保问题答案

	private String expiredIntervalTime;

	private String cardNo;

	private String issuerId;

	private String corId;

	private String RegisterChannel;

	private String custSeq;

	private String recCustSeq;

	private String payPassword;

	private String email;

	private String recMobile;

	private MMemberDTO mMemberDTO;

	private String words;

	private String[] cardNoArray;

	private String presMobile;

	private String billNo;

	private String pname;

	private String rname;

	private String message;

	private String defaultCardType;

	private String amount;

	private CardIdpvBean cardIdpvBean;

	private String notifyUrl;

	private PrepayCardTransBean prepayCardTransBean;

	private String smsContent;

	private String productType;

	private String dateFrom;

	private String dateTo;

	/** 接口语言 **/
	private String language;

	private String tranId;
	// 美心项目增加性别字段
	private String gender;

	private String isPager;

	private String pageNo;

	private String pageSize;

	private String cardLevel;

	private String type;

	/**
	 * 短信的类型
	 */
	private String smType;

	private String loginIdType;

	private MMemberDTO recMember;

	private String jv;

	private String userChannel;

	/**
	 * 消息推送
	 */
	private String mac;
	private String company;
	private String purseType;// L C
	private String transType;
	private String transName;
	private String transDate;
	private String transTime;
	private String transAmount;
	private String merId;
	private String merName;
	private String accountNo;
	private String accountName;
	private String expireDate;

	/** ************** */
	//注册时候的生日
	private String birthday;//生日，格式YYYYMMDD
	
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getUserChannel() {
		return userChannel;
	}

	public MMemberDTO getmMemberDTO() {
		return mMemberDTO;
	}

	public void setmMemberDTO(MMemberDTO mMemberDTO) {
		this.mMemberDTO = mMemberDTO;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPurseType() {
		return purseType;
	}

	public void setPurseType(String purseType) {
		this.purseType = purseType;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransName() {
		return transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public void setUserChannel(String userChannel) {
		this.userChannel = userChannel;
	}

	public String getJv() {
		return jv;
	}

	public void setJv(String jv) {
		this.jv = jv;
	}

	public MMemberDTO getRecMember() {
		return recMember;
	}

	public void setRecMember(MMemberDTO recMember) {
		this.recMember = recMember;
	}

	public String getLoginIdType() {
		return loginIdType;
	}

	public void setLoginIdType(String loginIdType) {
		this.loginIdType = loginIdType;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getProductIds() {
		return productIds;
	}

	public void setProductIds(String productIds) {
		this.productIds = productIds;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardLevel() {
		return cardLevel;
	}

	public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}

	public String getIsPager() {
		return isPager;
	}

	public void setIsPager(String isPager) {
		this.isPager = isPager;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSmsContent() {
		return smsContent;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

	public PrepayCardTransBean getPrepayCardTransBean() {
		return prepayCardTransBean;
	}

	public void setPrepayCardTransBean(PrepayCardTransBean prepayCardTransBean) {
		this.prepayCardTransBean = prepayCardTransBean;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public CardIdpvBean getCardIdpvBean() {
		return cardIdpvBean;
	}

	public void setCardIdpvBean(CardIdpvBean cardIdpvBean) {
		this.cardIdpvBean = cardIdpvBean;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDefaultCardType() {
		return defaultCardType;
	}

	public void setDefaultCardType(String defaultCardType) {
		this.defaultCardType = defaultCardType;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getPresMobile() {
		return presMobile;
	}

	public void setPresMobile(String presMobile) {
		this.presMobile = presMobile;
	}

	public String[] getCardNoArray() {
		return cardNoArray;
	}

	public void setCardNoArray(String[] cardNoArray) {
		this.cardNoArray = cardNoArray;
	}

	public String getRecMobile() {
		return recMobile;
	}

	public void setRecMobile(String recMobile) {
		this.recMobile = recMobile;
	}

	public MMemberDTO getMMemberDTO() {
		return mMemberDTO;
	}

	public void setMMemberDTO(MMemberDTO memberDTO) {
		mMemberDTO = memberDTO;
	}

	public String getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getExpiredIntervalTime() {
		return expiredIntervalTime;
	}

	public void setExpiredIntervalTime(String expiredIntervalTime) {
		this.expiredIntervalTime = expiredIntervalTime;
	}

	public String getMobliePhone() {
		return mobliePhone;
	}

	public void setMobliePhone(String mobliePhone) {
		this.mobliePhone = mobliePhone;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getCorId() {
		return corId;
	}

	public void setCorId(String corId) {
		this.corId = corId;
	}

	public String getRegisterChannel() {
		return RegisterChannel;
	}

	public void setRegisterChannel(String registerChannel) {
		RegisterChannel = registerChannel;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getSmType() {
		return smType;
	}

	public void setSmType(String smType) {
		this.smType = smType;
	}

	public String getRecCustSeq() {
		return recCustSeq;
	}

	public void setRecCustSeq(String recCustSeq) {
		this.recCustSeq = recCustSeq;
	}
	
	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
}
