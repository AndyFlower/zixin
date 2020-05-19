package com.cul.culsite.model.memberpoint;

import java.math.BigDecimal;
import java.util.List;

import com.cul.culsite.dto.MOrderTxnDTO;

public class ConsumeMemberBean {
	/** 发卡机构号 */
	private String issuerId;
	/** 是否开通电子会员卡业务 */
	private String memberFlg;
	/** 会员卡卡号 **/
	private String memberCardNo;
	/** 会员手机号 */
	private String memberPhone;
	/** 持卡人登录id */
	private String loginId;
	/** 登录id类型 */
	private String loginIdType;
	/** 支付密码 */
	private String payPassword;
	/** 是否验证支付密码 */
	private String verifyPayPassword;
	/** 订单号 */
	private String billNo;
	/** 是否支持部分消费 */
	private String isPartConsume;
	/** 支付总金额 */
	private String totalAmount;
	/** 积分参与联付 */
	private String isPointsConsume;
	/** 优惠券参与联付 */
	private String isVoucherConsume;
	/** 是否关联商品优惠 */
	private String isRelGoodsBenefit;
	/** 优惠商品信息 */
	private String goodsInfo;
	/** 交易日期 */
	private String txndate;
	/** 交易时间 */
	private String txntime;
	/** 终端号 */
	private String terminal;
	/** 门店号 */
	private String merId;
	/** 来源 */
	private String source;
	/** 消费渠道 */
	private String payChannel; // 消费渠道

	/** 实付总金额 */
	private String totalPayAmount;

	/** 规则类型 **/
	private String ruleType;

	/**** 线下参数 ***/
	private String[] cardNos;
	private String ememberEntityCardNo;
	private String txnId;
	private String sourceId;
	private String sysTraNo;
	private String transmsnDtTm;
	private String transmsnTm;// hhmmss
	private String transmsnDt;// yyymmdd

	// 原交易积分调整类型
	private String orgAdjustDirection;

	// 积分调整方向
	private String adjustDirection;
	
	private String[] voucherNos;
	
	// 交易类型标签
	private String at;
	
	
	

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public String getOrgAdjustDirection() {
		return orgAdjustDirection;
	}

	public void setOrgAdjustDirection(String orgAdjustDirection) {
		this.orgAdjustDirection = orgAdjustDirection;
	}

	public String getAdjustDirection() {
		return adjustDirection;
	}

	public void setAdjustDirection(String adjustDirection) {
		this.adjustDirection = adjustDirection;
	}

	public String getTransmsnDt() {
		return transmsnDt;
	}

	public void setTransmsnDt(String transmsnDt) {
		this.transmsnDt = transmsnDt;
	}

	// 收银信息
	private String cashierInformation;

	// pos参考号
	private String rrn;

	// switch流水号
	private String stan;

	// 请求日切时间
	private String requestPostingDate;

	private String channel;

	// 权益规则
	private List<BenefitsPkgInfo> benefitsPkgInfoList;

	// cust_seq
	private String custSeq;
	// 条码号
	private String barcodeId;
	// 会员权益抵扣数组
	private List<PromotionInfoBean> promotionInfoList;
	// 会员权益抵扣总金额
	private BigDecimal totalPromotionAmount;
	// 手机号
	private String mobliePhone;
	// 机构号
	private String receiverCode;
	// senderCode
	private String senderCode;
	// txnDateTime
	private String txnDateTime;
	// setOnlineTransType
	private String onlineTransType;
	// 条码类型
	private String accountType;
	// 消费流水
	private MOrderTxnDTO orderTxn;
	
	// 积分联付时积分抵扣值
	private BigDecimal pointsDiscount; // 积分值
	
	private BigDecimal pointsDiscountAmount; // 积分对应的金额
	
	// 券信息
	private List<VoucherDiscountInfo>voucherDiscountInfoList;
	private BigDecimal voucherDiscountAmount;
	
	private BigDecimal voucherSaleAmount;//
	
	public BigDecimal getVoucherSaleAmount() {
		return voucherSaleAmount;
	}

	public void setVoucherSaleAmount(BigDecimal voucherSaleAmount) {
		this.voucherSaleAmount = voucherSaleAmount;
	}

	public List<VoucherDiscountInfo> getVoucherDiscountInfoList() {
		return voucherDiscountInfoList;
	}

	public void setVoucherDiscountInfoList(
			List<VoucherDiscountInfo> voucherDiscountInfoList) {
		this.voucherDiscountInfoList = voucherDiscountInfoList;
	}

	public BigDecimal getVoucherDiscountAmount() {
		return voucherDiscountAmount;
	}

	public void setVoucherDiscountAmount(BigDecimal voucherDiscountAmount) {
		this.voucherDiscountAmount = voucherDiscountAmount;
	}

	public BigDecimal getPointsDiscount() {
		return pointsDiscount;
	}

	public void setPointsDiscount(BigDecimal pointsDiscount) {
		this.pointsDiscount = pointsDiscount;
	}

	public BigDecimal getPointsDiscountAmount() {
		return pointsDiscountAmount;
	}

	public void setPointsDiscountAmount(BigDecimal pointsDiscountAmount) {
		this.pointsDiscountAmount = pointsDiscountAmount;
	}

	public String getTransmsnTm() {
		return transmsnTm;
	}

	public void setTransmsnTm(String transmsnTm) {
		this.transmsnTm = transmsnTm;
	}

	public String getCashierInformation() {
		return cashierInformation;
	}

	public void setCashierInformation(String cashierInformation) {
		this.cashierInformation = cashierInformation;
	}

	public MOrderTxnDTO getOrderTxn() {
		return orderTxn;
	}

	public void setOrderTxn(MOrderTxnDTO orderTxn) {
		this.orderTxn = orderTxn;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getOnlineTransType() {
		return onlineTransType;
	}

	public void setOnlineTransType(String onlineTransType) {
		this.onlineTransType = onlineTransType;
	}

	public String getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(String txnDateTime) {
		this.txnDateTime = txnDateTime;
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

	public String getMobliePhone() {
		return mobliePhone;
	}

	public void setMobliePhone(String mobliePhone) {
		this.mobliePhone = mobliePhone;
	}

	public String getBarcodeId() {
		return barcodeId;
	}

	public void setBarcodeId(String barcodeId) {
		this.barcodeId = barcodeId;
	}

	public BigDecimal getTotalPromotionAmount() {
		return totalPromotionAmount;
	}

	public void setTotalPromotionAmount(BigDecimal totalPromotionAmount) {
		this.totalPromotionAmount = totalPromotionAmount;
	}

	public List<PromotionInfoBean> getPromotionInfoList() {
		return promotionInfoList;
	}

	public void setPromotionInfoList(List<PromotionInfoBean> promotionInfoList) {
		this.promotionInfoList = promotionInfoList;
	}

	public String getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	public List<BenefitsPkgInfo> getBenefitsPkgInfoList() {
		return benefitsPkgInfoList;
	}

	public void setBenefitsPkgInfoList(List<BenefitsPkgInfo> benefitsPkgInfoList) {
		this.benefitsPkgInfoList = benefitsPkgInfoList;
	}

	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String[] getCardNos() {
		return cardNos;
	}

	public void setCardNos(String[] cardNos) {
		this.cardNos = cardNos;
	}

	public String getEmemberEntityCardNo() {
		return ememberEntityCardNo;
	}

	public void setEmemberEntityCardNo(String ememberEntityCardNo) {
		this.ememberEntityCardNo = ememberEntityCardNo;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
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

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getTotalPayAmount() {
		return totalPayAmount;
	}

	public void setTotalPayAmount(String totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getMemberFlg() {
		return memberFlg;
	}

	public void setMemberFlg(String memberFlg) {
		this.memberFlg = memberFlg;
	}

	public String getMemberCardNo() {
		return memberCardNo;
	}

	public void setMemberCardNo(String memberCardNo) {
		this.memberCardNo = memberCardNo;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginIdType() {
		return loginIdType;
	}

	public void setLoginIdType(String loginIdType) {
		this.loginIdType = loginIdType;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public String getVerifyPayPassword() {
		return verifyPayPassword;
	}

	public void setVerifyPayPassword(String verifyPayPassword) {
		this.verifyPayPassword = verifyPayPassword;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getIsPartConsume() {
		return isPartConsume;
	}

	public void setIsPartConsume(String isPartConsume) {
		this.isPartConsume = isPartConsume;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getIsPointsConsume() {
		return isPointsConsume;
	}

	public void setIsPointsConsume(String isPointsConsume) {
		this.isPointsConsume = isPointsConsume;
	}

	public String getIsVoucherConsume() {
		return isVoucherConsume;
	}

	public void setIsVoucherConsume(String isVoucherConsume) {
		this.isVoucherConsume = isVoucherConsume;
	}

	public String getIsRelGoodsBenefit() {
		return isRelGoodsBenefit;
	}

	public void setIsRelGoodsBenefit(String isRelGoodsBenefit) {
		this.isRelGoodsBenefit = isRelGoodsBenefit;
	}

	public String getGoodsInfo() {
		return goodsInfo;
	}

	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
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

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String[] getVoucherNos() {
		return voucherNos;
	}

	public void setVoucherNos(String[] voucherNos) {
		this.voucherNos = voucherNos;
	}

	
	

}
