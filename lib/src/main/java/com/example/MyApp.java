package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.entity.Login;
import com.example.entity.Skill;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;
import com.example.service.SkillService;
import com.example.service.SkillServiceImpl;

public class MyApp {

	public static void main(String[] args) {
		
		// Create EmployeeServiceImpl obj
		EmployeeService empService 
		 		= new EmployeeServiceImpl();
		
		
		// Create SkillService impl obj
		SkillService skillService = new SkillServiceImpl();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add employee");
		System.out.println("2. Update employee");
		System.out.println("3. List all employees");
		System.out.println("4. Search employee");
		System.out.println("5. Delete employee");
		System.out.println("6. Update employee address");
		System.out.println("7. Add new skill");
		System.out.println("8. Update employee skill");
		
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
		case 6:
			// update emp address - city, state, eId, noOfAddress
			System.out.println("Enter employee id: ");
		    int id2 = sc.nextInt();
		     
		    System.out.println("Enter number of addresses to be added");
		    int noOfAddr= sc.nextInt();
		    List<Address> addrList =new ArrayList<>();
		    for(int i=0;i<noOfAddr;i++) {
		    	System.out.println("Enter city: ");
		    	String city = sc.next();
		    	System.out.println("Enter State: ");
		    	String state = sc.next();
		    	
		    	// Create address object using city & state
		    	Address a = new Address(city, state);
		    	
		    	// add addr obj to list
		    	addrList.add(a);
		    }
		    
		    // call Service method to map and store address info in db
		    Employee updatedEmp = empService.updateAddress(id2, addrList);   
		
		    // print result
		    System.out.println(updatedEmp);
			
			break;
		case 7:
			System.out.println("Enter skill name: ");
			String sName= sc.next();
			
			// Create skill obj
			Skill skill = new Skill(sName);
			
			// send skill obj to db
			Skill s= skillService.addSkill(skill);
			
			// print response
			System.out.println(s);
			break;
		case 8:
			// update employee skills - empId, skill list
			System.out.println("Enter employee id:");
			int eId = sc.nextInt();
			
			System.out.println("Enter number of skills to be added");
			int noOfSkills= sc.nextInt();
			
			// Get skills info from console
			List<String> skillLst = new ArrayList<>();
			
			for(int i=0; i<noOfSkills;i++) { ;
				System.out.println("Enter skill name: ");
				String newSkill =sc.next();
				skillLst.add(newSkill);
			}
			
			// call service method to update emp with skills
			Employee e= empService.updateSkill(eId, skillLst);
			
			// print result
			System.out.println(e);
			
			break;
		default:
			System.out.println("Enter any number between 1 to 8");
			
		}
	}

}
