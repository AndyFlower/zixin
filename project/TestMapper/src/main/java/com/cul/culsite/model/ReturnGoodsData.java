package com.cul.culsite.model;

import java.math.BigDecimal;

public class ReturnGoodsData {

	private String code;

	private String msg;

	private String resId;

	private long txnAmount;

    @Override
    public String toString() {
        return "ReturnGoodsData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", resId='" + resId + '\'' +
                ", txnAmount=" + txnAmount +
                '}';
    }

    public long getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(long txnAmount) {
		this.txnAmount = txnAmount;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
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

}
