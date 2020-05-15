package com.cul.culsite.model.redis;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用于保存条码生成时，和条码关联的额外数据，和m_bar_code表数据合并就可以完整的表示申请条码的现场信息
 * <p>
 * 在redis里面的key是条码号，内容是
 * 
 * @author zhengyb
 *
 */
public class BarCodeRelatedData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4822182427479156488L;

	/**
	 * 条码号
	 */
	private String barCode;

	/**
	 * 条码创建时间
	 */
	private Date createTime;

	/**
	 * 交易通知回调url，可以为空，为空的话，就是不需要进行通知
	 */
	private String notifyUrl;

	/**
	 * 钱包序列号
	 */
	private String custSeq;

	/**
	 * 使用语言
	 */
	private String language;

	/**
	 * 发卡机构号
	 */
	private String issuerId;

	/**
	 * 本次扫码请求的支付卡列表，如果是卡包消费，那么为空
	 */
	private List<String> cards;
	/**
	 * 本次申请的手机号
	 */
	private String mobileNo;
	/**
	 * 本次申请的条码使用场景类型 IDAD-消费
	 */
	private String orderType;
	/**
	 * 本次申请的条码类型 M-多卡，V-虚拟优惠券等等
	 */
	private String barCodeType;
	/**
	 * 是否支持部分消费
	 */
	private String isPartComsume;
	/**
	 * 本次申请条码的支付渠道
	 */
	private String payChannel;

	/**
	 * 会员卡条码申请积分兑换俱乐部
	 */
	private String loyaltyClub;
	/**
	 * 会员卡记次服务id
	 */
	private String serviceId;
	/**
	 * 申请源信息
	 */
	private String source;

	public String getLoyaltyClub() {
		return loyaltyClub;
	}

	public void setLoyaltyClub(String loyaltyClub) {
		this.loyaltyClub = loyaltyClub;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getBarCodeType() {
		return barCodeType;
	}

	public void setBarCodeType(String barCodeType) {
		this.barCodeType = barCodeType;
	}

	public String getIsPartComsume() {
		return isPartComsume;
	}

	public void setIsPartComsume(String isPartComsume) {
		this.isPartComsume = isPartComsume;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<String> getCards() {
		return cards;
	}

	public void setCards(List<String> cards) {
		this.cards = cards;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}
}
