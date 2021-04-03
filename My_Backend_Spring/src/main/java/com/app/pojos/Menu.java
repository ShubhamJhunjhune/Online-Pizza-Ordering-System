package com.app.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.app.pojos.EmployeeAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;

//E_ID	email	pwd	name	mob	role(ENUM)	ADDR_ID	DOB	ID_proof(img/aadhar no)	manager_ID	E_status(working/not)
@Entity
@Table(name = "menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer menuId;
	@Column(name = "menu_type", length = 25, unique = true)
	private String menuType;
	@JsonIgnore
	@OneToMany(mappedBy = "menu",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SubMenu> subMenu = new ArrayList<>();
	

	public Menu() {
		System.out.println("inside ctor of " + getClass().getName());
	}


	public Integer getMenuId() {
		return menuId;
	}


	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}


	public String getMenuType() {
		return menuType;
	}


	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}


	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuType=" + menuType + "]";
	}


	public List<SubMenu> getSubMenu() {
		return subMenu;
	}


	public void setSubMenu(List<SubMenu> subMenu) {
		this.subMenu = subMenu;
	}
	
}
