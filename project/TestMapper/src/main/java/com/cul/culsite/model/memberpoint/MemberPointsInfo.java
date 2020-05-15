package com.cul.culsite.model.memberpoint;

import java.math.BigDecimal;

public class MemberPointsInfo {
	
	private BigDecimal pointsBalance;
	
	private BigDecimal pointsBalanceAmount;

	public BigDecimal getPointsBalance() {
		return pointsBalance;
	}

	public void setPointsBalance(BigDecimal pointsBalance) {
		this.pointsBalance = pointsBalance;
	}

	public BigDecimal getPointsBalanceAmount() {
		return pointsBalanceAmount;
	}

	public void setPointsBalanceAmount(BigDecimal pointsBalanceAmount) {
		this.pointsBalanceAmount = pointsBalanceAmount;
	}
}
