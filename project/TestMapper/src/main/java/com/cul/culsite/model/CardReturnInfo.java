package com.cul.culsite.model;

public class CardReturnInfo {

	String cardNo;
	String balance;
	String balancePoints;
	String activedDate;
	String status;
	String statusName;
	String hotReason;
	String hotReasonName;
	String expiredDate;
	String merchantNo;
	String merchantName;
	String issuerCreateUser;
	String loyaltyClub;
	String txnId;
	
	@Override
	public String toString(){
		return "CardReturnInfo{" +
        "cardNo=" + cardNo +
        "balance=" + balance +
        "balancePoints=" + balancePoints +
        "activedDate=" + activedDate +
        "status=" + status +
        "statusName=" + statusName +
        "hotReason=" + hotReason +
        "hotReasonName=" + hotReasonName +
        "expiredDate=" + expiredDate +
        "merchantNo=" + merchantNo +
        "merchantName=" + merchantName +
        "issuerCreateUser=" + issuerCreateUser +
        "loyaltyClub=" + loyaltyClub +
        "txnId=" + txnId +
        '}';
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalancePoints() {
		return balancePoints;
	}
	public void setBalancePoints(String balancePoints) {
		this.balancePoints = balancePoints;
	}
	public String getActivedDate() {
		return activedDate;
	}
	public void setActivedDate(String activedDate) {
		this.activedDate = activedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getHotReason() {
		return hotReason;
	}
	public void setHotReason(String hotReason) {
		this.hotReason = hotReason;
	}
	public String getHotReasonName() {
		return hotReasonName;
	}
	public void setHotReasonName(String hotReasonName) {
		this.hotReasonName = hotReasonName;
	}
	public String getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
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
	public String getIssuerCreateUser() {
		return issuerCreateUser;
	}
	public void setIssuerCreateUser(String issuerCreateUser) {
		this.issuerCreateUser = issuerCreateUser;
	}
	public String getLoyaltyClub() {
		return loyaltyClub;
	}
	public void setLoyaltyClub(String loyaltyClub) {
		this.loyaltyClub = loyaltyClub;
	}
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
}
