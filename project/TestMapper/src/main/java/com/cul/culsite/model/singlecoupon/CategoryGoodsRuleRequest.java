package com.cul.culsite.model.singlecoupon;

import java.util.List;

public class CategoryGoodsRuleRequest {
	
	private String issuerId;
	private List<String> categoryNos;
	private List<String> cateTypeIds;
	private List<String> productIds;
	private String today;
	public String getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}
	public List<String> getCategoryNos() {
		return categoryNos;
	}
	public void setCategoryNos(List<String> categoryNos) {
		this.categoryNos = categoryNos;
	}
	public List<String> getCateTypeIds() {
		return cateTypeIds;
	}
	public void setCateTypeIds(List<String> cateTypeIds) {
		this.cateTypeIds = cateTypeIds;
	}
	public List<String> getProductIds() {
		return productIds;
	}
	public void setProductIds(List<String> productIds) {
		this.productIds = productIds;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
}
