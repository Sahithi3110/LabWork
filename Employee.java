package com.cg.Lab9;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Employee {
  private int employeeId;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private Date hireDate;
  private String designation;
  private double salary;
  private int managerID;
  private List<Department> department;
  //private Department department;
  
//public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
//		String designation, double salary, int managerID, Department department) {
//	super();
//	this.employeeId = employeeId;
//	this.firstName = firstName;
//	this.lastName = lastName;
//	this.email = email;
//	this.phoneNumber = phoneNumber;
//	this.hireDate = hireDate;
//	this.designation = designation;
//	this.salary = salary;
//	this.managerID = managerID;
//	this.department = department;
//}
public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
		String designation, double salary, int managerID,List<Department> department) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.hireDate = hireDate;
	this.designation = designation;
	this.salary = salary;
	this.managerID = managerID;
	this.department = department;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getManagerID() {
	return managerID;
}
public void setManagerID(int managerID) {
	this.managerID = managerID;
}

public List<Department> getDepartment() {
	return department;
}
public void setDepartment(List<Department> department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
			+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", designation=" + designation
			+ ", salary=" + salary + ", managerID=" + managerID + ", department=" + department + "]";
}

  
}
