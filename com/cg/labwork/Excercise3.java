package com.cg.labwork;

public class Excercise3 {
	public static int fibbonociWithOutRecursion(int num)
	{
		int n=0,m=1,p=0,i;
		if (num==0) {
			return n;
			
		} else {
			 i=2;
			while(i<=num)
			{
				p=n+m;
				n=m;m=p;i++;
			}return m;
		}

	}
	public static int fibbonociWithRecursion(int num)
	{
return (num <= 1)?num: fibbonociWithRecursion(num - 1) + fibbonociWithRecursion(num - 2);   
	}

	public static void main(String[] args) {
		System.out.println("Nth Fibboci without recursion:"+fibbonociWithOutRecursion(7));
		System.out.println("Nth Fibboci with recursion:"+fibbonociWithRecursion(7));

	}

}
