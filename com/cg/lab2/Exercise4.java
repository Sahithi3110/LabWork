package com.cg.lab2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Exercise4 {

	public static void main(String[] args) {
		int[] arr= {9,2,9,1,6,1,0,0};
		System.out.println(Arrays.toString(modifyArray (arr)));
	}

	private static int[] modifyArray(int[] arr) {
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		for(Integer num: arr)
		treeset.add(num);
		
		Iterator<Integer> it=treeset.iterator();
		int[] arr2=new int[treeset.size()];
		int i=0;
		while(it.hasNext())
		{
			arr2[i]=it.next();
			i++;
		}	
		return arr2;
	}

}
