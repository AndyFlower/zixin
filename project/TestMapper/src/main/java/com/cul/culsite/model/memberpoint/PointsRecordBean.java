package com.cul.culsite.model.memberpoint;

import java.math.BigDecimal;
import java.util.Date;

public class PointsRecordBean {
	private String pointTxnId;
	private String orginTxnId;
	private BigDecimal payPoints;
	private Date startDate;
	private Date endDate;

	public String getPointTxnId() {
		return pointTxnId;
	}

	public void setPointTxnId(String pointTxnId) {
		this.pointTxnId = pointTxnId;
	}

	public String getOrginTxnId() {
		return orginTxnId;
	}

	public void setOrginTxnId(String orginTxnId) {
		this.orginTxnId = orginTxnId;
	}

	public BigDecimal getPayPoints() {
		return payPoints;
	}

	public void setPayPoints(BigDecimal payPoints) {
		this.payPoints = payPoints;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
