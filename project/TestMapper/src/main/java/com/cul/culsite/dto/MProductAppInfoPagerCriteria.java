package com.cul.culsite.dto;

public class MProductAppInfoPagerCriteria extends MProductAppInfoCriteria {

	public MProductAppInfoPagerCriteria() {
		this.isPager = "N";
	}
	
	private String isPager;

	private Integer startPage;

	private Integer endPage;

	public String getIsPager() {
		return isPager;
	}

	public void setIsPager(String isPager) {
		this.isPager = isPager;
	}

	public Integer getStartPage() {
		return startPage;
	}

	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}

	public Integer getEndPage() {
		return endPage;
	}

	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}

	
}
