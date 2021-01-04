package com.example.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int empId;
	private String empName;
	private String emailId;
	private long salary;

	public User(int empId, String empName, String emailId, long salary) {
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.salary = salary;
	}

	public int getempId() {
		return this.empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public String getempName() {
		return this.empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getsalary() {
		return this.salary;
	}

	public void setsalary(long salary) {
		this.salary = salary;
	}

	public User() {
	}
}
