package com.cg.Lab9;
interface StudentInterface{
	void display(String str);
	//String display();
}
public class Exercise4 {
	 private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Exercise4 e=new Exercise4();
		StudentInterface str= e::setName;
		str.display("Sahithi");
//		StudentInterface str= e::getName;
//		System.out.println(str.display());

		

	}

}
