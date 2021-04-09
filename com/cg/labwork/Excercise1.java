package com.cg.labwork;
public class Excercise1 {
    public static int calculateCubes(int n) {
    	int rem=0,sum=0;
    	while(n!=0)
    	{
    		rem=n%10;
    		sum=sum+(int)Math.pow(rem, 3);
    		n=n/10;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		System.out.println(calculateCubes(123));
	}

}
