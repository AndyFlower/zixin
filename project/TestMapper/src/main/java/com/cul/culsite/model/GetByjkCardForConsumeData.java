package com.cul.culsite.model;

import java.util.List;

public class GetByjkCardForConsumeData {
	
	private CodeMsg codeMsg;
	//private List<String> attachCardNos;
	private CardInfomation[] attachCardNos;
	public CodeMsg getCodeMsg() {
		return codeMsg;
	}
	public void setCodeMsg(CodeMsg codeMsg) {
		this.codeMsg = codeMsg;
	}
//	public List<String> getAttachCardNos() {
//		return attachCardNos;
//	}
//	public void setAttachCardNos(List<String> attachCardNos) {
//		this.attachCardNos = attachCardNos;
//	}
	public CardInfomation[] getAttachCardNos() {
		return attachCardNos;
	}
	public void setAttachCardNos(CardInfomation[] attachCardNos) {
		this.attachCardNos = attachCardNos;
	}
	
	

}
