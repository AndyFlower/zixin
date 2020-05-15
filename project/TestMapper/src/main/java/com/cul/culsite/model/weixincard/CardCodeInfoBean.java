package com.cul.culsite.model.weixincard;

public class CardCodeInfoBean {
	private String errcode;
	private String errmsg;
	private String openid;
	private String user_card_status;
	private String can_consume;
	private Card card;
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	class Card{
		private String card_id;
		private String begin_time;
		private String end_time;
		private String code;
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getCard_id() {
			return card_id;
		}
		public void setCard_id(String card_id) {
			this.card_id = card_id;
		}
		public String getBegin_time() {
			return begin_time;
		}
		public void setBegin_time(String begin_time) {
			this.begin_time = begin_time;
		}
		public String getEnd_time() {
			return end_time;
		}
		public void setEnd_time(String end_time) {
			this.end_time = end_time;
		}
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getCard_id() {
		return card.getCard_id();
	}
	public String getCode(){
		return card.getCode();
	}
	public String getBegin_time() {
		return card.getBegin_time();
	}
	public String getEnd_time() {
		return card.getEnd_time();
	}
	public String getUser_card_status() {
		return user_card_status;
	}
	public void setUser_card_status(String user_card_status) {
		this.user_card_status = user_card_status;
	}
	public String getCan_consume() {
		return can_consume;
	}
	public void setCan_consume(String can_consume) {
		this.can_consume = can_consume;
	}
	@Override
	public String toString() {
		return "CardCodeInfo [errcode=" + errcode + ", errmsg=" + errmsg
				+ ", openid=" + openid + ", card_id=" + getCard_id()
				+ ", begin_time=" + getBegin_time() + ", end_time=" + getEnd_time()
				+ ", user_card_status=" + user_card_status + ", can_consume="
				+ can_consume + "]";
	}
	
}
