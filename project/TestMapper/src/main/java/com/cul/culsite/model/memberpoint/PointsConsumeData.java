package com.cul.culsite.model.memberpoint;

public class PointsConsumeData {

	private String pointTxnid;// 积分流水表id
	
	private String motTxnId;// 交易流水表id
	
	private String pointRedeemedAmount;
	
	private String equivalentAmount;
	
	private String remainPoint;
	

	public String getMotTxnId() {
		return motTxnId;
	}

	public void setMotTxnId(String motTxnId) {
		this.motTxnId = motTxnId;
	}

	public String getPointTxnid() {
		return pointTxnid;
	}

	public void setPointTxnid(String pointTxnid) {
		this.pointTxnid = pointTxnid;
	}

	public String getPointRedeemedAmount() {
		return pointRedeemedAmount;
	}

	public void setPointRedeemedAmount(String pointRedeemedAmount) {
		this.pointRedeemedAmount = pointRedeemedAmount;
	}

	public String getEquivalentAmount() {
		return equivalentAmount;
	}

	public void setEquivalentAmount(String equivalentAmount) {
		this.equivalentAmount = equivalentAmount;
	}

	public String getRemainPoint() {
		return remainPoint;
	}

	public void setRemainPoint(String remainPoint) {
		this.remainPoint = remainPoint;
	}
	
	
}
