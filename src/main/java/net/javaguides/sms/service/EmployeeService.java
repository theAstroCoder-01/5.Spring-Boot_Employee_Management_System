package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	// We need a list to get all employees.
	List<Employee> getAllEmployees();
	
		Employee saveEmployee(Employee employee);

		Employee getEmployeeById(Long id);

		Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);

}
