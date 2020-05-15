package com.cul.culsite.model.weixincard;

public class ActivateMemberCardInfo {
	private String card_id;
	private String code;
	private String membership_number;
	private Integer activate_begin_time;
	private Integer activate_end_time;
	private String init_balance;
	private String init_bonus;
	private String card_number;
	private String background_pic_url;
	private String init_custom_field_value1;
	private String init_custom_field_value2;
	private String init_custom_field_value3;

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getBackground_pic_url() {
		return background_pic_url;
	}

	public void setBackground_pic_url(String background_pic_url) {
		this.background_pic_url = background_pic_url;
	}

	public String getInit_custom_field_value1() {
		return init_custom_field_value1;
	}

	public void setInit_custom_field_value1(String init_custom_field_value1) {
		this.init_custom_field_value1 = init_custom_field_value1;
	}

	public String getInit_custom_field_value2() {
		return init_custom_field_value2;
	}

	public void setInit_custom_field_value2(String init_custom_field_value2) {
		this.init_custom_field_value2 = init_custom_field_value2;
	}

	public String getInit_custom_field_value3() {
		return init_custom_field_value3;
	}

	public void setInit_custom_field_value3(String init_custom_field_value3) {
		this.init_custom_field_value3 = init_custom_field_value3;
	}

	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMembership_number() {
		return membership_number;
	}

	public void setMembership_number(String membership_number) {
		this.membership_number = membership_number;
	}

	public Integer getActivate_begin_time() {
		return activate_begin_time;
	}

	public void setActivate_begin_time(Integer activate_begin_time) {
		this.activate_begin_time = activate_begin_time;
	}

	public Integer getActivate_end_time() {
		return activate_end_time;
	}

	public void setActivate_end_time(Integer activate_end_time) {
		this.activate_end_time = activate_end_time;
	}

	public String getInit_balance() {
		return init_balance;
	}

	public void setInit_balance(String init_balance) {
		this.init_balance = init_balance;
	}

	public String getInit_bonus() {
		return init_bonus;
	}

	public void setInit_bonus(String init_bonus) {
		this.init_bonus = init_bonus;
	}

}
