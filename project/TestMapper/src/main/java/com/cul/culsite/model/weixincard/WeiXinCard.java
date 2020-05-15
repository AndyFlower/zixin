package com.cul.culsite.model.weixincard;

public class WeiXinCard {
	private String card_type;
	private WeiXinCardMemberCard member_card;
	private WeiXinCardMemberCard cash;
	private WeiXinCardMemberCard general_card;

	public WeiXinCardMemberCard getGeneral_card() {
		return general_card;
	}

	public void setGeneral_card(WeiXinCardMemberCard general_card) {
		this.general_card = general_card;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public WeiXinCardMemberCard getMember_card() {
		return member_card;
	}

	public void setMember_card(WeiXinCardMemberCard member_card) {
		this.member_card = member_card;
	}

	public WeiXinCardMemberCard getCash() {
		return cash;
	}

	public void setCash(WeiXinCardMemberCard cash) {
		this.cash = cash;
	}

}
