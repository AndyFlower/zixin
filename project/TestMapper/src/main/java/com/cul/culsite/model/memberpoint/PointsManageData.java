package com.cul.culsite.model.memberpoint;

import com.cul.culsite.dto.MMemberDTO;
import com.cul.culsite.dto.MPointsRecordDTO;

public class PointsManageData {
	private String code;

	private String msg;

	private String loginId;

	private String loginIdType;

	private String issuerId;

	private String merchantNo;

	private String merchantName;

	private String billNo;

	private String transType; // 交易类型

	private String transTypeName;// 交易类型名称

	private String userId; // 操作人

	private String channel;// 渠道

	private String totalPoints; // 订单积分

	private String orderPayPoints; // 实付积分

	// 不足积分值
	private String bzPoints;

	// 是否不足扣减
	private String isPartAdjust;

	// 不足积分的等值金额
	private String bzEquivalentAmount;

	// 支付积分的等值金额
	private String orderPayAmount;

	private String promotionType;// 优惠类型

	private String tranDate;// 交易日期

	private String tranTime;// 交易时间

	private String txnId;// m_order_txn表中主键

	private String useChannel;// 使用渠道

	// 积分有效期
	private String startDate;

	private String endDate;

	// 积分类型
	private String pointsType;
	// 钱包id
	private String purseId;

	// 积分调整方向 up-上调 down-下调
	private String pointsAdjustDirection;

	// 会员信息
	private MMemberDTO member;

	// 积分调整参数
	private PointsTransBean pointsTransBean;

	// 会员积分钱包信息
	private PointsMember pointsMember;

	// 积分流水
	private MPointsRecordDTO pointsRecord;

	// 原积分交易流水id
	private String orignPointsTxnId;

	// 原积分交易交易类型
	private String orignTransType;

	// 退货订单号
	private String refundId;

	public String getBzEquivalentAmount() {
		return bzEquivalentAmount;
	}

	public void setBzEquivalentAmount(String bzEquivalentAmount) {
		this.bzEquivalentAmount = bzEquivalentAmount;
	}

	public String getOrderPayAmount() {
		return orderPayAmount;
	}

	public void setOrderPayAmount(String orderPayAmount) {
		this.orderPayAmount = orderPayAmount;
	}

	public String getIsPartAdjust() {
		return isPartAdjust;
	}

	public void setIsPartAdjust(String isPartAdjust) {
		this.isPartAdjust = isPartAdjust;
	}

	public String getBzPoints() {
		return bzPoints;
	}

	public void setBzPoints(String bzPoints) {
		this.bzPoints = bzPoints;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getOrignTransType() {
		return orignTransType;
	}

	public void setOrignTransType(String orignTransType) {
		this.orignTransType = orignTransType;
	}

	public String getOrignPointsTxnId() {
		return orignPointsTxnId;
	}

	public void setOrignPointsTxnId(String orignPointsTxnId) {
		this.orignPointsTxnId = orignPointsTxnId;
	}

	public MPointsRecordDTO getPointsRecord() {
		return pointsRecord;
	}

	public void setPointsRecord(MPointsRecordDTO pointsRecord) {
		this.pointsRecord = pointsRecord;
	}

	public PointsMember getPointsMember() {
		return pointsMember;
	}

	public void setPointsMember(PointsMember pointsMember) {
		this.pointsMember = pointsMember;
	}

	public PointsTransBean getPointsTransBean() {
		return pointsTransBean;
	}

	public void setPointsTransBean(PointsTransBean pointsTransBean) {
		this.pointsTransBean = pointsTransBean;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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

	public String getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransTypeName() {
		return transTypeName;
	}

	public void setTransTypeName(String transTypeName) {
		this.transTypeName = transTypeName;
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

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getUseChannel() {
		return useChannel;
	}

	public void setUseChannel(String useChannel) {
		this.useChannel = useChannel;
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

	public String getPurseId() {
		return purseId;
	}

	public void setPurseId(String purseId) {
		this.purseId = purseId;
	}

	public String getPointsAdjustDirection() {
		return pointsAdjustDirection;
	}

	public void setPointsAdjustDirection(String pointsAdjustDirection) {
		this.pointsAdjustDirection = pointsAdjustDirection;
	}

	public MMemberDTO getMember() {
		return member;
	}

	public void setMember(MMemberDTO member) {
		this.member = member;
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

}
