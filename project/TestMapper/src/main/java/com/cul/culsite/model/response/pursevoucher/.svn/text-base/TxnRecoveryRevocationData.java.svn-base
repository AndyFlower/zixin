package com.cul.culsite.model.response.pursevoucher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cul.culsite.model.CodeMsg;
import com.cul.culsite.model.GrdTransBean;

public class TxnRecoveryRevocationData {
	
	private CodeMsg msg;

	private Map<String, String> couponTxnNo;

	public CodeMsg getMsg() {
		return msg;
	}

	public void setMsg(CodeMsg msg) {
		this.msg = msg;
	}

	public Map<String, String> getCouponTxnNo() {
		return couponTxnNo;
	}

	public void setCouponTxnNo(Map<String, String> couponTxnNo) {
		this.couponTxnNo = couponTxnNo;
	}
	
	public  List<String> convertToTxnId(List<GrdTransBean> grdTransBeanList){
		List<String> txnIdList=new ArrayList<String>();
		if(this.couponTxnNo==null){
			return null;
		}
		for(GrdTransBean bean:grdTransBeanList){
			txnIdList.add(this.couponTxnNo.get(bean.getCardNo()));
		}
		return txnIdList;
		
	}

}
