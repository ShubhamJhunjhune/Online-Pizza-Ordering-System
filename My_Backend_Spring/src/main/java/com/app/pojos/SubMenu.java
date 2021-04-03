package com.app.pojos;


import javax.persistence.*;


// S_ID	name	sub_menu_details	price_base	image	M_ID
@Entity
@Table(name = "sub_menu")
public class SubMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subMenuId;
	@Column(name = "subm_name", unique = true)
	private String subMenuName;
	@Column(name = "subm_intro", nullable = false)
	private String subMenuIntro;
	@Column(name = "subm_details", nullable = false)
	private String subMenuDetails;
	@Column(name = "subm_base_price", length = 25)
	private Double subMenuBasePrice;
	@Column(name = "subm_img")
	private String subMenuImg;
	@ManyToOne(optional = false)
	@JoinColumn(name = "menuId", nullable = false) // to specify name of FK column n adds NOT NULL constraint
	private Menu menu;
	

	public SubMenu() {
		System.out.println("inside ctor of " + getClass().getName());
	}


	public SubMenu(Integer subMenuId, String subMenuName, String subMenuIntro, String subMenuDetails,
			Double subMenuBasePrice, String subMenuImg, Menu menu) {
		this.subMenuId = subMenuId;
		this.subMenuName = subMenuName;
		this.subMenuIntro = subMenuIntro;
		this.subMenuDetails = subMenuDetails;
		this.subMenuBasePrice = subMenuBasePrice;
		this.subMenuImg = subMenuImg;
		this.menu = menu;
	}


	public Integer getSubMenuId() {
		return subMenuId;
	}


	public void setSubMenuId(Integer subMenuId) {
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
		return "SubMenu [subMenuId=" + subMenuId + ", subMenuName=" + subMenuName + ", subMenuIntro=" + subMenuIntro
				+ ", subMenuDetails=" + subMenuDetails + ", subMenuBasePrice=" + subMenuBasePrice + ", subMenuImg="
				+ subMenuImg + ", menu=" + menu + "]";
	}


	
	
	
}
