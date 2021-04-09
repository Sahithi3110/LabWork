package com.cg.lab2;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		String[] str= {"s","a","h","i","t","h","i"};
		System.out.println(Arrays.toString(upperCaseAndLowerCase(str)));

	}

	private static String[] upperCaseAndLowerCase(String[] str) {
		String[] res=new String[str.length];
		Arrays.sort(str);
		if(str.length%2==0)
		{
			for(int i=0;i<str.length/2;i++)
			{
				res[i]=str[i].toUpperCase();
			}for(int i=str.length/2;i<str.length;i++)
			{
				res[i]=str[i].toLowerCase();
			}
		}else {
			for(int i=0;i<str.length/2+1;i++)
			{
				res[i]=str[i].toUpperCase();
			}for(int i=str.length/2+1;i<str.length;i++)
			{
				res[i]=str[i].toLowerCase();
			}
		}
		return res;
	}

}
