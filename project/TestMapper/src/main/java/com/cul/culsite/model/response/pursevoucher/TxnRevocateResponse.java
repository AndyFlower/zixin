package com.cul.culsite.model.response.pursevoucher;

public class TxnRevocateResponse {
	private String origiTxnNo;
	private String cardNo;
	private String revocateTxnNo;
	private String couponNo;

	public String getOrigiTxnNo() {
		return origiTxnNo;
	}
	public void setOrigiTxnNo(String origiTxnNo) {
		this.origiTxnNo = origiTxnNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getRevocateTxnNo() {
		return revocateTxnNo;
	}
	public void setRevocateTxnNo(String revocateTxnNo) {
		this.revocateTxnNo = revocateTxnNo;
	}
	public String getCouponNo() {
		return couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

}
