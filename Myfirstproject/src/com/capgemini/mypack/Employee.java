package com.capgemini.mypack;

public class Employee {
	private int employeeNumber;
	private String emplyeeName;
	
	public Employee(){
		System.out.println("From hardcoded cont");
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmplyeeName() {
		return emplyeeName;
	}
	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}
	
	
}
