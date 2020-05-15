package com.cul.culsite.model.redis;

import java.io.Serializable;

public class PickVoucher implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String consumeMerIdType;//Y-配置提货劵部分门店消费，N-提货券所有门店消费
	private String categoryNo;
	private String categoryClz;//FLY:飞券，PICk 提货券
	private String barCode;//条码
	public String getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
	public String getCategoryClz() {
		return categoryClz;
	}
	public void setCategoryClz(String categoryClz) {
		this.categoryClz = categoryClz;
	}
	public String getConsumeMerIdType() {
		return consumeMerIdType;
	}
	public void setConsumeMerIdType(String consumeMerIdType) {
		this.consumeMerIdType = consumeMerIdType;
	}
	

}
