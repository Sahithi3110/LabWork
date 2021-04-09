package com.cg.labwork;

public class Exercise5 {
         public static int calculateSum (int n)
         {
        	 int sum=0;
        	 for(int i=1;i<=20;i++)
        	 {
        		 if(i%3==0 || i%5==0) sum=sum+i;
        	 }return sum;
         }
	public static void main(String[] args) {
		System.out.println(calculateSum (20));

	}

}
