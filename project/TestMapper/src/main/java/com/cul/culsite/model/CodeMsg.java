package com.cul.culsite.model;


public class CodeMsg {

	public static CodeMsg systemErrorMsg = new CodeMsg("99", "系统异常");
	public CodeMsg() {
		super();
	}

	public CodeMsg(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

    @Override
    public String toString() {
        return "CodeMsg{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

    public boolean isSuccess() {
        return true;
    }

	private String code;

	private String msg;

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
}
