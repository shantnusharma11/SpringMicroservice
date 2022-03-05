package com.user_service.valueObject;

import com.user_service.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class ResponseTemplate {

	private Employee employee;
	private Department department;
	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplate(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
