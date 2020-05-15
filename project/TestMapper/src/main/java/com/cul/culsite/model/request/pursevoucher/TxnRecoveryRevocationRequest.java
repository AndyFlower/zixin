package com.cul.culsite.model.request.pursevoucher;

public class TxnRecoveryRevocationRequest {
	
	private String channel;
	private String merchantNo;
	private String termNo;
	private TxnRecoveryRevocationBean[] requestBean;
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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
	public TxnRecoveryRevocationBean[] getRequestBean() {
		return requestBean;
	}
	public void setRequestBean(TxnRecoveryRevocationBean[] requestBean) {
		this.requestBean = requestBean;
	}
	
	
}
