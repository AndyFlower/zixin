package com.cul.culsite.model.weixincard;

import java.util.HashMap;
import java.util.Map;

public class WeiXinCardBaseInfo {
	private String logo_url;
	private String brand_name;
	private String code_type;
	private String title;
	private String color;
	private String notice;
	private String service_phone;
	private String description;
	private WeiXinCardDateInfo date_info;
	private WeiXinCardSku sku;
	private Integer get_limit;
	private Boolean use_custom_code;
	private Boolean can_give_friend;
	private Integer[] location_id_list;
	private String custom_url_name;
	private String custom_url;
	private String custom_url_sub_title;
	private String promotion_url_name;
	private String promotion_url;
	private Boolean need_push_on_view;
	private Boolean can_share;
	private String center_title;// string（18） 快速使用 顶部居中的自定义cell。
	private String center_sub_title; // string（24） 点击快速核销卡券 顶部居中的自定义cell说明。
	private String center_url; // 顶部居中的自定义cell的跳转链接
	private Boolean use_all_locations;
	private Pay_info pay_info;
	
	public Pay_info getPay_info() {
		return pay_info;
	}

	public void setPay_info(Pay_info pay_info) {
		this.pay_info = pay_info;
	}

	public Boolean getUse_all_locations() {
		return use_all_locations;
	}

	public void setUse_all_locations(Boolean use_all_locations) {
		this.use_all_locations = use_all_locations;
	}

	private SubMerchantInfo sub_merchant_info;
	
	public class SubMerchantInfo{
		private String merchant_id;

		public String getMerchant_id() {
			return merchant_id;
		}

		public void setMerchant_id(String merchant_id) {
			this.merchant_id = merchant_id;
		}
		
	}
	
	
	public SubMerchantInfo getSub_merchant_info() {
		return sub_merchant_info;
	}

	public void setSub_merchant_info(SubMerchantInfo sub_merchant_info) {
		this.sub_merchant_info = sub_merchant_info;
	}

	private static Map<String, String> colorMap=new HashMap<String,String>();
	static{
		colorMap.put("#63b359", "Color010");
		colorMap.put("#2c9f67", "Color020");
		colorMap.put("#509fc9", "Color030");
		colorMap.put("#5885cf", "Color040");
		colorMap.put("#9062c0", "Color050");
		colorMap.put("#d09a45", "Color060");
		colorMap.put("#e4b138", "Color070");
		colorMap.put("#ee903c", "Color080");
		colorMap.put("#f08500", "Color081");
		colorMap.put("#a9d92d", "Color082");
		colorMap.put("#dd6549", "Color090");
		colorMap.put("#cc463d", "Color100");
		colorMap.put("#cf3e36", "Color101");
		colorMap.put("#5E6671", "Color102");
	}
	
	
	public String getCenter_title() {
		return center_title;
	}

	public void setCenter_title(String center_title) {
		this.center_title = center_title;
	}

	public String getCenter_sub_title() {
		return center_sub_title;
	}

	public void setCenter_sub_title(String center_sub_title) {
		this.center_sub_title = center_sub_title;
	}

	public String getCenter_url() {
		return center_url;
	}

	public void setCenter_url(String center_url) {
		this.center_url = center_url;
	}

	public String getLogo_url() {
		return logo_url;
	}

	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getCode_type() {
		return code_type;
	}

	public void setCode_type(String code_type) {
		this.code_type = code_type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.startsWith("#")){
			this.color = colorMap.get(color);
		}else{
			this.color = color;
		}
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getService_phone() {
		return service_phone;
	}

	public void setService_phone(String service_phone) {
		this.service_phone = service_phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WeiXinCardSku getSku() {
		return sku;
	}

	public void setSku(WeiXinCardSku sku) {
		this.sku = sku;
	}

	public Integer getGet_limit() {
		return get_limit;
	}

	public void setGet_limit(Integer get_limit) {
		this.get_limit = get_limit;
	}

	public Boolean isUse_custom_code() {
		return use_custom_code;
	}

	public void setUse_custom_code(Boolean use_custom_code) {
		this.use_custom_code = use_custom_code;
	}

	public Boolean isCan_give_friend() {
		return can_give_friend;
	}

	public void setCan_give_friend(Boolean can_give_friend) {
		this.can_give_friend = can_give_friend;
	}

	public Integer[] getLocation_id_list() {
		return location_id_list;
	}

	public void setLocation_id_list(Integer[] location_id_list) {
		this.location_id_list = location_id_list;
	}

	public String getCustom_url_name() {
		return custom_url_name;
	}

	public void setCustom_url_name(String custom_url_name) {
		this.custom_url_name = custom_url_name;
	}

	public String getCustom_url() {
		return custom_url;
	}

	public void setCustom_url(String custom_url) {
		this.custom_url = custom_url;
	}

	public String getCustom_url_sub_title() {
		return custom_url_sub_title;
	}

	public void setCustom_url_sub_title(String custom_url_sub_title) {
		this.custom_url_sub_title = custom_url_sub_title;
	}

	public String getPromotion_url_name() {
		return promotion_url_name;
	}

	public void setPromotion_url_name(String promotion_url_name) {
		this.promotion_url_name = promotion_url_name;
	}

	public String getPromotion_url() {
		return promotion_url;
	}

	public void setPromotion_url(String promotion_url) {
		this.promotion_url = promotion_url;
	}

	public Boolean isNeed_push_on_view() {
		return need_push_on_view;
	}

	public void setNeed_push_on_view(Boolean need_push_on_view) {
		this.need_push_on_view = need_push_on_view;
	}

	public Boolean getCan_share() {
		return can_share;
	}

	public void setCan_share(Boolean can_share) {
		this.can_share = can_share;
	}

	public Boolean getUse_custom_code() {
		return use_custom_code;
	}

	public Boolean getCan_give_friend() {
		return can_give_friend;
	}

	public Boolean getNeed_push_on_view() {
		return need_push_on_view;
	}

	public WeiXinCardDateInfo getDate_info() {
		return date_info;
	}

	public void setDate_info(WeiXinCardDateInfo date_info) {
		this.date_info = date_info;
	}

}
