package com.cg.labwork;

public class Exercise6 {

	public static void main(String[] args) {
		System.out.println(calculateDifference (5));

	}

	private static int calculateDifference(int n) {
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=(int)Math.pow(i, 2);
			sum2+=i;
			
		}
		return Math.abs(sum1-(int)Math.pow(sum2,2));
	}

}
