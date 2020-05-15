package com.cul.culsite.model;

public class CheckCardStatusBean {
	
	private String issuerId;
	
	private String[] cards;
	
	private String[] pwds;
	
	private String isVerifyMasterPassword;
	
	private String isVerifyAttachPassword;
	
	private String isBindUnactivatedCard;
	
	private CodeMsg  codeMsg ;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CodeMsg getCodeMsg() {
		return codeMsg;
	}

	public void setCodeMsg(CodeMsg codeMsg) {
		this.codeMsg = codeMsg;
	}

	public void setIsBindUnactivatedCard(String isBindUnactivatedCard){
		this.isBindUnactivatedCard = isBindUnactivatedCard;
	}
	
	public String getIsBindUnactivatedCard(){
		return this.isBindUnactivatedCard;
	}
	
	public void setIssuerId(String issuerId){
		this.issuerId = issuerId;
	}
	
	public String getIssuerId(){
		return this.issuerId;
	}
	public void setCards(String[]cards){
		this.cards = cards;
	}
	public String[] getCards(){
		return this.cards;
	}
	public void setPwds(String[]pwds){
		this.pwds = pwds;
	}
	public String[] getPwds(){
		return this.pwds;
	}
	public void setIsVerifyMasterPassword(String isVerifyMasterPassword){
		this.isVerifyMasterPassword = isVerifyMasterPassword;
	}
	public String getIsVerifyMasterPassword(){
		return this.isVerifyMasterPassword;
	}
	public void setIsVerifyAttachPassword(String isVerifyAttachPassword){
		this.isVerifyAttachPassword = isVerifyAttachPassword;
	}
	public String getIsVerifyAttachPassword(){
		return this.isVerifyAttachPassword;
	}
	
	
	
	
	
	
	

}
