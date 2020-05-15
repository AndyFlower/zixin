package com.cul.culsite.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class EGiftCard implements Serializable{

	private static final long serialVersionUID = 1L;
	private String productId;//前端商品号
	private Integer cardNum;
	private BigDecimal totalDenomination;//总面额
	private BigDecimal totalSalePrice;//打折后，总售价
	private String cardNo;//卡号
	private BigDecimal denomination;//面额
	private BigDecimal price;//售价
	private String activateCode;//激活码
	private String productName;//商品名称
	private String payStatus;//付款状态
	private String motOrderId;//订单编号
	//订单交易时间
	private String txndate;
	private String txntime;
	//交易门店号
	private String merchantId;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getCardNum() {
		return cardNum;
	}
	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}
	public BigDecimal getTotalDenomination() {
		return totalDenomination;
	}
	public void setTotalDenomination(BigDecimal totalDenomination) {
		this.totalDenomination = totalDenomination;
	}
	public BigDecimal getTotalSalePrice() {
		return totalSalePrice;
	}
	public void setTotalSalePrice(BigDecimal totalSalePrice) {
		this.totalSalePrice = totalSalePrice;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public BigDecimal getDenomination() {
		return denomination;
	}
	public void setDenomination(BigDecimal denomination) {
		this.denomination = denomination;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getActivateCode() {
		return activateCode;
	}
	public void setActivateCode(String activateCode) {
		this.activateCode = activateCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getMotOrderId() {
		return motOrderId;
	}
	public void setMotOrderId(String motOrderId) {
		this.motOrderId = motOrderId;
	}
	public String getTxndate() {
		return txndate;
	}
	public void setTxndate(String txndate) {
		this.txndate = txndate;
	}
	public String getTxntime() {
		return txntime;
	}
	public void setTxntime(String txntime) {
		this.txntime = txntime;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	
	
	
}
