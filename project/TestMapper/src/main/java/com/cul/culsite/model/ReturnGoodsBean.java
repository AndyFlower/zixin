package com.cul.culsite.model;

public class ReturnGoodsBean {

	private String txnId;

	private String cardNo;

	private String amount;

	private String merchantNo;

	private String userId;

	private String channel;

	private String moblie;

	private String issuerId;

	private String tranId;

	private String orderTxnId;

	private String termNo;

	private String sourceId;
	private String sysTraNo;
	private String transmsnDtTm;
	private String receiverCode;
	// by zsm for iprfmuitlpart
	private String inputChannel;// 退货渠道

	private String lmstxnId;// 消费时LmsId

	private String reqId;

	// 系统参考号
	private String referenceNo;
	// 原交易信息域(90)
	private String orgData;

	private String totalRefundAmount;

	private String crossMerRefund;

	private String cardType;
	// add by zsm on 201703021422 增加订单号
	private String orderId;
	
	private String iprfRrn;
	
	/**中商标志位**/
	private String zsIssuerFlag;
	/**中商款台柜号**/
	private String zseCashDeskNo;
	/**中商收银员号**/
	private String zseCashier;
	/**中商支付商品信息**/
	private String zseCommodityInfo;
	/**中商交易记录编号，即收银单号;网上商城为支付订单号**/
	private String zseRecordNo;
	/**中商sap门店id**/
	private String zseSapMerId;
	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCrossMerRefund() {
		return crossMerRefund;
	}

	public void setCrossMerRefund(String crossMerRefund) {
		this.crossMerRefund = crossMerRefund;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getTotalRefundAmount() {
		return totalRefundAmount;
	}

	public void setTotalRefundAmount(String totalRefundAmount) {
		this.totalRefundAmount = totalRefundAmount;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getOrgData() {
		return orgData;
	}

	public void setOrgData(String orgData) {
		this.orgData = orgData;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSysTraNo() {
		return sysTraNo;
	}

	public void setSysTraNo(String sysTraNo) {
		this.sysTraNo = sysTraNo;
	}

	public String getTransmsnDtTm() {
		return transmsnDtTm;
	}

	public void setTransmsnDtTm(String transmsnDtTm) {
		this.transmsnDtTm = transmsnDtTm;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getOrderTxnId() {
		return orderTxnId;
	}

	public void setOrderTxnId(String orderTxnId) {
		this.orderTxnId = orderTxnId;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getMoblie() {
		return moblie;
	}

	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getInputChannel() {
		return inputChannel;
	}

	public void setInputChannel(String inputChannel) {
		this.inputChannel = inputChannel;
	}

	public String getLmstxnId() {
		return lmstxnId;
	}

	public void setLmstxnId(String lmstxnId) {
		this.lmstxnId = lmstxnId;
	}

	public String getReceiverCode() {
		return receiverCode;
	}

	public void setReceiverCode(String receiverCode) {
		this.receiverCode = receiverCode;
	}

	public String getIprfRrn() {
		return iprfRrn;
	}

	public void setIprfRrn(String iprfRrn) {
		this.iprfRrn = iprfRrn;
	}

	public String getZsIssuerFlag() {
		return zsIssuerFlag;
	}

	public void setZsIssuerFlag(String zsIssuerFlag) {
		this.zsIssuerFlag = zsIssuerFlag;
	}

	public String getZseCashDeskNo() {
		return zseCashDeskNo;
	}

	public void setZseCashDeskNo(String zseCashDeskNo) {
		this.zseCashDeskNo = zseCashDeskNo;
	}

	public String getZseCashier() {
		return zseCashier;
	}

	public void setZseCashier(String zseCashier) {
		this.zseCashier = zseCashier;
	}

	public String getZseCommodityInfo() {
		return zseCommodityInfo;
	}

	public void setZseCommodityInfo(String zseCommodityInfo) {
		this.zseCommodityInfo = zseCommodityInfo;
	}

	public String getZseRecordNo() {
		return zseRecordNo;
	}

	public void setZseRecordNo(String zseRecordNo) {
		this.zseRecordNo = zseRecordNo;
	}

	public String getZseSapMerId() {
		return zseSapMerId;
	}

	public void setZseSapMerId(String zseSapMerId) {
		this.zseSapMerId = zseSapMerId;
	}
	
	

}
