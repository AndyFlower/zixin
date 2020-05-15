package com.cul.culsite.model;

public class IslvCodeMsg {
	private CodeMsg codeMsg;
	private String[] serialNoArray;
	public IslvCodeMsg() {
		super();
	}
	public IslvCodeMsg(CodeMsg codeMsg, String[] serialNoArray) {
		super();
		this.codeMsg = codeMsg;
		this.serialNoArray = serialNoArray;
	}
	public CodeMsg getCodeMsg() {
		return codeMsg;
	}
	public void setCodeMsg(CodeMsg codeMsg) {
		this.codeMsg = codeMsg;
	}
	public String[] getSerialNoArray() {
		return serialNoArray;
	}
	public void setSerialNoArray(String[] serialNoArray) {
		this.serialNoArray = serialNoArray;
	}
}
