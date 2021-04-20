package com.cg.Lab9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
public class EmployeeRepo {
   public static void main(String[] args) throws ParseException {
	   List<Employee> listEmp=new ArrayList<Employee>();
	   List<Department> listDep=new ArrayList<Department>();
	   listDep.add(new Department(00000,"FinanceServices",6666));
	   listDep.add(new Department(11111,"TechnicalServices",7777));
	 
	   listEmp.add(new Employee(222,"Abcd","Reddy", "ssreddy@gmail.com","7896543210",new SimpleDateFormat("dd/MM/yyyy").parse("14/12/2020"),
				"Analyst", 50000.00, 6666,listDep));
	   listEmp.add(new Employee(111,"CA","Reddy", "careddy@gmail.com","123645987",new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2020"),
				"Accountant",100000.00, 6666,listDep));
	   EmployeeService emps=new EmployeeService();
	   System.out.println("Sum of salaries of all employees: "+emps.sumOfSalaries(listEmp));
	   System.out.println("List of all Departments: "+emps.listOfDepAndCountOfEmp(listDep, listEmp));
	   System.out.println("Sorted by emp ID: "+emps.sortById(listEmp));
	   System.out.println("Sorted By FirstName:"+ emps.sortByName(listEmp));
	   System.out.println("Most Senior Employee is"+emps.seniorMostEmp(listEmp));
}
}
