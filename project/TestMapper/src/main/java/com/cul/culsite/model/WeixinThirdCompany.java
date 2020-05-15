package com.cul.culsite.model;

/**
 * 保存参数   用于解决并发问题
 * @author sun
 *	company公众号
 */
public class WeixinThirdCompany {
	private String appId;   //公众号addid 一个公众号只有一个appid
	private String company;	 //比如:合肥百大   hfbd
	private String issuerId;	//发行者
	private String homeUrl;			//主页Url
	private String registerUrl;		//注册页面URl
	
	public WeixinThirdCompany() {
		super();
	}
	public WeixinThirdCompany(String appId, String company, String issuerId, String homeUrl, String registerUrl) {
		super();
		this.appId = appId;
		this.company = company;
		this.issuerId = issuerId;
		this.homeUrl = homeUrl;
		this.registerUrl = registerUrl;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}
	public String getHomeUrl() {
		return homeUrl;
	}
	public void setHomeUrl(String homeUrl) {
		this.homeUrl = homeUrl;
	}
	public String getRegisterUrl() {
		return registerUrl;
	}
	public void setRegisterUrl(String registerUrl) {
		this.registerUrl = registerUrl;
	}
	
}
