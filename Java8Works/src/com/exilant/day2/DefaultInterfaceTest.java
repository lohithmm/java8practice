package com.exilant.day2;

public class DefaultInterfaceTest {
	
	public static void main(String[] args) {
		
		IDepartment.commonUtility();//static  method of interface 
		//can'nt overrride static method and we can acces using interface name directly
		
		ExilantEmployee exilantEmployee=new ExilantEmployee();
		exilantEmployee.noOfHours();//default method of interface
		//can override default method and we need implimantaion class instance to use default methhods
		exilantEmployee.salary();
		exilantEmployee.worklocation();
		
		
		
		
	}
}
