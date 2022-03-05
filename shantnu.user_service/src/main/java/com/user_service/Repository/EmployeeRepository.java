package com.user_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user_service.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>

{

	//public Employee findByEmployeeId(Long eId);
  public Employee findByEmpId(Long empId);
	//public Employee findByEmployeeId(Long eId);

	
	/*
	 * @Query("from Employee where eid=?1") Employee findById(Long id);
	 */
}
