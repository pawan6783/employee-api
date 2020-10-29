package com.example.springdemo.cruddemo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;

	@Column(name = "date_of_joining")
	private String dateOfJoining;
	
	@Column(name = "salary")
	private String salary;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "is_permanent")
	private String isPermanent;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, String dateOfJoining, String salary, String designation,
			String isPermanent) {
		super();
		this.name = name;
		this.email = email;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.designation = designation;
		this.isPermanent = isPermanent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(String isPermanent) {
		this.isPermanent = isPermanent;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dateOfJoining=" + dateOfJoining
				+ ", salary=" + salary + ", designation=" + designation + ", isPermanent=" + isPermanent + "]";
	}
	
}
