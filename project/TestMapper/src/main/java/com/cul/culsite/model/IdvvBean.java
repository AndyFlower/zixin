package com.cul.culsite.model;

public class IdvvBean {
	
	String merchantNo;
	String userId;
	String cardNoFrom;
	String cardNoTo;
	String amount;
	String totalAmount;
	String dMerchantNo;
	
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getCardNoFrom() {
		return cardNoFrom;
	}
	public void setCardNoFrom(String cardNoFrom) {
		this.cardNoFrom = cardNoFrom;
	}
	public String getCardNoTo() {
		return cardNoTo;
	}
	public void setCardNoTo(String cardNoTo) {
		this.cardNoTo = cardNoTo;
	}
	public String getDMerchantNo() {
		return dMerchantNo;
	}
	public void setDMerchantNo(String merchantNo) {
		dMerchantNo = merchantNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdvvBean{");
        sb.append("merchantNo='").append(merchantNo).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", cardNoFrom='").append(cardNoFrom).append('\'');
        sb.append(", cardNoTo='").append(cardNoTo).append('\'');
        sb.append(", amount='").append(amount).append('\'');
        sb.append(", totalAmount='").append(totalAmount).append('\'');
        sb.append(", dMerchantNo='").append(dMerchantNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
