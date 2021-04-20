package com.cg.Lab9;

import java.util.regex.Pattern;

interface Authintication{
	boolean authinticate(String uname,String password);
}
public class Exercise3 {

	public static void main(String[] args) {
		Authintication a=(uname,password)->{
			if(Pattern.matches("[a-zA-Z0-9]+",uname) && Pattern.matches("[a-zA-Z0-9]{8,}",password))
				return true;
			else return false;
				
		};
		System.out.println(a.authinticate("Sahithireddy","abccd746"));

	}

}
