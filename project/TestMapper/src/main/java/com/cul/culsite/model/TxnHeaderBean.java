package com.cul.culsite.model;

public class TxnHeaderBean {

	private String cardNo;
	private String lmsTxnId;
	private String orgLmsTxnId;
	private String transHeaderId;
	private String txnCode;
	private String status;
	private String arInd;
	// 交易后余额
	private String balancePoint;
	private String expirydate;
	public String getBalancePoint() {
		return balancePoint;
	}
	public void setBalancePoint(String balancePoint) {
		this.balancePoint = balancePoint;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getTxnCode() {
		return txnCode;
	}
	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getArInd() {
		return arInd;
	}
	public void setArInd(String arInd) {
		this.arInd = arInd;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getLmsTxnId() {
		return lmsTxnId;
	}
	public void setLmsTxnId(String lmsTxnId) {
		this.lmsTxnId = lmsTxnId;
	}
	public String getOrgLmsTxnId() {
		return orgLmsTxnId;
	}
	public void setOrgLmsTxnId(String orgLmsTxnId) {
		this.orgLmsTxnId = orgLmsTxnId;
	}
	public String getTransHeaderId() {
		return transHeaderId;
	}
	public void setTransHeaderId(String transHeaderId) {
		this.transHeaderId = transHeaderId;
	}
}
