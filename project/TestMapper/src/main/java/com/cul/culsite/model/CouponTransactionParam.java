package com.cul.culsite.model;

import java.util.List;

import com.cul.culsite.dto.MMemberDTO;

public class CouponTransactionParam {
	private String billNo = null; // 券交易订单号,系统生成规则 CULCC + 25位数字 Constants.COUPON_BILL_PREFIX + commons.lang RandomStringUtils.randomNumeric(25);
	private MMemberDTO operMember = null;
	private Integer orderTotalAmount = 0;//订单总金额 单位:分
	private Integer orderPayAmount = 0;//订单支付金额 单位:分
	private String merchantNo = null;//门店号
	private String sourceChannel = null;//交易来源渠道
	private String tranid = null;//核销时的条码号
	private Integer couponNum = 0;//售卖的券数量，核销每个订单只能使用1张券
	private String promotionType = null;//优惠类型（AA-主交易， AC-售卖，AD-注册时赠送券，AE-满额赠券,AF-员工返利）
	private String payChannel = null;//售卖单支付渠道
	private String payBillNo = null;//第三方支付流水号
	private String termno = null;//线下交易终端号
	private String sysTraNo = null;//线下交易系统跟踪号
	private String sourceId = null;//线下交易发送机构
	private String rrn = null;//线下交易交易参考号
	private String morderTxnId = null;//卡券联付、购卡赠券时 m_order_txn的主键
	private List<CouponTransactionDetailParam> detailList = null;
	
	public CouponTransactionParam() {
	
	}
	
	
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNO) {
		this.billNo = billNO;
	}
	public MMemberDTO getOperMember() {
		return operMember;
	}
	public void setOperMember(MMemberDTO operMember) {
		this.operMember = operMember;
	}
	public Integer getOrderTotalAmount() {
		return orderTotalAmount;
	}
	public void setOrderTotalAmount(Integer orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}
	public Integer getOrderPayAmount() {
		return orderPayAmount;
	}
	public void setOrderPayAmount(Integer orderPayAmount) {
		this.orderPayAmount = orderPayAmount;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	
	public String getSourceChannel() {
		return sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}
	public String getTranid() {
		return tranid;
	}

	public void setTranid(String tranid) {
		this.tranid = tranid;
	}

	public Integer getCouponNum() {
		return couponNum;
	}
	public void setCouponNum(Integer couponNum) {
		this.couponNum = couponNum;
	}
	public String getPromotionType() {
		return promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	public String getPayChannel() {
		return payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}
	public String getPayBillNo() {
		return payBillNo;
	}
	public void setPayBillNo(String payBillNo) {
		this.payBillNo = payBillNo;
	}
	public String getTermno() {
		return termno;
	}
	public void setTermno(String termno) {
		this.termno = termno;
	}
	public String getSysTraNo() {
		return sysTraNo;
	}
	public void setSysTraNo(String sysTraNo) {
		this.sysTraNo = sysTraNo;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public List<CouponTransactionDetailParam> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<CouponTransactionDetailParam> detailList) {
		this.detailList = detailList;
	}

	public String getMorderTxnId() {
		return morderTxnId;
	}

	public void setMorderTxnId(String morderTxnId) {
		this.morderTxnId = morderTxnId;
	}

}
