package com.user_service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long empId;
	private String eName;
	private Long eMobile;
	private Long eCode;
	private Long departmentId;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long empId, String eName, Long eMobile, Long eCode, Long departmentId) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.eMobile = eMobile;
		this.eCode = eCode;
		this.departmentId = departmentId;
	}
	public Long geteId() {
		return empId;
	}
	
	

	public void seteId(Long empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Long geteMobile() {
		return eMobile;
	}
	public void seteMobile(Long eMobile) {
		this.eMobile = eMobile;
	}
	public Long geteCode() {
		return eCode;
	}
	public void seteCode(Long eCode) {
		this.eCode = eCode;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
}
