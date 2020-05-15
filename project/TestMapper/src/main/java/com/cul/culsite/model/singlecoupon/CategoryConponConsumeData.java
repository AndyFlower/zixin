package com.cul.culsite.model.singlecoupon;

public class CategoryConponConsumeData {
	private  String couponNo;
    private  String productId;
    private  String goodsCatCode;
    private  String amount;
    private  String count;
    private  String couponName;
    private  String couponCategoryClz;
    private  String couponFaceValue;
    private String couponFaceTime;
    
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
	public String getCouponCategoryClz() {
		return couponCategoryClz;
	}
	public void setCouponCategoryClz(String couponCategoryClz) {
		this.couponCategoryClz = couponCategoryClz;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getCouponNo() {
		return couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getGoodsCatCode() {
		return goodsCatCode;
	}
	public void setGoodsCatCode(String goodsCatCode) {
		this.goodsCatCode = goodsCatCode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}

}
