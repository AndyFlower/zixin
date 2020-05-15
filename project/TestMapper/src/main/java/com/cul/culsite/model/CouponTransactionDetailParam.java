package com.cul.culsite.model;

public class CouponTransactionDetailParam {
	private String couponTypeId = null;//售卖，券种类
	private int couponNum = 0;//券数量
	private String couponNo = null;//券号
	private Integer amount = 0;//券消费金额或者售卖时券面额
	public String getCouponTypeId() {
		return couponTypeId;
	}
	public void setCouponTypeId(String couponTypeId) {
		this.couponTypeId = couponTypeId;
	}
	public int getCouponNum() {
		return couponNum;
	}
	public void setCouponNum(int couponNum) {
		this.couponNum = couponNum;
	}
	public String getCouponNo() {
		return couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
