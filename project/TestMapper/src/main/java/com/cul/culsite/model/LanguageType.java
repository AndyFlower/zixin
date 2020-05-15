package com.cul.culsite.model;

public class LanguageType {

	/** 中文*/
	public static String zh_CN = "zh_CN";
	/** 英文*/
	public static String en = "en";
	
	public static boolean isValidLanguage(String lg){
		if(lg.equalsIgnoreCase(zh_CN)||lg.equalsIgnoreCase(en)){
			return true;
		}
		return false;
	}
}
