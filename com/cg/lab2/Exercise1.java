package com.cg.lab2;

import java.util.Arrays;

public class Exercise1 {
      public static int getSecondSmallest (int arr[])
      {
    	  Arrays.sort(arr);
    	  return arr[1];
      }
	public static void main(String[] args) {
		int[] arr= {5,8,3,9,1,2,7};
		System.out.println(getSecondSmallest(arr));

	}

}
