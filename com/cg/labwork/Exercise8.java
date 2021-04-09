package com.cg.labwork;

public class Exercise8 {

	public static void main(String[] args) {
		System.out.println(checkNumber(7));

	}

	private static boolean checkNumber(int i) {
		if(i==0)
		return false;
		else {
			while(i!=1)
			{
				if(i%2==0)
					i=i/2;
				else return false;
			}return true;
		}
	}

}
