package com.cg.exceptions;

public class Main {

	public static void main(String[] args) throws EmployeeException{
		double sal=4000;
		try {
			if(sal<3000)
				throw new EmployeeException("Less Salary");
			else System.out.println("Correct Salary");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
