package com.cul.culsite.model.response.culapp;


public class ByCodeMsg {
	
	
	private String code;
	private String msg;
	
	private String[] serialNo;
    private String motTxnId;

	public ByCodeMsg(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public ByCodeMsg(String code, String msg, String[] serialNo) {
		super();
		this.code = code;
		this.msg = msg;
		this.serialNo = serialNo;
	}

    public ByCodeMsg(String code, String msg, String[] serialNo, String motTxnId) {
        super();
        this.code = code;
        this.msg = msg;
        this.serialNo = serialNo;
        this.motTxnId = motTxnId;
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

	public String[] getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String[] serialNo) {
		this.serialNo = serialNo;
	}

    public String getMotTxnId() {
        return motTxnId;
    }

    public void setMotTxnId(String motTxnId) {
        this.motTxnId = motTxnId;
    }
}
