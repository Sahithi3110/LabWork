package com.cg.exceptions;

public class Exercise1 {

	public static void main(String[] args) {
		
			method(12);
	}

	public static void method(int i) {
		try {
	    if(i>15)
	    	System.out.println("Correct age");
	    else throw new Exception("Wrong age");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
