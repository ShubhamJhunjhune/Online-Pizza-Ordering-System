package com.app.dto;

import com.app.pojos.Menu;

public class SubMenuDTO {
	private Integer subMenuId;
	private String subMenuName;
	private String subMenuIntro;
	private String subMenuDetails;
	private Double subMenuBasePrice;
	private String subMenuImg;
	private Menu menu;
	
	public SubMenuDTO() {
	}

	public int getSubMenuId() {
		return subMenuId;
	}

	public void setSubMenuId(int subMenuId) {
		this.subMenuId = subMenuId;
	}

	public String getSubMenuName() {
		return subMenuName;
	}

	public void setSubMenuName(String subMenuName) {
		this.subMenuName = subMenuName;
	}
	
	public String getSubMenuIntro() {
		return subMenuIntro;
	}

	public void setSubMenuIntro(String subMenuIntro) {
		this.subMenuIntro = subMenuIntro;
	}

	public String getSubMenuDetails() {
		return subMenuDetails;
	}

	public void setSubMenuDetails(String subMenuDetails) {
		this.subMenuDetails = subMenuDetails;
	}

	public Double getSubMenuBasePrice() {
		return subMenuBasePrice;
	}

	public void setSubMenuBasePrice(Double subMenuBasePrice) {
		this.subMenuBasePrice = subMenuBasePrice;
	}

	public String getSubMenuImg() {
		return subMenuImg;
	}

	public void setSubMenuImg(String subMenuImg) {
		this.subMenuImg = subMenuImg;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "SubMenuDTO [subMenuId=" + subMenuId + ", subMenuName=" + subMenuName + ", subMenuIntro=" + subMenuIntro
				+ ", subMenuDetails=" + subMenuDetails + ", subMenuBasePrice=" + subMenuBasePrice + ", subMenuImg="
				+ subMenuImg + ", menu=" + menu + "]";
	}

	
	
	}
