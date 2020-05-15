package com.cul.culsite.model.unifiedPayment;

import com.cul.culsite.dto.MCouponRefundTxnDTO;
import com.cul.culsite.model.CodeMsg;
import com.cul.culsite.model.CouponTransactionParam;
import com.cul.culsite.model.GrdTransData;
import com.cul.culsite.model.MutiPartIprfReturnData;

public class OfflineConsumeResult extends CodeMsg {
	private String billNo;//订单号
	private String authCode;//条码
	private String tradeDate;//交易完成日期YYYYMMDD
	private String tradeTime;//交易完成时间hhmmss
	private Integer totalAmount;//订单总金额，单位：分;
	private Integer totalPayAmount;//总支付金额，单位:分
	private String merchantNo;//门店号
	private String termNo;//终端
	private String sourceId;//机构来源
	private String sysTraNo;//系统跟踪号
	private String rrn = null;//线下交易交易参考号
	private String issuerId;
	private CouponTransactionParam couponTransactionParam;
	private MCouponRefundTxnDTO couponRefundTxn;
	private MutiPartIprfReturnData mutiPartIprfReturnData;
	private GrdTransData grdTransData;
	
	public OfflineConsumeResult() {
	}
	
	public OfflineConsumeResult(String code, String msg) {
		super(code, msg);
	}
	
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getTotalPayAmount() {
		return totalPayAmount;
	}
	public void setTotalPayAmount(Integer totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
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

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	

	public CouponTransactionParam getCouponTransactionParam() {
		return couponTransactionParam;
	}

	public void setCouponTransactionParam(CouponTransactionParam couponTransactionParam) {
		this.couponTransactionParam = couponTransactionParam;
	}

	public MCouponRefundTxnDTO getCouponRefundTxn() {
		return couponRefundTxn;
	}

	public void setCouponRefundTxn(MCouponRefundTxnDTO couponRefundTxn) {
		this.couponRefundTxn = couponRefundTxn;
	}

	public MutiPartIprfReturnData getMutiPartIprfReturnData() {
		return mutiPartIprfReturnData;
	}

	public void setMutiPartIprfReturnData(MutiPartIprfReturnData mutiPartIprfReturnData) {
		this.mutiPartIprfReturnData = mutiPartIprfReturnData;
	}

	public GrdTransData getGrdTransData() {
		return grdTransData;
	}

	public void setGrdTransData(GrdTransData grdTransData) {
		this.grdTransData = grdTransData;
	}

	@Override
	public String toString() {
		return "OfflineConsumeResult [billNo=" + billNo + ", authCode=" + authCode + ", tradeDate=" + tradeDate
				+ ", tradeTime=" + tradeTime + ", totalAmount=" + totalAmount + ", totalPayAmount=" + totalPayAmount
				+ ", merchantNo=" + merchantNo + ", termNo=" + termNo + ", sourceId=" + sourceId + ", sysTraNo="
				+ sysTraNo + ", rrn=" + rrn + "]";
	}
}
