package com.cul.culsite.model.singlecoupon;

public class ConsumeProductInfo {
	private String productId;// 商品号
	private String goodsCatCode;// 品类id
	private String amount;// 总金额
	private String count;//  提货次数
	private String price;// 单价

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
