package com.user_service.service;


import java.util.List;


import com.user_service.entity.Employee;
import com.user_service.valueObject.ResponseTemplate;

public interface EmployeeService {
	

	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> listAllEmployee();
	
	public Employee findEmployeeById(Long empId);

	public ResponseTemplate GetEmployeeWithDepartment(Long empId);
	 
}
