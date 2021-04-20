package com.cg.Lab9;

public class Department {
	private int departmentID;
	private String departmentName;
	private int managerID;
	public Department(int departmentID, String departmentName, int managerID) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.managerID = managerID;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", managerID="
				+ managerID + "]";
	}
	
}
