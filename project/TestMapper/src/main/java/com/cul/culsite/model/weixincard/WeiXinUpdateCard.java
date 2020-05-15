package com.cul.culsite.model.weixincard;

public class WeiXinUpdateCard {
	private String card_id;
	private WeiXinCardMemberCard member_card;
	private WeiXinCardMemberCard groupon;
	private WeiXinCardMemberCard cash;
	private WeiXinCardMemberCard general_card;

	public WeiXinCardMemberCard getGeneral_card() {
		return general_card;
	}

	public void setGeneral_card(WeiXinCardMemberCard general_card) {
		this.general_card = general_card;
	}

	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}

	public WeiXinCardMemberCard getMember_card() {
		return member_card;
	}

	public void setMember_card(WeiXinCardMemberCard member_card) {
		this.member_card = member_card;
	}

	public WeiXinCardMemberCard getGroupon() {
		return groupon;
	}

	public void setGroupon(WeiXinCardMemberCard groupon) {
		this.groupon = groupon;
	}

	public WeiXinCardMemberCard getCash() {
		return cash;
	}

	public void setCash(WeiXinCardMemberCard cash) {
		this.cash = cash;
	}

}
