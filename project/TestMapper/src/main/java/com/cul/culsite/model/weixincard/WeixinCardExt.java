package com.cul.culsite.model.weixincard;

public class WeixinCardExt {
	private String cardId;
	private CardExt cardExt;

	public CardExt getCardExt() {
		return cardExt;
	}

	public void setCardExt(CardExt cardExt) {
		this.cardExt = cardExt;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public class CardExt{
		private String code;
		private String nonce_str;
		private String openid="";
		private String timestamp;
		private String signature;
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getNonce_str() {
			return nonce_str;
		}
		public void setNonce_str(String nonce_str) {
			this.nonce_str = nonce_str;
		}
		public String getOpenid() {
			return openid;
		}
		public void setOpenid(String openid) {
			this.openid = openid;
		}
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		public String getSignature() {
			return signature;
		}
		public void setSignature(String signature) {
			this.signature = signature;
		}
	}
}
