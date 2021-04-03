package com.app.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;

import com.app.pojos.CustomerAddress;
import com.app.pojos.CustomerStatus;
import com.app.pojos.SubMenu;

public class MenuDTO {
	private int menuId;
	private String menuType;
	@JsonIgnore
	private List<SubMenu> subMenu = new ArrayList<>();
	
	public MenuDTO() {
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public List<SubMenu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<SubMenu> subMenu) {
		this.subMenu = subMenu;
	}

	@Override
	public String toString() {
		return "MenuDTO [menuId=" + menuId + ", menuType=" + menuType + "]";
	}
	
	}
