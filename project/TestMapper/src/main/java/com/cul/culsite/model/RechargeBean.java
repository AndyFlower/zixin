package com.cul.culsite.model;

import com.cul.culsite.dto.MOrderTxnDTO;

public class RechargeBean {
	private String WIDout_trade_no;
	private String subject;
	private String openId;
	private String company;
	private String issuerId;
	private String cardNo;
	private String rechargeAccount;
	private String productType;
	private String payType;
	private String payBillNo;// 外部订单号，如：支付宝的扣款订单号
	private String mobilePhone;// 增加手机号
	private String merchantNo ;//门店号
	private CodeMsg codeMsg; //充值结果
	private MOrderTxnDTO mOrderTxnDTO; //充值流水记录
	private String productId;
    private String custSeq;
	private String payAmount;//充值实付金额

    public String getCustSeq() {
        return custSeq;
    }

    public void setCustSeq(String custSeq) {
        this.custSeq = custSeq;
    }

    public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}


	public CodeMsg getCodeMsg() {
		return codeMsg;
	}

	public void setCodeMsg(CodeMsg codeMsg) {
		this.codeMsg = codeMsg;
	}

	public MOrderTxnDTO getmOrderTxnDTO() {
		return mOrderTxnDTO;
	}

	public void setmOrderTxnDTO(MOrderTxnDTO mOrderTxnDTO) {
		this.mOrderTxnDTO = mOrderTxnDTO;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPayBillNo() {
		return payBillNo;
	}

	public void setPayBillNo(String payBillNo) {
		this.payBillNo = payBillNo;
	}

	public String getWIDout_trade_no() {
		return WIDout_trade_no;
	}

	public void setWIDout_trade_no(String wIDoutTradeNo) {
		WIDout_trade_no = wIDoutTradeNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getRechargeAccount() {
		return rechargeAccount;
	}

	public void setRechargeAccount(String rechargeAccount) {
		this.rechargeAccount = rechargeAccount;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}


}
