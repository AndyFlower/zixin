package com.cul.culsite.model;

import java.util.List;


public class UserBenefitsBean {

	private String code;
	
	private String msg;
	
	private String mbpId; //权益包id
	
	private String mbrId; //权益规则id
	
	private String type; //权益规则类型
	
	private String description; //规则描述
	
	private String issuerId;

	private String promotionType; //优惠类型
	
	private String status;
	
	private String ruleCode; //规则码
	
	private String isFixed; //是否固定金额
	
	private String rate; //订单比例
	
	private String cofficient; //特殊日（月）系数
	
	private String amount; //加值金额
	
	private String minAmount; //订单最小金额
	
	private String maxAmount; //订单最大金额
	
	private String menchantNo; //适用门店号
	
	private String productId; //赠送商品号
	
	private String discountProductId; //打折商品号
	
	private String startDate; //规则生效日期
	
	private String endDate; //规则失效日期
	
	private String level; //会员等级
	
	private String levelDescription; //会员等级描述
	
	private String direction; //积分增值方向
	
	private String points; //加值积分值
	
	private String areaId; //适用区域
	
	private String productCategory; //适用商品类别
	
	private String pointsStartDate; //积分生效日期
	
	private String pointsEndDate; //积分生效日期
	
	private String mlId; //会员等级id
	
	private String limitPointMax; //等级最大值
	
	private String limitPointMin; //等级最小值

	private List<UserBenefitsBean> userBenefitsList;
	
	public String getMbpId() {
		return mbpId;
	}

	public void setMbpId(String mbpId) {
		this.mbpId = mbpId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRuleCode() {
		return ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getIsFixed() {
		return isFixed;
	}

	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getCofficient() {
		return cofficient;
	}

	public void setCofficient(String cofficient) {
		this.cofficient = cofficient;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}

	public String getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getMenchantNo() {
		return menchantNo;
	}

	public void setMenchantNo(String menchantNo) {
		this.menchantNo = menchantNo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDiscountProductId() {
		return discountProductId;
	}

	public void setDiscountProductId(String discountProductId) {
		this.discountProductId = discountProductId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevelDescription() {
		return levelDescription;
	}

	public void setLevelDescription(String levelDescription) {
		this.levelDescription = levelDescription;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getPointsStartDate() {
		return pointsStartDate;
	}

	public void setPointsStartDate(String pointsStartDate) {
		this.pointsStartDate = pointsStartDate;
	}

	public String getPointsEndDate() {
		return pointsEndDate;
	}

	public void setPointsEndDate(String pointsEndDate) {
		this.pointsEndDate = pointsEndDate;
	}

	public String getMlId() {
		return mlId;
	}

	public void setMlId(String mlId) {
		this.mlId = mlId;
	}

	public String getLimitPointMax() {
		return limitPointMax;
	}

	public void setLimitPointMax(String limitPointMax) {
		this.limitPointMax = limitPointMax;
	}

	public String getLimitPointMin() {
		return limitPointMin;
	}

	public void setLimitPointMin(String limitPointMin) {
		this.limitPointMin = limitPointMin;
	}

	public String getMbrId() {
		return mbrId;
	}

	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<UserBenefitsBean> getUserBenefitsList() {
		return userBenefitsList;
	}

	public void setUserBenefitsList(List<UserBenefitsBean> userBenefitsList) {
		this.userBenefitsList = userBenefitsList;
	}
	
}
