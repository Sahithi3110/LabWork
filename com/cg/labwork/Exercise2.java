package com.cg.labwork;

import java.util.Scanner;

public class Exercise2 {
public static String printMessage(int n)
{
	String message;
	switch(n)
	{
	case 1:message="Stop";
		break;
	case 2:message="Ready";
		break;
	case 3:message="Go";
		break;
	default:message="Choose correct option.";
	}
	return message;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Red"+"\n"+"2.Yellow"+"\n"+"3.Green");
		System.out.println("enter your choice:");
		int n=sc.nextInt();
		System.out.println(printMessage(n));
		sc.close();

	}

}
