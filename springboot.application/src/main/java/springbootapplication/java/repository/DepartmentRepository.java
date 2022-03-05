package springbootapplication.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootapplication.java.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	
	public Department findBydepartmentName(String departmentName);

	//public Department findBydepartmentNameIgnoreCase(String departmentName);

}
