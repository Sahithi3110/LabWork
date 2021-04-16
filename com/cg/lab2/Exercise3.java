package com.cg.lab2;

import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) {
		int[] arr= {480,90,41,60,21};
		arr=reverseSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] reverseSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			String str=Integer.toString(arr[i]);
			StringBuffer sbf=new StringBuffer(str);
			sbf.reverse();
			str=sbf.toString();
			int x=Integer.parseInt(str);
			arr[i]=x;
		}
		Arrays.sort(arr);
		return arr;
		
	}

}
