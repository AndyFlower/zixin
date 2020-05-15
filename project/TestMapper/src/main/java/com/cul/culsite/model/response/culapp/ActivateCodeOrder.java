package com.cul.culsite.model.response.culapp;

import java.math.BigDecimal;
import java.util.List;

import com.cul.culsite.dto.EsOrderDTOWithBLOBs;
import com.cul.culsite.model.EGiftCard;

public class ActivateCodeOrder {
	private String code;
	private String msg;
	private String status;
	private String orderNo;
	private List<String> activateCodes;
	private EsOrderDTOWithBLOBs esOrderDTO;
	private BigDecimal orderAmount;
	private BigDecimal payAmount;
	private List<EGiftCard> giftCardList;
	private String motTxnId;
	
	public ActivateCodeOrder(){}
	
	public ActivateCodeOrder(String status){
		this.status = status;
	}
	
	public ActivateCodeOrder(String code, String msg){
		this.code = code;
		this.msg = msg;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public List<String> getActivateCodes() {
		return activateCodes;
	}
	public void setActivateCodes(List<String> activateCodes) {
		this.activateCodes = activateCodes;
	}

	public EsOrderDTOWithBLOBs getEsOrderDTO() {
		return esOrderDTO;
	}

	public void setEsOrderDTO(EsOrderDTOWithBLOBs esOrderDTO) {
		this.esOrderDTO = esOrderDTO;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}


	public String getMotTxnId() {
		return motTxnId;
	}

	public void setMotTxnId(String motTxnId) {
		this.motTxnId = motTxnId;
	}

	public List<EGiftCard> getGiftCardList() {
		return giftCardList;
	}

	public void setGiftCardList(List<EGiftCard> giftCardList) {
		this.giftCardList = giftCardList;
	}
	
}
