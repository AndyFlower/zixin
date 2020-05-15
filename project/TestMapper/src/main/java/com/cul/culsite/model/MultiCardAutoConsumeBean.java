package com.cul.culsite.model;

public class MultiCardAutoConsumeBean {

	private String[] cardNos = new String[] {};

	// ֧���ܽ��
	private String totalAmount;

	private String autoPayRule;

	private String club;

	private String txndate;

	private String txntime;

	private String terminal;

	private String billNo;

	private String isPartConsume;

	private String isCardCommonUse;

	private String barcodeId;

	private String issuerId;

	private String mobliePhone;

	private String channel;

	private String merId;

	private String txnId;
	
	// pos参考号
	private String rrn;
	
	// switch流水号(系统跟踪号）
	private String stan;
	
	// 请求日切时间
	private String requestPostingDate;
	//发送方标识码
	private String senderCode;
	//接受方标识码
	private String receiverCode;
	//交易日期和时间
	private String txnDateTime;
	// 折扣金额
	private String discountAmount;
	//线上积分或储值标记位
	private String onlineTransType;
	
	/**南京中商4位门店代码**/
	private String brandNo;
	/**中商支付商品信息 **/
	private String commodityInfo;
	/**中商款台号**/
	private String cashDeskNo;
	/**中商交易小票号**/
	private String orderRecordNo;
	/**中商收银员号**/
	private String cashierNo;
	
	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	private String custSeq;
	
	public String getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public String getRequestPostingDate() {
		return requestPostingDate;
	}

	public void setRequestPostingDate(String requestPostingDate) {
		this.requestPostingDate = requestPostingDate;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getMobliePhone() {
		return mobliePhone;
	}

	public void setMobliePhone(String mobliePhone) {
		this.mobliePhone = mobliePhone;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getBarcodeId() {
		return barcodeId;
	}

	public void setBarcodeId(String barcodeId) {
		this.barcodeId = barcodeId;
	}

	public String getIsPartConsume() {
		return isPartConsume;
	}

	public void setIsPartConsume(String isPartConsume) {
		this.isPartConsume = isPartConsume;
	}

	public String getIsCardCommonUse() {
		return isCardCommonUse;
	}

	public void setIsCardCommonUse(String isCardCommonUse) {
		this.isCardCommonUse = isCardCommonUse;
	}

	public String getAutoPayRule() {
		return autoPayRule;
	}

	public void setAutoPayRule(String autoPayRule) {
		this.autoPayRule = autoPayRule;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getTxndate() {
		return txndate;
	}

	public void setTxndate(String txndate) {
		this.txndate = txndate;
	}

	public String getTxntime() {
		return txntime;
	}

	public void setTxntime(String txntime) {
		this.txntime = txntime;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String[] getCardNos() {
		return cardNos;
	}

	public void setCardNos(String[] cardNos) {
		this.cardNos = cardNos;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSenderCode() {
		return senderCode;
	}

	public void setSenderCode(String senderCode) {
		this.senderCode = senderCode;
	}

	public String getReceiverCode() {
		return receiverCode;
	}

	public void setReceiverCode(String receiverCode) {
		this.receiverCode = receiverCode;
	}

	public String getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(String txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public String getOnlineTransType() {
		return onlineTransType;
	}

	public void setOnlineTransType(String onlineTransType) {
		this.onlineTransType = onlineTransType;
	}

	public String getBrandNo() {
		return brandNo;
	}

	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public String getCommodityInfo() {
		return commodityInfo;
	}

	public void setCommodityInfo(String commodityInfo) {
		this.commodityInfo = commodityInfo;
	}

	public String getCashDeskNo() {
		return cashDeskNo;
	}

	public void setCashDeskNo(String cashDeskNo) {
		this.cashDeskNo = cashDeskNo;
	}

	public String getOrderRecordNo() {
		return orderRecordNo;
	}

	public void setOrderRecordNo(String orderRecordNo) {
		this.orderRecordNo = orderRecordNo;
	}

	public String getCashierNo() {
		return cashierNo;
	}

	public void setCashierNo(String cashierNo) {
		this.cashierNo = cashierNo;
	}
	
	
}
