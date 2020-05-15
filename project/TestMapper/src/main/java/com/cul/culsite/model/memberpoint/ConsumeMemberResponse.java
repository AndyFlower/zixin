package com.cul.culsite.model.memberpoint;

public class ConsumeMemberResponse {

	private String code;
	
	private String msg;

	private String billTxnId;
	
	private String billNo;
	
	private String billAmount;
	
	private String billRedeemedAmount;
	
	private String txndate;
	
	private String txntime;
	
	private CardsConsumeData cardsConsumeData;
	
	private VoucherConsumeData voucherConsumeData;
	
	private PointsConsumeData pointsConsumeData;
	
	private String buzAmount;
	
	private String txnType;
	
	public String getBuzAmount() {
		return buzAmount;
	}

	public void setBuzAmount(String buzAmount) {
		this.buzAmount = buzAmount;
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

	public String getBillTxnId() {
		return billTxnId;
	}

	public void setBillTxnId(String billTxnId) {
		this.billTxnId = billTxnId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillRedeemedAmount() {
		return billRedeemedAmount;
	}

	public void setBillRedeemedAmount(String billRedeemedAmount) {
		this.billRedeemedAmount = billRedeemedAmount;
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

	public CardsConsumeData getCardsConsumeData() {
		return cardsConsumeData;
	}

	public void setCardsConsumeData(CardsConsumeData cardsConsumeData) {
		this.cardsConsumeData = cardsConsumeData;
	}

	public VoucherConsumeData getVoucherConsumeData() {
		return voucherConsumeData;
	}

	public void setVoucherConsumeData(VoucherConsumeData voucherConsumeData) {
		this.voucherConsumeData = voucherConsumeData;
	}

	public PointsConsumeData getPointsConsumeData() {
		return pointsConsumeData;
	}

	public void setPointsConsumeData(PointsConsumeData pointsConsumeData) {
		this.pointsConsumeData = pointsConsumeData;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	
	
	
}
