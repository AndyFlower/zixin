package com.cul.culsite.model;


public class CardTransInfo {

	private String cardNo;
	/** 单位元   100.0, 100.00, 0, 0.0, 0.00, **/
	private String amount;
	private String cardHolderMobile;
	private String expiryDate;
	
	private String password;
	private String productId;
	
	private String payAmount;
	/** 单位元**/
	private String promotionAmount;// 优惠金额
	
	private String promotionDirect;// 优惠方向
	
	private String promotionRuleId;// 优惠id
	
	private String useableStatus;// 可领用状态
	
	private String productName;//商品名称
	
	private String cardSeq;
	
	private long productNum;
	
	private String areaCode;
	
	private String cardPrice;//面额
	
	private String salePrice;//售价
	
	private String jv;// 四位代码
	
	private String cityId;// 城市Id
	
	private String cityName;// 城市名
	
	private String provinceId;// 省Id
	
	private String provinceName;// 省名
	
	
	private String thirdSysTxnId;//帐务系统流水号 ex: 预付卡平台IM_TXN_HEADER ID
	
	private String cardFlag;//卡属性标志 卡属性标志为空时默人P正常卡 P：正常卡 D：折扣卡
	
	private String txnType;//售卖充值标志ISLV：售卖	IDPV：充值
	
	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getCardFlag() {
		return cardFlag;
	}

	public void setCardFlag(String cardFlag) {
		this.cardFlag = cardFlag;
	}

	public String getThirdSysTxnId() {
		return thirdSysTxnId;
	}

	public void setThirdSysTxnId(String thirdSysTxnId) {
		this.thirdSysTxnId = thirdSysTxnId;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCardPrice() {
		return cardPrice;
	}
	public void setCardPrice(String cardPrice) {
		this.cardPrice = cardPrice;
	}
	public String getJv() {
		return jv;
	}
	public void setJv(String jv) {
		this.jv = jv;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public long getProductNum() {
		return productNum;
	}
	public void setProductNum(long productNum) {
		this.productNum = productNum;
	}
	public String getCardSeq() {
		return cardSeq;
	}
	public void setCardSeq(String cardSeq) {
		this.cardSeq = cardSeq;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUseableStatus() {
		return useableStatus;
	}
	public void setUseableStatus(String useableStatus) {
		this.useableStatus = useableStatus;
	}
	public String getPromotionRuleId() {
		return promotionRuleId;
	}
	public void setPromotionRuleId(String promotionRuleId) {
		this.promotionRuleId = promotionRuleId;
	}
	public String getPromotionAmount() {
		return promotionAmount;
	}
	public void setPromotionAmount(String promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	public String getPromotionDirect() {
		return promotionDirect;
	}
	public void setPromotionDirect(String promotionDirect) {
		this.promotionDirect = promotionDirect;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCardHolderMobile() {
		return cardHolderMobile;
	}
	public void setCardHolderMobile(String cardHolderMobile) {
		this.cardHolderMobile = cardHolderMobile;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

    public static CardTransInfo newInstance(String cardNo, String amount, String mobile) {
        CardTransInfo bean = new CardTransInfo();
        bean.setCardNo(cardNo);
        bean.setAmount(amount);
        bean.setPayAmount(amount);
        bean.setCardHolderMobile(mobile);
        return bean;
    }
    
    public static CardTransInfo newInstanceSp(String cardNo, String amount) {
        CardTransInfo bean = new CardTransInfo();
        bean.setCardNo(cardNo);
        bean.setAmount(amount);
        bean.setPayAmount(amount);
        return bean;
    }

    @Override
    public String toString() {
        return "CardTransInfo{" +
                "cardNo='" + cardNo + '\'' +
                ", amount='" + amount + '\'' +
                ", cardHolderMobile='" + cardHolderMobile + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", password='" + password + '\'' +
                ", productId='" + productId + '\'' +
                ", payAmount='" + payAmount + '\'' +
                ", promotionAmount='" + promotionAmount + '\'' +
                ", promotionDirect='" + promotionDirect + '\'' +
                ", promotionRuleId='" + promotionRuleId + '\'' +
                ", useableStatus='" + useableStatus + '\'' +
                ", productName='" + productName + '\'' +
                ", cardSeq='" + cardSeq + '\'' +
                ", productNum=" + productNum +
                '}';
    }
}
