package com.cul.culsite.model.singlecoupon;

import java.math.BigDecimal;
import java.util.List;

public class CategoryCouponRequest {
	private String issuerId;
	private String status;
	private String useChannel;
	private String today;
	private BigDecimal orderAmount;
	private List<String> categoryClz;
	private List<String> couponNoList;
	private List<String> categoryNoList;
	public List<String> getCategoryNoList() {
		return categoryNoList;
	}

	public void setCategoryNoList(List<String> categoryNoList) {
		this.categoryNoList = categoryNoList;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUseChannel() {
		return useChannel;
	}

	public void setUseChannel(String useChannel) {
		this.useChannel = useChannel;
	}

	public List<String> getCategoryClz() {
		return categoryClz;
	}

	public void setCategoryClz(List<String> categoryClz) {
		this.categoryClz = categoryClz;
	}

	public List<String> getCouponNoList() {
		return couponNoList;
	}

	public void setCouponNoList(List<String> couponNoList) {
		this.couponNoList = couponNoList;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

}
