package com.example.service;

import java.util.List;

import com.example.entity.Address;
import com.example.entity.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee emp);
	List<Employee> getAllEmployees();
	Employee deleteEmployee(int id);
	Employee updateAddress(int empId, List<Address> addList);
}
