package com.cg.labwork;

public class Exercise7 {
	public static boolean checkNumber (int n)
	{
		boolean temp=false;
		int rem1,rem2;
		while(n!=0)
		{
			rem1=n%10;
			n=n/10;
			rem2=n%10;
			if(rem1>=rem2) {temp=true;continue;} else {temp=false;break;}	
		}if(temp)return true;else return false;
	}
	public static void main(String[] args) {
		System.out.println(checkNumber(1340));

	}

}
