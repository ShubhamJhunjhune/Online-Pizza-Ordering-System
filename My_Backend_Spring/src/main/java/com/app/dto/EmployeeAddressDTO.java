package com.app.dto;

import com.app.pojos.AddrType;
import com.app.pojos.Customers;
import com.app.pojos.Employees;

public class EmployeeAddressDTO {
	
	private Integer addrId;
	private String empHouse;
	private String empStreet;
	private String empcity;
	private String empPin;
	private Employees employee;
	private AddrType empAddrType;
	public Integer getAddrId() {
		return addrId;
	}
	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}
	public String getEmpHouse() {
		return empHouse;
	}
	public void setEmpHouse(String empHouse) {
		this.empHouse = empHouse;
	}
	public String getEmpStreet() {
		return empStreet;
	}
	public void setEmpStreet(String empStreet) {
		this.empStreet = empStreet;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public String getEmpPin() {
		return empPin;
	}
	public void setEmpPin(String empPin) {
		this.empPin = empPin;
	}
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	public AddrType getEmpAddrType() {
		return empAddrType;
	}
	public void setEmpAddrType(AddrType empAddrType) {
		this.empAddrType = empAddrType;
	}
	@Override
	public String toString() {
		return "EmployeeAddressDTO [addrId=" + addrId + ", empHouse=" + empHouse + ", empStreet=" + empStreet
				+ ", empcity=" + empcity + ", empPin=" + empPin + ", employee=" + employee + ", empAddrType="
				+ empAddrType + "]";
	}
	
	
}
