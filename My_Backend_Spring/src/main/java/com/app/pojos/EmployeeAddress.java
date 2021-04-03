package com.app.pojos;
//ADDR_ID	E_ID	House	street	city	PIN	addr_type

import javax.persistence.*;

@Entity
@Table(name = "emp_addr")
public class EmployeeAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addrId;

	// private int empId;
	@Column(name = "emp_house")
	private String empHouse;
	@Column(name = "emp_street")
	private String empStreet;
	@Column(name = "emp_city")
	private String empcity;
	@Column(name = "emp_pin")
	private String empPin;
	@ManyToOne(optional = false)
	@JoinColumn(name = "empId", nullable = false) // to specify name of FK column n adds NOT NULL constraint
	private Employees employee;
	@Enumerated(EnumType.STRING)
	private AddrType empAddrType;
	
	public AddrType getEmpAddrType() {
		return empAddrType;
	}

	public void setEmpAddrType(AddrType empAddrType) {
		this.empAddrType = empAddrType;
	}

	public EmployeeAddress() {
		System.out.println("inside ctor of" + getClass().getName());
	}

	public EmployeeAddress(String empHouse, String empStreet, String empcity, String empPin) {
		super();
		this.empHouse = empHouse;
		this.empStreet = empStreet;
		this.empcity = empcity;
		this.empPin = empPin;
	}

	public Integer getAddrId() {
		return addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	/*
	 * public int getEmpId() { return empId; }
	 * 
	 * public void setEmpId(int empId) { this.empId = empId; }
	 */

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

	@Override
	public String toString() {
		return "EmployeeAddress [addrId=" + addrId + ", empId=" + /* empId* + */ ", empHouse=" + empHouse
				+ ", empStreet=" + empStreet + ", empcity=" + empcity + ", empPin=" + empPin + "]";
	}

}
