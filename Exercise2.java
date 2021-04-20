package com.cg.Lab9;
interface StringOperation{
	String modifyString(String str);
}
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation s=(str)->{
			String temp="";
			for(int i=0;i<str.length();i++)
				temp+=str.charAt(i)+" ";
			return temp;
		};
		System.out.println(s.modifyString("Sahithi"));

	}

}
