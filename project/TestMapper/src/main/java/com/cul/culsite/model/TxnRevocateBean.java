package com.cul.culsite.model;

import com.cul.culsite.model.request.pursevoucher.TxnRevocateRequest;

public class TxnRevocateBean {
	private String channel;
	private String merchantNo;
	private String termNo;
	private String stan;
	private String rrn;
	private String field33;
	private String field32;
	private TxnRevocateRequest[] revocateArray;
	
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
	
	public String getStan() {
		return stan;
	}
	public void setStan(String stan) {
		this.stan = stan;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public String getField33() {
		return field33;
	}
	public void setField33(String field33) {
		this.field33 = field33;
	}
	public String getField32() {
		return field32;
	}
	public void setField32(String field32) {
		this.field32 = field32;
	}
	public TxnRevocateRequest[] getRevocateArray() {
		return revocateArray;
	}
	public void setRevocateArray(TxnRevocateRequest[] revocateArray) {
		this.revocateArray = revocateArray;
	}
	
	
}
