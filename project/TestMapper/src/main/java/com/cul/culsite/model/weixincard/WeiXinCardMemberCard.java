package com.cul.culsite.model.weixincard;

public class WeiXinCardMemberCard {
	private WeiXinCardBaseInfo base_info;
	private Boolean supply_bonus;
	private Boolean supply_balance;
	private String prerogative;
	private Boolean auto_activate;
	private WeiXinCardCustomField custom_field1;
	private WeiXinCardCustomField custom_field2;
	private WeiXinCardCustomField custom_field3;
	private String activate_url;
	private WeiXinCardCustomCell custom_cell1;
	private WeiXinBonusRule bonus_rule;
	private Integer discount;
	private Integer reduce_cost;
	private String background_pic_url;
	
	public String getBackground_pic_url() {
		return background_pic_url;
	}

	public void setBackground_pic_url(String background_pic_url) {
		this.background_pic_url = background_pic_url;
	}

	public Integer getReduce_cost() {
		return reduce_cost;
	}

	public void setReduce_cost(Integer reduce_cost) {
		this.reduce_cost = reduce_cost;
	}

	public WeiXinCardBaseInfo getBase_info() {
		return base_info;
	}

	public void setBase_info(WeiXinCardBaseInfo base_info) {
		this.base_info = base_info;
	}

	public Boolean getSupply_bonus() {
		return supply_bonus;
	}

	public Boolean getSupply_balance() {
		return supply_balance;
	}

	public Boolean getAuto_activate() {
		return auto_activate;
	}

	public Boolean isSupply_bonus() {
		return supply_bonus;
	}

	public void setSupply_bonus(Boolean supply_bonus) {
		this.supply_bonus = supply_bonus;
	}

	public Boolean isSupply_balance() {
		return supply_balance;
	}

	public void setSupply_balance(Boolean supply_balance) {
		this.supply_balance = supply_balance;
	}

	public String getPrerogative() {
		return prerogative;
	}

	public void setPrerogative(String prerogative) {
		this.prerogative = prerogative;
	}

	public Boolean isAuto_activate() {
		return auto_activate;
	}

	public void setAuto_activate(Boolean auto_activate) {
		this.auto_activate = auto_activate;
	}

	public WeiXinCardCustomField getCustom_field1() {
		return custom_field1;
	}

	public void setCustom_field1(WeiXinCardCustomField custom_field1) {
		this.custom_field1 = custom_field1;
	}

	public WeiXinCardCustomField getCustom_field2() {
		return custom_field2;
	}

	public void setCustom_field2(WeiXinCardCustomField custom_field2) {
		this.custom_field2 = custom_field2;
	}

	public WeiXinCardCustomField getCustom_field3() {
		return custom_field3;
	}

	public void setCustom_field3(WeiXinCardCustomField custom_field3) {
		this.custom_field3 = custom_field3;
	}

	public String getActivate_url() {
		return activate_url;
	}

	public void setActivate_url(String activate_url) {
		this.activate_url = activate_url;
	}

	public WeiXinCardCustomCell getCustom_cell1() {
		return custom_cell1;
	}

	public void setCustom_cell1(WeiXinCardCustomCell custom_cell1) {
		this.custom_cell1 = custom_cell1;
	}

	public WeiXinBonusRule getBonus_rule() {
		return bonus_rule;
	}

	public void setBonus_rule(WeiXinBonusRule bonus_rule) {
		this.bonus_rule = bonus_rule;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

}
