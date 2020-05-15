package com.cul.culsite.model;

import java.math.BigDecimal;
import java.util.List;

public class MutiPartIprfReturnData {
	
	
	private String code;

	private String msg;
	
	//退货流水号
	private String txnId;
	
	private List<MutiPartReturnGoodsData> mutiPartReturnGoodsDataList;
	
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

	public boolean isSuccess(){
		
		return false;
	}
	
	public String createPosAdditionalValue(String tranId){
		if(!isSuccess()){
			return "";
		}
		return tranId;
		
	}
	
	@Override
	public String toString(){
		return "MutiPartIprfReturnData{" +
        "code=" + code +
        "msg=" + msg +
        "mutiPartReturnGoodsDataList=" + mutiPartReturnGoodsDataList +
        '}';
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

	public List<MutiPartReturnGoodsData> getMutiPartReturnGoodsDataList() {
		return mutiPartReturnGoodsDataList;
	}

	public void setMutiPartReturnGoodsDataList(
			List<MutiPartReturnGoodsData> mutiPartReturnGoodsDataList) {
		this.mutiPartReturnGoodsDataList = mutiPartReturnGoodsDataList;
	}

	

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String refundTxnId) {
		this.txnId = refundTxnId;
	}
	
	

}
