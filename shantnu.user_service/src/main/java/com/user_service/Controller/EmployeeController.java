package com.user_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.user_service.service.EmployeeService;
import com.user_service.valueObject.ResponseTemplate;
import com.user_service.entity.Employee;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody Employee employee) {	
		//log.info("Inside save Employee method of EmployeeController");
	return employeeService.saveEmployee(employee);
	}	
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		return employeeService.listAllEmployee();
	}
	
	  @GetMapping("/{id}")
	   public Employee findEmployeeById(@PathVariable("id")Long eId)
	    { 
	    //log.info("Inside findEmployeeById method of EmployeeController");
	  return employeeService.findEmployeeById(eId);
	  }
		
	  @GetMapping("/getById") 
  public @ResponseBody ResponseTemplate GetEmployeeWithDepartment(@RequestParam Long eId)
	 { 
		   // log.info("Inside CheckEmployeeWithDepartment method of EmployeeController");

	  return employeeService.GetEmployeeWithDepartment(eId);
	  }	
}
