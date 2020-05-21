package com.cul.culsite.model.memberpoint;

import java.util.List;


public class PointsPurseTxn {
	 private String purseId        ;
	 private String totalPoints    ; 
	 private String usedPoints     ; 
	 private String invalidPoints  ; 
	 private String recordCode     ; 
	 private String recordCodeName; 
	 private String txnId              ; 
	 private String orderNo        ; 
	 private String channel         ; 
	 private String useChannel     ; 
	 private String motTxnId      ; 
	 private String adjustDirection; 
	 private String expiredPoints  ; 
	 private String status          ; 
	 private String refundId       ; 
	 private String dateTime;
    
     
	public String getPurseId() {
		return purseId;
	}
	public void setPurseId(String purseId) {
		this.purseId = purseId;
	}
	public String getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}
	public String getUsedPoints() {
		return usedPoints;
	}
	public void setUsedPoints(String usedPoints) {
		this.usedPoints = usedPoints;
	}
	public String getInvalidPoints() {
		return invalidPoints;
	}
	public void setInvalidPoints(String invalidPoints) {
		this.invalidPoints = invalidPoints;
	}
	public String getRecordCode() {
		return recordCode;
	}
	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
	}
	public String getRecordCodeName() {
		return recordCodeName;
	}
	public void setRecordCodeName(String recordCodeName) {
		this.recordCodeName = recordCodeName;
	}
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getUseChannel() {
		return useChannel;
	}
	public void setUseChannel(String useChannel) {
		this.useChannel = useChannel;
	}
	public String getMotTxnId() {
		return motTxnId;
	}
	public void setMotTxnId(String motTxnId) {
		this.motTxnId = motTxnId;
	}
	public String getAdjustDirection() {
		return adjustDirection;
	}
	public void setAdjustDirection(String adjustDirection) {
		this.adjustDirection = adjustDirection;
	}
	public String getExpiredPoints() {
		return expiredPoints;
	}
	public void setExpiredPoints(String expiredPoints) {
		this.expiredPoints = expiredPoints;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
 
}