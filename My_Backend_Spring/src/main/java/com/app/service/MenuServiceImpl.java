
package com.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.CustomerHandlingException;
import com.app.dao.EmployeeRepository;
import com.app.dao.MenuRepository;
import com.app.dao.SubMenuRepository;
import com.app.dto.EmployeeDTO;
import com.app.dto.MenuDTO;
import com.app.dto.SubMenuDTO;
import com.app.pojos.EmployeeAddress;
import com.app.pojos.Employees;
import com.app.pojos.Menu;
import com.app.pojos.SubMenu;

@Service
@Transactional
public class MenuServiceImpl implements IMenuService {
	@Autowired
	private MenuRepository menuRepo;
	@Autowired
	private SubMenuRepository subMenuRepo;
		
	@Override
	public List<Menu> getAllMenu() {
		return menuRepo.findAll();
	}

	@Override
	public Menu addMenuDetails(MenuDTO menuDTO) {
		Menu menu = new Menu();
		BeanUtils.copyProperties(menuDTO, menu);
		System.out.println("add user src : " + menuDTO);
		System.out.println(menu);
		return menuRepo.save(menu);
		
	}

	@Override
	public List<SubMenu> getAllSubMenu() {
		return subMenuRepo.findAll();
	}

	@Override
	public SubMenu addSubMenuDetails(SubMenuDTO subMenuDTO,  int id) {
		SubMenu subMenu = new SubMenu();
		subMenu.setMenu(menuRepo.findById(id).get());
		BeanUtils.copyProperties(subMenuDTO, subMenu,"menu","subMenuId");
		System.out.println("Submenu DTO : " + subMenuDTO);
		System.out.println("Submenu : " +subMenu);
		return subMenuRepo.save(subMenu);
		
	}

	
}