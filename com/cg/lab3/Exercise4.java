package com.cg.lab3;

public class Exercise4 {

	public static void main(String[] args) {
		System.out.println(modifyNumber (45862));

	}
	private static int modifyNumber(int n) {
		String str=Integer.toString(n);
		String s="";
		for(int i=0,j=i+1;i<str.length() & j<str.length();i++,j++)
			s=s+(int)Math.abs((int)str.charAt(i)-(int)str.charAt(j));
		s=s+str.charAt(str.length()-1);
		return Integer.parseInt(s);
		
	}

}
