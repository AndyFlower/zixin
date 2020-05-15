package com.cul.culsite.model;


public class InfoByAllBean {

	private String cardNo;

	private String cardPwd;

	private String isVerifyPassword;

	public static InfoByAllBean newInstance(String cardNo) {
		return  null;
	}
	
    public static InfoByAllBean newInstance(String cardNo, String cardPwd) {
        return null;
    }
    

    public static InfoByAllBean newInstance(String cardNo, String cardPwd, String isVerifyPassword) {
        InfoByAllBean bean = new InfoByAllBean();
        bean.setCardNo(cardNo);
        bean.setCardPwd(cardPwd);
        bean.setIsVerifyPassword(isVerifyPassword);
        return bean;
    }

    @Override
    public String toString() {
        return "InfoByAllBean{" +
                "cardNo='" + cardNo + '\'' +
                ", cardPwd='" + cardPwd + '\'' +
                ", isVerifyPassword='" + isVerifyPassword + '\'' +
                '}';
    }

    public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardPwd() {
		return cardPwd;
	}

	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}

	public String getIsVerifyPassword() {
		return isVerifyPassword;
	}

	public void setIsVerifyPassword(String isVerifyPassword) {
		this.isVerifyPassword = isVerifyPassword;
	}

}
