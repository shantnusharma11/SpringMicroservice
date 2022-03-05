package com.user_service.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;

import com.user_service.Repository.EmployeeRepository;
import com.user_service.entity.Employee;
import com.user_service.valueObject.Department;
import com.user_service.valueObject.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private RestTemplate restTemplate;
	
public EmployeeServiceImpl(EmployeeRepository employeeRepository,RestTemplate restTemplate) {
		super();
		this.employeeRepository = employeeRepository;
		this.restTemplate=restTemplate;
	}

@Override
public List<Employee> listAllEmployee(){
	return employeeRepository.findAll();
}

@Override
public Employee saveEmployee(Employee employee) {
	//log.info("Inside save Employee method of EmployeeService");

	return employeeRepository.save(employee);
}

  @Override
  public Employee findEmployeeById(Long empId) {
 // log.info("Inside findEmployeeById method of EmployeeService");
  Optional<Employee> employee= 
		  employeeRepository.findById(empId);
    return employee.get();
   }

  public ResponseTemplate GetEmployeeWithDepartment(Long empId) {
	//  log.info("Inside CheckEmployeeWithDepartment method of EmployeeService");
  ResponseTemplate rt= new ResponseTemplate(); 
  Employee employee =employeeRepository.findByEmpId(empId);
   
  Department department =
	   restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+employee.getDepartmentId()
        ,Department.class); 
  rt.setEmployee(employee); //now we have to set 
  rt.setDepartment(department); 
  return rt;
  
  }
 

}
