package com.cg.Lab9;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
//import java.util.Map.HashMap;

public class EmployeeService {
  public double sumOfSalaries(List<Employee> list)
  {
	  double sum=0;
	  for(Employee e:list)
		  sum+=e.getSalary();
	  return sum;
  }
  public List<String> listOfDepAndCountOfEmp(List<Department> depList,List<Employee> empList)
  {
	 	  List<String> list1=  depList.stream()
      .map(Department::getDepartmentName)
      .distinct().collect(Collectors.toList()); 
	 	  
////	 	 Map<Department, Long> employeeCountByDepartment=
////	 			empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
////	 			         
//	 	 System.out.println(employeeCountByDepartment);
	  return list1;
  }
  public String seniorMostEmp(List<Employee> list)
  {
	  List<Employee> seniorEmp=list.stream().sorted((o1,o2)->o1.getHireDate().compareTo(o2.getHireDate())).collect(Collectors.toList());
	  Optional<Employee> str=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	  Optional<Employee> juniorMostEmp=list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getHireDate)));
	  System.out.println("High paid Sal is: "+str.get().getFirstName());
	  System.out.println("Most Senior Emp DOJ: "+juniorMostEmp.get().getHireDate());
	  return seniorEmp.get(0).getFirstName();
  }
  public List<Employee> sortById(List<Employee> list)
  {
	  List<Employee> list1=list.stream().sorted((o1,o2)->(int)o1.getEmployeeId()-o2.getEmployeeId()).collect(Collectors.toList());
	  return list1;
	  
  }
  public List<Employee> sortByName(List<Employee> list)
  {
	  List<Employee> list1=list.stream().sorted((o1,o2)->o1.getFirstName().compareTo(o2.getFirstName())).collect(Collectors.toList());
	  return list1;
	  
  }
    
}
