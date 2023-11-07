package com.example.service;

import java.util.List;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository empRepo 
		= new EmployeeRepositoryImpl();
	
	@Override
	public Employee addEmployee(Employee emp) {
		// Call repository method to add emp obj in db
		return empRepo.addEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// Call repository method to get all employees
		return empRepo.getAllEmployees();
	}

	@Override
	public Employee deleteEmployee(int id) {
		return empRepo.deleteEmployee(id);
	}

}
