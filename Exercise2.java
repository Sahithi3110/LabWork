package com.cg.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise2 {

	public static void main(String[] args) {
		char[] ch={'s','a','h','i','t','h','i'};
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		map=countChars(ch);
		for(Entry<Character, Integer>  m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());

	}

	private static Map<Character,Integer> countChars(char[] ch) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(map.containsKey(ch[i]))
				map.put(ch[i], map.get(ch[i])+1);
			else map.put(ch[i], 1);
		}return map;
		
	}

}