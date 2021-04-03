package com.app.service;

import java.util.List;

import com.app.dto.MenuDTO;
import com.app.dto.SubMenuDTO;
import com.app.pojos.Menu;
import com.app.pojos.SubMenu;

public interface IMenuService {
	List<Menu> getAllMenu();
	Menu addMenuDetails(MenuDTO menuDTO);
	
	
	List<SubMenu> getAllSubMenu();
	SubMenu addSubMenuDetails(SubMenuDTO subMenuDTO, int id);
}
