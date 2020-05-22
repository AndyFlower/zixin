package com.cul.culsite.TestMapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {

	public static void main(String[] args) {
		String sql = "`M_ORDER_TXN`\r\n" + 
				"    set `MOT_ORDER_ID` = ?,\r\n" + 
				"      `MOT_MER_ID` = ?,\r\n" + 
				"      `MOT_TOTAL_AMOUNT` = ?,\r\n" + 
				"      `MOT_TRAN_DATE` = ?,\r\n" + 
				"      `MOT_TRAN_TIME` = ?,\r\n" + 
				"      `MOT_POSTING_TIME` = ?,\r\n" + 
				"      `MOT_BUYER_MOBILE` = ?,\r\n" + 
				"      `MOT_ORDER_TYPE` = ?,\r\n" + 
				"      `MOT_STATUS` = ?,\r\n" + 
				"      `MOT_TYPE` = ?,\r\n" + 
				"      `MOT_CHANNEL` = ?,\r\n" + 
				"      `MOT_TRANID` = ?,\r\n" + 
				"      `MOT_ISSUER_ID` = ?,\r\n" + 
				"      `MOT_ORDER_NUM` = ?,\r\n" + 
				"      `MOT_IS_PART_CONSUME` = ?,\r\n" + 
				"      `CREATE_USER` = ?,\r\n" + 
				"      `CREATE_TIMESTAMP` = ?,\r\n" + 
				"      `UPDATE_USER` = ?,\r\n" + 
				"      `UPDATE_TIMESTAMP` = ?,\r\n" + 
				"      `MOT_NEED_PICK_NOTICE` = ?,\r\n" + 
				"      `MOT_TRAN_PIC_URL` = ?,\r\n" + 
				"      `MOT_TOTAL_PAY_AMOUNT` = ?,\r\n" + 
				"      `MOT_PROMOTION_TYPE` = ?,\r\n" + 
				"      `MOT_PAY_CHANNEL` = ?,\r\n" + 
				"      `MOT_PAY_BILL_NO` = ?,\r\n" + 
				"      `MOT_PAY_STATUS` = ?,\r\n" + 
				"      `MOT_TERMNO` = ?,\r\n" + 
				"      `MOT_TRANSMSN_DT_TM` = ?,\r\n" + 
				"      `MOT_SYS_TRA_NO` = ?,\r\n" + 
				"      `MOT_SOURCE_ID` = ?,\r\n" + 
				"      `MOT_RRN` = ?,\r\n" + 
				"      `MOT_TRANSMSN_DT` = ?,\r\n" + 
				"      `MOT_TRANSMSN_TM` = ?,\r\n" + 
				"      `MTH_EXTERNAL_TXNID` = ?,\r\n" + 
				"      `MTH_EXTERNAL_TXNID_OWNER` = ?,\r\n" + 
				"      `MOT_CUST_SEQ` = ?,\r\n" + 
				"      `MOT_CASHIER_INFORMATION` = ?,\r\n" + 
				"      `MOT_LOYALTY_CLUB` = ?,\r\n" + 
				"      `MOT_DISCOUNT_AMOUNT` = ?,\r\n" + 
				"      `MOT_SERVICE_ID` = ?,\r\n" + 
				"      `MOT_EXPIRY_TIME` = ?,\r\n" + 
				"      `MOT_GATEWAY_TXNID` = ?,\r\n" + 
				"      `MOT_SETTLE_DATE` = ?,\r\n" + 
				"      `MOT_SOURCE` = ?,\r\n" + 
				"      `MOT_SUM_ORDER_AMT` = ?,\r\n" + 
				"      `MOT_SUM_DISCOUNT_AMT` = ?,\r\n" + 
				"      `MOT_RANDOM_SUB_AMOUNT` = ?\r\n" + 
				"    where `MOT_TXN_ID` = ?";
		StringBuilder newSql = new StringBuilder();
		System.out.println(sql.contains("MOT_ISSUER_ID"));
		System.out.println(sql.indexOf("MOT_ISSUER_ID"));
		newSql.append(sql.substring(0, sql.indexOf("MOT_ISSUER_ID")-1));
        //System.out.println(sql.substring(0, sql.indexOf("MOT_ISSUER_ID")-1));
        String lastPart =  sql.substring(sql.indexOf("MOT_ISSUER_ID")-1, sql.length());
        Matcher matcher=Pattern.compile(",").matcher(lastPart);
        if(matcher.find()){
       	 //System.out.println(matcher.start());
        }
        //System.out.println(lastPart);
        //System.out.println(lastPart.substring(matcher.start(), lastPart.length()));
        newSql.append(lastPart.substring(matcher.start()+1, lastPart.length()));
        System.out.println(newSql);
	}

}
