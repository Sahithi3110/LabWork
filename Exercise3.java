package com.cg.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise3 {

	public static void main(String[] args) {
			int[] arr={5,2,9,1,0};
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			map=getSquares(arr);
			for(Entry<Integer, Integer>  m:map.entrySet())
				System.out.println(m.getKey()+" "+m.getValue());

		}

		private static Map<Integer,Integer> getSquares(int[] ch) {
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<ch.length;i++)
			{
					map.put(ch[i], (int)Math.pow(ch[i], 2));
			}return map;
			
		


	}

}
