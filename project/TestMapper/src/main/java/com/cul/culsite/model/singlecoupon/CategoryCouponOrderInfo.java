package com.cul.culsite.model.singlecoupon;

import java.util.List;

import com.cul.culsite.dto.MVoucherRecordDTO;
import com.cul.culsite.dto.MVoucherRecordDetailDTO;

public class CategoryCouponOrderInfo {
	private String code;
	private String msg;
	private MVoucherRecordDTO voucherRecord;
	private List<MVoucherRecordDetailDTO> voucherRecordDetailList;
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
	public MVoucherRecordDTO getVoucherRecord() {
		return voucherRecord;
	}
	public void setVoucherRecord(MVoucherRecordDTO voucherRecord) {
		this.voucherRecord = voucherRecord;
	}
	public List<MVoucherRecordDetailDTO> getVoucherRecordDetailList() {
		return voucherRecordDetailList;
	}
	public void setVoucherRecordDetailList(
			List<MVoucherRecordDetailDTO> voucherRecordDetailList) {
		this.voucherRecordDetailList = voucherRecordDetailList;
	}
}
