package com.cg.Lab9;
interface InterfaceOne{
	void method1(int x,int y);
}
public class Exercise1 {

	public static void main(String[] args) {
		InterfaceOne i=(x,y)->{
			System.out.println((int)Math.pow(x,y));
		};
		i.method1(4, 2);
       
	}

}
