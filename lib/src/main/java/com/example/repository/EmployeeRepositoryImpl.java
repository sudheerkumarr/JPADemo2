package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.entity.Employee;


public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Employee addEmployee(Employee emp) {
		// logic to add emp in db using JPA
		// Get Entity manager
		
		// Create entity manager factory using 
		//   Persistence class method - createEntityManagerFactory
		EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("PU");
		
		// Create Entity manager using entity manager factory
		EntityManager em= emf.createEntityManager();
		
		// Begin transaction
		em.getTransaction().begin();
		
		// add employee obj in the db
		em.persist(emp);
		
		// commit changes in db permanently
		em.getTransaction().commit();
		
		// close entity manager & entity manager factory
		em.close();
		emf.close();
		
		return emp;
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// logic to get list of emp's from db.
		
		// Create entity manager factory obj
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		
		// Create Entity manager using entity manager factor
		EntityManager em = emf.createEntityManager();
		
		// get all employees from db.
		// HQL - Hibernate Query language
		List<Employee> empList= em.createQuery("select e from Employee e").getResultList();
		
		// close entity manager
		em.close();
		// close entity manager factory
		emf.close();
		
		// return emp list
		return empList;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// Create entity manager factory obj
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
				
		// Create Entity manager using entity manager factor
		EntityManager em = emf.createEntityManager();
		
		// find employee based on id
		Employee emp = em.find(Employee.class, id);
		
		// remove emp if present else return null 
		if(emp==null) {
			return null;
		} else {
			em.remove(emp);	
		}
		
		// close emf & em
		em.close();
		emf.close();
		
		// return emp obj
		return emp;
	}

}
