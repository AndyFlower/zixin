package com.cul.culsite.model.memberpoint;

public class PointsTransInfo {
	
	private String orignTxn_id ; // 扣减的加值积分的txn_id
	
	private String payPoints ; // 使用积分值
	
	private String pointsType ; // 积分类型
	
	public String getPointsType() {
		return pointsType;
	}

	public void setPointsType(String pointsType) {
		this.pointsType = pointsType;
	}

	public String getOrignTxn_id() {
		return orignTxn_id;
	}

	public void setOrignTxn_id(String orignTxn_id) {
		this.orignTxn_id = orignTxn_id;
	}

	public String getPayPoints() {
		return payPoints;
	}

	public void setPayPoints(String payPoints) {
		this.payPoints = payPoints;
	}
	
	

}
