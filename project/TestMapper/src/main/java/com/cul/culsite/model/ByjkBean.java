package com.cul.culsite.model;

public class ByjkBean {
	private String[] cardNos ;
	private String totalAmount;
	private String terminal;
	private String billNo;
	private String txndate;
	private String txntime;
	private String isPartConsume;
	private String masterCardNo;
	private String txnId;
	private String merId;
	
	private String sourceId;
	private String sysTraNo;
	private String transmsnDtTm;
	
	// pos参考号
	private String rrn;
	
	// switch流水号
	private String stan;
	
	// 请求日切时间
	private String requestPostingDate;
	
	private String channel;
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public String getRequestPostingDate() {
		return requestPostingDate;
	}

	public void setRequestPostingDate(String requestPostingDate) {
		this.requestPostingDate = requestPostingDate;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSysTraNo() {
		return sysTraNo;
	}

	public void setSysTraNo(String sysTraNo) {
		this.sysTraNo = sysTraNo;
	}

	public String getTransmsnDtTm() {
		return transmsnDtTm;
	}

	public void setTransmsnDtTm(String transmsnDtTm) {
		this.transmsnDtTm = transmsnDtTm;
	}

	public void setTxnId(String txnId){
		this.txnId = txnId;
	}
	
	public String getTxnId(){
		return this.txnId;
	}
	
	public void setMerId(String merId){
		this.merId = merId;
	}
	
	public String getMerId(){
		return this.merId;
	}
	
	public void setMasterCardNo(String masterCardNo){
		this.masterCardNo = masterCardNo;
		
	}
	public String getMasterCardNo(){
		return this.masterCardNo;
	}
	public void setCardNos(String[] cardNos ){
		this.cardNos = cardNos;
	}
	public void setTotalAmount(String totalAmount ){
		this.totalAmount = totalAmount;
	}
	public void setTerminal(String terminal ){
		this.terminal = terminal;
	}
	public void setTxndate(String txndate ){
		this.txndate = txndate;
	}
	public void setTxntime(String txntime ){
		this.txntime = txntime;
	}
	public void setBillNo(String billNo){
		this.billNo = billNo;
	}
	public void setIsPartConsume(String isPartConsume){
		this.isPartConsume = isPartConsume;
		
	}
	public String[] getCardNos(){
		return this.cardNos;
	}
	public String getTotalAmount(){
		return this.totalAmount;
	}
	public String getTerminal(){
		return this.terminal;
	}
	public String getTxndate(){
		return this.txndate;
	}
	public String getTxntime(){
		return this.txntime;
	}
	public String getBillNo(){
		return this.billNo;
	}
	public String getIsPartConsume(){
		return this.isPartConsume;
	}

}
