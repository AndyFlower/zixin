package com.cul.culsite.model;

public class CouponResponse {
	private String code;
	private String msg;
	private String authCode;
	private CouponOrderTxnInfo couponIDADOrderTxn;
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
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public CouponOrderTxnInfo getCouponIDADOrderTxn() {
		return couponIDADOrderTxn;
	}
	public void setCouponIDADOrderTxn(CouponOrderTxnInfo couponIDADOrderTxn) {
		this.couponIDADOrderTxn = couponIDADOrderTxn;
	}
}
