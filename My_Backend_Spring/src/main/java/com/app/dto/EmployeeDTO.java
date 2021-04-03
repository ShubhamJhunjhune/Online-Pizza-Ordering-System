package com.app.dto;
import com.app.pojos.EmployeeAddress;
import com.app.pojos.EmployeeStatus;
import com.app.pojos.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
 * {
	"empId": 2,
        "empEmail": "b@g.com",
        "empPass": "123",
        "empName": "nnn",
        "empMobile": "12345",
        "empRole": "MANAGER",
        "empAddr": null,
        "empIdProof": "123",
        "managerId": 2,
        "empStatus": "WORKING",
        "empImg": "a",
        "dob": "1999-12-13"
}
 */

public class EmployeeDTO {
	private int empId;
	private String empEmail;
	private String empPass;
	private String empName;
	private String empMobile;
	private String role;
	@JsonIgnore
	private List<EmployeeAddress> empAddr = new ArrayList<>();
	private String empIdProof;
	private Integer managerId;
	private EmployeeStatus empStatus;
	private String empImg;
	private Date dob;
	
	public EmployeeDTO() {
		System.out.println(new Date());
	}
	
	
	public EmployeeDTO(int empId, String empEmail, String empPass, String empName, String empMobile, String role,
			List<EmployeeAddress> empAddr, String empIdProof, Integer managerId, EmployeeStatus empStatus,
			String empImg, Date dob) {
		
		this.empId = empId;
		this.empEmail = empEmail;
		this.empPass = empPass;
		this.empName = empName;
		this.empMobile = empMobile;
		this.role = role;
		this.empAddr = empAddr;
		this.empIdProof = empIdProof;
		this.managerId = managerId;
		this.empStatus = empStatus;
		this.empImg = empImg;
		this.dob = dob;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
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

	public List<EmployeeAddress> getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(List<EmployeeAddress> empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpIdProof() {
		return empIdProof;
	}

	public void setEmpIdProof(String empIdProof) {
		this.empIdProof = empIdProof;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public EmployeeStatus getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(EmployeeStatus empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmpImg() {
		return empImg;
	}

	public void setEmpImg(String empImg) {
		this.empImg = empImg;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empEmail=" + empEmail + ", empPass=" + empPass + ", empName="
				+ empName + ", empMobile=" + empMobile + ", Role=" + role + ", empAddr=" + empAddr
				+ ", empIdProof=" + empIdProof + ", managerId=" + managerId + ", empStatus=" + empStatus + ", empImg="
				+ empImg + ", dob=" + dob + "]";
	}
	
	
}
