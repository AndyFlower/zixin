package com.cul.culsite.model;

public class ReduceSubInfoBean {

	private String prizeIndex; // 索引
	private String prizeAmount; // 立减固定金额
	private double prizeWeight; // 立减金额的权重
	private String prizeStore; // 立减金额的可享受次数

	
	public String getPrizeIndex() {
		return prizeIndex;
	}

	public void setPrizeIndex(String prizeIndex) {
		this.prizeIndex = prizeIndex;
	}

	public String getPrizeAmount() {
		return prizeAmount;
	}

	public void setPrizeAmount(String prizeAmount) {
		this.prizeAmount = prizeAmount;
	}

	public double getPrizeWeight() {
		return prizeWeight;
	}

	public void setPrizeWeight(double prizeWeight) {
		this.prizeWeight = prizeWeight;
	}

	public String getPrizeStore() {
		return prizeStore;
	}

	public void setPrizeStore(String prizeStore) {
		this.prizeStore = prizeStore;
	}

}
