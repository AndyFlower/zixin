package com.cul.culsite.model.memberpoint;

public class BenefitsPkgInfo {
	/*发卡机构号*/
	private String issuerId;
	/*会员等级*/
	private String memberLevel;
	/*会员等级描述*/
	private String memberLevelDes;
	/*会员等级权益包id*/
	private String benefitsPkgId;
	/*会员等级规则id*/
	private String benefitsRuleId;
	/*会员等级规则类型*/
	private String benefitsRuleType;
	public String getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public String getMemberLevelDes() {
		return memberLevelDes;
	}
	public void setMemberLevelDes(String memberLevelDes) {
		this.memberLevelDes = memberLevelDes;
	}
	public String getBenefitsPkgId() {
		return benefitsPkgId;
	}
	public void setBenefitsPkgId(String benefitsPkgId) {
		this.benefitsPkgId = benefitsPkgId;
	}
	public String getBenefitsRuleId() {
		return benefitsRuleId;
	}
	public void setBenefitsRuleId(String benefitsRuleId) {
		this.benefitsRuleId = benefitsRuleId;
	}
	public String getBenefitsRuleType() {
		return benefitsRuleType;
	}
	public void setBenefitsRuleType(String benefitsRuleType) {
		this.benefitsRuleType = benefitsRuleType;
	}
}
