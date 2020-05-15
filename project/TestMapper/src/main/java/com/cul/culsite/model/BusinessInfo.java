package com.cul.culsite.model;

/**
 *中商交易信息62域解析
 * 
 */
public class BusinessInfo {
	/**南京中商4位门店代码**/
	private String brandNo;
	/**中商支付商品信息 **/
	private String commodityInfo;
	/**中商款台号**/
	private String cashDeskNo;
	/**中商交易小票号**/
	private String orderRecordNo;
	/**中商收银员号**/
	private String cashierNo;
	
	
	public BusinessInfo() {}


	public BusinessInfo(String brandNo, String commodityInfo,
			String cashDeskNo, String orderRecordNo, String cashierNo) {
		this.brandNo = brandNo;
		this.commodityInfo = commodityInfo;
		this.cashDeskNo = cashDeskNo;
		this.orderRecordNo = orderRecordNo;
		this.cashierNo = cashierNo;
	}


	public String getBrandNo() {
		return brandNo;
	}


	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}


	public String getCommodityInfo() {
		return commodityInfo;
	}


	public void setCommodityInfo(String commodityInfo) {
		this.commodityInfo = commodityInfo;
	}


	public String getCashDeskNo() {
		return cashDeskNo;
	}


	public void setCashDeskNo(String cashDeskNo) {
		this.cashDeskNo = cashDeskNo;
	}


	public String getOrderRecordNo() {
		return orderRecordNo;
	}


	public void setOrderRecordNo(String orderRecordNo) {
		this.orderRecordNo = orderRecordNo;
	}


	public String getCashierNo() {
		return cashierNo;
	}


	public void setCashierNo(String cashierNo) {
		this.cashierNo = cashierNo;
	}
	
	
	
}
