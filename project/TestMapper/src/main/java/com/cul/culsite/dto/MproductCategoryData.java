package com.cul.culsite.dto;



public class MproductCategoryData {

	private String[] nos;
	
	private String[] amount;
	//实际优惠总金额
	private String sjYhTotalAmount;
	//理论优惠最大总金额
	private String llYhTotalAmount;
	//订单总金额
	private String OrderAmount;
	
	private String[] clazzType;
	
	private String[] productNos;
	
	private String[] categoryNo;
	
	private String[] times;
	
	private MproductCategory[] mprocateGory;
	
	private long smTotalAmount;
	
	public String[] getProductNos() {
		return productNos;
	}
	public void setProductNos(String[] productNos) {
		this.productNos = productNos;
	}
	public String[] getNos() {
		return nos;
	}
	public void setNos(String[] nos) {
		this.nos = nos;
	}
	public String[] getAmount() {
		return amount;
	}
	public void setAmount(String[] amount) {
		this.amount = amount;
	}
	public String[] getClazzType() {
		return clazzType;
	}
	public void setClazzType(String[] clazzType) {
		this.clazzType = clazzType;
	}
	public String[] getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String[] categoryNo) {
		this.categoryNo = categoryNo;
	}
	public MproductCategory[] getMprocateGory() {
		return mprocateGory;
	}
	public void setMprocateGory(MproductCategory[] mprocateGory) {
		this.mprocateGory = mprocateGory;
	}
	public String getOrderAmount() {
		return OrderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		OrderAmount = orderAmount;
	}
	public String getSjYhTotalAmount() {
		return sjYhTotalAmount;
	}
	public void setSjYhTotalAmount(String sjYhTotalAmount) {
		this.sjYhTotalAmount = sjYhTotalAmount;
	}
	public String getLlYhTotalAmount() {
		return llYhTotalAmount;
	}
	public void setLlYhTotalAmount(String llYhTotalAmount) {
		this.llYhTotalAmount = llYhTotalAmount;
	}
	public long getSmTotalAmount() {
		return smTotalAmount;
	}
	public void setSmTotalAmount(long smTotalAmount) {
		this.smTotalAmount = smTotalAmount;
	}
	public String[] getTimes() {
		return times;
	}
	public void setTimes(String[] times) {
		this.times = times;
	}
	
	
}
