package com.cg.lab3;

public class Exercise3 {

	public static void main(String[] args) {
		System.out.println(alterString("sahithi"));
		

	}

	private static String alterString(String string) {
	
		char[] ch=string.toCharArray();
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!='a' && string.charAt(i)!='e' &&string.charAt(i)!='i' &&string.charAt(i)!='o' &&
					string.charAt(i)!='u')
			{	
				ch[i]=(char)((int)(string.charAt(i)+1));
			}
			 
		}String str=new String(ch);
		return str;
	}

}
