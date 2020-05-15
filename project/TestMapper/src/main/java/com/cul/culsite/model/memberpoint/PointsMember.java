package com.cul.culsite.model.memberpoint;

import java.math.BigDecimal;

import com.cul.culsite.dto.MMemberDTO;

public class PointsMember extends MMemberDTO {
	private static final long serialVersionUID = 1126894783356939319L;
	private String code;
	private String msg;
	private String level;
	private String levelDesc;
	private String memberCardNo;
	private String memberCardLevel;
	private String pointsPurseId;
	private BigDecimal validPoints;
	private BigDecimal usedPoints;
	private BigDecimal expiredPoints;
	private BigDecimal invalidPoints;
	private BigDecimal permanentPoints;
	private BigDecimal usedPermanentPoints;
	private BigDecimal expiredPermanentPoints;
	private BigDecimal invalidPermanentPoints;
	private BigDecimal totalPointsBalance;// 积分折成人民币
	private BigDecimal totalPoints;
	private BigDecimal totalCardBalance;

	public BigDecimal getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(BigDecimal totalPoints) {
		this.totalPoints = totalPoints;
	}

	public BigDecimal getTotalCardBalance() {
		return totalCardBalance;
	}

	public void setTotalCardBalance(BigDecimal totalCardBalance) {
		this.totalCardBalance = totalCardBalance;
	}

	public BigDecimal getTotalPointsBalance() {
		return totalPointsBalance;
	}

	public void setTotalPointsBalance(BigDecimal totalPointsBalance) {
		this.totalPointsBalance = totalPointsBalance;
	}

	public BigDecimal getPermanentPoints() {
		return permanentPoints;
	}

	public void setPermanentPoints(BigDecimal permanentPoints) {
		this.permanentPoints = permanentPoints;
	}

	public BigDecimal getUsedPermanentPoints() {
		return usedPermanentPoints;
	}

	public void setUsedPermanentPoints(BigDecimal usedPermanentPoints) {
		this.usedPermanentPoints = usedPermanentPoints;
	}

	public BigDecimal getExpiredPermanentPoints() {
		return expiredPermanentPoints;
	}

	public void setExpiredPermanentPoints(BigDecimal expiredPermanentPoints) {
		this.expiredPermanentPoints = expiredPermanentPoints;
	}

	public BigDecimal getInvalidPermanentPoints() {
		return invalidPermanentPoints;
	}

	public void setInvalidPermanentPoints(BigDecimal invalidPermanentPoints) {
		this.invalidPermanentPoints = invalidPermanentPoints;
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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevelDesc() {
		return levelDesc;
	}

	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

	public String getMemberCardNo() {
		return memberCardNo;
	}

	public void setMemberCardNo(String memberCardNo) {
		this.memberCardNo = memberCardNo;
	}

	public String getMemberCardLevel() {
		return memberCardLevel;
	}

	public void setMemberCardLevel(String memberCardLevel) {
		this.memberCardLevel = memberCardLevel;
	}

	public String getPointsPurseId() {
		return pointsPurseId;
	}

	public void setPointsPurseId(String pointsPurseId) {
		this.pointsPurseId = pointsPurseId;
	}

	public BigDecimal getValidPoints() {
		return validPoints;
	}

	public void setValidPoints(BigDecimal validPoints) {
		this.validPoints = validPoints;
	}

	public BigDecimal getUsedPoints() {
		return usedPoints;
	}

	public void setUsedPoints(BigDecimal usedPoints) {
		this.usedPoints = usedPoints;
	}

	public BigDecimal getExpiredPoints() {
		return expiredPoints;
	}

	public void setExpiredPoints(BigDecimal expiredPoints) {
		this.expiredPoints = expiredPoints;
	}

	public BigDecimal getInvalidPoints() {
		return invalidPoints;
	}

	public void setInvalidPoints(BigDecimal invalidPoints) {
		this.invalidPoints = invalidPoints;
	}

}