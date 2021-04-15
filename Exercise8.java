package com.cg.lab3;

public class Exercise8 {

	public static void main(String[] args) {
		System.out.println(isPositiveOrNot("anti"));
		
		

	}

	private static boolean isPositiveOrNot(String string) {
		char[] ch=string.toCharArray();
		boolean temp=false;
		for(int i=0,j=i+1;i<ch.length & j<ch.length;i++,j++)
		{
			if(ch[i]<ch[j]) 
				temp =true;	
			else {temp=false;break;}
		}
		
		return (temp)?true:false;
	}

}
