package com.cul.culsite.model;

public class AccountTradeInfo {
	private String accountNo;
	private String balanceInfen;
	private String tradeAmountInfen;
	
	public AccountTradeInfo() {
		super();
	}
	
	public AccountTradeInfo(String accountNo, String balanceInfen) {
		super();
		this.accountNo = accountNo;
		this.balanceInfen = balanceInfen;
	}
	
	public AccountTradeInfo(String accountNo, String balanceInfen, String tradeAmountInfen) {
		super();
		this.accountNo = accountNo;
		this.balanceInfen = balanceInfen;
		this.tradeAmountInfen = tradeAmountInfen;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBalanceInfen() {
		return balanceInfen;
	}
	public void setBalanceInfen(String balanceInfen) {
		this.balanceInfen = balanceInfen;
	}
	public String getTradeAmountInfen() {
		return tradeAmountInfen;
	}
	public void setTradeAmountInfen(String tradeAmountInfen) {
		this.tradeAmountInfen = tradeAmountInfen;
	}
}
