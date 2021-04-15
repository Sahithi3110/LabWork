package com.cg.lab3;

public class Exercise2 {

	public static void main(String[] args) {
		System.out.println(getImage ("EARTH"));

	}

	private static String getImage(String string) {
		StringBuffer str=new StringBuffer(string);
		return str+"|"+str.reverse();
	}

}
