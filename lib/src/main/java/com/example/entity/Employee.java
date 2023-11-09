package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="emp")
public class Employee {
	// Fields/Variables
	
	@Id
	@GeneratedValue
	@Column(name="eId")
	private int empId;// lowerCamelCase
	
	private String name;
	@Column(name="cNo")
	private String contactNo;

	// HAS-A Relationship
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_login_fk")
	private Login login;
	
	
	// OneToMany - Unidirectional
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_addr_fk")
	private List<Address> address; 
	
	
	// ManaToMany
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinTable(
		  name = "employee_skills", 
		  joinColumns = { @JoinColumn(name = "emp_id") }, 
		  inverseJoinColumns = { @JoinColumn(name = "skill_id") }
	)
	private List<Skill> skillList;
	

	
	
	// Constructors
	public Employee() {}
	public Employee(String name, String contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}
	

	public Employee(String name, String contactNo, Login login) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.login = login;
	}
	
	// Getters/Setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public List<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", contactNo=" + contactNo + ", login=" + login
				+ ", address=" + address + ", skillList=" + skillList + "]";
	}

}
