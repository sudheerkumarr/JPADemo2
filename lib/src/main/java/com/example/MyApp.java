package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.entity.Employee;
import com.example.entity.Login;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

public class MyApp {

	public static void main(String[] args) {
		
		// Create EmployeeServiceImpl obj
		EmployeeService empService 
		 		= new EmployeeServiceImpl();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add employee");
		System.out.println("2. Update employee");
		System.out.println("3. List all employees");
		System.out.println("4. Search employee");
		System.out.println("5. Delete employee");
		
		int opt = sc.nextInt();
		
		System.out.println(opt);
		
		switch(opt) {
		case 1:
			//Get employee details
			System.out.println("Enter employee name: ");
			String name = sc.next();
			System.out.println("Enter employee contactNo: ");
			String contactNo =sc.next();
			
			System.out.println("Enter email address");
			String email = sc.next();
			
			System.out.println("Enter password");
			String password= sc.next();
			
			// Create Login obj
			Login login = new Login(email, password);
			
			login.setRole("Customer");
			
			// Create employee obj
			Employee emp 
				= new Employee(name, contactNo, login);
			
			// call service method to store emp obj in db
			Employee newEmp= empService.addEmployee(emp);
			
			// print result
			System.out.println(newEmp);
			
			break;
		case 2:
			
			
			break;
		case 3:
			// Get All employees
			List<Employee> empList = empService.getAllEmployees();
			System.out.println(empList);
			break;
		case 4:
			break;
		case 5:
			// Delete employee
			
			// Get emp id from end user
			System.out.println("Enter emp id: ");
			int id = sc.nextInt();
			
			// call service method to delete emp from db
			Employee deletedEmp = empService.deleteEmployee(id);
			
			// print success message
			System.out.println("Deleted employee with id: "+deletedEmp.getEmpId()+" successfully!");
			
			break;
		default:
			System.out.println("Enter any number between 1 to 5");
			
		}
	}

}
