package com.cul.culsite.model;

import java.util.List;

public class GrdTransData {

	String code;
	String msg;
	List<String> txnIdList;
	
	List<CardReturnInfo> cardReturnInfoList;
	
	private String cardType;//接口返回值，首张卡对应的卡类型信息：卡类型
	private String cardTypeDesc;//接口返回值，首张卡对应的卡类型信息：卡类型描述
	
	
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardTypeDesc() {
		return cardTypeDesc;
	}
	public void setCardTypeDesc(String cardTypeDesc) {
		this.cardTypeDesc = cardTypeDesc;
	}
	@Override
	public String toString(){
		return "CardReturnInfo{" +
        "code=" + code +
        "msg=" + msg +
        "txnIdList=" + txnIdList +
        "cardReturnInfoList=" + cardReturnInfoList +
        '}';
	}
	public GrdTransData() {
		super();
	}
	public GrdTransData(String code, String msg, List<String> txnIdList) {
		super();
		this.code = code;
		this.msg = msg;
		this.txnIdList = txnIdList;
	}
	public GrdTransData(String code, String msg, List<String> txnIdList,
			List<CardReturnInfo> cardReturnInfoList) {
		super();
		this.code = code;
		this.msg = msg;
		this.txnIdList = txnIdList;
		this.cardReturnInfoList = cardReturnInfoList;
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
	public List<String> getTxnIdList() {
		return txnIdList;
	}
	public void setTxnIdList(List<String> txnIdList) {
		this.txnIdList = txnIdList;
	}
	public List<CardReturnInfo> getCardReturnInfoList() {
		return cardReturnInfoList;
	}
	public void setCardReturnInfoList(List<CardReturnInfo> cardReturnInfoList) {
		this.cardReturnInfoList = cardReturnInfoList;
	}
	
}
