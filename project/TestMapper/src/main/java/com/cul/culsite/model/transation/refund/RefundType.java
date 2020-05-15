package com.cul.culsite.model.transation.refund;

public enum RefundType {
	/**  */
	WHOLE_ORDER_REFUND("A"),
	/**  */
	PART_ONCE_REFUND("B"),
	/** 条码多次退货 */
	PART_REPEAT_REFUND_TRANID("C"),
	/** 订单号多次退货 */
	PART_REPEAT_REFUND_ORDERID("D"),
	/** 流水号号多次退货 */
	PART_REPEAT_REFUND_TXNID("E"),
	/**  */
	CERTAIN_CARD_REFUND_ORDERID("F"),
	/*中小商户退货交易*/
	MSCORP_CARD_REFUND_ORDERID("G");
	
	private String code;
	
	private RefundType(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public static RefundType getRefundType(String code){
		for(RefundType r : RefundType.values()){
			if(code.equals(r.getCode())){
				return r;
			}
		}
		return null;
	}
}