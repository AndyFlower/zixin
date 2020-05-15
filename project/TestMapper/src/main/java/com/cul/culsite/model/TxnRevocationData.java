package com.cul.culsite.model;

import java.util.List;
import com.cul.culsite.model.response.pursevoucher.TxnRevocateResponse;

public class TxnRevocationData {
	private CodeMsg msg;
	private List<TxnRevocateResponse> responseList;
	
	
	public CodeMsg getMsg() {
		return msg;
	}
	public void setMsg(CodeMsg msg) {
		this.msg = msg;
	}
	public List<TxnRevocateResponse> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<TxnRevocateResponse> responseList) {
		this.responseList = responseList;
	}

}
