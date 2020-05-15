package com.cul.culsite.model;

public class MessageType {

	/** 购卡给自己*/
	public static String BCFM = "BCFM";
	
	/** 购卡给朋友*/
	public static String BCFF = "BCFF";
	
	/** 支付*/
	public static String IDAD = "IDAD";
	
	/** 领卡后发送短信给赠卡人*/
	public static String UCTP = "UCTP";
	
	/** 赠卡*/
	public static String CPTF = "CPTF";
	
	/** 取消赠卡*/
	public static String CCPT = "CCPT";
	
	/** 注册发送短信验证码*/
	public static String RCTM = "RCTM";
	
	/** 提取码产生后发送信息给收卡人*/
	public static String EGTH = "EGTH";
	
	/** 修改支付密码发送短信验证码*/
	public static String UCTM = "UCTM";
	
	/** 重置支付密码发送短信验证码*/
	public static String CZMM = "CZMM";
	
	/**大客户团购售卖 */
	public static String LKTZ = "LKTZ";
	
	/** 大客户团购充值*/
	public static String LKCZ = "LKCZ";
	
	/**
	 *中信银行联名卡验证码
	 */
	public static String CITIC_COBRAND_CARD_CODE ="CITV";
	
	/**
	 * 微信绑定的实体卡交易{充值、充值撤销、消费、转账（转入、转出）、换卡（换入、换出）、卡片回收}通知
	 * 适用于家乐福银商发的卡
	 */
	public static String CARD_BIND_WECHAT_NOTIFY="CBWN";
	/**
	 * 微信绑定的实体卡交易{充值、充值撤销、消费、转账（转入、转出）、换卡（换入、换出）、卡片回收}通知
	 * 适用于家乐福中信联名卡卡
	 */
	public static String CI_CARD_BIND_WECHAT_NOTIFY="CIWN";
	
	/**
	 * 电子卡领取 Receive Electronic card
	 */
	public static String RCEC = "RCEC";
	
	/**
	 * 修改手机号发送短信验证码 modify mobile temp message
	 */
	public static String MODIFY_MOBILE_TM = "MMTM";
	
	/**
	 * 拒收（回绝）卡片短信通知 reject card notity message
	 */
	public static String REJECT_CARD_NOTITY_MESSAGE = "RCNM";
	
	/**
	 * 消费交易提醒
	 */
	public static String JYTX="JYTX";
	
	
}
