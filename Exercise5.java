package com.cg.Lab9;
interface Factorial{
	long factorialofANumber(int n);
}
public class Exercise5 {
 public long fact(int n) {
	 long res=1;
	 for(int i=1;i<=n;i++)
		 res=res*i;
	 return res;
 }
	public static void main(String[] args) {
		Exercise5 e=new Exercise5();
		Factorial f=e::fact;
		System.out.println(f.factorialofANumber(5));

	}

}
