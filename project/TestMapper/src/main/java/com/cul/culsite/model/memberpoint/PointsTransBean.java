package com.cul.culsite.model.memberpoint;

import com.cul.culsite.dto.MMemberDTO;
import com.cul.culsite.model.uid.UserData;

public class PointsTransBean {

	private String issuerId;
	
	private String merchantNo;

	private String merchantName;

	private String billNo;
	
	private String userPhone; // 会员手机号

	private String totalPoints;

	private String memberCardNo;// 会员卡号

	private String transType; // 交易类型
	
	private String transTypeName;//交易类型名称

	private String userId; // 操作人

	private String channel;// 渠道

	private String orderPayPoints; // 实付积分

	private String promotionType;// 优惠类型

	private String tranDate;// 交易日期

	private String tranTime;// 交易时间

	/** 条码 */
	private String tranid; // 线下条码

	/** C-卡，R-红包，V-券 ,P-积分 */
	private String accountType;

	private String txnId;// m_order_txn表中主键

	private String termNo;

	private String useChannel;// 使用渠道

	private UserData userDate;

	private String status;

	private String source;
	
	// 积分有效期
	private String startDate;
	
	private String endDate;
	
	// 积分类型 
	private String pointsType;
	// 钱包id
	private String purseId;
	
	// 积分调整方向 up-上调 down-下调
	private String pointsAdjustDirection;
	
	// 扣減的是哪些加值积分流水中的
	private PointsTransInfo[] pointsTransInfoArray;
	
	// 会员信息
	private MMemberDTO member;
	
	// 退货订单号
	private String refundId;
	
	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getPurseId() {
		return purseId;
	}

	public void setPurseId(String purseId) {
		this.purseId = purseId;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getMemberCardNo() {
		return memberCardNo;
	}

	public void setMemberCardNo(String memberCardNo) {
		this.memberCardNo = memberCardNo;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
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

	public String getOrderPayPoints() {
		return orderPayPoints;
	}

	public void setOrderPayPoints(String orderPayPoints) {
		this.orderPayPoints = orderPayPoints;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public String getTranid() {
		return tranid;
	}

	public void setTranid(String tranid) {
		this.tranid = tranid;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}



	public String getUseChannel() {
		return useChannel;
	}

	public void setUseChannel(String useChannel) {
		this.useChannel = useChannel;
	}

	public UserData getUserDate() {
		return userDate;
	}

	public void setUserDate(UserData userDate) {
		this.userDate = userDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPointsType() {
		return pointsType;
	}

	public void setPointsType(String pointsType) {
		this.pointsType = pointsType;
	}

	public String getPointsAdjustDirection() {
		return pointsAdjustDirection;
	}

	public void setPointsAdjustDirection(String pointsAdjustDirection) {
		this.pointsAdjustDirection = pointsAdjustDirection;
	}

	public String getTransTypeName() {
		return transTypeName;
	}

	public void setTransTypeName(String transTypeName) {
		this.transTypeName = transTypeName;
	}

	public PointsTransInfo[] getPointsTransInfoArray() {
		return pointsTransInfoArray;
	}

	public void setPointsTransInfoArray(PointsTransInfo[] pointsTransInfoArray) {
		this.pointsTransInfoArray = pointsTransInfoArray;
	}

	public MMemberDTO getMember() {
		return member;
	}

	public void setMember(MMemberDTO member) {
		this.member = member;
	}
	
}
