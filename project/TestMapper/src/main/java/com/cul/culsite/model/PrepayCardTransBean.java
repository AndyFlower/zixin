package com.cul.culsite.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cul.culsite.dto.MOrderTxnDTO;
import com.cul.culsite.model.uid.UserData;

public class PrepayCardTransBean {

	private CardTransInfo[] cardTransInfoArray;

	private String merchantNo;

	private String merchantName;

	private String billNo;

	private String totalAmount;

	private String buyerMobile;

	private String cardNum;

	private String transType;

	private String userId;

	private String channel;

	private String issuerId;

	private String pn;

	private String urlT;

	private String orderPayAmount;

	private String promotionType;// 优惠类型

	private String tranDate;

	private String tranTime;

	private String holderMobile;

	private String sendName;

	private String sendWord;
	/** 条码 */
	private String tranid;

	/** C-卡，R-红包，V-券 */
	private String accountType;

	private String txnId;

	private String termNo;

	// 提取码
	private String extractingCode;
	//
	private String extractingCodeStatus;

	private String productType;

	private String buyChannel;
	// 外部订单号
	private String outBillNo;

	// 订单状态
	private String payStatus;

	// 是否赠送的标记
	private String isSend;

	private UserData userDate;

	private String status;

	private String custSeq;

	private String discountAmount;

	private boolean withoutMember;

	private String gatewayTxnId;

	private boolean notRecordMCAI;

	private String isPartConsume;// 是否部分消费Y/N
	private String createUser;
	private String updateUser;
	private String transDtTm;// 交易传输时间，switch上送的时间
	private String sysTranNo;// 系统跟踪号
	private String sourceId;// 发送机构
	private String sysReference; // 参考号
	private String expiryTime;// 账务有效期
	
	private String saleCmplTime;

	public String getIsPartConsume() {
		return isPartConsume;
	}

	public void setIsPartConsume(String isPartConsume) {
		this.isPartConsume = isPartConsume;
	}

	public String getUpdateUser() {
		return createUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getTransDtTm() {
		return transDtTm;
	}

	public void setTransDtTm(String transDtTm) {
		this.transDtTm = transDtTm;
	}

	public String getSysTranNo() {
		return sysTranNo;
	}

	public void setSysTranNo(String sysTranNo) {
		this.sysTranNo = sysTranNo;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSysReference() {
		return sysReference;
	}

	public void setSysReference(String sysReference) {
		this.sysReference = sysReference;
	}

	public String getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	public boolean isNotRecordMCAI() {
		return notRecordMCAI;
	}

	public void setNotRecordMCAI(boolean notRecordMCAI) {
		this.notRecordMCAI = notRecordMCAI;
	}

	public boolean isWithoutMember() {
		return withoutMember;
	}

	public void setWithoutMember(boolean withoutMember) {
		this.withoutMember = withoutMember;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserData getUserDate() {
		return userDate;
	}

	public void setUserDate(UserData userDate) {
		this.userDate = userDate;
	}

	public String getIsSend() {
		return isSend;
	}

	public void setIsSend(String isSend) {
		this.isSend = isSend;
	}

	// jv
	private String jv;

	// 赠送人姓名
	private String shipName;

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getJv() {
		return jv;
	}

	public void setJv(String jv) {
		this.jv = jv;
	}

	// 增加充值流水返回记录
	private MOrderTxnDTO mOrderTxnDTO; // 充值流水记录

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public MOrderTxnDTO getmOrderTxnDTO() {
		return mOrderTxnDTO;
	}

	public void setmOrderTxnDTO(MOrderTxnDTO mOrderTxnDTO) {
		this.mOrderTxnDTO = mOrderTxnDTO;
	}

	public String getOutBillNo() {
		return outBillNo;
	}

	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getBuyChannel() {
		return buyChannel;
	}

	public void setBuyChannel(String buyChannel) {
		this.buyChannel = buyChannel;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getExtractingCode() {
		return extractingCode;
	}

	public void setExtractingCode(String extractingCode) {
		this.extractingCode = extractingCode;
	}

	public String getExtractingCodeStatus() {
		return extractingCodeStatus;
	}

	public void setExtractingCodeStatus(String extractingCodeStatus) {
		this.extractingCodeStatus = extractingCodeStatus;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getTranid() {
		return tranid;
	}

	public void setTranid(String tranid) {
		this.tranid = tranid;
	}

	public String getSendName() {
		return sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

	public String getSendWord() {
		return sendWord;
	}

	public void setSendWord(String sendWord) {
		this.sendWord = sendWord;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getOrderPayAmount() {
		return orderPayAmount;
	}

	public void setOrderPayAmount(String orderPayAmount) {
		this.orderPayAmount = orderPayAmount;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public String getUrlT() {
		return urlT;
	}

	public void setUrlT(String urlT) {
		this.urlT = urlT;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public CardTransInfo[] getCardTransInfoArray() {
		return cardTransInfoArray;
	}

	public void setCardTransInfoArray(CardTransInfo[] cardTransInfoArray) {
		this.cardTransInfoArray = cardTransInfoArray;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getBuyerMobile() {
		return buyerMobile;
	}

	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getHolderMobile() {
		return holderMobile;
	}

	public void setHolderMobile(String holderMobile) {
		this.holderMobile = holderMobile;
	}

	public String getGatewayTxnId() {
		return gatewayTxnId;
	}

	public void setGatewayTxnId(String gatewayTxnId) {
		this.gatewayTxnId = gatewayTxnId;
	}

	public String getSaleCmplTime() {
		return saleCmplTime;
	}

	public void setSaleCmplTime(String saleCmplTime) {
		this.saleCmplTime = saleCmplTime;
	}

	public static PrepayCardTransBean newInstance(String cardNo, String mobile, String amount, String orderId, String merchantNo, String terminal,
			String barCode, String buyChannel, String issuerId) {
		PrepayCardTransBean bean = new PrepayCardTransBean();

		List<CardTransInfo> cardTransBatchList = new ArrayList<CardTransInfo>();
		CardTransInfo cardTransBatch = CardTransInfo.newInstance(cardNo, amount, mobile);
		cardTransBatchList.add(cardTransBatch);

		bean.setChannel("VPY");
		bean.setBuyChannel(buyChannel);
		bean.setBillNo(orderId);
		bean.setBuyerMobile(mobile);
		bean.setCardNum(String.valueOf(cardTransBatchList.size()));
		bean.setMerchantNo(merchantNo);
		bean.setTermNo(terminal);
		bean.setTotalAmount(amount);
		bean.setOrderPayAmount(amount);
		bean.setTransType("IDAD");
		bean.setUserId(mobile);
		bean.setIssuerId(issuerId);
	
		bean.setTranid(barCode);
		bean.setCardTransInfoArray(cardTransBatchList.toArray(new CardTransInfo[cardTransBatchList.size()]));

		return bean;
	}

	/**
	 * 中小商户转接类交易,构造交易bean，channel为VPY
	 * 
	 * @param issuerId
	 * @param cardNo
	 * @param amount
	 * @param billNo
	 * @param merchantNo
	 * @param terminal
	 * @param barCode
	 * @param buyChannel
	 *            支付渠道
	 * @param createUser
	 * @return
	 */
	public static PrepayCardTransBean getPrepayCardTransBeanForPayOnLine(String issuerId, String cardNo, String amount, String billNo,
			String merchantNo, String terminal, String barCode, String buyChannel, String createUser) {

		List<CardTransInfo> cardTransBatchList = new ArrayList<CardTransInfo>();
		CardTransInfo cardTransBatch = CardTransInfo.newInstance(cardNo, amount, "");
		cardTransBatchList.add(cardTransBatch);
		CardTransInfo[] cardTransInfos = cardTransBatchList.toArray(new CardTransInfo[cardTransBatchList.size()]);

		return getPrepayCardTransBeanWithCardTransInfo(issuerId, cardTransInfos, "", amount, billNo, "IDAD", "", "VPY", merchantNo, terminal,
				barCode, buyChannel, "N", createUser, "", "", "", "", "", "", "", "", "", "");
	}

	/**
	 * 线下转接交易，构造交易bean，channel为VPY
	 * 
	 * @param issuerId
	 *            商户号
	 * @param cardNo
	 *            卡号
	 * @param amount
	 *            金额
	 * @param billNo
	 *            订单号
	 * @param merchantNo
	 *            门店号
	 * @param terminal
	 *            终端
	 * @param barCode
	 *            条码
	 * @param buyChannel
	 *            , 支付渠道
	 * @param createUser
	 * @param transDtTm
	 * @param sysTranNo
	 * @param sysReference
	 * @param sourceId
	 * @return
	 */
	public static PrepayCardTransBean getPrepayCardTransBeanForPosTxn(String issuerId, String cardNo, String amount, String billNo,
			String merchantNo, String terminal, String barCode, String buyChannel, String createUser, String transDtTm, String sysTranNo,
			String sysReference, String sourceId) {
		List<CardTransInfo> cardTransBatchList = new ArrayList<CardTransInfo>();
		CardTransInfo cardTransBatch = CardTransInfo.newInstance(cardNo, amount, "");
		cardTransBatchList.add(cardTransBatch);
		CardTransInfo[] cardTransInfos = cardTransBatchList.toArray(new CardTransInfo[cardTransBatchList.size()]);
		return getPrepayCardTransBeanWithCardTransInfo(issuerId, cardTransInfos, "", amount, billNo, "IDAD", "", "VPY", merchantNo, terminal,
				barCode, buyChannel, "N", createUser, "", "", transDtTm, sysTranNo, sysReference, sourceId, "", "", "", "");
	}

	/**
	 * 构建消费的bean,不需要消费通知
	 * @param issuerId
	 * @param cardTransInfos
	 * @param buyerMobile
	 * @param amount  总金额
	 * @param billNo
	 * @param channel  
	 * @param merchantNo
	 * @param terminal
	 * @param barCode
	 * @param buyChannel  消費渠道
	 * @param createUser
	 * @param custSeq
	 * @param discountAmount  折扣
	 * @param gatewayTxnId  支付网关Id
	 * @return
	 */
	public static PrepayCardTransBean getPrepayCardTransBeanForIDAD(String issuerId, CardTransInfo[] cardTransInfos, String buyerMobile,
			String amount, String billNo, String channel, String merchantNo, String terminal, String barCode, String buyChannel, String createUser,
			String custSeq, String discountAmount, String gatewayTxnId) {
		return getPrepayCardTransBeanWithCardTransInfo(issuerId, cardTransInfos, buyerMobile, amount, billNo, "IDAD", "C", buyChannel, merchantNo,
				terminal, barCode, buyChannel, "N", createUser, "", "", "", "", "", "", custSeq, discountAmount, "", gatewayTxnId);
	}

	private static PrepayCardTransBean getPrepayCardTransBeanWithCardTransInfo(String issuerId, CardTransInfo[] cardTransInfos, String buyerMobile,
			String amount, String billNo, String transType, String accountType, String channel, String merchantNo, String terminal, String barCode,
			String buyChannel, String isPartConsume, String createUser, String promotionType, String outBillNo, String transDtTm, String sysTranNo,
			String sysReference, String sourceId, String custSeq, String discountAmount, String expiryTime, String gatewayTxnId) {
		PrepayCardTransBean bean = new PrepayCardTransBean();

		bean.setCardTransInfoArray(cardTransInfos);
		bean.setCardNum(String.valueOf(cardTransInfos.length));

		bean.setBillNo(billNo);
		bean.setMerchantNo(merchantNo);
		bean.setTotalAmount(amount);
		bean.setBuyerMobile(buyerMobile);
		bean.setTransType(transType);
		bean.setAccountType(accountType);
		bean.setChannel(channel);
		bean.setIssuerId(issuerId);
		bean.setTranid(barCode);
		bean.setTermNo(terminal);
		bean.setIsPartConsume(isPartConsume);
		bean.setCreateUser(createUser);
		bean.setPromotionType(promotionType);
		bean.setBuyChannel(buyChannel);
		bean.setOutBillNo(outBillNo);
		bean.setTransDtTm(transDtTm);
		bean.setSysTranNo(sysTranNo);
		bean.setSysReference(sysReference);
		bean.setSourceId(sourceId);
		bean.setCustSeq(custSeq);
		bean.setDiscountAmount(discountAmount);
		bean.setExpiryTime(expiryTime);
		bean.setGatewayTxnId(gatewayTxnId);
		bean.setOrderPayAmount(amount);
		return bean;
	}

	@Override
	public String toString() {
		return "PrepayCardTransBean{" + "cardTransInfoArray=" + Arrays.toString(cardTransInfoArray) + ", merchantNo='" + merchantNo + '\''
				+ ", merchantName='" + merchantName + '\'' + ", billNo='" + billNo + '\'' + ", totalAmount='" + totalAmount + '\''
				+ ", buyerMobile='" + buyerMobile + '\'' + ", cardNum='" + cardNum + '\'' + ", transType='" + transType + '\'' + ", userId='"
				+ userId + '\'' + ", channel='" + channel + '\'' + ", issuerId='" + issuerId + '\'' + ", pn='" + pn + '\'' + ", urlT='" + urlT + '\''
				+ ", orderPayAmount='" + orderPayAmount + '\'' + ", promotionType='" + promotionType + '\'' + ", tranDate='" + tranDate + '\''
				+ ", tranTime='" + tranTime + '\'' + ", holderMobile='" + holderMobile + '\'' + ", sendName='" + sendName + '\'' + ", sendWord='"
				+ sendWord + '\'' + ", tranid='" + tranid + '\'' + ", accountType='" + accountType + '\'' + ", txnId='" + txnId + '\'' + ", termNo='"
				+ termNo + '\'' + ", extractingCode='" + extractingCode + '\'' + ", extractingCodeStatus='" + extractingCodeStatus + '\''
				+ ", productType='" + productType + '\'' + ", buyChannel='" + buyChannel + '\'' + '}';
	}
}
