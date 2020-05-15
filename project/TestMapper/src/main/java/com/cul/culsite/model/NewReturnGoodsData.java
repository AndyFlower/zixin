package com.cul.culsite.model;

import java.util.List;

public class NewReturnGoodsData {
	
	private String code;

	private String msg;
	
	private List <ReturnGoodsBean> returnGoodsBeanList;

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

	public List<ReturnGoodsBean> getReturnGoodsBeanList() {
		return returnGoodsBeanList;
	}

	public void setReturnGoodsBeanList(List<ReturnGoodsBean> returnGoodsBeanList) {
		this.returnGoodsBeanList = returnGoodsBeanList;
	}


	
	


}
