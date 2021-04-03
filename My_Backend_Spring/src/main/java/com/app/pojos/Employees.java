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
@Table(name = "employees")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	@Column(name = "emp_email", length = 25, unique = true)
	private String empEmail;
	@Column(name = "emp_pass", nullable = false)
	private String empPass;
	@Column(name = "emp_name", length = 25)
	private String empName;
	@Column(name = "emp_mob", length = 15)
	private String empMobile;
	//@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private String role;
	@JsonIgnore
	@OneToMany(mappedBy = "employee",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<EmployeeAddress> empAddr = new ArrayList<>();
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="dob")
	private String DOB;
	@Column(name = "emp_id_proof", length = 20)
	private String empIdProof;
	private int managerId;
	@Enumerated(EnumType.STRING)
	private EmployeeStatus empStatus;
	@Column(name = "emp_img")
	private String empImg;

	public Employees() {
		System.out.println("inside ctor of " + getClass().getName());
	}

	public Employees(String empEmail, String empPass, String empName, String empMobile, String role, String dOB,
			String empIdProof, int managerId, EmployeeStatus empStatus) {
		super();

		this.empEmail = empEmail;
		this.empPass = empPass;
		this.empName = empName;
		this.empMobile = empMobile;
		this.role = role;
		this.DOB = dOB;
		this.empIdProof = empIdProof;
		this.managerId = managerId;
		this.empStatus = empStatus;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmpIdProof() {
		return empIdProof;
	}

	public void setEmpIdProof(String empIdProof) {
		this.empIdProof = empIdProof;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public EmployeeStatus getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(EmployeeStatus empStatus) {
		this.empStatus = empStatus;
	}

	

	public List<EmployeeAddress> getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(List<EmployeeAddress> empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpImg() {
		return empImg;
	}

	public void setEmpImg(String empImg) {
		this.empImg = empImg;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empEmail=" + empEmail + ", empPass=" + empPass + ", empName=" + empName
				+ ", empMobile=" + empMobile + ", empRole=" + role + ", DOB=" + DOB + ", empIdProof=" + empIdProof
				+ ", managerId=" + managerId + ", empStatus=" + empStatus + ", empImg=" + empImg + "]";
	}

}
