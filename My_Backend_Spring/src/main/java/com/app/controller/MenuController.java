package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerDTO;
import com.app.dto.LoginRequest;
import com.app.dto.MenuDTO;
import com.app.dto.ResponseDTO;
import com.app.dto.SubMenuDTO;
import com.app.service.ICustomerService;
import com.app.service.IMenuService;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuController {
	@Autowired
	private IMenuService menuService;

	@GetMapping
	public ResponseDTO<?> getAllMenu() {
		System.out.println("in get all Menues");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", menuService.getAllMenu());
	}
	
	@PostMapping
	public ResponseDTO<?> addMenuDetails(@RequestBody MenuDTO menuDTO) {
		System.out.println("in add menu details " + menuDTO);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", menuService.addMenuDetails(menuDTO));
	}
	
	@GetMapping("/submenu")
	public ResponseDTO<?> getAllSubMenu() {
		System.out.println("in get all Menues");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", menuService.getAllSubMenu());
	}
	
	@PostMapping("/submenu/{menuId}")
	public ResponseDTO<?> addSubMenuDetails(@RequestBody SubMenuDTO subMenuDTO,@PathVariable int menuId) {
		System.out.println("in add sub menu details " + subMenuDTO);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", menuService.addSubMenuDetails(subMenuDTO,menuId));
	}

}
