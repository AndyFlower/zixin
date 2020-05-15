package com.cul.culsite.model.singlecoupon;

import java.util.List;

public class SingleCouponConsumeInfo {
	private String couponNo;// 券号
	private String couponType;// 券类型 提货券 or 代金券
	private String couponDistributeType;// 发行方式 实体券 or 电子券
	private List<ConsumeProductInfo> consumeProductInfoList;
	private String couponAmount;// 金额
	private String couponCount;//  提货次数
	private String mulitUse;// 使用次数 S-单次 M-多次
	private String couponName;// 券名称
	private String couponFaceValue;// 面额
	private String couponFaceTime;// 初始提货件数

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponFaceValue() {
		return couponFaceValue;
	}

	public void setCouponFaceValue(String couponFaceValue) {
		this.couponFaceValue = couponFaceValue;
	}

	public String getCouponFaceTime() {
		return couponFaceTime;
	}

	public void setCouponFaceTime(String couponFaceTime) {
		this.couponFaceTime = couponFaceTime;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getCouponDistributeType() {
		return couponDistributeType;
	}

	public void setCouponDistributeType(String couponDistributeType) {
		this.couponDistributeType = couponDistributeType;
	}

	public List<ConsumeProductInfo> getConsumeProductInfoList() {
		return consumeProductInfoList;
	}

	public void setConsumeProductInfoList(
			List<ConsumeProductInfo> consumeProductInfoList) {
		this.consumeProductInfoList = consumeProductInfoList;
	}

	public String getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(String couponAmount) {
		this.couponAmount = couponAmount;
	}

	public String getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(String couponCount) {
		this.couponCount = couponCount;
	}

	public String getMulitUse() {
		return mulitUse;
	}

	public void setMulitUse(String mulitUse) {
		this.mulitUse = mulitUse;
	}
}
